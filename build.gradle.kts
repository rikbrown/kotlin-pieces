import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    java
    kotlin("jvm") version "1.3.21"
    idea
}

group = "codes.rik"
version = "0.1"

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    val spekVersion = "2.0.1"

    //
    // Code
    //

    // Kotlin
    implementation(kotlin("stdlib-jdk8"))

    // 3P
    implementation("com.google.guava", "guava", "27.0.1-jre")
    implementation("org.atteo", "evo-inflector", "1.0.1")

    //
    // Test
    //

    testImplementation("org.junit.jupiter", "junit-jupiter-api", "5.1.1")
    testRuntimeOnly("org.junit.jupiter", "junit-jupiter-engine", "5.1.1")

    // Kotlin
    testRuntimeOnly(kotlin("reflect"))

    // Spek
    testImplementation("org.spekframework.spek2", "spek-dsl-jvm", spekVersion)
    testRuntimeOnly("org.spekframework.spek2", "spek-runner-junit5", spekVersion)

    // Hamkrest
    testImplementation("com.natpryce", "hamkrest", "1.7.0.0")
}

tasks.withType<Test> {
    useJUnitPlatform {
        includeEngines("spek2")
    }
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}
tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

