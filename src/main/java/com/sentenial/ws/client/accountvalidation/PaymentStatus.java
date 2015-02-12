
package com.sentenial.ws.client.accountvalidation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="READY_FOR_EXPORT"/>
 *     &lt;enumeration value="EXPORTING"/>
 *     &lt;enumeration value="REVOKED"/>
 *     &lt;enumeration value="EXPORTED"/>
 *     &lt;enumeration value="ACCEPTED"/>
 *     &lt;enumeration value="REVERSED"/>
 *     &lt;enumeration value="REFUSED"/>
 *     &lt;enumeration value="REJECTED"/>
 *     &lt;enumeration value="RETURNED"/>
 *     &lt;enumeration value="REFUNDED"/>
 *     &lt;enumeration value="CANCELLED"/>
 *     &lt;enumeration value="PENDING"/>
 *     &lt;enumeration value="INVALID"/>
 *     &lt;enumeration value="REPRESENTED"/>
 *     &lt;enumeration value="RECALLED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentStatus", namespace = "urn:com:sentenial:origix:ws:common:types")
@XmlEnum
public enum PaymentStatus {

    READY_FOR_EXPORT,
    EXPORTING,
    REVOKED,
    EXPORTED,
    ACCEPTED,
    REVERSED,
    REFUSED,
    REJECTED,
    RETURNED,
    REFUNDED,
    CANCELLED,
    PENDING,
    INVALID,
    REPRESENTED,
    RECALLED;

    public String value() {
        return name();
    }

    public static PaymentStatus fromValue(String v) {
        return valueOf(v);
    }

}
