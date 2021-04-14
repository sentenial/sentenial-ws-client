# Sentenial Web Services Client (deprecated)

All integrations are now to use our REST APIs. See https://developer.nuapay.com

## Dependencies

* jdk >= 1.7 (includes a JAX-WS 2.2 implementation).

You can use jdk 1.6 with some [workarounds](https://jax-ws.java.net/2.2/docs/ReleaseNotes.html#Running_on_top_of_JDK_6).

To use in maven as a dependency:

    <dependency>
        <groupId>com.sentenial</groupId>
        <artifactId>sentenial-ws-client</artifactId>
        <version>1.0.0</version>
    </dependency>

## Settings
To get started with NUAPAY you can test using our sandbox credentials. Your credentials can be set in two ways:

### Option 1: Create these environment variables with your credentials and some options:

    sentenial.ws.username
    sentenial.ws.password
    sentenial.ws.url
    sentenial.ws.debug
    

### Option 2: Create a file called `'sentenial.properties'`, then add the following properties:

    sentenial.ws.username=YOUR_USERNAME
    sentenial.ws.password=YOUR_PASSWORD
    sentenial.ws.url=http://host:8080/origix-webservice/ws/services
    sentenial.ws.debug=true #enables the message sent and received in the console
    
