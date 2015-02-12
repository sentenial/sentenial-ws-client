
package com.sentenial.ws.client.mandate;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DomesticFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DomesticFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="DF_SCHEME"/>
 *     &lt;enumeration value="NL_SCHEME"/>
 *     &lt;enumeration value="FR_SCHEME"/>
 *     &lt;enumeration value="BE_SCHEME"/>
 *     &lt;enumeration value="ES_SCHEME"/>
 *     &lt;enumeration value="SK_SCHEME"/>
 *     &lt;enumeration value="IT_SCHEME"/>
 *     &lt;enumeration value="PX_SCHEME"/>
 *     &lt;enumeration value="PBA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DomesticFormat", namespace = "urn:com:sentenial:origix:ws:common:types")
@XmlEnum
public enum DomesticFormat {

    DF_SCHEME,
    NL_SCHEME,
    FR_SCHEME,
    BE_SCHEME,
    ES_SCHEME,
    SK_SCHEME,
    IT_SCHEME,
    PX_SCHEME,
    PBA;

    public String value() {
        return name();
    }

    public static DomesticFormat fromValue(String v) {
        return valueOf(v);
    }

}
