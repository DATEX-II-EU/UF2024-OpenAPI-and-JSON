# Dockerfile
FROM mcr.microsoft.com/devcontainers/java:1-21-bullseye

# Install .NET 8
RUN wget https://dot.net/v1/dotnet-install.sh -O dotnet-install.sh \
    && chmod +x dotnet-install.sh \
    && ./dotnet-install.sh --channel 8.0 \
    && rm dotnet-install.sh

# Add .NET to PATH
ENV PATH="/root/.dotnet:/root/.dotnet/tools:${PATH}"

# Ensure .NET binaries are executable
RUN chmod -R a+x /root/.dotnet

