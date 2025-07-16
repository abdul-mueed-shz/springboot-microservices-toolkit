package com.abdul.admin.dto;

import java.net.URI;
import java.util.Objects;
import com.abdul.admin.dto.GithubUserInfo;
import com.abdul.admin.dto.GoogleUserInfo;
import com.abdul.admin.dto.LinkedinUserInfo;
import com.abdul.admin.dto.RoleInfo;
import com.abdul.admin.dto.TwitterUserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * UserResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-17T01:46:12.118849+05:00[Asia/Karachi]")
public class UserResponse {

  private Long id;

  private String firstName;

  private String lastName;

  private Boolean emailVerified;

  private String username;

  private String email;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updatedAt;

  private Boolean isActive;

  private Boolean isSystemLock;

  private Boolean areCredentialsValid;

  private GoogleUserInfo googleUser;

  private LinkedinUserInfo linkedinUser;

  private TwitterUserInfo twitterUser;

  private GithubUserInfo githubUser;

  @Valid
  private List<@Valid RoleInfo> roles;

  public UserResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UserResponse(Long id, String firstName, String lastName, String email, OffsetDateTime createdAt, OffsetDateTime updatedAt, Boolean isActive, Boolean isSystemLock, Boolean areCredentialsValid) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.isActive = isActive;
    this.isSystemLock = isSystemLock;
    this.areCredentialsValid = areCredentialsValid;
  }

  public UserResponse id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the user
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Unique identifier for the user", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public UserResponse firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * First name of the user
   * @return firstName
  */
  @NotNull @Size(min = 10) 
  @Schema(name = "firstName", description = "First name of the user", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UserResponse lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Last name of the user
   * @return lastName
  */
  @NotNull @Size(min = 10) 
  @Schema(name = "lastName", description = "Last name of the user", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UserResponse emailVerified(Boolean emailVerified) {
    this.emailVerified = emailVerified;
    return this;
  }

  /**
   * Email verification info
   * @return emailVerified
  */
  
  @Schema(name = "emailVerified", description = "Email verification info", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emailVerified")
  public Boolean getEmailVerified() {
    return emailVerified;
  }

  public void setEmailVerified(Boolean emailVerified) {
    this.emailVerified = emailVerified;
  }

  public UserResponse username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Username of the user
   * @return username
  */
  
  @Schema(name = "username", description = "Username of the user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public UserResponse email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Email address of the user
   * @return email
  */
  @NotNull 
  @Schema(name = "email", description = "Email address of the user", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserResponse createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The date and time the user was created
   * @return createdAt
  */
  @NotNull @Valid 
  @Schema(name = "createdAt", description = "The date and time the user was created", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("createdAt")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public UserResponse updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The date and time the user was last updated
   * @return updatedAt
  */
  @NotNull @Valid 
  @Schema(name = "updatedAt", description = "The date and time the user was last updated", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("updatedAt")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public UserResponse isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Indicates whether the user is active
   * @return isActive
  */
  @NotNull 
  @Schema(name = "isActive", description = "Indicates whether the user is active", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("isActive")
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public UserResponse isSystemLock(Boolean isSystemLock) {
    this.isSystemLock = isSystemLock;
    return this;
  }

  /**
   * Indicates whether the user's system lock is enabled
   * @return isSystemLock
  */
  @NotNull 
  @Schema(name = "isSystemLock", description = "Indicates whether the user's system lock is enabled", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("isSystemLock")
  public Boolean getIsSystemLock() {
    return isSystemLock;
  }

  public void setIsSystemLock(Boolean isSystemLock) {
    this.isSystemLock = isSystemLock;
  }

  public UserResponse areCredentialsValid(Boolean areCredentialsValid) {
    this.areCredentialsValid = areCredentialsValid;
    return this;
  }

  /**
   * Indicates whether the user's credentials are valid
   * @return areCredentialsValid
  */
  @NotNull 
  @Schema(name = "areCredentialsValid", description = "Indicates whether the user's credentials are valid", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("areCredentialsValid")
  public Boolean getAreCredentialsValid() {
    return areCredentialsValid;
  }

  public void setAreCredentialsValid(Boolean areCredentialsValid) {
    this.areCredentialsValid = areCredentialsValid;
  }

  public UserResponse googleUser(GoogleUserInfo googleUser) {
    this.googleUser = googleUser;
    return this;
  }

  /**
   * Get googleUser
   * @return googleUser
  */
  @Valid 
  @Schema(name = "googleUser", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("googleUser")
  public GoogleUserInfo getGoogleUser() {
    return googleUser;
  }

  public void setGoogleUser(GoogleUserInfo googleUser) {
    this.googleUser = googleUser;
  }

  public UserResponse linkedinUser(LinkedinUserInfo linkedinUser) {
    this.linkedinUser = linkedinUser;
    return this;
  }

  /**
   * Get linkedinUser
   * @return linkedinUser
  */
  @Valid 
  @Schema(name = "linkedinUser", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("linkedinUser")
  public LinkedinUserInfo getLinkedinUser() {
    return linkedinUser;
  }

  public void setLinkedinUser(LinkedinUserInfo linkedinUser) {
    this.linkedinUser = linkedinUser;
  }

  public UserResponse twitterUser(TwitterUserInfo twitterUser) {
    this.twitterUser = twitterUser;
    return this;
  }

  /**
   * Get twitterUser
   * @return twitterUser
  */
  @Valid 
  @Schema(name = "twitterUser", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("twitterUser")
  public TwitterUserInfo getTwitterUser() {
    return twitterUser;
  }

  public void setTwitterUser(TwitterUserInfo twitterUser) {
    this.twitterUser = twitterUser;
  }

  public UserResponse githubUser(GithubUserInfo githubUser) {
    this.githubUser = githubUser;
    return this;
  }

  /**
   * Get githubUser
   * @return githubUser
  */
  @Valid 
  @Schema(name = "githubUser", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("githubUser")
  public GithubUserInfo getGithubUser() {
    return githubUser;
  }

  public void setGithubUser(GithubUserInfo githubUser) {
    this.githubUser = githubUser;
  }

  public UserResponse roles(List<@Valid RoleInfo> roles) {
    this.roles = roles;
    return this;
  }

  public UserResponse addRolesItem(RoleInfo rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * Set of roles assigned to the user
   * @return roles
  */
  @Valid 
  @Schema(name = "roles", description = "Set of roles assigned to the user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roles")
  public List<@Valid RoleInfo> getRoles() {
    return roles;
  }

  public void setRoles(List<@Valid RoleInfo> roles) {
    this.roles = roles;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserResponse userResponse = (UserResponse) o;
    return Objects.equals(this.id, userResponse.id) &&
        Objects.equals(this.firstName, userResponse.firstName) &&
        Objects.equals(this.lastName, userResponse.lastName) &&
        Objects.equals(this.emailVerified, userResponse.emailVerified) &&
        Objects.equals(this.username, userResponse.username) &&
        Objects.equals(this.email, userResponse.email) &&
        Objects.equals(this.createdAt, userResponse.createdAt) &&
        Objects.equals(this.updatedAt, userResponse.updatedAt) &&
        Objects.equals(this.isActive, userResponse.isActive) &&
        Objects.equals(this.isSystemLock, userResponse.isSystemLock) &&
        Objects.equals(this.areCredentialsValid, userResponse.areCredentialsValid) &&
        Objects.equals(this.googleUser, userResponse.googleUser) &&
        Objects.equals(this.linkedinUser, userResponse.linkedinUser) &&
        Objects.equals(this.twitterUser, userResponse.twitterUser) &&
        Objects.equals(this.githubUser, userResponse.githubUser) &&
        Objects.equals(this.roles, userResponse.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, emailVerified, username, email, createdAt, updatedAt, isActive, isSystemLock, areCredentialsValid, googleUser, linkedinUser, twitterUser, githubUser, roles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    emailVerified: ").append(toIndentedString(emailVerified)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isSystemLock: ").append(toIndentedString(isSystemLock)).append("\n");
    sb.append("    areCredentialsValid: ").append(toIndentedString(areCredentialsValid)).append("\n");
    sb.append("    googleUser: ").append(toIndentedString(googleUser)).append("\n");
    sb.append("    linkedinUser: ").append(toIndentedString(linkedinUser)).append("\n");
    sb.append("    twitterUser: ").append(toIndentedString(twitterUser)).append("\n");
    sb.append("    githubUser: ").append(toIndentedString(githubUser)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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

