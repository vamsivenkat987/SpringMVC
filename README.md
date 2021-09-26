[![Maven Central](https://maven-badges.herokuapp.com/maven-central/cz.jirutka.rsql/rsql-parser/badge.svg)](https://maven-badges.herokuapp.com/maven-central/cz.jirutka.rsql/rsql-parser)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)

# DailyDoListWebApplication

*This is Maven-Spring based WebApplication using Java. The main aim of the project is to Add, Update, Delete and View list. The IDE used to build this project was IntelliJ.*
## Installation
```
git clone https://github.com/vamsivenkat987/WebApp-Spring.git
```

## How to run the project
*From the root of the project:*

```
mvn clean install
java -jar target/TodoList-1.0-SNAPSHOT-exec.jar
```
*This will spin up a spring boot application to HomePage. From there there is link to view the items list. In the /items page there is table of list to add, delete and update links which can done with 
that you can fire a GET request at to get some dummy output*


## How this works
### Dependency Management
*Each of the modules are themselves maven modules, which a parent pom in the root of the project. The parent pom orchestrates building each of the modules.*
*The app module then brings these in as dependencies, which can be seen in pom.xml for the app module and in the module-info.java inside /src/main in the app module.*
