
package com.sentenial.ws.client.dd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ResponseListDirectDebits complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseListDirectDebits">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnCode" type="{urn:com:sentenial:origix:ws:common:types}ReturnCode"/>
 *         &lt;element name="returnDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Creditor" type="{urn:com:sentenial:origix:ws:common:commontypes}Creditor"/>
 *         &lt;element name="MandateInfo" type="{urn:com:sentenial:origix:ws:common:commontypes}MandateInfo" minOccurs="0"/>
 *         &lt;element name="PaymentScheduleInfo" type="{urn:com:sentenial:origix:ws:common:commontypes}PaymentScheduleInfo" minOccurs="0"/>
 *         &lt;element name="DirectDebitInfo" type="{urn:com:sentenial:origix:ws:common:commontypes}DirectDebitInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseListDirectDebits", propOrder = {
    "returnCode",
    "returnDesc",
    "creditor",
    "mandateInfo",
    "paymentScheduleInfo",
    "directDebitInfo"
})
@XmlSeeAlso({
    ListDirectDebitResponse.class
})
public class ResponseListDirectDebits {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String returnCode;
    protected String returnDesc;
    @XmlElement(name = "Creditor", required = true)
    protected Creditor creditor;
    @XmlElement(name = "MandateInfo")
    protected MandateInfo mandateInfo;
    @XmlElement(name = "PaymentScheduleInfo")
    protected PaymentScheduleInfo paymentScheduleInfo;
    @XmlElement(name = "DirectDebitInfo")
    protected DirectDebitInfo directDebitInfo;

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

}
