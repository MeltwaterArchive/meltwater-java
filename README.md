# Meltwater Java SDK

_**Disclaimer: This client was generated automatically based on our Swagger Spec. We are sharing it for purely demonstrative purposes. We hope it it helps. If you have any comments please open an issue, we would love to hear from you!**_

The Meltwater API provides the needed resources for Meltwater clients to create & delete REST Hooks and stream Meltwater search results to their specified destination.

This SDK is automatically generated using [Swagger Codegen](https://github.com/swagger-api/swagger-codegen).

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
        String userKey = "userKey_example"; // String | The `user_key` from [developer.meltwater.com](https://developer.meltwater.com/admin/applications/).
        String authorization = "authorization_example"; // String | `email`:`password`    Basic Auth (RFC2617) credentials. Must contain the realm `Basic` followed by a  Base64-encoded `email`:`password` pair using your Meltwater credentials.    #### Example:        Basic bXlfZW1haWxAZXhhbXJzZWNyZXQ=
        try {
            ClientCredentials result = apiInstance.createClientCredentials(userKey, authorization);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientsApi#createClientCredentials");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.meltwater.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ClientsApi* | [**createClientCredentials**](docs/ClientsApi.md#createClientCredentials) | **POST** /v1/clients | Register new client
*ClientsApi* | [**deleteClientCredentials**](docs/ClientsApi.md#deleteClientCredentials) | **DELETE** /v1/clients/{client_id} | Delete client.
*HooksApi* | [**createHook**](docs/HooksApi.md#createHook) | **POST** /v1/hooks | Creates a hook for one of your predefined searches.
*HooksApi* | [**deleteHook**](docs/HooksApi.md#deleteHook) | **DELETE** /v1/hooks/{id} | Delete an existing hook.
*HooksApi* | [**getAllHooks**](docs/HooksApi.md#getAllHooks) | **GET** /v1/hooks | List all hooks.
*OauthApi* | [**createToken**](docs/OauthApi.md#createToken) | **POST** /oauth2/token | Create an access token
*SearchesApi* | [**getAllSearches**](docs/SearchesApi.md#getAllSearches) | **GET** /v1/searches | List your saved searches.


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

