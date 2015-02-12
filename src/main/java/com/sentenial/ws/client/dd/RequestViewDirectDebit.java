
package com.sentenial.ws.client.dd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for RequestViewDirectDebit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestViewDirectDebit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Creditor" type="{urn:com:sentenial:origix:ws:common:commontypes}Creditor"/>
 *         &lt;element name="MandateInfo" type="{urn:com:sentenial:origix:ws:common:commontypes}MandateInfo" minOccurs="0"/>
 *         &lt;element name="PmtEndToEndId" type="{urn:com:sentenial:origix:ws:common:types}Max35Text"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestViewDirectDebit", propOrder = {
    "creditor",
    "mandateInfo",
    "pmtEndToEndId"
})
@XmlSeeAlso({
    ViewDirectDebitRequest.class
})
public class RequestViewDirectDebit {

    @XmlElement(name = "Creditor", required = true)
    protected Creditor creditor;
    @XmlElement(name = "MandateInfo")
    protected MandateInfo mandateInfo;
    @XmlElement(name = "PmtEndToEndId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String pmtEndToEndId;

    /**
     * Gets the value of the creditor property.
     * 
     * @return
     *     possible object is
     *     {@link Creditor }
     *     
     */
    public Creditor getCreditor() {
        return creditor;
    }

    /**
     * Sets the value of the creditor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Creditor }
     *     
     */
    public void setCreditor(Creditor value) {
        this.creditor = value;
    }

    /**
     * Gets the value of the mandateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MandateInfo }
     *     
     */
    public MandateInfo getMandateInfo() {
        return mandateInfo;
    }

    /**
     * Sets the value of the mandateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateInfo }
     *     
     */
    public void setMandateInfo(MandateInfo value) {
        this.mandateInfo = value;
    }

    /**
     * Gets the value of the pmtEndToEndId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtEndToEndId() {
        return pmtEndToEndId;
    }

    /**
     * Sets the value of the pmtEndToEndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtEndToEndId(String value) {
        this.pmtEndToEndId = value;
    }

}
