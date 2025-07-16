package com.abdul.toolkit.utils.linkedin.port.in;

import com.abdul.toolkit.utils.model.AccessToken;
import com.abdul.toolkit.utils.linkedin.model.LinkedinUserResponse;

public interface LinkedinApiUseCase {

    LinkedinUserResponse getUserResponse(String accessToken);

    AccessToken getAccessToken(
            String grantType,
            String code,
            String redirectUri,
            String clientId,
            String clientSecret
    );

}
