# OauthApi

All URIs are relative to *https://api.meltwater.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createToken**](OauthApi.md#createToken) | **POST** /oauth2/token | Create an access token


<a name="createToken"></a>
# **createToken**
> OAuth2Token createToken(userKey, authorization, grantType, scope)

Create an access token

Create an OAuth2 access token based on the provided &#x60;client_id&#x60; and &#x60;client_secret&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OauthApi;


OauthApi apiInstance = new OauthApi();
String userKey = "userKey_example"; // String | The `user_key` from [developer.meltwater.io](https://developer.meltwater.io/admin/applications/).
String authorization = "authorization_example"; // String | `client_id:client_secret`  Basic Auth (RFC2617) credentials. Must contain the realm `Basic` followed by a Base64-encoded `client_id`:`client_secret` pair.   #### Example:      Basic aAlfbb1haWxDSXhhDXxxZWKJAyZXQ=
String grantType = "grantType_example"; // String | OAuth2 grant type, use `client_credentials`
String scope = "scope_example"; // String | OAuth2 scope, use `search`
try {
    OAuth2Token result = apiInstance.createToken(userKey, authorization, grantType, scope);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OauthApi#createToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userKey** | **String**| The &#x60;user_key&#x60; from [developer.meltwater.io](https://developer.meltwater.io/admin/applications/). |
 **authorization** | **String**| &#x60;client_id:client_secret&#x60;  Basic Auth (RFC2617) credentials. Must contain the realm &#x60;Basic&#x60; followed by a Base64-encoded &#x60;client_id&#x60;:&#x60;client_secret&#x60; pair.   #### Example:      Basic aAlfbb1haWxDSXhhDXxxZWKJAyZXQ&#x3D; |
 **grantType** | **String**| OAuth2 grant type, use &#x60;client_credentials&#x60; |
 **scope** | **String**| OAuth2 scope, use &#x60;search&#x60; |

### Return type

[**OAuth2Token**](OAuth2Token.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

