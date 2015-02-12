
package com.sentenial.ws.client.mandate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Debtor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Debtor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{urn:com:sentenial:origix:ws:common:types}Max70Text" minOccurs="0"/>
 *         &lt;element name="Address" type="{urn:com:sentenial:origix:ws:mandate}SepaAddress" minOccurs="0"/>
 *         &lt;element name="Language" type="{urn:com:sentenial:origix:ws:common:types}CommunicationLanguage" minOccurs="0"/>
 *         &lt;element name="Email" type="{urn:com:sentenial:origix:ws:common:types}Max254Text" minOccurs="0"/>
 *         &lt;element name="PhoneNumber" type="{urn:com:sentenial:origix:ws:common:types}Max30Text" minOccurs="0"/>
 *         &lt;element name="MobileNumber" type="{urn:com:sentenial:origix:ws:common:types}Max30Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Debtor", namespace = "urn:com:sentenial:origix:ws:mandate", propOrder = {
    "name",
    "address",
    "language",
    "email",
    "phoneNumber",
    "mobileNumber"
})
public class Debtor {

    @XmlElement(name = "Name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String name;
    @XmlElement(name = "Address")
    protected SepaAddress address;
    @XmlElement(name = "Language")
    protected CommunicationLanguage language;
    @XmlElement(name = "Email")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String email;
    @XmlElement(name = "PhoneNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String phoneNumber;
    @XmlElement(name = "MobileNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String mobileNumber;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link SepaAddress }
     *     
     */
    public SepaAddress getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link SepaAddress }
     *     
     */
    public void setAddress(SepaAddress value) {
        this.address = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationLanguage }
     *     
     */
    public CommunicationLanguage getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationLanguage }
     *     
     */
    public void setLanguage(CommunicationLanguage value) {
        this.language = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the mobileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     * Sets the value of the mobileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileNumber(String value) {
        this.mobileNumber = value;
    }

}
