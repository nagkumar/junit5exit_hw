plugins {
    java
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("com.ginsberg:junit5-system-exit:2.0.2")

    testImplementation("org.junit.jupiter:junit-jupiter:6.0.0-M1")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
    jvmArgs(
	"--add-opens", "java.base/java.lang=ALL-UNNAMED",
	"--add-opens", "java.base/java.io=ALL-UNNAMED"
	   )
    jvmArgumentProviders.add(CommandLineArgumentProvider {
	listOf("-javaagent:${
	    configurations.testRuntimeClasspath.get().files.find {
		it.name.contains("junit5-system-exit")
	    }
	}")
    })

    testLogging {
	events("passed", "skipped", "failed")
	exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
	showExceptions = true
	showCauses = true
	showStackTraces = true
    }

    // Optional: Set system properties for tests
    systemProperties(
	"junit.jupiter.execution.parallel.enabled" to "true",
	"junit.jupiter.execution.parallel.mode.default" to "concurrent"
		    )
}

tasks.withType<Test> {
    jvmArgs("--enable-preview") // If using preview features
}

tasks.withType<JavaCompile> {
    options.compilerArgs.addAll(
	listOf(
	    "--enable-preview", // If using preview features
	    "-Xlint:unchecked",
	    "-Xlint:deprecation"))
}