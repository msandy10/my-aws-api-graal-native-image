#!/bin/sh
docker build . -t my-aws-api-graal-native-image
echo
echo
echo "To run the docker container execute:"
echo "    $ docker run -p 8080:8080 my-aws-api-graal-native-image"
