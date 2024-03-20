plugins {
	java
	id("org.springframework.boot") version "3.2.3"
	id("io.spring.dependency-management") version "1.1.4"
}

allprojects {
	apply(plugin = "java")

	group = "com.ben.discuss"
	version = "0.0.1-SNAPSHOT"

	java {
		sourceCompatibility = JavaVersion.VERSION_21
		targetCompatibility = JavaVersion.VERSION_21
	}

	repositories {
		mavenCentral()
	}

	tasks.withType<Test> {
		useJUnitPlatform()
	}
}

subprojects {
	extra["testcontainersVersion"] = "1.19.7"
	extra["junitVersion"] = "5.10.2"

	dependencies {
		testImplementation("org.junit.jupiter:junit-jupiter-api:${project.extra["junitVersion"]}")
		testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:${project.extra["junitVersion"]}")

		testImplementation("org.assertj:assertj-core:3.25.1")
	}
}

