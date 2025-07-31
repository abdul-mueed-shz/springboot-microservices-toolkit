package com.abdul.toolkit.utils.user.usecase;

import com.abdul.toolkit.utils.user.model.PermissionInfo;
import com.abdul.toolkit.utils.user.model.RoleInfo;
import com.abdul.toolkit.utils.user.model.UserInfo;
import com.abdul.toolkit.utils.user.port.in.GetAdminUserUseCase;
import java.util.Set;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetAdminUserUseCaseImpl implements GetAdminUserUseCase {
    @Override
    public UserInfo getAdminUser() {
        RoleInfo internalAdminRole = RoleInfo.builder()
                .permissions(
                        Set.of(
                                PermissionInfo.builder()
                                        .name("INTERNAL_ADMIN")
                                        .build()
                        )
                )
                .build();
        return UserInfo.builder()
                .username("internal admin")
                .roles(Set.of(internalAdminRole))
                .build();
    }
}
