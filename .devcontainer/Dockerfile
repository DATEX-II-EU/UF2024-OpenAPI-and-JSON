FROM mcr.microsoft.com/vscode/devcontainers/base:ubuntu

# Install dependencies
RUN apt-get update && apt-get install -y \
    openjdk-11-jdk \
    maven \
    wget \
    unzip

# Install OpenAPI Generator
RUN wget https://repo1.maven.org/maven2/org/openapitools/openapi-generator-cli/6.0.0/openapi-generator-cli-6.0.0.jar -O /usr/local/bin/openapi-generator-cli.jar
RUN echo 'alias openapi-generator="java -jar /usr/local/bin/openapi-generator-cli.jar"' >> ~/.bashrc