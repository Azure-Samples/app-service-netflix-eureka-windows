# Netflix Eureka on App Service (Windows)

This is a sample project to demonstrate how to configure Netflix Eureka for use on Azure Apps Service.

## Features

This project framework provides the following features:

* 1 discovery server
* 2 services which provide data
* 1 service which consumes the data of the other 2
* Maven project files which are used to manage dependencies, specify build operations, and deploy to Azure

## Getting Started

### Prerequisites

* Java JDK 1.8
* Maven
* Azure CLI

### Quickstart

Ensure you are logged into the Azure CLI with `az login`

1. git clone <https://github.com/Azure-Samples/app-service-netflix-eureka-windows.git>
2. cd app-service-netflix-eureka-windows
3. `mvn clean prepare-package package azure-webapp:deploy -DskipTests`

## Resources

See [this blog post](https://azure.github.io/AppService/2020/08/04/Netflix-Eureka-On-Apps-Service-Windows.html) for more information about configuring Netflix Eureka for App Service.

This project is based on [this project](https://github.com/koushikkothagal/spring-boot-microservices-workshop), which demonstrates the basic principles of Netflix Eureka.
