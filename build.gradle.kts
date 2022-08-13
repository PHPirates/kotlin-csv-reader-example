plugins {
    application
    kotlin("jvm") version("1.7.0")
    java // Required by at least JUnit.

    // Plugin which checks for dependency updates with help/dependencyUpdates task.
    id("com.github.ben-manes.versions") version "0.42.0"

    // Plugin which can update Gradle dependencies, use help/useLatestVersions
    id("se.patrikerdes.use-latest-versions") version "0.2.18"
}

dependencies {
    implementation(kotlin("stdlib"))
    // To "prevent strange errors".
    implementation(kotlin("reflect"))

    implementation("com.github.doyaaaaaken:kotlin-csv-jvm:1.6.0")
}

repositories {
    mavenCentral()
    mavenLocal()
}
