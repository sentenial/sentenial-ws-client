
package com.sentenial.ws.client.mandate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for SepaAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SepaAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Line1" type="{urn:com:sentenial:origix:ws:common:types}Max70Text" minOccurs="0"/>
 *         &lt;element name="Line2" type="{urn:com:sentenial:origix:ws:common:types}Max70Text" minOccurs="0"/>
 *         &lt;element name="Town" type="{urn:com:sentenial:origix:ws:common:types}Max70Text" minOccurs="0"/>
 *         &lt;element name="PostCode" type="{urn:com:sentenial:origix:ws:common:types}Max16Text" minOccurs="0"/>
 *         &lt;element name="State" type="{urn:com:sentenial:origix:ws:common:types}Max70Text" minOccurs="0"/>
 *         &lt;element name="Country" type="{urn:com:sentenial:origix:ws:common:types}IsoCountryCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SepaAddress", namespace = "urn:com:sentenial:origix:ws:mandate", propOrder = {
    "line1",
    "line2",
    "town",
    "postCode",
    "state",
    "country"
})
public class SepaAddress {

    @XmlElement(name = "Line1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String line1;
    @XmlElement(name = "Line2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String line2;
    @XmlElement(name = "Town")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String town;
    @XmlElement(name = "PostCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String postCode;
    @XmlElement(name = "State")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String state;
    @XmlElement(name = "Country")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String country;

    /**
     * Gets the value of the line1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine1() {
        return line1;
    }

    /**
     * Sets the value of the line1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine1(String value) {
        this.line1 = value;
    }

    /**
     * Gets the value of the line2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine2() {
        return line2;
    }

    /**
     * Sets the value of the line2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine2(String value) {
        this.line2 = value;
    }

    /**
     * Gets the value of the town property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTown() {
        return town;
    }

    /**
     * Sets the value of the town property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTown(String value) {
        this.town = value;
    }

    /**
     * Gets the value of the postCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCode(String value) {
        this.postCode = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

}
