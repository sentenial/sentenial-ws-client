package com.sentenial.ws.service;

import com.sun.xml.ws.transport.http.client.HttpTransportPipe;

/**
 *
 */
final public class WsSettingsLoader {

    //keeps here as a small performance improvement
    private static WsSettings settings = null;

    /**
     *
     * @return
     */
    public static synchronized WsSettings loadSettings(){
        //TODO: read from properties, environment, whatever...
        if(settings == null) {
            settings = new WsSettings();
            settings.setUsername("sampleuser");
            settings.setPassword("123SecretPass");
            settings.setWsUrl("http://localhost:8080/origix-webservice/ws/services");

            boolean debugCallEnabled = true;//should come from the same place as the user/pass
            HttpTransportPipe.dump = debugCallEnabled;
            System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", debugCallEnabled + "");
            System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", debugCallEnabled + "");
            System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", debugCallEnabled + "");
            System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", debugCallEnabled + "");
        }
        return settings;
    }
}
