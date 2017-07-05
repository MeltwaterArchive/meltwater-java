# HooksApi

All URIs are relative to *https://api.meltwater.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createHook**](HooksApi.md#createHook) | **POST** /v2/hooks | Creates a hook for one of your predefined searches.
[**deleteHook**](HooksApi.md#deleteHook) | **DELETE** /v2/hooks/{hook_id} | Delete an existing hook.
[**getAllHooks**](HooksApi.md#getAllHooks) | **GET** /v2/hooks | List all hooks.


<a name="createHook"></a>
# **createHook**
> Hook createHook(userKey, authorization, v2Hooks, xHookSecret)

Creates a hook for one of your predefined searches.

Creates a hook for one of your predefined searches.  Delivers search results for the query referenced by the &#x60;search_id&#x60; to the &#x60;target_url&#x60; via HTTP POST. Note that a &#x60;hook_id&#x60; will be returned on successful creation, this id is needed to delete the hook.   We are also returning the header: &#x60;X-Hook-Secret&#x60;, a shared secret used to sign the document body pushed to your &#x60;target_url&#x60;.    Requires an OAuth access token.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HooksApi;


HooksApi apiInstance = new HooksApi();
String userKey = "userKey_example"; // String | The `user_key` from [developer.meltwater.com](https://developer.meltwater.com/admin/applications/).
String authorization = "authorization_example"; // String | `Oauth Access Token`    OAuth access token (RFC 6749). Must contain the access token type `Bearer`  followed by an OAuth access token.    #### Example:        Bearer KKwmfHwxsEoeMDTMAfxOpO...
PostV2Hooks v2Hooks = new PostV2Hooks(); // PostV2Hooks | 
String xHookSecret = "xHookSecret_example"; // String | Shared secret for content signing/verification.    The shared secret header is optional and can be provided by the user or will  be set by the API. Must be between 16 and 64 characters.  Obtain the shared secret from the response header `X-Hook-Secret`.    #### Example:        e2d264b524240b9572ebc2fc7eebd980
try {
    Hook result = apiInstance.createHook(userKey, authorization, v2Hooks, xHookSecret);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HooksApi#createHook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userKey** | **String**| The &#x60;user_key&#x60; from [developer.meltwater.com](https://developer.meltwater.com/admin/applications/). |
 **authorization** | **String**| &#x60;Oauth Access Token&#x60;    OAuth access token (RFC 6749). Must contain the access token type &#x60;Bearer&#x60;  followed by an OAuth access token.    #### Example:        Bearer KKwmfHwxsEoeMDTMAfxOpO... |
 **v2Hooks** | [**PostV2Hooks**](PostV2Hooks.md)|  |
 **xHookSecret** | **String**| Shared secret for content signing/verification.    The shared secret header is optional and can be provided by the user or will  be set by the API. Must be between 16 and 64 characters.  Obtain the shared secret from the response header &#x60;X-Hook-Secret&#x60;.    #### Example:        e2d264b524240b9572ebc2fc7eebd980 | [optional]

### Return type

[**Hook**](Hook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteHook"></a>
# **deleteHook**
> deleteHook(userKey, authorization, hookId)

Delete an existing hook.

Delete an existing hook.  Removes the hook and stops sending any search results to the target_url.    Requires an OAuth access token.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HooksApi;


HooksApi apiInstance = new HooksApi();
String userKey = "userKey_example"; // String | The `user_key` from [developer.meltwater.com](https://developer.meltwater.com/admin/applications/).
String authorization = "authorization_example"; // String | `Oauth Access Token`    OAuth access token (RFC 6749). Must contain the access token type `Bearer`  followed by an OAuth access token.    #### Example:        Bearer KKwmfHwxsEoeMDTMAfxOpO...
String hookId = "hookId_example"; // String | Hook ID received from creating a hook
try {
    apiInstance.deleteHook(userKey, authorization, hookId);
} catch (ApiException e) {
    System.err.println("Exception when calling HooksApi#deleteHook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userKey** | **String**| The &#x60;user_key&#x60; from [developer.meltwater.com](https://developer.meltwater.com/admin/applications/). |
 **authorization** | **String**| &#x60;Oauth Access Token&#x60;    OAuth access token (RFC 6749). Must contain the access token type &#x60;Bearer&#x60;  followed by an OAuth access token.    #### Example:        Bearer KKwmfHwxsEoeMDTMAfxOpO... |
 **hookId** | **String**| Hook ID received from creating a hook |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllHooks"></a>
# **getAllHooks**
> HooksCollection getAllHooks(userKey, authorization)

List all hooks.

List all hooks.     Delivers all previously generated hooks.    Requires an OAuth access token.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HooksApi;


HooksApi apiInstance = new HooksApi();
String userKey = "userKey_example"; // String | The `user_key` from [developer.meltwater.com](https://developer.meltwater.com/admin/applications/).
String authorization = "authorization_example"; // String | `Oauth Access Token`    OAuth access token (RFC 6749). Must contain the access token type `Bearer`  followed by an OAuth access token.    #### Example:        Bearer KKwmfHwxsEoeMDTMAfxOpO...
try {
    HooksCollection result = apiInstance.getAllHooks(userKey, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HooksApi#getAllHooks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userKey** | **String**| The &#x60;user_key&#x60; from [developer.meltwater.com](https://developer.meltwater.com/admin/applications/). |
 **authorization** | **String**| &#x60;Oauth Access Token&#x60;    OAuth access token (RFC 6749). Must contain the access token type &#x60;Bearer&#x60;  followed by an OAuth access token.    #### Example:        Bearer KKwmfHwxsEoeMDTMAfxOpO... |

### Return type

[**HooksCollection**](HooksCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

