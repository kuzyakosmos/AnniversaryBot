plugins {
    java
}

group = "org.anniversarybot"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testCompile("junit", "junit", "4.12")
    compile("org.hibernate", "hibernate-gradle-plugin", "5.4.22.Final")

    compileOnly("org.projectlombok", "lombok", "1.18.14")
    annotationProcessor("org.projectlombok", "lombok", "1.18.14")

    testCompileOnly("org.projectlombok", "lombok", "1.18.14")
    testAnnotationProcessor("org.projectlombok", "lombok", "1.18.14")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}