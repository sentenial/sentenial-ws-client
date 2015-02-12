
package com.sentenial.ws.client.paymentschedule;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentScheduleRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentScheduleRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Creditor" type="{urn:com:sentenial:origix:ws:common:commontypes}Creditor"/>
 *         &lt;element name="MandateInfo" type="{urn:com:sentenial:origix:ws:common:commontypes}MandateInfo" minOccurs="0"/>
 *         &lt;element name="PaymentScheduleInfo" type="{urn:com:sentenial:origix:ws:common:commontypes}PaymentScheduleInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentScheduleRequest", namespace = "urn:com:sentenial:origix:ws:paymentschedule-ws", propOrder = {
    "creditor",
    "mandateInfo",
    "paymentScheduleInfo"
})
@XmlSeeAlso({
    AddPaymentScheduleRequest.class,
    EditPaymentScheduleRequest.class
})
public abstract class PaymentScheduleRequest {

    @XmlElement(name = "Creditor", required = true)
    protected Creditor creditor;
    @XmlElement(name = "MandateInfo")
    protected MandateInfo mandateInfo;
    @XmlElement(name = "PaymentScheduleInfo", required = true)
    protected PaymentScheduleInfo paymentScheduleInfo;

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
     * Gets the value of the paymentScheduleInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentScheduleInfo }
     *     
     */
    public PaymentScheduleInfo getPaymentScheduleInfo() {
        return paymentScheduleInfo;
    }

    /**
     * Sets the value of the paymentScheduleInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentScheduleInfo }
     *     
     */
    public void setPaymentScheduleInfo(PaymentScheduleInfo value) {
        this.paymentScheduleInfo = value;
    }

}
