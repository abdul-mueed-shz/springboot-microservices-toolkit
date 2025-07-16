package com.abdul.toolkit.utils.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TwitterUserInfo implements Serializable {

    private Long id;
    private String state;
    private String accessToken;
    private String refreshToken;
    private String expiresIn;
    private String picture;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String tokenScope;
    private String usedAuthCode;
    private String tokenType;
}
