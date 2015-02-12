
package com.sentenial.ws.client.mandate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CreditorScheme complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditorScheme">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Scheme" type="{urn:com:sentenial:origix:ws:common:types}SchemeType" minOccurs="0"/>
 *         &lt;element name="CreditorSchemeId" type="{urn:com:sentenial:origix:ws:common:types}Max35Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditorScheme", namespace = "urn:com:sentenial:origix:ws:common:commontypes", propOrder = {
    "scheme",
    "creditorSchemeId"
})
public class CreditorScheme {

    @XmlElement(name = "Scheme")
    protected SchemeType scheme;
    @XmlElement(name = "CreditorSchemeId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String creditorSchemeId;

    /**
     * Gets the value of the scheme property.
     * 
     * @return
     *     possible object is
     *     {@link SchemeType }
     *     
     */
    public SchemeType getScheme() {
        return scheme;
    }

    /**
     * Sets the value of the scheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemeType }
     *     
     */
    public void setScheme(SchemeType value) {
        this.scheme = value;
    }

    /**
     * Gets the value of the creditorSchemeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditorSchemeId() {
        return creditorSchemeId;
    }

    /**
     * Sets the value of the creditorSchemeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditorSchemeId(String value) {
        this.creditorSchemeId = value;
    }

}
