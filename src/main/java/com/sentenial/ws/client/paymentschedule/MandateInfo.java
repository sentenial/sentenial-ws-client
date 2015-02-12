
package com.sentenial.ws.client.paymentschedule;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for MandateInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MandateInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MandateId" type="{urn:com:sentenial:origix:ws:common:types}Max35Text" minOccurs="0"/>
 *         &lt;element name="DomesticMandateId" type="{urn:com:sentenial:origix:ws:common:types}Max35Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MandateInfo", propOrder = {
    "mandateId",
    "domesticMandateId"
})
public class MandateInfo {

    @XmlElement(name = "MandateId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String mandateId;
    @XmlElement(name = "DomesticMandateId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String domesticMandateId;

    /**
     * Gets the value of the mandateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMandateId() {
        return mandateId;
    }

    /**
     * Sets the value of the mandateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMandateId(String value) {
        this.mandateId = value;
    }

    /**
     * Gets the value of the domesticMandateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomesticMandateId() {
        return domesticMandateId;
    }

    /**
     * Sets the value of the domesticMandateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomesticMandateId(String value) {
        this.domesticMandateId = value;
    }

}
