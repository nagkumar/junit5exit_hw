https://github.com/tginsberg/junit5-system-exit
https://github.com/tginsberg/junit5-system-exit/issues/34
https://www.linkedin.com/in/tginsberg/
https://github.com/nagkumar/junit5exit_hw

Not sure if maintained well as the last commit is around a year ago as of July 2025

Works in JDK17,21,23 too
Does not work only in JDK 24

Starting Gradle Daemon...
Gradle Daemon started in 1 s 61 ms
> Task :compileJava
> Task :processResources NO-SOURCE
> Task :classes
> Task :compileTestJava
> Task :processTestResources NO-SOURCE
> Task :testClasses
Hello, World!
Unexpected exception thrown.
org.gradle.internal.remote.internal.MessageIOException: Could not write '/127.0.0.1:61790'.
at org.gradle.internal.remote.internal.inet.SocketConnection.flush(SocketConnection.java:142)
at org.gradle.internal.remote.internal.hub.MessageHub$ConnectionDispatch.run(MessageHub.java:333)
at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
at org.gradle.internal.concurrent.AbstractManagedExecutor$1.run(AbstractManagedExecutor.java:48)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.io.IOException: Connection reset by peer
at java.base/sun.nio.ch.SocketDispatcher.write0(Native Method)
at java.base/sun.nio.ch.SocketDispatcher.write(SocketDispatcher.java:54)
at java.base/sun.nio.ch.IOUtil.writeFromNativeBuffer(IOUtil.java:137)
at java.base/sun.nio.ch.IOUtil.write(IOUtil.java:81)
at java.base/sun.nio.ch.IOUtil.write(IOUtil.java:58)
at java.base/sun.nio.ch.SocketChannelImpl.implWrite(SocketChannelImpl.java:562)
at java.base/sun.nio.ch.SocketChannelImpl.write(SocketChannelImpl.java:614)
at org.gradle.internal.remote.internal.inet.SocketConnection$SocketOutputStream.writeWithNonBlockingRetry(SocketConnection.java:282)
at org.gradle.internal.remote.internal.inet.SocketConnection$SocketOutputStream.writeBufferToChannel(SocketConnection.java:269)
at org.gradle.internal.remote.internal.inet.SocketConnection$SocketOutputStream.flush(SocketConnection.java:263)
at org.gradle.internal.remote.internal.inet.SocketConnection.flush(SocketConnection.java:140)
... 6 more
> Task :test FAILED
HelloWorldTest > testSystemExit() SKIPPED
FAILURE: Build failed with an exception.
* What went wrong:

D:\OS\WIn11\devs\langs\java\jdks\24.x\24.0.1\bin\java.exe, --add-opens=java.base/java.lang=ALL-UNNAMED, --add-opens=java.base/java.lang.invoke=ALL-UNNAMED, --add-opens=java.base/java.util=ALL-UNNAMED, --add-opens=java.prefs/java.util.prefs=ALL-UNNAMED, --add-exports=jdk.compiler/com.sun.tools.javac.api=ALL-UNNAMED, --add-exports=jdk.compiler/com.sun.tools.javac.util=ALL-UNNAMED, --add-opens=java.base/java.util=ALL-UNNAMED, --add-opens=java.prefs/java.util.prefs=ALL-UNNAMED, --add-opens=java.base/java.nio.charset=ALL-UNNAMED, --add-opens=java.base/java.net=ALL-UNNAMED, --add-opens=java.base/java.util.concurrent.atomic=ALL-UNNAMED, --add-opens=java.xml/javax.xml.namespace=ALL-UNNAMED, --enable-native-access=ALL-UNNAMED, -XX:MaxMetaspaceSize=384m, -XX:+HeapDumpOnOutOfMemoryError, -Xms256m, -Xmx512m, -Dfile.encoding=UTF-8, -Duser.country=IN, -Duser.language=en, -Duser.variant, -cp, D:\OS\WIn11\devs\langs\java\builds\gradle\8.x\8.14.1\lib\gradle-daemon-main-8.14.1.jar, -javaagent:D:\OS\WIn11\devs\langs\java\builds\gradle\8.x\8.14.1\lib\agents\gradle-instrumentation-agent-8.14.1.jar, org.gradle.launcher.daemon.bootstrap.GradleDaemon, 8.14.1