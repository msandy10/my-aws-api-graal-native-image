FROM oracle/graalvm-ce:20.0.0-java8 as graalvm
# For JDK 11
#FROM oracle/graalvm-ce:20.0.0-java11 as graalvm
RUN gu install native-image

COPY . /home/app/my-aws-api-graal-native-image
WORKDIR /home/app/my-aws-api-graal-native-image

RUN native-image --no-server -cp build/libs/my-aws-api-graal-native-image-*-all.jar

FROM frolvlad/alpine-glibc
RUN apk update && apk add libstdc++
EXPOSE 8080
COPY --from=graalvm /home/app/my-aws-api-graal-native-image/my-aws-api-graal-native-image /app/my-aws-api-graal-native-image
ENTRYPOINT ["/app/my-aws-api-graal-native-image"]
