
package com.sentenial.ws.client.dd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Creditor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Creditor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreditorScheme" type="{urn:com:sentenial:origix:ws:common:commontypes}CreditorScheme"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Creditor", namespace = "urn:com:sentenial:origix:ws:common:commontypes", propOrder = {
    "creditorScheme"
})
public class Creditor {

    @XmlElement(name = "CreditorScheme", required = true)
    protected CreditorScheme creditorScheme;

    /**
     * Gets the value of the creditorScheme property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorScheme }
     *     
     */
    public CreditorScheme getCreditorScheme() {
        return creditorScheme;
    }

    /**
     * Sets the value of the creditorScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorScheme }
     *     
     */
    public void setCreditorScheme(CreditorScheme value) {
        this.creditorScheme = value;
    }

}
