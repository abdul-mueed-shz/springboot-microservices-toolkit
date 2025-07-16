package com.abdul.admin.dto;

import java.net.URI;
import java.util.Objects;
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
 * GithubUserInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-17T01:46:12.118849+05:00[Asia/Karachi]")
public class GithubUserInfo {

  private Long id;

  private String avatarUrl;

  private String htmlUrl;

  private String blog;

  private String company;

  private String bio;

  private Boolean hireable;

  private String createdAt;

  private String updatedAt;

  public GithubUserInfo id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GithubUserInfo avatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

  /**
   * Get avatarUrl
   * @return avatarUrl
  */
  
  @Schema(name = "avatarUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("avatarUrl")
  public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public GithubUserInfo htmlUrl(String htmlUrl) {
    this.htmlUrl = htmlUrl;
    return this;
  }

  /**
   * Get htmlUrl
   * @return htmlUrl
  */
  
  @Schema(name = "htmlUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("htmlUrl")
  public String getHtmlUrl() {
    return htmlUrl;
  }

  public void setHtmlUrl(String htmlUrl) {
    this.htmlUrl = htmlUrl;
  }

  public GithubUserInfo blog(String blog) {
    this.blog = blog;
    return this;
  }

  /**
   * Get blog
   * @return blog
  */
  
  @Schema(name = "blog", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("blog")
  public String getBlog() {
    return blog;
  }

  public void setBlog(String blog) {
    this.blog = blog;
  }

  public GithubUserInfo company(String company) {
    this.company = company;
    return this;
  }

  /**
   * Get company
   * @return company
  */
  
  @Schema(name = "company", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("company")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public GithubUserInfo bio(String bio) {
    this.bio = bio;
    return this;
  }

  /**
   * Get bio
   * @return bio
  */
  
  @Schema(name = "bio", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bio")
  public String getBio() {
    return bio;
  }

  public void setBio(String bio) {
    this.bio = bio;
  }

  public GithubUserInfo hireable(Boolean hireable) {
    this.hireable = hireable;
    return this;
  }

  /**
   * Get hireable
   * @return hireable
  */
  
  @Schema(name = "hireable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hireable")
  public Boolean getHireable() {
    return hireable;
  }

  public void setHireable(Boolean hireable) {
    this.hireable = hireable;
  }

  public GithubUserInfo createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  
  @Schema(name = "createdAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdAt")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public GithubUserInfo updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
  */
  
  @Schema(name = "updatedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updatedAt")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GithubUserInfo githubUserInfo = (GithubUserInfo) o;
    return Objects.equals(this.id, githubUserInfo.id) &&
        Objects.equals(this.avatarUrl, githubUserInfo.avatarUrl) &&
        Objects.equals(this.htmlUrl, githubUserInfo.htmlUrl) &&
        Objects.equals(this.blog, githubUserInfo.blog) &&
        Objects.equals(this.company, githubUserInfo.company) &&
        Objects.equals(this.bio, githubUserInfo.bio) &&
        Objects.equals(this.hireable, githubUserInfo.hireable) &&
        Objects.equals(this.createdAt, githubUserInfo.createdAt) &&
        Objects.equals(this.updatedAt, githubUserInfo.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, avatarUrl, htmlUrl, blog, company, bio, hireable, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GithubUserInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    blog: ").append(toIndentedString(blog)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    bio: ").append(toIndentedString(bio)).append("\n");
    sb.append("    hireable: ").append(toIndentedString(hireable)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

