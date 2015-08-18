# Maven archetype for Vert.x project

What's inside:

- [Vert.x](http://vertx.io/)
- [Guice](https://github.com/google/guice)
- [Lombok](https://projectlombok.org/)

How to use:
1. Clone repo

2. Inside repository execute

```
mvn install
```

3. Then you can user archetype

```
mvn archetype:generate \
-DarchetypeGroupId=pl.espeo \
-DarchetypeArtifactId=vertx3-microservice-archetype \
-DarchetypeVersion=0.0.1
```

### Todos

 - Write Test Skeleton
 - Use Event Bus in MicroserviceVerticle
 - Push to Maven Central repository
 
License
----
Apache License 2.0
