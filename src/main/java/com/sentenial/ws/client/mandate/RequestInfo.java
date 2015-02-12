
package com.sentenial.ws.client.mandate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for RequestInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AuthMethod" type="{urn:com:sentenial:origix:ws:common:types}AuthMethod" minOccurs="0"/>
 *         &lt;element name="AuthToken" type="{urn:com:sentenial:origix:ws:common:types}Max35Text" minOccurs="0"/>
 *         &lt;element name="AuthTokenPhoneNo" type="{urn:com:sentenial:origix:ws:common:types}Max30Text" minOccurs="0"/>
 *         &lt;element name="AuthTokenEmail" type="{urn:com:sentenial:origix:ws:common:types}Max254Text" minOccurs="0"/>
 *         &lt;element name="IpAddress" type="{urn:com:sentenial:origix:ws:common:types}IpAddress" minOccurs="0"/>
 *         &lt;element name="GeographicLocation" type="{urn:com:sentenial:origix:ws:common:types}Max70Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestInfo", namespace = "urn:com:sentenial:origix:ws:mandate", propOrder = {
    "authMethod",
    "authToken",
    "authTokenPhoneNo",
    "authTokenEmail",
    "ipAddress",
    "geographicLocation"
})
public class RequestInfo {

    @XmlElement(name = "AuthMethod")
    protected AuthMethod authMethod;
    @XmlElement(name = "AuthToken")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String authToken;
    @XmlElement(name = "AuthTokenPhoneNo")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String authTokenPhoneNo;
    @XmlElement(name = "AuthTokenEmail")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String authTokenEmail;
    @XmlElement(name = "IpAddress")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String ipAddress;
    @XmlElement(name = "GeographicLocation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String geographicLocation;

    /**
     * Gets the value of the authMethod property.
     * 
     * @return
     *     possible object is
     *     {@link AuthMethod }
     *     
     */
    public AuthMethod getAuthMethod() {
        return authMethod;
    }

    /**
     * Sets the value of the authMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthMethod }
     *     
     */
    public void setAuthMethod(AuthMethod value) {
        this.authMethod = value;
    }

    /**
     * Gets the value of the authToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthToken() {
        return authToken;
    }

    /**
     * Sets the value of the authToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthToken(String value) {
        this.authToken = value;
    }

    /**
     * Gets the value of the authTokenPhoneNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthTokenPhoneNo() {
        return authTokenPhoneNo;
    }

    /**
     * Sets the value of the authTokenPhoneNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthTokenPhoneNo(String value) {
        this.authTokenPhoneNo = value;
    }

    /**
     * Gets the value of the authTokenEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthTokenEmail() {
        return authTokenEmail;
    }

    /**
     * Sets the value of the authTokenEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthTokenEmail(String value) {
        this.authTokenEmail = value;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the geographicLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeographicLocation() {
        return geographicLocation;
    }

    /**
     * Sets the value of the geographicLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeographicLocation(String value) {
        this.geographicLocation = value;
    }

}
