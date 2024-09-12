#!/bin/bash
java -jar /usr/local/bin/openapi-generator-cli.jar generate -i generate -i ../Schema_Small_Accident/datexpull-1.0.2.yaml -g spring -o Java/DatexServer_Small_Accident
