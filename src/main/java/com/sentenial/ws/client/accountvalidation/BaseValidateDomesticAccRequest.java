
package com.sentenial.ws.client.accountvalidation;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for BaseValidateDomesticAccRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseValidateDomesticAccRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DomesticAccountNumber" type="{urn:com:sentenial:origix:ws:common:types}Max70Text"/>
 *         &lt;element name="CountryCode" type="{urn:com:sentenial:origix:ws:common:types}IsoCountryCode"/>
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
@XmlType(name = "BaseValidateDomesticAccRequest", namespace = "urn:com:sentenial:origix:ws:accountvalidation-ws", propOrder = {
    "domesticAccountNumber",
    "countryCode",
    "domesticBankCode",
    "domesticBranchCode",
    "domesticCheckSum"
})
@XmlSeeAlso({
    ValidateDomesticAccountRequest.class
})
public class BaseValidateDomesticAccRequest {

    @XmlElement(name = "DomesticAccountNumber", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String domesticAccountNumber;
    @XmlElement(name = "CountryCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String countryCode;
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
