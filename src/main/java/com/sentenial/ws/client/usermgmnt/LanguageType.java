
package com.sentenial.ws.client.usermgmnt;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LanguageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LanguageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="EN"/>
 *     &lt;enumeration value="FR"/>
 *     &lt;enumeration value="NL"/>
 *     &lt;enumeration value="BE"/>
 *     &lt;enumeration value="ES"/>
 *     &lt;enumeration value="DE"/>
 *     &lt;enumeration value="PT"/>
 *     &lt;enumeration value="IT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LanguageType")
@XmlEnum
public enum LanguageType {

    EN,
    FR,
    NL,
    BE,
    ES,
    DE,
    PT,
    IT;

    public String value() {
        return name();
    }

    public static LanguageType fromValue(String v) {
        return valueOf(v);
    }

}
