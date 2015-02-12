
package com.sentenial.ws.client.dd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommunicationLanguage.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommunicationLanguage">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="pt"/>
 *     &lt;enumeration value="nl"/>
 *     &lt;enumeration value="fr"/>
 *     &lt;enumeration value="en"/>
 *     &lt;enumeration value="it"/>
 *     &lt;enumeration value="es"/>
 *     &lt;enumeration value="de"/>
 *     &lt;enumeration value="sk"/>
 *     &lt;enumeration value="fr_BE"/>
 *     &lt;enumeration value="nl_BE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CommunicationLanguage", namespace = "urn:com:sentenial:origix:ws:common:types")
@XmlEnum
public enum CommunicationLanguage {

    @XmlEnumValue("pt")
    PT("pt"),
    @XmlEnumValue("nl")
    NL("nl"),
    @XmlEnumValue("fr")
    FR("fr"),
    @XmlEnumValue("en")
    EN("en"),
    @XmlEnumValue("it")
    IT("it"),
    @XmlEnumValue("es")
    ES("es"),
    @XmlEnumValue("de")
    DE("de"),
    @XmlEnumValue("sk")
    SK("sk"),
    @XmlEnumValue("fr_BE")
    FR_BE("fr_BE"),
    @XmlEnumValue("nl_BE")
    NL_BE("nl_BE");
    private final String value;

    CommunicationLanguage(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommunicationLanguage fromValue(String v) {
        for (CommunicationLanguage c: CommunicationLanguage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
