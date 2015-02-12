
package com.sentenial.ws.client.accountvalidation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MandateRequestMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MandateRequestMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="VALIDATE_CREATE_UNSIGNED_PDF"/>
 *     &lt;enumeration value="CREATE_MANDATE_PDF_SIGNED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MandateRequestMode", namespace = "urn:com:sentenial:origix:ws:common:types")
@XmlEnum
public enum MandateRequestMode {

    VALIDATE_CREATE_UNSIGNED_PDF,
    CREATE_MANDATE_PDF_SIGNED;

    public String value() {
        return name();
    }

    public static MandateRequestMode fromValue(String v) {
        return valueOf(v);
    }

}
