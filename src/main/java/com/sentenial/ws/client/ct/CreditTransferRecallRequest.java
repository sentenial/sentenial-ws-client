
package com.sentenial.ws.client.ct;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CreditTransferRecallRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditTransferRecallRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreditorRef" type="{urn:com:sentenial:origix:ws:common:types}Max35Number"/>
 *         &lt;element name="PmtEndToEndId" type="{urn:com:sentenial:origix:ws:common:types}Max35TextMandatory"/>
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
@XmlType(name = "CreditTransferRecallRequest", propOrder = {
    "creditorRef",
    "pmtEndToEndId",
    "operationRsn"
})
@XmlSeeAlso({
    RecallCreditTransferRequest.class
})
public abstract class CreditTransferRecallRequest {

    @XmlElement(name = "CreditorRef", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String creditorRef;
    @XmlElement(name = "PmtEndToEndId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String pmtEndToEndId;
    @XmlElement(name = "OperationRsn")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String operationRsn;

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
