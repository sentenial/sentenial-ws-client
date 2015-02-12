
package com.sentenial.ws.client.dd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SchemeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SchemeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CORE"/>
 *     &lt;enumeration value="B2B"/>
 *     &lt;enumeration value="COR1"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SchemeType", namespace = "urn:com:sentenial:origix:ws:common:types")
@XmlEnum
public enum SchemeType {

    CORE("CORE"),
    @XmlEnumValue("B2B")
    B_2_B("B2B"),
    @XmlEnumValue("COR1")
    COR_1("COR1");
    private final String value;

    SchemeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SchemeType fromValue(String v) {
        for (SchemeType c: SchemeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
