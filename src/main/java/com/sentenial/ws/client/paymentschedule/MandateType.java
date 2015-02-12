
package com.sentenial.ws.client.paymentschedule;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MandateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MandateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="OOFF"/>
 *     &lt;enumeration value="RCUR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MandateType", namespace = "urn:com:sentenial:origix:ws:common:types")
@XmlEnum
public enum MandateType {

    OOFF,
    RCUR;

    public String value() {
        return name();
    }

    public static MandateType fromValue(String v) {
        return valueOf(v);
    }

}
