#!/bin/bash
openapi-generator generate -i ../Published_schema/jaderb-datexpull-1.0.2-swagger-local.yaml -g  aspnetcore -o .Net/DatexServer_Published --additional-properties=aspnetCoreVersion=6.0 --skip-operation-example
