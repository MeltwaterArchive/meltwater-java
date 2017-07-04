/*
 * Meltwater Streaming API v2
 * The Meltwater Streaming API provides the needed resources for Meltwater clients to create & delete REST Hooks and stream Meltwater search results to your specified destination.
 *
 * OpenAPI spec version: 2.0.0
 * Contact: support@api.meltwater.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Creates a hook for one of your predefined searches.
 */
@ApiModel(description = "Creates a hook for one of your predefined searches.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-04T11:33:45.947+02:00")
public class PostV2Hooks {
  @SerializedName("target_url")
  private String targetUrl = null;

  @SerializedName("search_id")
  private Integer searchId = null;

  public PostV2Hooks targetUrl(String targetUrl) {
    this.targetUrl = targetUrl;
    return this;
  }

   /**
   * Target URL to send article results
   * @return targetUrl
  **/
  @ApiModelProperty(example = "null", required = true, value = "Target URL to send article results")
  public String getTargetUrl() {
    return targetUrl;
  }

  public void setTargetUrl(String targetUrl) {
    this.targetUrl = targetUrl;
  }

  public PostV2Hooks searchId(Integer searchId) {
    this.searchId = searchId;
    return this;
  }

   /**
   * Search ID
   * @return searchId
  **/
  @ApiModelProperty(example = "null", required = true, value = "Search ID")
  public Integer getSearchId() {
    return searchId;
  }

  public void setSearchId(Integer searchId) {
    this.searchId = searchId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostV2Hooks postV2Hooks = (PostV2Hooks) o;
    return Objects.equals(this.targetUrl, postV2Hooks.targetUrl) &&
        Objects.equals(this.searchId, postV2Hooks.searchId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetUrl, searchId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostV2Hooks {\n");
    
    sb.append("    targetUrl: ").append(toIndentedString(targetUrl)).append("\n");
    sb.append("    searchId: ").append(toIndentedString(searchId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
