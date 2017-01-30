# Meltwater Java SDK

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.ClientsApi;

import java.io.File;
import java.util.*;

public class ClientsApiExample {

    public static void main(String[] args) {
        
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.meltwater.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ClientsApi* | [**deleteV1ClientsClientId**](docs/ClientsApi.md#deleteV1ClientsClientId) | **DELETE** /v1/clients/{client_id} | Delete client.
*ClientsApi* | [**postV1Clients**](docs/ClientsApi.md#postV1Clients) | **POST** /v1/clients | Register new client
*HooksApi* | [**deleteV1HooksId**](docs/HooksApi.md#deleteV1HooksId) | **DELETE** /v1/hooks/{id} | Delete an existing hook.
*HooksApi* | [**getV1Hooks**](docs/HooksApi.md#getV1Hooks) | **GET** /v1/hooks | List all hooks.
*HooksApi* | [**postV1Hooks**](docs/HooksApi.md#postV1Hooks) | **POST** /v1/hooks | Creates a hook for one of your predefined searches.
*OauthApi* | [**postOauth2Token**](docs/OauthApi.md#postOauth2Token) | **POST** /oauth2/token | Create an access token
*SearchesApi* | [**getV1Searches**](docs/SearchesApi.md#getV1Searches) | **GET** /v1/searches | List your saved searches.


## Documentation for Models

 - [ClientCredentials](docs/ClientCredentials.md)
 - [Error](docs/Error.md)
 - [ErrorsCollection](docs/ErrorsCollection.md)
 - [Hook](docs/Hook.md)
 - [HooksCollection](docs/HooksCollection.md)
 - [OAuth2Token](docs/OAuth2Token.md)
 - [PostV1Hooks](docs/PostV1Hooks.md)
 - [Search](docs/Search.md)
 - [SearchesCollection](docs/SearchesCollection.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author

support@api.meltwater.com

