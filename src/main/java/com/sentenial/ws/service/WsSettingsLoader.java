package com.sentenial.ws.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 */
final public class WsSettingsLoader {

    public static final String SETTINGS_FILE    = "sentenial.properties";

    public static final String USERNAME_PROP    = "sentenial.ws.username";
    public static final String PASSWD_PROP      = "sentenial.ws.password";
    public static final String WSURL_PROP       = "sentenial.ws.url";
    public static final String DEBUG_PROP       = "sentenial.ws.debug";

    //keep it here as a small performance improvement
    private static WsSettings settings = null;

    /**
     *
     * @return
     */
    public static synchronized WsSettings loadSettings(){
        if(settings == null) {
            settings = getInformedSettings();
            //HttpTransportPipe.dump = settings.isDebugEnabled();
            System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", settings.getDebugEnabled());
            System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", settings.getDebugEnabled());
            System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", settings.getDebugEnabled());
            System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", settings.getDebugEnabled());
        }
        return settings;
    }

    /**
     *
     * @return
     */
    static WsSettings getInformedSettings(){
        WsSettings settings = null;
        final Properties prop = new Properties();
        InputStream input = null;
        try {
            final ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            input = classLoader.getResourceAsStream(SETTINGS_FILE);
            prop.load(input);
            settings = parseProperties(prop);
        } catch (IOException ex) {
            settings = parseProperties(System.getProperties());
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        if(settings.getUsername() == null || settings.getPassword() == null || settings.getWsUrl() == null){
            throw new IllegalStateException("No credentials informed for Sentenial WS");
        }
        return settings;
    }

    static WsSettings parseProperties(Properties prop) {
        final WsSettings settings = new WsSettings();
        settings.setUsername(prop.getProperty(USERNAME_PROP));
        settings.setPassword(prop.getProperty(PASSWD_PROP));
        settings.setWsUrl(prop.getProperty(WSURL_PROP));
        if(prop.getProperty(DEBUG_PROP) != null){
            settings.setDebugEnabled("true".equalsIgnoreCase(prop.getProperty(DEBUG_PROP)));
        }
        return settings;
    }

}
