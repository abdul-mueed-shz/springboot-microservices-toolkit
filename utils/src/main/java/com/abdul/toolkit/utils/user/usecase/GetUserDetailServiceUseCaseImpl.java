package com.abdul.toolkit.utils.user.usecase;

import com.abdul.toolkit.utils.feigns.UserFeignClient;
import com.abdul.toolkit.utils.user.mapper.UserServiceMapper;
import com.abdul.toolkit.utils.user.model.UserInfo;
import com.abdul.toolkit.utils.user.port.in.GetUserDetailServiceUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetUserDetailServiceUseCaseImpl implements GetUserDetailServiceUseCase {

    private final UserFeignClient userFeignClient;
    private final UserServiceMapper userServiceMapper;

    @Override
    public UserInfo get(String searchTerm) {
        return userServiceMapper.toUserInfo(userFeignClient.getUser(searchTerm));
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return get(username);
    }
}
