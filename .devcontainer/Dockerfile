# Dockerfile
FROM mcr.microsoft.com/devcontainers/java:1-21-bullseye

# Install .NET 8
RUN wget https://dot.net/v1/dotnet-install.sh -O dotnet-install.sh \
    && chmod +x dotnet-install.sh \
    && ./dotnet-install.sh --channel 8.0 \
    && rm dotnet-install.sh

# Add .NET to PATH for all users
ENV DOTNET_ROOT="/root/.dotnet"
ENV PATH="$DOTNET_ROOT:$PATH"

# Ensure .NET binaries are executable and accessible
RUN chmod -R a+rx /root/.dotnet

# Install Python 3
RUN apt-get update \
    && apt-get install -y python3 python3-pip \
    && apt-get clean \
    && rm -rf /var/lib/apt/lists/*
