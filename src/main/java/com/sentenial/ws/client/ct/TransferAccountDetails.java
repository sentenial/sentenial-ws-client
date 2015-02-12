
package com.sentenial.ws.client.ct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for TransferAccountDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferAccountDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrgntrIban" type="{urn:com:sentenial:origix:ws:common:types}Max35Text"/>
 *         &lt;element name="BnfcryIban" type="{urn:com:sentenial:origix:ws:common:types}Max35Text"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferAccountDetails", propOrder = {
    "orgntrIban",
    "bnfcryIban"
})
public class TransferAccountDetails {

    @XmlElement(name = "OrgntrIban", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String orgntrIban;
    @XmlElement(name = "BnfcryIban", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String bnfcryIban;

    /**
     * Gets the value of the orgntrIban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgntrIban() {
        return orgntrIban;
    }

    /**
     * Sets the value of the orgntrIban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgntrIban(String value) {
        this.orgntrIban = value;
    }

    /**
     * Gets the value of the bnfcryIban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBnfcryIban() {
        return bnfcryIban;
    }

    /**
     * Sets the value of the bnfcryIban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBnfcryIban(String value) {
        this.bnfcryIban = value;
    }

}
