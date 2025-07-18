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
    jvmArgumentProviders.add(CommandLineArgumentProvider {
	listOf("-javaagent:${
	    configurations.testRuntimeClasspath.get().files.find {
		it.name.contains("junit5-system-exit")
	    }
	}")
    })
}

tasks.register("printTestRuntimeClasspath") {
    doLast {
	println("All testRuntimeClasspath files:")
	configurations.testRuntimeClasspath.get().files.forEach { println(it) }
    }
}