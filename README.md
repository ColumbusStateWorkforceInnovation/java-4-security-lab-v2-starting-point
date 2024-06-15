# Java 4 Security Lab

## Introduction
This lab implements security using Spring Security, JWT, and OAauth2.

## Setup
1. Clone the repository
2. Start the Docker dependencies by running `docker-compose up`
3. Log into Keycloak at `http://localhost:9999/admin` with the credentials `admin/admin`
4. In Keycloak, create a new realm called `security-lab`
5. Create a new client called `jwt-client`
6. Enable Client Authentication and Authorization for the client
7. *IMPORTANT*: Regenerate the client secret.
8. Create a new user called `java4user` with the email verified enabled.
9. Set the password for the user to `password1234`, with temporary disabled.
10. Optionally, navigate to Realm Settings -> Tokens and set the Access Token Lifespan to 30 minutes.

## Retrieving the Access Token
1. Log into Keycloak at `http://localhost:9999/admin` with the credentials `admin/admin`
2. In Keycloak, navigate to the `security-lab` realm
3. Navigate to the `jwt-client` client
4. Click on the `Credentials` tab
5. Copy the `Secret` value
6. Run the following command to retrieve the access token:
    ```bash
    curl -X POST 'http://localhost:9999/realms/security-lab/protocol/openid-connect/token' \
    --header 'Content-Type: application/x-www-form-urlencoded' \
    --data-urlencode 'grant_type=password' \
    --data-urlencode 'client_id=jwt-client' \
    --data-urlencode 'client_secret=<client secret>' \
    --data-urlencode 'username=java4user' \
    --data-urlencode 'password=password1234' \
    --data-urlencode 'scope=<space separated list of scopes>'
    ```
7. Copy the `access_token` value
8. Use the `access_token` as a Bearer token to make requests to the application

## Creating Client Scopes
In order to restrict access to the different operations, we need to create client scopes for each operation.
1. Log into Keycloak at `http://localhost:9999/admin` with the credentials `admin/admin`
2. In Keycloak, navigate to the `security-lab` realm
3. Navigate to the `Client Scopes` tab
4. Create a new client scope called `<model>:read`. Set the scope to "Optional" and "Include in Token Scope" to true.
5. Follow the same steps to create a new client scope for the "update", "create", and "delete" operations.

## Running the application
1Run the application by executing `./gradlew bootRun`
2The application will be available at `http://localhost:8080`

## Scopes for this Application
List your scopes here: