
package com.sentenial.ws.client.ct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditTransferDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditTransferDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountDetails" type="{urn:com:sentenial:origix:ws:credittransfer-ws}TransferAccountDetails"/>
 *         &lt;element name="PaymentInfo" type="{urn:com:sentenial:origix:ws:credittransfer-ws}PaymentInfoResponse"/>
 *         &lt;element name="PmtStatus" type="{urn:com:sentenial:origix:ws:common:types}BeneficiaryPaymentStatus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditTransferDetails", propOrder = {
    "accountDetails",
    "paymentInfo",
    "pmtStatus"
})
public class CreditTransferDetails {

    @XmlElement(name = "AccountDetails", required = true)
    protected TransferAccountDetails accountDetails;
    @XmlElement(name = "PaymentInfo", required = true)
    protected PaymentInfoResponse paymentInfo;
    @XmlElement(name = "PmtStatus", required = true)
    protected BeneficiaryPaymentStatus pmtStatus;

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
     *     {@link PaymentInfoResponse }
     *     
     */
    public PaymentInfoResponse getPaymentInfo() {
        return paymentInfo;
    }

    /**
     * Sets the value of the paymentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInfoResponse }
     *     
     */
    public void setPaymentInfo(PaymentInfoResponse value) {
        this.paymentInfo = value;
    }

    /**
     * Gets the value of the pmtStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BeneficiaryPaymentStatus }
     *     
     */
    public BeneficiaryPaymentStatus getPmtStatus() {
        return pmtStatus;
    }

    /**
     * Sets the value of the pmtStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeneficiaryPaymentStatus }
     *     
     */
    public void setPmtStatus(BeneficiaryPaymentStatus value) {
        this.pmtStatus = value;
    }

}
