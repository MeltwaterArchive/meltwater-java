# ClientsApi

All URIs are relative to *https://api.meltwater.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteV1ClientsClientId**](ClientsApi.md#deleteV1ClientsClientId) | **DELETE** /v1/clients/{client_id} | Delete client.
[**postV1Clients**](ClientsApi.md#postV1Clients) | **POST** /v1/clients | Register new client


<a name="deleteV1ClientsClientId"></a>
# **deleteV1ClientsClientId**
> deleteV1ClientsClientId(userKey, authorization, clientId)

Delete client.

Delete client.    Deletes your current client credentials consisting of  client_id and client_secret. After calling this resource, you will not be able  to use the Meltwater API unless you create a new set of client credentials!  Requires your Meltwater credentials (&#x60;email&#x60;:&#x60;password&#x60;) to authenticate.   #### Appendix    The Base64-encoded &#x60;email&#x60;:&#x60;password&#x60; string can be generated in a terminal  with following command:        $ echo -n \&quot;your_email@your_domain.com:your_secret_password\&quot; | base64    &lt;i&gt;You will need &#x60;base64&#x60; installed.&lt;/i&gt;

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClientsApi;


ClientsApi apiInstance = new ClientsApi();
String userKey = "userKey_example"; // String | The `user_key` from [developer.meltwater.io](https://developer.meltwater.io/admin/applications/).
String authorization = "authorization_example"; // String | `email`:`password`    Basic Auth (RFC2617) credentials. Must contain the realm `Basic` followed by a  Base64-encoded `email`:`password` pair using your Meltwater credentials.    #### Example:        Basic bXlfZW1haWxAZXhhbXJzZWNyZXQ=
String clientId = "clientId_example"; // String | Client ID
try {
    apiInstance.deleteV1ClientsClientId(userKey, authorization, clientId);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#deleteV1ClientsClientId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userKey** | **String**| The &#x60;user_key&#x60; from [developer.meltwater.io](https://developer.meltwater.io/admin/applications/). |
 **authorization** | **String**| &#x60;email&#x60;:&#x60;password&#x60;    Basic Auth (RFC2617) credentials. Must contain the realm &#x60;Basic&#x60; followed by a  Base64-encoded &#x60;email&#x60;:&#x60;password&#x60; pair using your Meltwater credentials.    #### Example:        Basic bXlfZW1haWxAZXhhbXJzZWNyZXQ&#x3D; |
 **clientId** | **String**| Client ID |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postV1Clients"></a>
# **postV1Clients**
> ClientCredentials postV1Clients(userKey, authorization)

Register new client

Register new client     Creates a new pair of client credentials (&#x60;client_id&#x60;/&#x60;client_secret&#x60; pair).  Requires your Meltwater credentials (&#x60;email&#x60;:&#x60;password&#x60;) to authenticate.   #### Appendix    The Base64-encoded &#x60;email&#x60;:&#x60;password&#x60; string can be generated in a terminal  with following command:        $ echo -n \&quot;your_email@your_domain.com:your_secret_password\&quot; | base64    &lt;i&gt;You will need &#x60;base64&#x60; installed.&lt;/i&gt;

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClientsApi;


ClientsApi apiInstance = new ClientsApi();
String userKey = "userKey_example"; // String | The `user_key` from [developer.meltwater.io](https://developer.meltwater.io/admin/applications/).
String authorization = "authorization_example"; // String | `email`:`password`    Basic Auth (RFC2617) credentials. Must contain the realm `Basic` followed by a  Base64-encoded `email`:`password` pair using your Meltwater credentials.    #### Example:        Basic bXlfZW1haWxAZXhhbXJzZWNyZXQ=
try {
    ClientCredentials result = apiInstance.postV1Clients(userKey, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#postV1Clients");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userKey** | **String**| The &#x60;user_key&#x60; from [developer.meltwater.io](https://developer.meltwater.io/admin/applications/). |
 **authorization** | **String**| &#x60;email&#x60;:&#x60;password&#x60;    Basic Auth (RFC2617) credentials. Must contain the realm &#x60;Basic&#x60; followed by a  Base64-encoded &#x60;email&#x60;:&#x60;password&#x60; pair using your Meltwater credentials.    #### Example:        Basic bXlfZW1haWxAZXhhbXJzZWNyZXQ&#x3D; |

### Return type

[**ClientCredentials**](ClientCredentials.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

