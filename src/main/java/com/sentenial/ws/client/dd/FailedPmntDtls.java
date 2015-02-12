
package com.sentenial.ws.client.dd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FailedPmntDtls complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FailedPmntDtls">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Creditor" type="{urn:com:sentenial:origix:ws:common:commontypes}Creditor"/>
 *         &lt;element name="MandateInfo" type="{urn:com:sentenial:origix:ws:common:commontypes}MandateInfo"/>
 *         &lt;element name="PaymentScheduleRef" type="{urn:com:sentenial:origix:ws:directdebit}PaymentScheduleRef"/>
 *         &lt;element name="DirectDebitInfo" type="{urn:com:sentenial:origix:ws:common:commontypes}DirectDebitInfo"/>
 *         &lt;element name="RjctDtls" type="{urn:com:sentenial:origix:ws:directdebit}RjctDtls"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FailedPmntDtls", propOrder = {
    "creditor",
    "mandateInfo",
    "paymentScheduleRef",
    "directDebitInfo",
    "rjctDtls"
})
public class FailedPmntDtls {

    @XmlElement(name = "Creditor", required = true)
    protected Creditor creditor;
    @XmlElement(name = "MandateInfo", required = true)
    protected MandateInfo mandateInfo;
    @XmlElement(name = "PaymentScheduleRef", required = true)
    protected PaymentScheduleRef paymentScheduleRef;
    @XmlElement(name = "DirectDebitInfo", required = true)
    protected DirectDebitInfo directDebitInfo;
    @XmlElement(name = "RjctDtls", required = true)
    protected RjctDtls rjctDtls;

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
     * Gets the value of the paymentScheduleRef property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentScheduleRef }
     *     
     */
    public PaymentScheduleRef getPaymentScheduleRef() {
        return paymentScheduleRef;
    }

    /**
     * Sets the value of the paymentScheduleRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentScheduleRef }
     *     
     */
    public void setPaymentScheduleRef(PaymentScheduleRef value) {
        this.paymentScheduleRef = value;
    }

    /**
     * Gets the value of the directDebitInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DirectDebitInfo }
     *     
     */
    public DirectDebitInfo getDirectDebitInfo() {
        return directDebitInfo;
    }

    /**
     * Sets the value of the directDebitInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectDebitInfo }
     *     
     */
    public void setDirectDebitInfo(DirectDebitInfo value) {
        this.directDebitInfo = value;
    }

    /**
     * Gets the value of the rjctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link RjctDtls }
     *     
     */
    public RjctDtls getRjctDtls() {
        return rjctDtls;
    }

    /**
     * Sets the value of the rjctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RjctDtls }
     *     
     */
    public void setRjctDtls(RjctDtls value) {
        this.rjctDtls = value;
    }

}
