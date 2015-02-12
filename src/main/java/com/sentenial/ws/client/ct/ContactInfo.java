
package com.sentenial.ws.client.ct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ContactInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BnfcryPhoneNumber" type="{urn:com:sentenial:origix:ws:common:types}Max30Text" minOccurs="0"/>
 *         &lt;element name="BnfcryMobileNumber" type="{urn:com:sentenial:origix:ws:common:types}Max30Text" minOccurs="0"/>
 *         &lt;element name="BnfcryEmail" type="{urn:com:sentenial:origix:ws:common:types}Max254Text" minOccurs="0"/>
 *         &lt;element name="BnfcryLng" type="{urn:com:sentenial:origix:ws:common:types}BeneficiaryLanguage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactInfo", propOrder = {
    "bnfcryPhoneNumber",
    "bnfcryMobileNumber",
    "bnfcryEmail",
    "bnfcryLng"
})
public class ContactInfo {

    @XmlElement(name = "BnfcryPhoneNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String bnfcryPhoneNumber;
    @XmlElement(name = "BnfcryMobileNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String bnfcryMobileNumber;
    @XmlElement(name = "BnfcryEmail")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String bnfcryEmail;
    @XmlElement(name = "BnfcryLng")
    protected BeneficiaryLanguage bnfcryLng;

    /**
     * Gets the value of the bnfcryPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBnfcryPhoneNumber() {
        return bnfcryPhoneNumber;
    }

    /**
     * Sets the value of the bnfcryPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBnfcryPhoneNumber(String value) {
        this.bnfcryPhoneNumber = value;
    }

    /**
     * Gets the value of the bnfcryMobileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBnfcryMobileNumber() {
        return bnfcryMobileNumber;
    }

    /**
     * Sets the value of the bnfcryMobileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBnfcryMobileNumber(String value) {
        this.bnfcryMobileNumber = value;
    }

    /**
     * Gets the value of the bnfcryEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBnfcryEmail() {
        return bnfcryEmail;
    }

    /**
     * Sets the value of the bnfcryEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBnfcryEmail(String value) {
        this.bnfcryEmail = value;
    }

    /**
     * Gets the value of the bnfcryLng property.
     * 
     * @return
     *     possible object is
     *     {@link BeneficiaryLanguage }
     *     
     */
    public BeneficiaryLanguage getBnfcryLng() {
        return bnfcryLng;
    }

    /**
     * Sets the value of the bnfcryLng property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeneficiaryLanguage }
     *     
     */
    public void setBnfcryLng(BeneficiaryLanguage value) {
        this.bnfcryLng = value;
    }

}
