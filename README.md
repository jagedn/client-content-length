# Overwrite micronaut.http.client.max-content-length

```
MICRONAUT_HTTP_CLIENT_MAX_CONTENT_LENGTH=1mb \
MICRONAUT_HTTP_CLIENT_MAX_CONTENT=2MB \
MICRONAUT_HTTP_CLIENT_MAX_CONTENT_LENGTH_TEST=TEST \
./gradlew run

> Task :run
maxContentLength 10mb
maxContent 2MB
maxContentLengthTest TEST

```