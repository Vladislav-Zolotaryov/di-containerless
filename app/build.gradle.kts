plugins {
    id("org.jetbrains.kotlin.jvm") version "1.8.21"
    application
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

    implementation("org.springframework:spring-core:6.0.9")

    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}

application {
    // Define the main class for the application.
    mainClass.set("di.cotainerless.AppKt")
}
