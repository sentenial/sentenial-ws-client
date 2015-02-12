
package com.sentenial.ws.client.ct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CreditTransferRecallResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditTransferRecallResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnCode" type="{urn:com:sentenial:origix:ws:common:types}ReturnCode"/>
 *         &lt;element name="returnDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditorRef" type="{urn:com:sentenial:origix:ws:common:types}Max35Number"/>
 *         &lt;element name="CreditTransfer" type="{urn:com:sentenial:origix:ws:credittransfer-ws}CreditTransferDetails" minOccurs="0"/>
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
@XmlType(name = "CreditTransferRecallResponse", propOrder = {
    "returnCode",
    "returnDesc",
    "creditorRef",
    "creditTransfer",
    "operationRsn"
})
@XmlSeeAlso({
    RecallCreditTransferResponse.class
})
public abstract class CreditTransferRecallResponse {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String returnCode;
    protected String returnDesc;
    @XmlElement(name = "CreditorRef", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String creditorRef;
    @XmlElement(name = "CreditTransfer")
    protected CreditTransferDetails creditTransfer;
    @XmlElement(name = "OperationRsn")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String operationRsn;

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
     * Gets the value of the creditTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link CreditTransferDetails }
     *     
     */
    public CreditTransferDetails getCreditTransfer() {
        return creditTransfer;
    }

    /**
     * Sets the value of the creditTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditTransferDetails }
     *     
     */
    public void setCreditTransfer(CreditTransferDetails value) {
        this.creditTransfer = value;
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
