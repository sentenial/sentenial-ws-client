
package com.sentenial.ws.client.ct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for RjctDtls complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RjctDtls">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RjctRsn" type="{urn:com:sentenial:origix:ws:common:types}Max4Text" minOccurs="0"/>
 *         &lt;element name="RjctDesc" type="{urn:com:sentenial:origix:ws:common:types}Max140Text" minOccurs="0"/>
 *         &lt;element name="RjctType" type="{urn:com:sentenial:origix:ws:common:types}Max6Text"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RjctDtls", propOrder = {
    "rjctRsn",
    "rjctDesc",
    "rjctType"
})
public class RjctDtls {

    @XmlElement(name = "RjctRsn")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rjctRsn;
    @XmlElement(name = "RjctDesc")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rjctDesc;
    @XmlElement(name = "RjctType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rjctType;

    /**
     * Gets the value of the rjctRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRjctRsn() {
        return rjctRsn;
    }

    /**
     * Sets the value of the rjctRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRjctRsn(String value) {
        this.rjctRsn = value;
    }

    /**
     * Gets the value of the rjctDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRjctDesc() {
        return rjctDesc;
    }

    /**
     * Sets the value of the rjctDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRjctDesc(String value) {
        this.rjctDesc = value;
    }

    /**
     * Gets the value of the rjctType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRjctType() {
        return rjctType;
    }

    /**
     * Sets the value of the rjctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRjctType(String value) {
        this.rjctType = value;
    }

}
