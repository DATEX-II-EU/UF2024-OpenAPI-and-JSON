#!/bin/bash

set -e  # Exit immediately if a command exits with a non-zero status

echo 'Starting wget'
sudo wget https://repo1.maven.org/maven2/org/openapitools/openapi-generator-cli/6.0.0/openapi-generator-cli-6.0.0.jar -O /usr/local/bin/openapi-generator-cli.jar || { echo 'wget failed'; exit 1; }

echo 'Starting chmod'
sudo chmod +x /usr/local/bin/openapi-generator-cli.jar || { echo 'chmod failed'; exit 1; }

echo 'Updating .bashrc'
# Use a here document to append the alias to .bashrc
cat << 'EOF' >> ~/.bashrc

# Alias for OpenAPI Generator CLI
alias openapi-generator="java -jar /usr/local/bin/openapi-generator-cli.jar"
EOF

echo 'Adding alias to current session'
alias openapi-generator="java -jar /usr/local/bin/openapi-generator-cli.jar" || { echo 'alias command failed'; exit 1; }
