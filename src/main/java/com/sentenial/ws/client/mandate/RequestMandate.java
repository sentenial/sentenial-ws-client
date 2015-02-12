
package com.sentenial.ws.client.mandate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestMandate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestMandate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Format" type="{urn:com:sentenial:origix:ws:common:types}DomesticFormat" minOccurs="0"/>
 *         &lt;element name="Creditor" type="{urn:com:sentenial:origix:ws:common:commontypes}Creditor" minOccurs="0"/>
 *         &lt;element name="Debtor" type="{urn:com:sentenial:origix:ws:mandate}Debtor" minOccurs="0"/>
 *         &lt;element name="MandateInfo" type="{urn:com:sentenial:origix:ws:mandate}RequestMandateInfo" minOccurs="0"/>
 *         &lt;element name="DebtorAccount" type="{urn:com:sentenial:origix:ws:mandate}DebtorAccount" minOccurs="0"/>
 *         &lt;element name="CreditorAccount" type="{urn:com:sentenial:origix:ws:mandate}CreditorAccount" minOccurs="0"/>
 *         &lt;element name="OmitPdf" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MandateRequestMode" type="{urn:com:sentenial:origix:ws:common:types}MandateRequestMode" minOccurs="0"/>
 *         &lt;element name="SelfPrintMandate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MandateSource" type="{urn:com:sentenial:origix:ws:common:types}MandateSource" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestMandate", namespace = "urn:com:sentenial:origix:ws:mandate", propOrder = {
    "format",
    "creditor",
    "debtor",
    "mandateInfo",
    "debtorAccount",
    "creditorAccount",
    "omitPdf",
    "mandateRequestMode",
    "selfPrintMandate",
    "mandateSource"
})
public class RequestMandate {

    @XmlElement(name = "Format")
    protected DomesticFormat format;
    @XmlElement(name = "Creditor")
    protected Creditor creditor;
    @XmlElement(name = "Debtor")
    protected Debtor debtor;
    @XmlElement(name = "MandateInfo")
    protected RequestMandateInfo mandateInfo;
    @XmlElement(name = "DebtorAccount")
    protected DebtorAccount debtorAccount;
    @XmlElement(name = "CreditorAccount")
    protected CreditorAccount creditorAccount;
    @XmlElement(name = "OmitPdf")
    protected Boolean omitPdf;
    @XmlElement(name = "MandateRequestMode")
    protected MandateRequestMode mandateRequestMode;
    @XmlElement(name = "SelfPrintMandate")
    protected Boolean selfPrintMandate;
    @XmlElement(name = "MandateSource")
    protected MandateSource mandateSource;

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link DomesticFormat }
     *     
     */
    public DomesticFormat getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomesticFormat }
     *     
     */
    public void setFormat(DomesticFormat value) {
        this.format = value;
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
     * Gets the value of the debtor property.
     * 
     * @return
     *     possible object is
     *     {@link Debtor }
     *     
     */
    public Debtor getDebtor() {
        return debtor;
    }

    /**
     * Sets the value of the debtor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Debtor }
     *     
     */
    public void setDebtor(Debtor value) {
        this.debtor = value;
    }

    /**
     * Gets the value of the mandateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RequestMandateInfo }
     *     
     */
    public RequestMandateInfo getMandateInfo() {
        return mandateInfo;
    }

    /**
     * Sets the value of the mandateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestMandateInfo }
     *     
     */
    public void setMandateInfo(RequestMandateInfo value) {
        this.mandateInfo = value;
    }

    /**
     * Gets the value of the debtorAccount property.
     * 
     * @return
     *     possible object is
     *     {@link DebtorAccount }
     *     
     */
    public DebtorAccount getDebtorAccount() {
        return debtorAccount;
    }

    /**
     * Sets the value of the debtorAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorAccount }
     *     
     */
    public void setDebtorAccount(DebtorAccount value) {
        this.debtorAccount = value;
    }

    /**
     * Gets the value of the creditorAccount property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorAccount }
     *     
     */
    public CreditorAccount getCreditorAccount() {
        return creditorAccount;
    }

    /**
     * Sets the value of the creditorAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorAccount }
     *     
     */
    public void setCreditorAccount(CreditorAccount value) {
        this.creditorAccount = value;
    }

    /**
     * Gets the value of the omitPdf property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOmitPdf() {
        return omitPdf;
    }

    /**
     * Sets the value of the omitPdf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOmitPdf(Boolean value) {
        this.omitPdf = value;
    }

    /**
     * Gets the value of the mandateRequestMode property.
     * 
     * @return
     *     possible object is
     *     {@link MandateRequestMode }
     *     
     */
    public MandateRequestMode getMandateRequestMode() {
        return mandateRequestMode;
    }

    /**
     * Sets the value of the mandateRequestMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateRequestMode }
     *     
     */
    public void setMandateRequestMode(MandateRequestMode value) {
        this.mandateRequestMode = value;
    }

    /**
     * Gets the value of the selfPrintMandate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSelfPrintMandate() {
        return selfPrintMandate;
    }

    /**
     * Sets the value of the selfPrintMandate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSelfPrintMandate(Boolean value) {
        this.selfPrintMandate = value;
    }

    /**
     * Gets the value of the mandateSource property.
     * 
     * @return
     *     possible object is
     *     {@link MandateSource }
     *     
     */
    public MandateSource getMandateSource() {
        return mandateSource;
    }

    /**
     * Sets the value of the mandateSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateSource }
     *     
     */
    public void setMandateSource(MandateSource value) {
        this.mandateSource = value;
    }

}
