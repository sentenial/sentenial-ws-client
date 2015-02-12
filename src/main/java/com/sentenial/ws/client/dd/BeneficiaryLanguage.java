
package com.sentenial.ws.client.dd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BeneficiaryLanguage.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BeneficiaryLanguage">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="nl"/>
 *     &lt;enumeration value="fr"/>
 *     &lt;enumeration value="en"/>
 *     &lt;enumeration value="es"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BeneficiaryLanguage", namespace = "urn:com:sentenial:origix:ws:common:types")
@XmlEnum
public enum BeneficiaryLanguage {

    @XmlEnumValue("nl")
    NL("nl"),
    @XmlEnumValue("fr")
    FR("fr"),
    @XmlEnumValue("en")
    EN("en"),
    @XmlEnumValue("es")
    ES("es");
    private final String value;

    BeneficiaryLanguage(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BeneficiaryLanguage fromValue(String v) {
        for (BeneficiaryLanguage c: BeneficiaryLanguage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
