
package com.sentenial.ws.client.ct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for DomAccountInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DomAccountInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BnfcryAccntCntry" type="{urn:com:sentenial:origix:ws:common:types}IsoCountryCode" minOccurs="0"/>
 *         &lt;element name="BnfcryBnkCd" type="{urn:com:sentenial:origix:ws:common:types}Max35Text" minOccurs="0"/>
 *         &lt;element name="BnfcryBrnchCd" type="{urn:com:sentenial:origix:ws:common:types}Max35Text" minOccurs="0"/>
 *         &lt;element name="BnfcryDomAccNum" type="{urn:com:sentenial:origix:ws:common:types}Max70Text" minOccurs="0"/>
 *         &lt;element name="BnfcryDomChkSm" type="{urn:com:sentenial:origix:ws:common:types}Max35Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DomAccountInfo", propOrder = {
    "bnfcryAccntCntry",
    "bnfcryBnkCd",
    "bnfcryBrnchCd",
    "bnfcryDomAccNum",
    "bnfcryDomChkSm"
})
public class DomAccountInfo {

    @XmlElement(name = "BnfcryAccntCntry")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String bnfcryAccntCntry;
    @XmlElement(name = "BnfcryBnkCd")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String bnfcryBnkCd;
    @XmlElement(name = "BnfcryBrnchCd")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String bnfcryBrnchCd;
    @XmlElement(name = "BnfcryDomAccNum")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String bnfcryDomAccNum;
    @XmlElement(name = "BnfcryDomChkSm")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String bnfcryDomChkSm;

    /**
     * Gets the value of the bnfcryAccntCntry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBnfcryAccntCntry() {
        return bnfcryAccntCntry;
    }

    /**
     * Sets the value of the bnfcryAccntCntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBnfcryAccntCntry(String value) {
        this.bnfcryAccntCntry = value;
    }

    /**
     * Gets the value of the bnfcryBnkCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBnfcryBnkCd() {
        return bnfcryBnkCd;
    }

    /**
     * Sets the value of the bnfcryBnkCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBnfcryBnkCd(String value) {
        this.bnfcryBnkCd = value;
    }

    /**
     * Gets the value of the bnfcryBrnchCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBnfcryBrnchCd() {
        return bnfcryBrnchCd;
    }

    /**
     * Sets the value of the bnfcryBrnchCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBnfcryBrnchCd(String value) {
        this.bnfcryBrnchCd = value;
    }

    /**
     * Gets the value of the bnfcryDomAccNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBnfcryDomAccNum() {
        return bnfcryDomAccNum;
    }

    /**
     * Sets the value of the bnfcryDomAccNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBnfcryDomAccNum(String value) {
        this.bnfcryDomAccNum = value;
    }

    /**
     * Gets the value of the bnfcryDomChkSm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBnfcryDomChkSm() {
        return bnfcryDomChkSm;
    }

    /**
     * Sets the value of the bnfcryDomChkSm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBnfcryDomChkSm(String value) {
        this.bnfcryDomChkSm = value;
    }

}
