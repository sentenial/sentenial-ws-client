
package com.sentenial.ws.client.dd;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RequestListDirectDebits complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestListDirectDebits">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Creditor" type="{urn:com:sentenial:origix:ws:common:commontypes}Creditor"/>
 *         &lt;element name="MandateInfo" type="{urn:com:sentenial:origix:ws:common:commontypes}MandateInfo" minOccurs="0"/>
 *         &lt;element name="ScheduleId" type="{urn:com:sentenial:origix:ws:common:types}Max19Number" minOccurs="0"/>
 *         &lt;element name="PmtStatus" type="{urn:com:sentenial:origix:ws:common:types}PaymentStatus" minOccurs="0"/>
 *         &lt;element name="PmtFromDate" type="{urn:com:sentenial:origix:ws:common:types}IsoDate" minOccurs="0"/>
 *         &lt;element name="PmtToDate" type="{urn:com:sentenial:origix:ws:common:types}IsoDate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestListDirectDebits", propOrder = {
    "creditor",
    "mandateInfo",
    "scheduleId",
    "pmtStatus",
    "pmtFromDate",
    "pmtToDate"
})
@XmlSeeAlso({
    ListDirectDebitRequest.class
})
public class RequestListDirectDebits {

    @XmlElement(name = "Creditor", required = true)
    protected Creditor creditor;
    @XmlElement(name = "MandateInfo")
    protected MandateInfo mandateInfo;
    @XmlElement(name = "ScheduleId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String scheduleId;
    @XmlElement(name = "PmtStatus")
    protected PaymentStatus pmtStatus;
    @XmlElement(name = "PmtFromDate")
    protected XMLGregorianCalendar pmtFromDate;
    @XmlElement(name = "PmtToDate")
    protected XMLGregorianCalendar pmtToDate;

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
     * Gets the value of the pmtStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentStatus }
     *     
     */
    public PaymentStatus getPmtStatus() {
        return pmtStatus;
    }

    /**
     * Sets the value of the pmtStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentStatus }
     *     
     */
    public void setPmtStatus(PaymentStatus value) {
        this.pmtStatus = value;
    }

    /**
     * Gets the value of the pmtFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPmtFromDate() {
        return pmtFromDate;
    }

    /**
     * Sets the value of the pmtFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPmtFromDate(XMLGregorianCalendar value) {
        this.pmtFromDate = value;
    }

    /**
     * Gets the value of the pmtToDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPmtToDate() {
        return pmtToDate;
    }

    /**
     * Sets the value of the pmtToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPmtToDate(XMLGregorianCalendar value) {
        this.pmtToDate = value;
    }

}
