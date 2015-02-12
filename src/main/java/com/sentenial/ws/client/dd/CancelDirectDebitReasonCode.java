
package com.sentenial.ws.client.dd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelDirectDebitReasonCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CancelDirectDebitReasonCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AGNT"/>
 *     &lt;enumeration value="CURR"/>
 *     &lt;enumeration value="CUST"/>
 *     &lt;enumeration value="CUTA"/>
 *     &lt;enumeration value="DUPL"/>
 *     &lt;enumeration value="UPAY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CancelDirectDebitReasonCode", namespace = "urn:com:sentenial:origix:ws:common:types")
@XmlEnum
public enum CancelDirectDebitReasonCode {

    AGNT,
    CURR,
    CUST,
    CUTA,
    DUPL,
    UPAY;

    public String value() {
        return name();
    }

    public static CancelDirectDebitReasonCode fromValue(String v) {
        return valueOf(v);
    }

}
