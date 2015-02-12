
package com.sentenial.ws.client.ct;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PmtStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PmtStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Ready For Export"/>
 *     &lt;enumeration value="Revoked"/>
 *     &lt;enumeration value="Exported"/>
 *     &lt;enumeration value="Accepted"/>
 *     &lt;enumeration value="Refused"/>
 *     &lt;enumeration value="Rejected"/>
 *     &lt;enumeration value="Returned"/>
 *     &lt;enumeration value="Refunded"/>
 *     &lt;enumeration value="Cancelled"/>
 *     &lt;enumeration value="Pending"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PmtStatus", namespace = "urn:com:sentenial:origix:ws:common:types")
@XmlEnum
public enum PmtStatus {

    @XmlEnumValue("Ready For Export")
    READY_FOR_EXPORT("Ready For Export"),
    @XmlEnumValue("Revoked")
    REVOKED("Revoked"),
    @XmlEnumValue("Exported")
    EXPORTED("Exported"),
    @XmlEnumValue("Accepted")
    ACCEPTED("Accepted"),
    @XmlEnumValue("Refused")
    REFUSED("Refused"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected"),
    @XmlEnumValue("Returned")
    RETURNED("Returned"),
    @XmlEnumValue("Refunded")
    REFUNDED("Refunded"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("Pending")
    PENDING("Pending");
    private final String value;

    PmtStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PmtStatus fromValue(String v) {
        for (PmtStatus c: PmtStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
