package com.abdul.admin.dto;

import java.net.URI;
import java.util.Objects;
import com.abdul.admin.dto.AuthenticationInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Oauth2LoginResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-17T01:46:12.118849+05:00[Asia/Karachi]")
public class Oauth2LoginResponse {

  private AuthenticationInfo tokenInfo;

  public Oauth2LoginResponse tokenInfo(AuthenticationInfo tokenInfo) {
    this.tokenInfo = tokenInfo;
    return this;
  }

  /**
   * Get tokenInfo
   * @return tokenInfo
  */
  @Valid 
  @Schema(name = "tokenInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tokenInfo")
  public AuthenticationInfo getTokenInfo() {
    return tokenInfo;
  }

  public void setTokenInfo(AuthenticationInfo tokenInfo) {
    this.tokenInfo = tokenInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Oauth2LoginResponse oauth2LoginResponse = (Oauth2LoginResponse) o;
    return Objects.equals(this.tokenInfo, oauth2LoginResponse.tokenInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Oauth2LoginResponse {\n");
    sb.append("    tokenInfo: ").append(toIndentedString(tokenInfo)).append("\n");
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

