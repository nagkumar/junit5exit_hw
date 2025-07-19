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
    testImplementation("org.junit.jupiter:junit-jupiter:5.11.4")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<Test>().configureEach {
    jvmArgs("--add-opens", "java.base/java.lang=ALL-UNNAMED",
	    "--add-opens", "java.base/java.io=ALL-UNNAMED",
	    "--add-opens", "java.base/java.util=ALL-UNNAMED",
	    "--add-exports", "java.base/sun.security.util=ALL-UNNAMED")
}

tasks.test {
    useJUnitPlatform()
    jvmArgumentProviders.add(CommandLineArgumentProvider {
	var dd = configurations.testRuntimeClasspath.get().files.find {
	    it.name.contains("junit5-system-exit")
	}
	listOf("-javaagent:${dd}")
    })
}

