# SearchesApi

All URIs are relative to *https://api.meltwater.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllSearches**](SearchesApi.md#getAllSearches) | **GET** /v2/searches | List your saved searches.


<a name="getAllSearches"></a>
# **getAllSearches**
> SearchesCollection getAllSearches(userKey, authorization)

List your saved searches.

List your saved searches.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SearchesApi;


SearchesApi apiInstance = new SearchesApi();
String userKey = "userKey_example"; // String | The `user_key` from [developer.meltwater.com](https://developer.meltwater.com/admin/applications/).
String authorization = "authorization_example"; // String | `Oauth Access Token`    OAuth access token (RFC 6749). Must contain the access token type `Bearer`  followed by an OAuth access token.    #### Example:        Bearer KKwmfHwxsEoeMDTMAfxOpO...
try {
    SearchesCollection result = apiInstance.getAllSearches(userKey, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchesApi#getAllSearches");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userKey** | **String**| The &#x60;user_key&#x60; from [developer.meltwater.com](https://developer.meltwater.com/admin/applications/). |
 **authorization** | **String**| &#x60;Oauth Access Token&#x60;    OAuth access token (RFC 6749). Must contain the access token type &#x60;Bearer&#x60;  followed by an OAuth access token.    #### Example:        Bearer KKwmfHwxsEoeMDTMAfxOpO... |

### Return type

[**SearchesCollection**](SearchesCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

