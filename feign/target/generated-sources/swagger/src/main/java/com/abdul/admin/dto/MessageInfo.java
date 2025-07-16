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
 * MessageInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-17T01:46:12.118849+05:00[Asia/Karachi]")
public class MessageInfo {

  private String messageCode;

  private String messageDescription;

  private String displayableName;

  private Long id;

  private String displayableId;

  public MessageInfo messageCode(String messageCode) {
    this.messageCode = messageCode;
    return this;
  }

  /**
   * Get messageCode
   * @return messageCode
  */
  
  @Schema(name = "messageCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("messageCode")
  public String getMessageCode() {
    return messageCode;
  }

  public void setMessageCode(String messageCode) {
    this.messageCode = messageCode;
  }

  public MessageInfo messageDescription(String messageDescription) {
    this.messageDescription = messageDescription;
    return this;
  }

  /**
   * Get messageDescription
   * @return messageDescription
  */
  
  @Schema(name = "messageDescription", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("messageDescription")
  public String getMessageDescription() {
    return messageDescription;
  }

  public void setMessageDescription(String messageDescription) {
    this.messageDescription = messageDescription;
  }

  public MessageInfo displayableName(String displayableName) {
    this.displayableName = displayableName;
    return this;
  }

  /**
   * Get displayableName
   * @return displayableName
  */
  
  @Schema(name = "displayableName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("displayableName")
  public String getDisplayableName() {
    return displayableName;
  }

  public void setDisplayableName(String displayableName) {
    this.displayableName = displayableName;
  }

  public MessageInfo id(Long id) {
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

  public MessageInfo displayableId(String displayableId) {
    this.displayableId = displayableId;
    return this;
  }

  /**
   * Get displayableId
   * @return displayableId
  */
  
  @Schema(name = "displayableId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("displayableId")
  public String getDisplayableId() {
    return displayableId;
  }

  public void setDisplayableId(String displayableId) {
    this.displayableId = displayableId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageInfo messageInfo = (MessageInfo) o;
    return Objects.equals(this.messageCode, messageInfo.messageCode) &&
        Objects.equals(this.messageDescription, messageInfo.messageDescription) &&
        Objects.equals(this.displayableName, messageInfo.displayableName) &&
        Objects.equals(this.id, messageInfo.id) &&
        Objects.equals(this.displayableId, messageInfo.displayableId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageCode, messageDescription, displayableName, id, displayableId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageInfo {\n");
    sb.append("    messageCode: ").append(toIndentedString(messageCode)).append("\n");
    sb.append("    messageDescription: ").append(toIndentedString(messageDescription)).append("\n");
    sb.append("    displayableName: ").append(toIndentedString(displayableName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayableId: ").append(toIndentedString(displayableId)).append("\n");
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

