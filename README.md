# prova_pratica2

[![Coverage Status](https://coveralls.io/repos/github/francescopasqual/prova_pratica2/badge.svg?branch=main)](https://coveralls.io/github/francescopasqual/prova_pratica2?branch=main)

WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by com.google.common.util.concurrent.AbstractFuture$UnsafeAtomicHelper (file:/usr/share/maven/lib/guava.jar)
WARNING: Please consider reporting this to the maintainers of class com.google.common.util.concurrent.AbstractFuture$UnsafeAtomicHelper
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
[INFO] Scanning for projects...
[INFO] 
[INFO] ---------------------< it.unipd.mtss:roman-number >---------------------
[INFO] Building roman-number 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:3.1.0:clean (default-clean) @ roman-number ---
[INFO] Deleting /home/francesco/Desktop/prova_pratica2/roman-number/target
[INFO] 
[INFO] --- jacoco-maven-plugin:0.8.11:prepare-agent (prepare-agent) @ roman-number ---
[INFO] argLine set to -javaagent:/home/francesco/.m2/repository/org/jacoco/org.jacoco.agent/0.8.11/org.jacoco.agent-0.8.11-runtime.jar=destfile=/home/francesco/Desktop/prova_pratica2/roman-number/target/jacoco.exec
[INFO] 
[INFO] --- maven-resources-plugin:3.0.2:resources (default-resources) @ roman-number ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/francesco/Desktop/prova_pratica2/roman-number/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.0:compile (default-compile) @ roman-number ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 2 source files to /home/francesco/Desktop/prova_pratica2/roman-number/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:3.0.2:testResources (default-testResources) @ roman-number ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/francesco/Desktop/prova_pratica2/roman-number/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.0:testCompile (default-testCompile) @ roman-number ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 2 source files to /home/francesco/Desktop/prova_pratica2/roman-number/target/test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:2.22.1:test (default-test) @ roman-number ---
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 0, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] 
[INFO] --- maven-jar-plugin:3.0.2:jar (default-jar) @ roman-number ---
[INFO] Building jar: /home/francesco/Desktop/prova_pratica2/roman-number/target/roman-number-1.0-SNAPSHOT.jar
[INFO] 
[INFO] --- maven-checkstyle-plugin:3.3.1:check (check-style) @ roman-number ---
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  4.222 s
[INFO] Finished at: 2025-05-09T16:04:10+02:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-checkstyle-plugin:3.3.1:check (check-style) on project roman-number: Failed during checkstyle execution: There are 2 errors reported by Checkstyle 9.3 with checkstyle.xml ruleset. -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoExecutionException

