package com.abdul.toolkit.utils.user.port.in;

import com.abdul.toolkit.utils.user.model.UserInfo;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface GetUserDetailServiceUseCase extends UserDetailsService {

    UserInfo get(String searchTerm);
}
