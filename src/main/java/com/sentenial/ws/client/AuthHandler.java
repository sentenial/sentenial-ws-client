package com.sentenial.ws.client;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPFactory;
import javax.xml.soap.SOAPHeader;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.util.Set;

/**
 * Copyright of Sentenial
 * User: christian.reichel
 */
public class AuthHandler implements SOAPHandler<SOAPMessageContext> {

    //private static final Logger LOGGER = LoggerFactory.getLogger(AuthHandler.class);

    private String username;
    private String password;

    public AuthHandler(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public AuthHandler() {}

    @Override
    public boolean handleMessage(SOAPMessageContext context) {

        final Boolean outboundProperty =
                (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        if (outboundProperty.booleanValue()) {

            try {
                final SOAPEnvelope envelope = context.getMessage().getSOAPPart().getEnvelope();
                final SOAPFactory factory = SOAPFactory.newInstance();
                final String prefix = "wsse";
                final String uri = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";
                final SOAPElement securityElem = factory.createElement("Security", prefix, uri);
                final SOAPElement tokenElem = factory.createElement("UsernameToken", prefix, uri);
                tokenElem.addAttribute(QName.valueOf("wsu:Id"), "UsernameToken-2");
                tokenElem.addAttribute(QName.valueOf("xmlns:wsu"), "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");
                final SOAPElement userElem = factory.createElement("Username", prefix, uri);
                userElem.addTextNode(username);
                final SOAPElement pwdElem = factory.createElement("Password", prefix, uri);
                pwdElem.addTextNode(password);
                pwdElem.addAttribute(QName.valueOf("Type"), "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText");
                tokenElem.addChildElement(userElem);
                tokenElem.addChildElement(pwdElem);
                securityElem.addChildElement(tokenElem);
                if (envelope.getHeader() != null) {
                    envelope.getHeader().detachNode();
                }
                final SOAPHeader header = envelope.addHeader();
                header.addChildElement(securityElem);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        // else -> inbound
        return true;
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        //System.out.println("|| handleFault has been invoked.");
        return true;
    }

    @Override
    public void close(MessageContext context) {
        //System.out.println("|| close has been invoked.");
    }

    @Override
    public Set<QName> getHeaders() {
        //System.out.println("|| getHeaders has been invoked.");
        return null;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
