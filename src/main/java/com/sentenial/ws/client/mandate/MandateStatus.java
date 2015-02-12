
package com.sentenial.ws.client.mandate;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MandateStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MandateStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="CANCELLED"/>
 *     &lt;enumeration value="COMPLETE"/>
 *     &lt;enumeration value="PENDING"/>
 *     &lt;enumeration value="UNREADABLE"/>
 *     &lt;enumeration value="UNSIGNED"/>
 *     &lt;enumeration value="SCREENING"/>
 *     &lt;enumeration value="SUSPENDED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MandateStatus", namespace = "urn:com:sentenial:origix:ws:common:types")
@XmlEnum
public enum MandateStatus {

    ACTIVE,
    CANCELLED,
    COMPLETE,
    PENDING,
    UNREADABLE,
    UNSIGNED,
    SCREENING,
    SUSPENDED;

    public String value() {
        return name();
    }

    public static MandateStatus fromValue(String v) {
        return valueOf(v);
    }

}
