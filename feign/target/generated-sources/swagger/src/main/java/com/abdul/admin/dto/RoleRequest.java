package com.abdul.admin.dto;

import java.net.URI;
import java.util.Objects;
import com.abdul.admin.dto.PermissionInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * RoleRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-17T01:46:12.118849+05:00[Asia/Karachi]")
public class RoleRequest {

  private Long id;

  private String name;

  @Valid
  private List<@Valid PermissionInfo> permissions = new ArrayList<>();

  public RoleRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RoleRequest(Long id, String name, List<@Valid PermissionInfo> permissions) {
    this.id = id;
    this.name = name;
    this.permissions = permissions;
  }

  public RoleRequest id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the role
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Unique identifier for the role", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public RoleRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the role
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Name of the role", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RoleRequest permissions(List<@Valid PermissionInfo> permissions) {
    this.permissions = permissions;
    return this;
  }

  public RoleRequest addPermissionsItem(PermissionInfo permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * Get permissions
   * @return permissions
  */
  @NotNull @Valid 
  @Schema(name = "permissions", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("permissions")
  public List<@Valid PermissionInfo> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<@Valid PermissionInfo> permissions) {
    this.permissions = permissions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleRequest roleRequest = (RoleRequest) o;
    return Objects.equals(this.id, roleRequest.id) &&
        Objects.equals(this.name, roleRequest.name) &&
        Objects.equals(this.permissions, roleRequest.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

