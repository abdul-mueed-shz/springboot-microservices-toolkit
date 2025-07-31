package com.abdul.toolkit.security.domain.auth.config;

import com.abdul.toolkit.security.domain.auth.validator.JwtTokenValidator;
import com.abdul.toolkit.utils.jwt.port.in.ExtractJwtClaimsUseCase;
import com.abdul.toolkit.utils.user.model.UserInfo;
import com.abdul.toolkit.utils.user.port.in.GetAdminUserUseCase;
import com.abdul.toolkit.utils.user.port.in.GetUserDetailServiceUseCase;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
@RequiredArgsConstructor
public class JwtAuthenticationFilter extends OncePerRequestFilter {

    private final GetUserDetailServiceUseCase getUserDetailServiceUseCase;
    private final ExtractJwtClaimsUseCase extractJwtClaimsUseCase;
    private final JwtTokenValidator jwtTokenValidator;
    private final GetAdminUserUseCase getAdminUserUseCase;

    @Override
    protected void doFilterInternal(@NonNull HttpServletRequest request,
            @NonNull HttpServletResponse response,
            @NonNull FilterChain filterChain) throws ServletException, IOException {

        String authHeader = request.getHeader("Authorization");

        if (authHeader == null || !authHeader.startsWith("Bearer ")) {
            filterChain.doFilter(request, response);
            return;
        }

        String jwt = authHeader.substring(7);
        if (!Boolean.TRUE.equals(jwtTokenValidator.isTokenValid(jwt))) {
            filterChain.doFilter(request, response);
            return;
        }

        String tokenType = (String) extractJwtClaimsUseCase.extractTokenType(jwt);
        String username = extractJwtClaimsUseCase.extractUsername(jwt);

        if (Objects.isNull(SecurityContextHolder.getContext().getAuthentication())) {
            UserDetails userDetails;

            if ("access".equals(tokenType)) {
                userDetails = getUserDetailServiceUseCase.loadUserByUsername(username);
            } else if ("internal".equals(tokenType)) {
                userDetails = getAdminUserUseCase.getAdminUser();
            } else {
                filterChain.doFilter(request, response);
                return;
            }

            UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(
                    userDetails, null, userDetails.getAuthorities()
            );
            authenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
            SecurityContextHolder.getContext().setAuthentication(authenticationToken);
        }

        filterChain.doFilter(request, response);
    }
}
