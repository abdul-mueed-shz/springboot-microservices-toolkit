package com.abdul.toolkit.security.domain.auth.port.in;

import javax.crypto.SecretKey;

public interface GetSignInKeyUseCase {

    SecretKey get();
}
