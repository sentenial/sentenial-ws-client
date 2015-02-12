
package com.sentenial.ws.client.ct;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DirectDebit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DirectDebit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ScheduleId" type="{urn:com:sentenial:origix:ws:common:types}Max19Number" minOccurs="0"/>
 *         &lt;element name="PmtEndToEndId" type="{urn:com:sentenial:origix:ws:common:types}Max35Text"/>
 *         &lt;element name="PmntAmt" type="{urn:com:sentenial:origix:ws:common:types}Max15DecimalNumber"/>
 *         &lt;element name="ReqdColltnDt" type="{urn:com:sentenial:origix:ws:common:types}IsoDate"/>
 *         &lt;element name="ActColltnDt" type="{urn:com:sentenial:origix:ws:common:types}IsoDate"/>
 *         &lt;element name="ExportDt" type="{urn:com:sentenial:origix:ws:common:types}IsoDate"/>
 *         &lt;element name="RemittanceInfo" type="{urn:com:sentenial:origix:ws:common:types}Max140Text" minOccurs="0"/>
 *         &lt;element name="FirstPmtEndToEndId" type="{urn:com:sentenial:origix:ws:common:types}Max35Text" minOccurs="0"/>
 *         &lt;element name="OrgnlPmtEndToEndId" type="{urn:com:sentenial:origix:ws:common:types}Max35Text" minOccurs="0"/>
 *         &lt;element name="RepresentationAttNo" type="{urn:com:sentenial:origix:ws:common:types}Max2Number" minOccurs="0"/>
 *         &lt;element name="PmtStatus" type="{urn:com:sentenial:origix:ws:common:types}PaymentStatus" minOccurs="0"/>
 *         &lt;element name="OperationReason" type="{urn:com:sentenial:origix:ws:common:types}Max140Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectDebit", namespace = "urn:com:sentenial:origix:ws:common:commontypes", propOrder = {
    "scheduleId",
    "pmtEndToEndId",
    "pmntAmt",
    "reqdColltnDt",
    "actColltnDt",
    "exportDt",
    "remittanceInfo",
    "firstPmtEndToEndId",
    "orgnlPmtEndToEndId",
    "representationAttNo",
    "pmtStatus",
    "operationReason"
})
public class DirectDebit {

    @XmlElement(name = "ScheduleId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String scheduleId;
    @XmlElement(name = "PmtEndToEndId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String pmtEndToEndId;
    @XmlElement(name = "PmntAmt", required = true)
    protected BigDecimal pmntAmt;
    @XmlElement(name = "ReqdColltnDt", required = true)
    protected XMLGregorianCalendar reqdColltnDt;
    @XmlElement(name = "ActColltnDt", required = true)
    protected XMLGregorianCalendar actColltnDt;
    @XmlElement(name = "ExportDt", required = true)
    protected XMLGregorianCalendar exportDt;
    @XmlElement(name = "RemittanceInfo")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String remittanceInfo;
    @XmlElement(name = "FirstPmtEndToEndId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String firstPmtEndToEndId;
    @XmlElement(name = "OrgnlPmtEndToEndId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String orgnlPmtEndToEndId;
    @XmlElement(name = "RepresentationAttNo")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String representationAttNo;
    @XmlElement(name = "PmtStatus")
    protected PaymentStatus pmtStatus;
    @XmlElement(name = "OperationReason")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String operationReason;

    /**
     * Gets the value of the scheduleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleId() {
        return scheduleId;
    }

    /**
     * Sets the value of the scheduleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleId(String value) {
        this.scheduleId = value;
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
     * Gets the value of the pmntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPmntAmt() {
        return pmntAmt;
    }

    /**
     * Sets the value of the pmntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPmntAmt(BigDecimal value) {
        this.pmntAmt = value;
    }

    /**
     * Gets the value of the reqdColltnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReqdColltnDt() {
        return reqdColltnDt;
    }

    /**
     * Sets the value of the reqdColltnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReqdColltnDt(XMLGregorianCalendar value) {
        this.reqdColltnDt = value;
    }

    /**
     * Gets the value of the actColltnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActColltnDt() {
        return actColltnDt;
    }

    /**
     * Sets the value of the actColltnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActColltnDt(XMLGregorianCalendar value) {
        this.actColltnDt = value;
    }

    /**
     * Gets the value of the exportDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExportDt() {
        return exportDt;
    }

    /**
     * Sets the value of the exportDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExportDt(XMLGregorianCalendar value) {
        this.exportDt = value;
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

    /**
     * Gets the value of the firstPmtEndToEndId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstPmtEndToEndId() {
        return firstPmtEndToEndId;
    }

    /**
     * Sets the value of the firstPmtEndToEndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstPmtEndToEndId(String value) {
        this.firstPmtEndToEndId = value;
    }

    /**
     * Gets the value of the orgnlPmtEndToEndId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlPmtEndToEndId() {
        return orgnlPmtEndToEndId;
    }

    /**
     * Sets the value of the orgnlPmtEndToEndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlPmtEndToEndId(String value) {
        this.orgnlPmtEndToEndId = value;
    }

    /**
     * Gets the value of the representationAttNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepresentationAttNo() {
        return representationAttNo;
    }

    /**
     * Sets the value of the representationAttNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepresentationAttNo(String value) {
        this.representationAttNo = value;
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

    /**
     * Gets the value of the operationReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationReason() {
        return operationReason;
    }

    /**
     * Sets the value of the operationReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationReason(String value) {
        this.operationReason = value;
    }

}
