# Maven archetype for Vert.x project

### What's inside:

Libs:

- [Vert.x](http://vertx.io/)
- [Guice](https://github.com/google/guice)
- [Lombok](https://projectlombok.org/)

Code:

- Main Verticle
- Sample EventBus usage with test case
- Guice Module


How to use:

1. Clone repo
2. Inside repository execute

    ```
    mvn install
    ```
3. Then you can use archetype

    ```
    mvn archetype:generate \
    -DarchetypeGroupId=eu.espeo \
    -DarchetypeArtifactId=vertx3-microservice-archetype \
    -DarchetypeVersion=0.0.1
    ```

### Todos

  - sample REST endpoint
  - Push to Maven Central repository
 
License
----
Apache License 2.0
