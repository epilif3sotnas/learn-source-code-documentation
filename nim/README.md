## Run

Commands to run the project:

```
cd {PATH_REPOSITORY}/nim;
nimble run;
```

&nbsp;


## Build documentation

Commands to build documentation of the project:

```
cd {PATH_REPOSITORY}/nim;
nim doc --project --index:on --outdir:htmldocs src/main.nim;
```

&nbsp;


## Create server for documentation

Commands to create a server for documentation:

```
cd {PATH_REPOSITORY}/nim;
python3 -m http.server 8080 --directory htmldocs;
```