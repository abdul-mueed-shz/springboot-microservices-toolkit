package com.abdul.toolkit.utils.jwt.port.in;

import javax.crypto.SecretKey;

public interface GetSignInKeyUseCase {

    SecretKey get();
}
