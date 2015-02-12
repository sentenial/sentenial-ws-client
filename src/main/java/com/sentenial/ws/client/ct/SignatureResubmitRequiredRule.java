
package com.sentenial.ws.client.ct;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignatureResubmitRequiredRule.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SignatureResubmitRequiredRule">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="DEFAULT"/>
 *     &lt;enumeration value="SEND"/>
 *     &lt;enumeration value="DO_NOT_SEND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SignatureResubmitRequiredRule", namespace = "urn:com:sentenial:origix:ws:common:types")
@XmlEnum
public enum SignatureResubmitRequiredRule {

    DEFAULT,
    SEND,
    DO_NOT_SEND;

    public String value() {
        return name();
    }

    public static SignatureResubmitRequiredRule fromValue(String v) {
        return valueOf(v);
    }

}
