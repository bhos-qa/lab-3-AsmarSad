plugins {
    id("java")
    id ("jacoco")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}
jacoco {
    toolVersion = "0.8.7" // Make sure the Jacoco version is correct
}

tasks.jacocoTestReport {
    reports {
        xml.required.set(true)  // Generate XML report for SonarCloud
        html.required.set(true) // Generate HTML report for local browsing
    }
}

// Ensure Jacoco reports are generated after tests
tasks.test {
    finalizedBy(tasks.jacocoTestReport) // Run jacocoTestReport after test
}
