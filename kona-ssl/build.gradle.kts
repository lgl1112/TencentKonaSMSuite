plugins {
    id("kona-common")
}

dependencies {
    implementation(project(":kona-crypto"))
    implementation(project(":kona-pkix"))

    testImplementation("io.netty:netty-all:4.1.77.Final")
    testImplementation("org.eclipse.jetty:jetty-server:9.4.44.v20210927")
    testImplementation("org.eclipse.jetty:jetty-servlet:9.4.44.v20210927")
    testImplementation("org.eclipse.jetty:jetty-client:9.4.44.v20210927")
    testImplementation("org.apache.httpcomponents:httpclient:4.5.13")
}
