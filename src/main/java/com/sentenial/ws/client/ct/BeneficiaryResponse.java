
package com.sentenial.ws.client.ct;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for BeneficiaryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BeneficiaryResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnCode" type="{urn:com:sentenial:origix:ws:common:types}ReturnCode"/>
 *         &lt;element name="returnDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "BeneficiaryResponse", propOrder = {
    "returnCode",
    "returnDesc",
    "creditorRef",
    "bnfcryNm",
    "postalAddress",
    "bnfcryDscOfPurp",
    "contactInfo",
    "beneficiaryAccount"
})
@XmlSeeAlso({
    ViewBeneficiaryResponse.class,
    EditBeneficiaryResponse.class,
    AddBeneficiaryResponse.class
})
public abstract class BeneficiaryResponse {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String returnCode;
    protected String returnDesc;
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
     * Gets the value of the returnCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnCode(String value) {
        this.returnCode = value;
    }

    /**
     * Gets the value of the returnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnDesc() {
        return returnDesc;
    }

    /**
     * Sets the value of the returnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnDesc(String value) {
        this.returnDesc = value;
    }

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
