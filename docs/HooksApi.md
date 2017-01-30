# HooksApi

All URIs are relative to *https://api.meltwater.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteV1HooksId**](HooksApi.md#deleteV1HooksId) | **DELETE** /v1/hooks/{id} | Delete an existing hook.
[**getV1Hooks**](HooksApi.md#getV1Hooks) | **GET** /v1/hooks | List all hooks.
[**postV1Hooks**](HooksApi.md#postV1Hooks) | **POST** /v1/hooks | Creates a hook for one of your predefined searches.


<a name="deleteV1HooksId"></a>
# **deleteV1HooksId**
> deleteV1HooksId(userKey, authorization, id)

Delete an existing hook.

Delete an existing hook.  Removes the hook and stops sending any search results to the target_url.    Requires an OAuth access token.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HooksApi;


HooksApi apiInstance = new HooksApi();
String userKey = "userKey_example"; // String | The `user_key` from [developer.meltwater.io](https://developer.meltwater.io/admin/applications/).
String authorization = "authorization_example"; // String | `Oauth Access Token`    OAuth access token (RFC 6749). Must contain the access token type `Bearer`  followed by an OAuth access token.    #### Example:        Bearer KKwmfHwxsEoeMDTMAfxOpO...
String id = "id_example"; // String | Hook ID received from creating a hook
try {
    apiInstance.deleteV1HooksId(userKey, authorization, id);
} catch (ApiException e) {
    System.err.println("Exception when calling HooksApi#deleteV1HooksId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userKey** | **String**| The &#x60;user_key&#x60; from [developer.meltwater.io](https://developer.meltwater.io/admin/applications/). |
 **authorization** | **String**| &#x60;Oauth Access Token&#x60;    OAuth access token (RFC 6749). Must contain the access token type &#x60;Bearer&#x60;  followed by an OAuth access token.    #### Example:        Bearer KKwmfHwxsEoeMDTMAfxOpO... |
 **id** | **String**| Hook ID received from creating a hook |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getV1Hooks"></a>
# **getV1Hooks**
> HooksCollection getV1Hooks(userKey, authorization)

List all hooks.

List all hooks.     Delivers all previously generated hooks.    Requires an OAuth access token.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HooksApi;


HooksApi apiInstance = new HooksApi();
String userKey = "userKey_example"; // String | The `user_key` from [developer.meltwater.io](https://developer.meltwater.io/admin/applications/).
String authorization = "authorization_example"; // String | `Oauth Access Token`    OAuth access token (RFC 6749). Must contain the access token type `Bearer`  followed by an OAuth access token.    #### Example:        Bearer KKwmfHwxsEoeMDTMAfxOpO...
try {
    HooksCollection result = apiInstance.getV1Hooks(userKey, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HooksApi#getV1Hooks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userKey** | **String**| The &#x60;user_key&#x60; from [developer.meltwater.io](https://developer.meltwater.io/admin/applications/). |
 **authorization** | **String**| &#x60;Oauth Access Token&#x60;    OAuth access token (RFC 6749). Must contain the access token type &#x60;Bearer&#x60;  followed by an OAuth access token.    #### Example:        Bearer KKwmfHwxsEoeMDTMAfxOpO... |

### Return type

[**HooksCollection**](HooksCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postV1Hooks"></a>
# **postV1Hooks**
> Hook postV1Hooks(userKey, authorization, v1Hooks)

Creates a hook for one of your predefined searches.

Creates a hook for one of your predefined searches.  Delivers search results for the query referenced by thesearch_id to the target_url via HTTP POST. Note that a hook id will be returned on successful creation, this id is needed to delete the hook.     Requires an OAuth access token.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HooksApi;


HooksApi apiInstance = new HooksApi();
String userKey = "userKey_example"; // String | The `user_key` from [developer.meltwater.io](https://developer.meltwater.io/admin/applications/).
String authorization = "authorization_example"; // String | `Oauth Access Token`    OAuth access token (RFC 6749). Must contain the access token type `Bearer`  followed by an OAuth access token.    #### Example:        Bearer KKwmfHwxsEoeMDTMAfxOpO...
PostV1Hooks v1Hooks = new PostV1Hooks(); // PostV1Hooks | 
try {
    Hook result = apiInstance.postV1Hooks(userKey, authorization, v1Hooks);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HooksApi#postV1Hooks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userKey** | **String**| The &#x60;user_key&#x60; from [developer.meltwater.io](https://developer.meltwater.io/admin/applications/). |
 **authorization** | **String**| &#x60;Oauth Access Token&#x60;    OAuth access token (RFC 6749). Must contain the access token type &#x60;Bearer&#x60;  followed by an OAuth access token.    #### Example:        Bearer KKwmfHwxsEoeMDTMAfxOpO... |
 **v1Hooks** | [**PostV1Hooks**](PostV1Hooks.md)|  |

### Return type

[**Hook**](Hook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

