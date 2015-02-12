
package com.sentenial.ws.client.dd;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RequestActivateRevokedDirectDebit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestActivateRevokedDirectDebit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Creditor" type="{urn:com:sentenial:origix:ws:common:commontypes}Creditor"/>
 *         &lt;element name="MandateInfo" type="{urn:com:sentenial:origix:ws:common:commontypes}MandateInfo" minOccurs="0"/>
 *         &lt;element name="PmtEndToEndId" type="{urn:com:sentenial:origix:ws:common:types}Max35Text"/>
 *         &lt;element name="PmtDate" type="{urn:com:sentenial:origix:ws:common:types}IsoDate" minOccurs="0"/>
 *         &lt;element name="PmtAmt" type="{urn:com:sentenial:origix:ws:common:types}Max15DecimalNumber" minOccurs="0"/>
 *         &lt;element name="RemittanceInfo" type="{urn:com:sentenial:origix:ws:common:types}Max140Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestActivateRevokedDirectDebit", propOrder = {
    "creditor",
    "mandateInfo",
    "pmtEndToEndId",
    "pmtDate",
    "pmtAmt",
    "remittanceInfo"
})
@XmlSeeAlso({
    ActivateRevokedDirectDebitRequest.class
})
public class RequestActivateRevokedDirectDebit {

    @XmlElement(name = "Creditor", required = true)
    protected Creditor creditor;
    @XmlElement(name = "MandateInfo")
    protected MandateInfo mandateInfo;
    @XmlElement(name = "PmtEndToEndId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String pmtEndToEndId;
    @XmlElement(name = "PmtDate")
    protected XMLGregorianCalendar pmtDate;
    @XmlElement(name = "PmtAmt")
    protected BigDecimal pmtAmt;
    @XmlElement(name = "RemittanceInfo")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String remittanceInfo;

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
     * Gets the value of the pmtDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPmtDate() {
        return pmtDate;
    }

    /**
     * Sets the value of the pmtDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPmtDate(XMLGregorianCalendar value) {
        this.pmtDate = value;
    }

    /**
     * Gets the value of the pmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPmtAmt() {
        return pmtAmt;
    }

    /**
     * Sets the value of the pmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPmtAmt(BigDecimal value) {
        this.pmtAmt = value;
    }

    /**
     * Gets the value of the remittanceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemittanceInfo() {
        return remittanceInfo;
    }

    /**
     * Sets the value of the remittanceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemittanceInfo(String value) {
        this.remittanceInfo = value;
    }

}
