Demo of executable resource in Maven
========

Maven fails to copy the permissions of the executable resource
when it copies it from the `src/test/resource/` folder to the `target/test-classes` folder.

There is a bug open against this issue:
https://issues.apache.org/jira/browse/MRESOURCES-132

To see this bug in action, simply clone this project and run:

```
mvn test
```
