
package com.sentenial.ws.client.accountvalidation;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for BaseValidateAccResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseValidateAccResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnCode" type="{urn:com:sentenial:origix:ws:common:types}ReturnCode"/>
 *         &lt;element name="returnDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Iban" type="{urn:com:sentenial:origix:ws:common:types}IbanIdentifier" minOccurs="0"/>
 *         &lt;element name="Bic" type="{urn:com:sentenial:origix:ws:common:types}BicIdentifier" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{urn:com:sentenial:origix:ws:common:types}IsoCountryCode" minOccurs="0"/>
 *         &lt;element name="DomesticAccountNumber" type="{urn:com:sentenial:origix:ws:common:types}Max70Text" minOccurs="0"/>
 *         &lt;element name="DomesticBankCode" type="{urn:com:sentenial:origix:ws:common:types}Max35Text" minOccurs="0"/>
 *         &lt;element name="DomesticBranchCode" type="{urn:com:sentenial:origix:ws:common:types}Max35Text" minOccurs="0"/>
 *         &lt;element name="DomesticCheckSum" type="{urn:com:sentenial:origix:ws:common:types}Max35Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseValidateAccResponse", namespace = "urn:com:sentenial:origix:ws:accountvalidation-ws", propOrder = {
    "returnCode",
    "returnDesc",
    "iban",
    "bic",
    "countryCode",
    "domesticAccountNumber",
    "domesticBankCode",
    "domesticBranchCode",
    "domesticCheckSum"
})
@XmlSeeAlso({
    ValidateAccountResponse.class
})
public class BaseValidateAccResponse {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String returnCode;
    protected String returnDesc;
    @XmlElement(name = "Iban")
    protected String iban;
    @XmlElement(name = "Bic")
    protected String bic;
    @XmlElement(name = "CountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String countryCode;
    @XmlElement(name = "DomesticAccountNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String domesticAccountNumber;
    @XmlElement(name = "DomesticBankCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String domesticBankCode;
    @XmlElement(name = "DomesticBranchCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String domesticBranchCode;
    @XmlElement(name = "DomesticCheckSum")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String domesticCheckSum;

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
     * Gets the value of the iban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIban() {
        return iban;
    }

    /**
     * Sets the value of the iban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIban(String value) {
        this.iban = value;
    }

    /**
     * Gets the value of the bic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBic() {
        return bic;
    }

    /**
     * Sets the value of the bic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBic(String value) {
        this.bic = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the domesticAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomesticAccountNumber() {
        return domesticAccountNumber;
    }

    /**
     * Sets the value of the domesticAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomesticAccountNumber(String value) {
        this.domesticAccountNumber = value;
    }

    /**
     * Gets the value of the domesticBankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomesticBankCode() {
        return domesticBankCode;
    }

    /**
     * Sets the value of the domesticBankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomesticBankCode(String value) {
        this.domesticBankCode = value;
    }

    /**
     * Gets the value of the domesticBranchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomesticBranchCode() {
        return domesticBranchCode;
    }

    /**
     * Sets the value of the domesticBranchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomesticBranchCode(String value) {
        this.domesticBranchCode = value;
    }

    /**
     * Gets the value of the domesticCheckSum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomesticCheckSum() {
        return domesticCheckSum;
    }

    /**
     * Sets the value of the domesticCheckSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomesticCheckSum(String value) {
        this.domesticCheckSum = value;
    }

}
