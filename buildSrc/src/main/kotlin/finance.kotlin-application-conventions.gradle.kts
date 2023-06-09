/*
 * This file was generated by the Gradle 'init' task.
 *
 * This project uses @Incubating APIs which are subject to change.
 */
val KtorVersion = "2.0.2"
val exposedVersion = "0.38.2"
val resilience4jVersion = "1.7.0"
val h2databaseversion = "2.1.214"
val KoinVersion = "3.2.0"

plugins {
    // Apply the common convention plugin for shared build configuration between library and application projects.
    id("finance.kotlin-common-conventions")
    // Apply the application plugin to add support for building a CLI application in Java.
    application
}

dependencies {
    implementation("io.ktor:ktor-server-content-negotiation-jvm:${KtorVersion}")
    implementation("io.ktor:ktor-server-metrics-micrometer-jvm:${KtorVersion}")
    implementation("io.micrometer:micrometer-registry-prometheus:1.9.0")
    implementation("io.ktor:ktor-server-metrics-jvm:${KtorVersion}")
    implementation("io.ktor:ktor-server-call-logging-jvm:${KtorVersion}")
    implementation("io.ktor:ktor-server-call-id-jvm:${KtorVersion}")
    implementation("io.ktor:ktor-server-partial-content-jvm:${KtorVersion}")
    implementation("io.ktor:ktor-server-cors-jvm:${KtorVersion}")
    implementation("io.ktor:ktor-server-host-common-jvm:${KtorVersion}")
    implementation("io.ktor:ktor-server-status-pages-jvm:${KtorVersion}")
    implementation("io.ktor:ktor-server-default-headers-jvm:${KtorVersion}")
    implementation("io.ktor:ktor-server-cio-jvm:${KtorVersion}")
    implementation("io.ktor:ktor-server-netty:$KtorVersion")
    implementation("ch.qos.logback:logback-classic:1.2.11")
    implementation("org.kodein.di:kodein-di:7.10.0")
    implementation("org.kodein.di:kodein-di-framework-ktor-server-jvm:7.10.0")
    implementation("io.ktor:ktor-client-content-negotiation:${KtorVersion}")
    implementation("io.ktor:ktor-serialization-gson:${KtorVersion}")
    implementation("io.ktor:ktor-client-logging:${KtorVersion}")
    implementation("io.ktor:ktor-server-call-logging:${KtorVersion}")
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-xml:2.13.3")
    implementation("io.konform:konform-jvm:0.4.0")
    implementation("org.ktorm:ktorm-core:3.5.0")
    implementation("org.ktorm:ktorm-support-postgresql:3.5.0")
    implementation("org.postgresql:postgresql:42.4.0")
    testImplementation("io.ktor:ktor-server-tests-jvm:2.0.1")
    testImplementation("io.ktor:ktor-server-tests-jvm:${KtorVersion}")
    implementation("org.json:json:20220320")
    implementation("org.bouncycastle:bcprov-jdk15on:1.70")
    implementation("org.jetbrains.exposed:exposed-core:${exposedVersion}")
    implementation("org.jetbrains.exposed:exposed-dao:${exposedVersion}")
    implementation("org.jetbrains.exposed:exposed-jdbc:${exposedVersion}")
    implementation("org.jetbrains.exposed:exposed-java-time:${exposedVersion}")
    implementation("com.azure:azure-messaging-eventhubs:5.12.1")
    implementation("com.microsoft.azure:azure-eventhubs:3.3.0")
    implementation("com.azure:azure-messaging-eventhubs-checkpointstore-blob:1.13.0")
    implementation("io.github.resilience4j:resilience4j-kotlin:${resilience4jVersion}")
    implementation("io.github.resilience4j:resilience4j-retry:${resilience4jVersion}")
    implementation("io.github.resilience4j:resilience4j-circuitbreaker:${resilience4jVersion}")
    implementation("io.github.resilience4j:resilience4j-ratelimiter:${resilience4jVersion}")
    implementation("io.github.resilience4j:resilience4j-timelimiter:${resilience4jVersion}")
    implementation("io.ktor:ktor-client-serialization:${KtorVersion}")
    implementation("org.apache.kafka:kafka-clients:3.1.0")
    testImplementation("com.h2database:h2:${h2databaseversion}")
    implementation("com.launchdarkly:launchdarkly-java-server-sdk:5.9.0")
    implementation("org.junit.jupiter:junit-jupiter:5.7.0")
    implementation("com.zaxxer:HikariCP:5.0.1")
    implementation("mysql:mysql-connector-java:8.0.29")
    testImplementation("io.ktor:ktor-server-test-host:2.0.2")
    testImplementation("io.ktor:ktor-client-mock:2.0.2")
    implementation("com.jayway.jsonpath:json-path:2.4.0")
    implementation("me.xdrop:fuzzywuzzy:1.3.1")
    implementation("io.insert-koin:koin-ktor:${KoinVersion}")
    implementation("io.insert-koin:koin-logger-slf4j:${KoinVersion}")
    implementation("com.microsoft.azure:azure-storage:1.2.0")
    implementation("com.azure:azure-storage-blob:12.19.1")
    implementation("fr.opensagres.xdocreport:org.apache.poi.xwpf.converter.pdf:1.0.0")
    implementation("commons-io:commons-io:2.11.0")
    implementation("net.sf.supercsv:super-csv:2.1.0")
    implementation("org.apache.poi:poi-ooxml:5.2.2")
    implementation ("org.apache.poi:poi:4.1.2")
    implementation("org.apache.commons:commons-csv:1.9.0")
}
