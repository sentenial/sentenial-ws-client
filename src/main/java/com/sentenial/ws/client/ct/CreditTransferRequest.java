
package com.sentenial.ws.client.ct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CreditTransferRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditTransferRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreditorRef" type="{urn:com:sentenial:origix:ws:common:types}Max35Number"/>
 *         &lt;element name="AccountDetails" type="{urn:com:sentenial:origix:ws:credittransfer-ws}TransferAccountDetails"/>
 *         &lt;element name="PaymentInfo" type="{urn:com:sentenial:origix:ws:credittransfer-ws}PaymentInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditTransferRequest", propOrder = {
    "creditorRef",
    "accountDetails",
    "paymentInfo"
})
@XmlSeeAlso({
    AddCreditTransferRequest.class
})
public abstract class CreditTransferRequest {

    @XmlElement(name = "CreditorRef", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String creditorRef;
    @XmlElement(name = "AccountDetails", required = true)
    protected TransferAccountDetails accountDetails;
    @XmlElement(name = "PaymentInfo", required = true)
    protected PaymentInfo paymentInfo;

    /**
     * Gets the value of the creditorRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditorRef() {
        return creditorRef;
    }

    /**
     * Sets the value of the creditorRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditorRef(String value) {
        this.creditorRef = value;
    }

    /**
     * Gets the value of the accountDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TransferAccountDetails }
     *     
     */
    public TransferAccountDetails getAccountDetails() {
        return accountDetails;
    }

    /**
     * Sets the value of the accountDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferAccountDetails }
     *     
     */
    public void setAccountDetails(TransferAccountDetails value) {
        this.accountDetails = value;
    }

    /**
     * Gets the value of the paymentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInfo }
     *     
     */
    public PaymentInfo getPaymentInfo() {
        return paymentInfo;
    }

    /**
     * Sets the value of the paymentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInfo }
     *     
     */
    public void setPaymentInfo(PaymentInfo value) {
        this.paymentInfo = value;
    }

}
