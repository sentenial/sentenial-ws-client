
package com.sentenial.ws.client.ct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PostalAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostalAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BnfcryAddrLn1" type="{urn:com:sentenial:origix:ws:common:types}Max70EPCImplAllowed" minOccurs="0"/>
 *         &lt;element name="BnfcryAddrLn2" type="{urn:com:sentenial:origix:ws:common:types}Max70EPCImplAllowed" minOccurs="0"/>
 *         &lt;element name="BnfcryTwn" type="{urn:com:sentenial:origix:ws:common:types}Max35Text" minOccurs="0"/>
 *         &lt;element name="BnfcrySt" type="{urn:com:sentenial:origix:ws:common:types}Max35Text" minOccurs="0"/>
 *         &lt;element name="BnfcryPstCd" type="{urn:com:sentenial:origix:ws:common:types}Max16EPCImplAllowed" minOccurs="0"/>
 *         &lt;element name="BnfcryCntry" type="{urn:com:sentenial:origix:ws:common:types}IsoCountryCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostalAddress", propOrder = {
    "bnfcryAddrLn1",
    "bnfcryAddrLn2",
    "bnfcryTwn",
    "bnfcrySt",
    "bnfcryPstCd",
    "bnfcryCntry"
})
public class PostalAddress {

    @XmlElement(name = "BnfcryAddrLn1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String bnfcryAddrLn1;
    @XmlElement(name = "BnfcryAddrLn2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String bnfcryAddrLn2;
    @XmlElement(name = "BnfcryTwn")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String bnfcryTwn;
    @XmlElement(name = "BnfcrySt")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String bnfcrySt;
    @XmlElement(name = "BnfcryPstCd")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String bnfcryPstCd;
    @XmlElement(name = "BnfcryCntry")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String bnfcryCntry;

    /**
     * Gets the value of the bnfcryAddrLn1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBnfcryAddrLn1() {
        return bnfcryAddrLn1;
    }

    /**
     * Sets the value of the bnfcryAddrLn1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBnfcryAddrLn1(String value) {
        this.bnfcryAddrLn1 = value;
    }

    /**
     * Gets the value of the bnfcryAddrLn2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBnfcryAddrLn2() {
        return bnfcryAddrLn2;
    }

    /**
     * Sets the value of the bnfcryAddrLn2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBnfcryAddrLn2(String value) {
        this.bnfcryAddrLn2 = value;
    }

    /**
     * Gets the value of the bnfcryTwn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBnfcryTwn() {
        return bnfcryTwn;
    }

    /**
     * Sets the value of the bnfcryTwn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBnfcryTwn(String value) {
        this.bnfcryTwn = value;
    }

    /**
     * Gets the value of the bnfcrySt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBnfcrySt() {
        return bnfcrySt;
    }

    /**
     * Sets the value of the bnfcrySt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBnfcrySt(String value) {
        this.bnfcrySt = value;
    }

    /**
     * Gets the value of the bnfcryPstCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBnfcryPstCd() {
        return bnfcryPstCd;
    }

    /**
     * Sets the value of the bnfcryPstCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBnfcryPstCd(String value) {
        this.bnfcryPstCd = value;
    }

    /**
     * Gets the value of the bnfcryCntry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBnfcryCntry() {
        return bnfcryCntry;
    }

    /**
     * Sets the value of the bnfcryCntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBnfcryCntry(String value) {
        this.bnfcryCntry = value;
    }

}
