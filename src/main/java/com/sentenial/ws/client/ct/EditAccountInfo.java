
package com.sentenial.ws.client.ct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for EditAccountInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EditAccountInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BnfcryBic" type="{urn:com:sentenial:origix:ws:common:types}Max11Text" minOccurs="0"/>
 *         &lt;element name="BnfcryIban" type="{urn:com:sentenial:origix:ws:common:types}Max35Text"/>
 *         &lt;element name="NewBnfcryIban" type="{urn:com:sentenial:origix:ws:common:types}Max35Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditAccountInfo", propOrder = {
    "bnfcryBic",
    "bnfcryIban",
    "newBnfcryIban"
})
public class EditAccountInfo {

    @XmlElement(name = "BnfcryBic")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String bnfcryBic;
    @XmlElement(name = "BnfcryIban", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String bnfcryIban;
    @XmlElement(name = "NewBnfcryIban")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String newBnfcryIban;

    /**
     * Gets the value of the bnfcryBic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBnfcryBic() {
        return bnfcryBic;
    }

    /**
     * Sets the value of the bnfcryBic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBnfcryBic(String value) {
        this.bnfcryBic = value;
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

    /**
     * Gets the value of the newBnfcryIban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewBnfcryIban() {
        return newBnfcryIban;
    }

    /**
     * Sets the value of the newBnfcryIban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewBnfcryIban(String value) {
        this.newBnfcryIban = value;
    }

}
