/**
 * The Meltwater API
 * The Meltwater API provides the needed resources for Meltwater clients to create & delete REST Hooks and stream Meltwater search results to your specified destination.
 *
 * OpenAPI spec version: 0.9.0
 * Contact: support@api.meltwater.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Create an OAuth2 access token based on the provided &#x60;client_id&#x60; and &#x60;client_secret&#x60;
 */
@ApiModel(description = "Create an OAuth2 access token based on the provided `client_id` and `client_secret`")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-30T17:35:57.415+01:00")
public class OAuth2Token   {
  @SerializedName("access_token")
  private String accessToken = null;

  @SerializedName("expires_in")
  private Integer expiresIn = null;

  @SerializedName("scope")
  private String scope = null;

  @SerializedName("token_type")
  private String tokenType = null;

  public OAuth2Token accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

   /**
   * The oauth2 access token to use for subsequent API calls
   * @return accessToken
  **/
  @ApiModelProperty(example = "null", value = "The oauth2 access token to use for subsequent API calls")
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public OAuth2Token expiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * Time until the token expires in seconds
   * @return expiresIn
  **/
  @ApiModelProperty(example = "null", value = "Time until the token expires in seconds")
  public Integer getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

  public OAuth2Token scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * The type of oauth2 scope the token is valid for
   * @return scope
  **/
  @ApiModelProperty(example = "null", value = "The type of oauth2 scope the token is valid for")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public OAuth2Token tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

   /**
   * The type/realm of the access token
   * @return tokenType
  **/
  @ApiModelProperty(example = "null", value = "The type/realm of the access token")
  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuth2Token oAuth2Token = (OAuth2Token) o;
    return Objects.equals(this.accessToken, oAuth2Token.accessToken) &&
        Objects.equals(this.expiresIn, oAuth2Token.expiresIn) &&
        Objects.equals(this.scope, oAuth2Token.scope) &&
        Objects.equals(this.tokenType, oAuth2Token.tokenType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, expiresIn, scope, tokenType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuth2Token {\n");
    
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
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
