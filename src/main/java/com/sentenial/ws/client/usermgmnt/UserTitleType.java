
package com.sentenial.ws.client.usermgmnt;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserTitleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserTitleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Mr"/>
 *     &lt;enumeration value="Ms"/>
 *     &lt;enumeration value="Mrs"/>
 *     &lt;enumeration value="Miss"/>
 *     &lt;enumeration value="Dr"/>
 *     &lt;enumeration value="Prof"/>
 *     &lt;enumeration value="Fr"/>
 *     &lt;enumeration value="Rev"/>
 *     &lt;enumeration value="Bishop"/>
 *     &lt;enumeration value="Sr"/>
 *     &lt;enumeration value="None"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UserTitleType")
@XmlEnum
public enum UserTitleType {

    @XmlEnumValue("Mr")
    MR("Mr"),
    @XmlEnumValue("Ms")
    MS("Ms"),
    @XmlEnumValue("Mrs")
    MRS("Mrs"),
    @XmlEnumValue("Miss")
    MISS("Miss"),
    @XmlEnumValue("Dr")
    DR("Dr"),
    @XmlEnumValue("Prof")
    PROF("Prof"),
    @XmlEnumValue("Fr")
    FR("Fr"),
    @XmlEnumValue("Rev")
    REV("Rev"),
    @XmlEnumValue("Bishop")
    BISHOP("Bishop"),
    @XmlEnumValue("Sr")
    SR("Sr"),
    @XmlEnumValue("None")
    NONE("None");
    private final String value;

    UserTitleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserTitleType fromValue(String v) {
        for (UserTitleType c: UserTitleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
