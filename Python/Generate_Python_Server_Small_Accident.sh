#!/bin/bash
java -jar /usr/local/bin/openapi-generator-cli.jar generate \
    -i ../Schema_Small_Accident/datexpull-1.0.2.yaml \
    -g  python-flask \
    -o DatexServer_Small_Accident \
    --skip-operation-example
