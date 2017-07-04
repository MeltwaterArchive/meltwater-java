# SchemasApi

All URIs are relative to *https://api.meltwater.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEditorialStreamingJsonSchema**](SchemasApi.md#getEditorialStreamingJsonSchema) | **GET** /v2/schemas/editorial_streaming.json | Editorial Streaming JSON schema
[**getSocialStreamingJsonSchema**](SchemasApi.md#getSocialStreamingJsonSchema) | **GET** /v2/schemas/social_streaming.json | Social Streaming JSON schema


<a name="getEditorialStreamingJsonSchema"></a>
# **getEditorialStreamingJsonSchema**
> getEditorialStreamingJsonSchema(userKey)

Editorial Streaming JSON schema

Get the JSON schema describing the layout of Editorial Streaming documents.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SchemasApi;


SchemasApi apiInstance = new SchemasApi();
String userKey = "userKey_example"; // String | The `user_key` from [developer.meltwater.com](https://developer.meltwater.com/admin/applications/).
try {
    apiInstance.getEditorialStreamingJsonSchema(userKey);
} catch (ApiException e) {
    System.err.println("Exception when calling SchemasApi#getEditorialStreamingJsonSchema");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userKey** | **String**| The &#x60;user_key&#x60; from [developer.meltwater.com](https://developer.meltwater.com/admin/applications/). |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSocialStreamingJsonSchema"></a>
# **getSocialStreamingJsonSchema**
> getSocialStreamingJsonSchema(userKey)

Social Streaming JSON schema

Get the JSON schema describing the layout of Social Streaming documents.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SchemasApi;


SchemasApi apiInstance = new SchemasApi();
String userKey = "userKey_example"; // String | The `user_key` from [developer.meltwater.com](https://developer.meltwater.com/admin/applications/).
try {
    apiInstance.getSocialStreamingJsonSchema(userKey);
} catch (ApiException e) {
    System.err.println("Exception when calling SchemasApi#getSocialStreamingJsonSchema");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userKey** | **String**| The &#x60;user_key&#x60; from [developer.meltwater.com](https://developer.meltwater.com/admin/applications/). |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

