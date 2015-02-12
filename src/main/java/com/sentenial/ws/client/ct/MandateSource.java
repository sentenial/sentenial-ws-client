
package com.sentenial.ws.client.ct;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MandateSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MandateSource">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="OCX"/>
 *     &lt;enumeration value="Emandate_App"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MandateSource", namespace = "urn:com:sentenial:origix:ws:common:types")
@XmlEnum
public enum MandateSource {

    OCX("OCX"),
    @XmlEnumValue("Emandate_App")
    EMANDATE_APP("Emandate_App");
    private final String value;

    MandateSource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MandateSource fromValue(String v) {
        for (MandateSource c: MandateSource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
