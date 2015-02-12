
package com.sentenial.ws.client.paymentschedule;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PmtWeekOfMonth.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PmtWeekOfMonth">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="FIRST"/>
 *     &lt;enumeration value="SECOND"/>
 *     &lt;enumeration value="THIRD"/>
 *     &lt;enumeration value="FOURTH"/>
 *     &lt;enumeration value="LAST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PmtWeekOfMonth", namespace = "urn:com:sentenial:origix:ws:common:types")
@XmlEnum
public enum PmtWeekOfMonth {

    FIRST,
    SECOND,
    THIRD,
    FOURTH,
    LAST;

    public String value() {
        return name();
    }

    public static PmtWeekOfMonth fromValue(String v) {
        return valueOf(v);
    }

}
