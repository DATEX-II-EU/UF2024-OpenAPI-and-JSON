#!/bin/bash
java -jar /usr/local/bin/openapi-generator-cli.jar generate -i ../Schema_Small_Accident/datexpull-1.0.2.yaml -g  aspnetcore -o .Net/DatexServer_Small_Accident --additional-properties=aspnetCoreVersion=6.0
