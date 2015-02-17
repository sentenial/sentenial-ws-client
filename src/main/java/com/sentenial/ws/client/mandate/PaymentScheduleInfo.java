
package com.sentenial.ws.client.mandate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;


/**
 * <p>Java class for PaymentScheduleInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentScheduleInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ScheduleId" type="{urn:com:sentenial:origix:ws:common:types}Max19Number" minOccurs="0"/>
 *         &lt;element name="Frequency" type="{urn:com:sentenial:origix:ws:common:types}PaymentFrequency"/>
 *         &lt;element name="PmtType" type="{urn:com:sentenial:origix:ws:common:types}PaymentType"/>
 *         &lt;element name="StartDate" type="{urn:com:sentenial:origix:ws:common:types}IsoDate"/>
 *         &lt;element name="NoOfPayments" type="{urn:com:sentenial:origix:ws:common:types}Max3Number" minOccurs="0"/>
 *         &lt;element name="PmtAmt" type="{urn:com:sentenial:origix:ws:common:types}Max15DecimalNumber"/>
 *         &lt;element name="FrstPmtAmt" type="{urn:com:sentenial:origix:ws:common:types}Max15DecimalNumber" minOccurs="0"/>
 *         &lt;element name="LstPmtAmt" type="{urn:com:sentenial:origix:ws:common:types}Max15DecimalNumber" minOccurs="0"/>
 *         &lt;element name="RemittanceInfo" type="{urn:com:sentenial:origix:ws:common:types}Max140Text" minOccurs="0"/>
 *         &lt;element name="PmtDayOfWeek" type="{urn:com:sentenial:origix:ws:common:types}PaymentDayofWeek" minOccurs="0"/>
 *         &lt;element name="PmtWeekOfMonth" type="{urn:com:sentenial:origix:ws:common:types}PmtWeekOfMonth" minOccurs="0"/>
 *         &lt;element name="PmtDateInMonth" type="{urn:com:sentenial:origix:ws:common:types}DateInMonth" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentScheduleInfo", namespace = "urn:com:sentenial:origix:ws:common:commontypes", propOrder = {
    "scheduleId",
    "frequency",
    "pmtType",
    "startDate",
    "noOfPayments",
    "pmtAmt",
    "frstPmtAmt",
    "lstPmtAmt",
    "remittanceInfo",
    "pmtDayOfWeek",
    "pmtWeekOfMonth",
    "pmtDateInMonth"
})
public class PaymentScheduleInfo {

    @XmlElement(name = "ScheduleId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String scheduleId;
    @XmlElement(name = "Frequency", required = true)
    protected PaymentFrequency frequency;
    @XmlElement(name = "PmtType", required = true)
    protected PaymentType pmtType;
    @XmlElement(name = "StartDate", required = true)
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "NoOfPayments")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String noOfPayments;
    @XmlElement(name = "PmtAmt", required = true)
    protected BigDecimal pmtAmt;
    @XmlElement(name = "FrstPmtAmt")
    protected BigDecimal frstPmtAmt;
    @XmlElement(name = "LstPmtAmt")
    protected BigDecimal lstPmtAmt;
    @XmlElement(name = "RemittanceInfo")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String remittanceInfo;
    @XmlElement(name = "PmtDayOfWeek")
    protected PaymentDayofWeek pmtDayOfWeek;
    @XmlElement(name = "PmtWeekOfMonth")
    protected PmtWeekOfMonth pmtWeekOfMonth;
    @XmlElement(name = "PmtDateInMonth")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String pmtDateInMonth;

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
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentFrequency }
     *     
     */
    public PaymentFrequency getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentFrequency }
     *     
     */
    public void setFrequency(PaymentFrequency value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the pmtType property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentType }
     *     
     */
    public PaymentType getPmtType() {
        return pmtType;
    }

    /**
     * Sets the value of the pmtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentType }
     *     
     */
    public void setPmtType(PaymentType value) {
        this.pmtType = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the noOfPayments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoOfPayments() {
        return noOfPayments;
    }

    /**
     * Sets the value of the noOfPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoOfPayments(String value) {
        this.noOfPayments = value;
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
     * Gets the value of the frstPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFrstPmtAmt() {
        return frstPmtAmt;
    }

    /**
     * Sets the value of the frstPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFrstPmtAmt(BigDecimal value) {
        this.frstPmtAmt = value;
    }

    /**
     * Gets the value of the lstPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLstPmtAmt() {
        return lstPmtAmt;
    }

    /**
     * Sets the value of the lstPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLstPmtAmt(BigDecimal value) {
        this.lstPmtAmt = value;
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
     * Gets the value of the pmtDayOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDayofWeek }
     *     
     */
    public PaymentDayofWeek getPmtDayOfWeek() {
        return pmtDayOfWeek;
    }

    /**
     * Sets the value of the pmtDayOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDayofWeek }
     *     
     */
    public void setPmtDayOfWeek(PaymentDayofWeek value) {
        this.pmtDayOfWeek = value;
    }

    /**
     * Gets the value of the pmtWeekOfMonth property.
     * 
     * @return
     *     possible object is
     *     {@link PmtWeekOfMonth }
     *     
     */
    public PmtWeekOfMonth getPmtWeekOfMonth() {
        return pmtWeekOfMonth;
    }

    /**
     * Sets the value of the pmtWeekOfMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtWeekOfMonth }
     *     
     */
    public void setPmtWeekOfMonth(PmtWeekOfMonth value) {
        this.pmtWeekOfMonth = value;
    }

    /**
     * Gets the value of the pmtDateInMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtDateInMonth() {
        return pmtDateInMonth;
    }

    /**
     * Sets the value of the pmtDateInMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtDateInMonth(String value) {
        this.pmtDateInMonth = value;
    }

}
