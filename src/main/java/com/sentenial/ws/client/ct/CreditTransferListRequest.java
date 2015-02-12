
package com.sentenial.ws.client.ct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CreditTransferListRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditTransferListRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreditorRef" type="{urn:com:sentenial:origix:ws:common:types}Max35Number"/>
 *         &lt;element name="AccountDetails" type="{urn:com:sentenial:origix:ws:credittransfer-ws}ListTransferAccountDetails" minOccurs="0"/>
 *         &lt;element name="PmtStatus" type="{urn:com:sentenial:origix:ws:common:types}PaymentStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditTransferListRequest", propOrder = {
    "creditorRef",
    "accountDetails",
    "pmtStatus"
})
@XmlSeeAlso({
    ListCreditTransferRequest.class
})
public abstract class CreditTransferListRequest {

    @XmlElement(name = "CreditorRef", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String creditorRef;
    @XmlElement(name = "AccountDetails")
    protected ListTransferAccountDetails accountDetails;
    @XmlElement(name = "PmtStatus")
    protected PaymentStatus pmtStatus;

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
     *     {@link ListTransferAccountDetails }
     *     
     */
    public ListTransferAccountDetails getAccountDetails() {
        return accountDetails;
    }

    /**
     * Sets the value of the accountDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListTransferAccountDetails }
     *     
     */
    public void setAccountDetails(ListTransferAccountDetails value) {
        this.accountDetails = value;
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

}
