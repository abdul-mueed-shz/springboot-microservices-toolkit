package com.abdul.toolkit.utils.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GithubUserInfo implements Serializable {

    private Long id;
    private boolean hireable;
    private String bio;
    private String company;
    private String blog;
    private String htmlUrl;
    private String avatarUrl;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String accessToken;
}
