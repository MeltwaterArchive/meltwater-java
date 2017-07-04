# SwaggerDocApi

All URIs are relative to *https://api.meltwater.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCompleteSwaggerSpec**](SwaggerDocApi.md#getCompleteSwaggerSpec) | **GET** /v2/swagger_doc | Meltwater API Swagger Spec


<a name="getCompleteSwaggerSpec"></a>
# **getCompleteSwaggerSpec**
> getCompleteSwaggerSpec(userKey)

Meltwater API Swagger Spec

Get the complete Swagger Spec that describes all Meltwater API endpoints.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SwaggerDocApi;


SwaggerDocApi apiInstance = new SwaggerDocApi();
String userKey = "userKey_example"; // String | The `user_key` from [developer.meltwater.com](https://developer.meltwater.com/admin/applications/).
try {
    apiInstance.getCompleteSwaggerSpec(userKey);
} catch (ApiException e) {
    System.err.println("Exception when calling SwaggerDocApi#getCompleteSwaggerSpec");
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

