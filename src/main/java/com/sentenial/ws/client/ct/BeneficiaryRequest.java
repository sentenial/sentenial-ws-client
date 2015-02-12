
package com.sentenial.ws.client.ct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for BeneficiaryRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BeneficiaryRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreditorRef" type="{urn:com:sentenial:origix:ws:common:types}Max35Number"/>
 *         &lt;element name="BnfcryNm" type="{urn:com:sentenial:origix:ws:common:types}Max70Text"/>
 *         &lt;element name="PostalAddress" type="{urn:com:sentenial:origix:ws:credittransfer-ws}PostalAddress" minOccurs="0"/>
 *         &lt;element name="BnfcryDscOfPurp" type="{urn:com:sentenial:origix:ws:common:types}Max140Text" minOccurs="0"/>
 *         &lt;element name="ContactInfo" type="{urn:com:sentenial:origix:ws:credittransfer-ws}ContactInfo" minOccurs="0"/>
 *         &lt;element name="BeneficiaryAccount" type="{urn:com:sentenial:origix:ws:credittransfer-ws}BeneficiaryAccount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BeneficiaryRequest", propOrder = {
    "creditorRef",
    "bnfcryNm",
    "postalAddress",
    "bnfcryDscOfPurp",
    "contactInfo",
    "beneficiaryAccount"
})
@XmlSeeAlso({
    AddBeneficiaryRequest.class
})
public abstract class BeneficiaryRequest {

    @XmlElement(name = "CreditorRef", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String creditorRef;
    @XmlElement(name = "BnfcryNm", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String bnfcryNm;
    @XmlElement(name = "PostalAddress")
    protected PostalAddress postalAddress;
    @XmlElement(name = "BnfcryDscOfPurp")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String bnfcryDscOfPurp;
    @XmlElement(name = "ContactInfo")
    protected ContactInfo contactInfo;
    @XmlElement(name = "BeneficiaryAccount")
    protected BeneficiaryAccount beneficiaryAccount;

    /**
     * Gets the value of the creditorRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditorRef() {
        return creditorRef;
    }

    /**
     * Sets the value of the creditorRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditorRef(String value) {
        this.creditorRef = value;
    }

    /**
     * Gets the value of the bnfcryNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBnfcryNm() {
        return bnfcryNm;
    }

    /**
     * Sets the value of the bnfcryNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBnfcryNm(String value) {
        this.bnfcryNm = value;
    }

    /**
     * Gets the value of the postalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress }
     *     
     */
    public PostalAddress getPostalAddress() {
        return postalAddress;
    }

    /**
     * Sets the value of the postalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress }
     *     
     */
    public void setPostalAddress(PostalAddress value) {
        this.postalAddress = value;
    }

    /**
     * Gets the value of the bnfcryDscOfPurp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBnfcryDscOfPurp() {
        return bnfcryDscOfPurp;
    }

    /**
     * Sets the value of the bnfcryDscOfPurp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBnfcryDscOfPurp(String value) {
        this.bnfcryDscOfPurp = value;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfo }
     *     
     */
    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfo }
     *     
     */
    public void setContactInfo(ContactInfo value) {
        this.contactInfo = value;
    }

    /**
     * Gets the value of the beneficiaryAccount property.
     * 
     * @return
     *     possible object is
     *     {@link BeneficiaryAccount }
     *     
     */
    public BeneficiaryAccount getBeneficiaryAccount() {
        return beneficiaryAccount;
    }

    /**
     * Sets the value of the beneficiaryAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeneficiaryAccount }
     *     
     */
    public void setBeneficiaryAccount(BeneficiaryAccount value) {
        this.beneficiaryAccount = value;
    }

}
