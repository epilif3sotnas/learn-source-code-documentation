## Run

Commands to run the project:

```
cd {PATH_REPOSITORY}/java;
mvn package -q;
java -jar target/learn-source-code-documentation-jar-with-dependencies.jar;
```

&nbsp;


## Build documentation

Commands to build documentation of the project:

```
cd {PATH_REPOSITORY}/nim;
mvn javadoc:javadoc -q;
```

&nbsp;


## Create server for documentation

Commands to create a server for documentation:

```
cd {PATH_REPOSITORY}/nim;
python3 -m http.server 8080 --directory target/site;
```