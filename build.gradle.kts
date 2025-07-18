plugins {
    java
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
    implementation("com.ginsberg:junit5-system-exit:2.0.2")
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