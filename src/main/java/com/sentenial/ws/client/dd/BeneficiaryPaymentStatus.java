
package com.sentenial.ws.client.dd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BeneficiaryPaymentStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BeneficiaryPaymentStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="READY_FOR_EXPORT"/>
 *     &lt;enumeration value="EXPORTED"/>
 *     &lt;enumeration value="EXPORTING"/>
 *     &lt;enumeration value="ACCEPTED"/>
 *     &lt;enumeration value="RECALLED"/>
 *     &lt;enumeration value="REJECTED"/>
 *     &lt;enumeration value="CANCELLED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BeneficiaryPaymentStatus", namespace = "urn:com:sentenial:origix:ws:common:types")
@XmlEnum
public enum BeneficiaryPaymentStatus {

    READY_FOR_EXPORT,
    EXPORTED,
    EXPORTING,
    ACCEPTED,
    RECALLED,
    REJECTED,
    CANCELLED;

    public String value() {
        return name();
    }

    public static BeneficiaryPaymentStatus fromValue(String v) {
        return valueOf(v);
    }

}
