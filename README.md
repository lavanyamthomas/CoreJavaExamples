### Design pattern

### Design Pattern

Design Patterns - Elements of Reusable Object-Oriented Software

### Prerequisites

Java 1.8 (http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

Maven 3 (http://www.sonatype.com/books/mvnref-book/reference/installation.html)

git command line tool (https://help.github.com/articles/set-up-git)


#### Factory pattern

Create object without exposing the creation logic to the client and refer to newly created object using a common interface.

#### Abstract Factory pattern

its works around super factory which create other factories. this factory also called as factory of factories

#### Singleton pattern

This pattern involves a single class which is responsible to create an object while making sure that only single object gets created.

#### Builder Pattern

Builder pattern builds a complex object using simple objects and using a step by step approach.

#### ProtoType Pattern

Prototype pattern refers to creating duplicate object while keeping performance in mind. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.

This pattern involves implementing a prototype interface which tells to create a clone of the current object. This pattern is used when creation of object directly is costly. For example, an object is to be created after a costly database operation. We can cache the object, returns its clone on next request and update the database as and when needed thus reducing database calls.

*****************************************************************************************************************************

#Java 8:

###Closure

A closure is a block of code that can be referenced (and passed around) with access to the variables of the enclosing scope.

A closure is a special kind of object that combines two things: a function, and the environment in which that function was created. The environment consists of any local variables that were in-scope at the time that the closure was created.

This fundamental mechanism allows the creation of closures that saves the storage location of free variables — those can be modified by the function itself as well as by others.


#Threads 

A thread is a single sequence of execution within a program

MultipleThread: its refers to multiple threads control of single program
Example: Each program can run multiple threads of control within it.


Process: Executing instance of a program is called a process. Thread is subset of the process.
Thread shared the address space of the process that created it. Process have it own address space.









