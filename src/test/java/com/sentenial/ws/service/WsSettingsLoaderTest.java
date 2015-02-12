package com.sentenial.ws.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class WsSettingsLoaderTest {

    @Test
    public void testGetInformedSettings() throws Exception {
        //Given and When
        final WsSettings settings = WsSettingsLoader.getInformedSettings();
        //Then
        assertEquals(settings.getWsUrl(), "http://localhost:8080/origix-webservice/ws/services");
        assertEquals(settings.getPassword(), "123SecretPass");
        assertEquals(settings.getUsername(), "sampleuser");
        assertEquals(settings.getDebugEnabled(), "true");
    }

    @Test
    public void testParseProperties() throws Exception{
        //Given
        System.setProperty(WsSettingsLoader.DEBUG_PROP, "false");
        System.setProperty(WsSettingsLoader.WSURL_PROP, "www.sentenial.com");
        System.setProperty(WsSettingsLoader.PASSWD_PROP, "java");
        System.setProperty(WsSettingsLoader.USERNAME_PROP, "junit");
        //When
        final WsSettings settings = WsSettingsLoader.parseProperties(System.getProperties());
        //Then
        assertEquals(settings.getWsUrl(), "www.sentenial.com");
        assertEquals(settings.getPassword(), "java");
        assertEquals(settings.getUsername(), "junit");
        assertFalse(settings.isDebugEnabled());
    }
}