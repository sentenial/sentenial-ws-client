
package com.sentenial.ws.client.dd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for RequestRevokeAllDirectDebits complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestRevokeAllDirectDebits">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Creditor" type="{urn:com:sentenial:origix:ws:common:commontypes}Creditor"/>
 *         &lt;element name="MandateInfo" type="{urn:com:sentenial:origix:ws:common:commontypes}MandateInfo" minOccurs="0"/>
 *         &lt;element name="ScheduleId" type="{urn:com:sentenial:origix:ws:common:types}Max19Number" minOccurs="0"/>
 *         &lt;element name="OperationRsn" type="{urn:com:sentenial:origix:ws:common:types}Max140Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestRevokeAllDirectDebits", propOrder = {
    "creditor",
    "mandateInfo",
    "scheduleId",
    "operationRsn"
})
@XmlSeeAlso({
    RevokeAllDirectDebitsRequest.class
})
public class RequestRevokeAllDirectDebits {

    @XmlElement(name = "Creditor", required = true)
    protected Creditor creditor;
    @XmlElement(name = "MandateInfo")
    protected MandateInfo mandateInfo;
    @XmlElement(name = "ScheduleId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String scheduleId;
    @XmlElement(name = "OperationRsn")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String operationRsn;

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
     * Gets the value of the scheduleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleId() {
        return scheduleId;
    }

    /**
     * Sets the value of the scheduleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleId(String value) {
        this.scheduleId = value;
    }

    /**
     * Gets the value of the operationRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationRsn() {
        return operationRsn;
    }

    /**
     * Sets the value of the operationRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationRsn(String value) {
        this.operationRsn = value;
    }

}
