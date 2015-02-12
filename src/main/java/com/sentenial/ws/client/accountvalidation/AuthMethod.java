
package com.sentenial.ws.client.accountvalidation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CHECK_BOX"/>
 *     &lt;enumeration value="SMS_PASSWORD"/>
 *     &lt;enumeration value="EMAIL_PASSWORD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AuthMethod", namespace = "urn:com:sentenial:origix:ws:common:types")
@XmlEnum
public enum AuthMethod {

    CHECK_BOX,
    SMS_PASSWORD,
    EMAIL_PASSWORD;

    public String value() {
        return name();
    }

    public static AuthMethod fromValue(String v) {
        return valueOf(v);
    }

}
