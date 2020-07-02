plugins {

    val kotlinVersion = "1.3.61"

    application
    kotlin("jvm") version kotlinVersion
    java // Required by at least JUnit.

    // Plugin which checks for dependency updates with help/dependencyUpdates task.
    id("com.github.ben-manes.versions") version "0.28.0"

    // Plugin which can update Gradle dependencies, use help/useLatestVersions
    id("se.patrikerdes.use-latest-versions") version "0.2.14"
}

application {
    mainClassName = "deltadak.HelloWorld"
}

dependencies {
    implementation(kotlin("stdlib"))
    // To "prevent strange errors".
    implementation(kotlin("reflect"))

    implementation("com.github.doyaaaaaken:kotlin-csv-jvm:0.7.3")
}

repositories {
    mavenCentral()
    mavenLocal()
    jcenter()
}
