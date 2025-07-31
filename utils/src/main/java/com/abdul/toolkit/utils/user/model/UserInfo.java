package com.abdul.toolkit.utils.user.model;

import com.abdul.toolkit.utils.linkedin.model.LinkedinUserInfo;
import com.abdul.toolkit.utils.model.GithubUserInfo;
import com.abdul.toolkit.utils.model.GoogleUserInfo;
import com.abdul.toolkit.utils.model.TwitterUserInfo;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo implements UserDetails, Serializable {

    private Long id;
    private String username;
    private String email;
    private Set<RoleInfo> roles;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean isActive;
    private Boolean isSystemLock;
    private Boolean areCredentialsValid;
    private String firstName;
    private String lastName;
    private Boolean emailVerified = Boolean.FALSE;
    private GoogleUserInfo googleUser;
    private LinkedinUserInfo linkedinUser;
    private TwitterUserInfo twitterUser;
    private GithubUserInfo githubUser;
    private String password;


    /**
     * @return {@link GrantedAuthority}
     */
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if (roles == null || roles.isEmpty()) {
            return List.of();
        }
        List<GrantedAuthority> authorities = new ArrayList<>();
        for (RoleInfo role : roles) {
            authorities.addAll(
                    role.getPermissions().stream().map(
                            permission -> new SimpleGrantedAuthority(permission.getName())
                    ).toList()
            );
        }
        return authorities;
    }

    /**
     * @return password {@link String}
     */
    @Override
    public String getPassword() {
        return this.password;
    }
}
