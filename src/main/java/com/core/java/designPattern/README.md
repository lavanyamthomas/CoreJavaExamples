### Design Pattern

Design Patterns - Elements of Reusable Object-Oriented Software

#### Factory pattern

Create object without exposing the creation logic to the client and refer to newly created object using a common interface.


### Prerequisites

Java 1.8 (http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

Maven 3 (http://www.sonatype.com/books/mvnref-book/reference/installation.html)

git command line tool (https://help.github.com/articles/set-up-git)


#### Factory pattern

Create object without exposing the creation logic to the client and refer to newly created object using a common interface

### Project from GIT Repo

git clone https://github.com/lavanyamthomas/ChildrenGame.git

### Setup application in Eclipse (Spring Tool Suite)

Working with Children Circle Game in Eclipse/STS

Note : Eclipse will create the needed .project, .settings, .classpath files based on your pom.xml and environment settings (installed Java version, etc.) . The earlier versions of Eclipse needed to have run the command mvn eclipse:eclipse which produced the same result.

Import as Existing Maven Project and run it as maven Application.

mvn(Maven) clean via eclipse

mvn(Maven) install via eclipse
 
### Run application from eclipse

 *ChildrenGameMain.java* run as java application
 
### Run application from command line
 
 mvn clean install
 
 get the **ChildrensGame-0.0.1-SNAPSHOT.jar** under target folder
 
 execute the app suing the following command
 
 **java -jar ChildrensGame-0.0.1-SNAPSHOT.jar**
 