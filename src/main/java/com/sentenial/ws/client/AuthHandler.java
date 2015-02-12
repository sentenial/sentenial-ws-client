package com.sentenial.ws.client;

import javax.xml.namespace.QName;
import javax.xml.soap.*;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringWriter;
import java.util.Set;

/**
 * Copyright of Sentenial
 * User: christian.reichel
 * Date: 11/02/2015
 * Time: 15:33
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

        Boolean outboundProperty =
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
        } else {
            // inbound
        }
        return true;
    }

    /*
    @Override
    public boolean handleMessage(SOAPMessageContext context) {
        try {
            SOAPMessage message = context.getMessage();
            SOAPHeader header = message.getSOAPHeader();
            SOAPEnvelope envelope = message.getSOAPPart().getEnvelope();
            if (header == null) {
                header = envelope.addHeader();
            }
            QName qNameUserCredentials = new QName("https://www.sentenial.com/", "UserCredentials");
            SOAPHeaderElement userCredentials = header.addHeaderElement(qNameUserCredentials);

            QName qNameUsername = new QName("https://www.sentenial.com/", "Username");
            SOAPHeaderElement username = header.addHeaderElement(qNameUsername );
            username.addTextNode(this.username);
            QName qNamePassword = new QName("https://www.sentenial.com/", "Password");
            SOAPHeaderElement password = header.addHeaderElement(qNamePassword);
            password.addTextNode(this.password);

            userCredentials.addChildElement(username);
            userCredentials.addChildElement(password);

            message.saveChanges();
                StringWriter writer = new StringWriter();
            message.writeTo(new StringOutputStream(writer));
            System.out.println("___> SOAP message: \n" + writer.toString());
        } catch (SOAPException e) {
            System.err.println("XxX Error occurred while adding credentials to SOAP header." + e);
        } catch (IOException e) {
            System.err.println("XxX Error occurred while writing message to output stream." + e);
        }
        return true;
    }
    */

    //TODO: remove this class after testing is finished
    private static class StringOutputStream extends OutputStream {

        private StringWriter writer;

        public StringOutputStream(StringWriter writer) {
            this.writer = writer;
        }

        @Override
        public void write(int b) throws IOException {
            writer.write(b);
        }
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        System.out.println("|| handleFault has been invoked.");
        return true;
    }

    @Override
    public void close(MessageContext context) {
        System.out.println("|| close has been invoked.");
    }

    @Override
    public Set<QName> getHeaders() {
        System.out.println("|| getHeaders has been invoked.");
        return null;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
