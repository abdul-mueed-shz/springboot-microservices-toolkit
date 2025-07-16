package com.abdul.toolkit.utils.user.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RoleInfo implements Serializable {

    private Long id;

    private String name;

    private Set<PermissionInfo> permissions;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
