
package com.sentenial.ws.client.accountvalidation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentFrequency.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentFrequency">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="DAILY"/>
 *     &lt;enumeration value="WEEKLY"/>
 *     &lt;enumeration value="BIWEEKLY"/>
 *     &lt;enumeration value="MONTHLY"/>
 *     &lt;enumeration value="YEARLY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentFrequency", namespace = "urn:com:sentenial:origix:ws:common:types")
@XmlEnum
public enum PaymentFrequency {

    DAILY,
    WEEKLY,
    BIWEEKLY,
    MONTHLY,
    YEARLY;

    public String value() {
        return name();
    }

    public static PaymentFrequency fromValue(String v) {
        return valueOf(v);
    }

}
