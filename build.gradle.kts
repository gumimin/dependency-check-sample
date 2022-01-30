plugins {
    kotlin("jvm") version "1.5.31"
    id("org.owasp.dependencycheck") version "6.5.3"
    id("com.dorongold.task-tree") version "2.1.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    // contains vulnerabilities
    implementation("org.apache.logging.log4j", "log4j-core", "2.0")
}

/* カスタマイズ
tasks {
    dependencyCheck {
        autoUpdate = false
        format = org.owasp.dependencycheck.reporting.ReportGenerator.Format.JSON
    }
}
*/
