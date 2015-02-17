
package com.sentenial.ws.client.mandate;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for MandateResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MandateResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnCode" type="{urn:com:sentenial:origix:ws:common:types}ReturnCode"/>
 *         &lt;element name="returnDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mandate" type="{urn:com:sentenial:origix:ws:mandate}ResponseMandate" minOccurs="0"/>
 *         &lt;element name="RequestInfo" type="{urn:com:sentenial:origix:ws:mandate}RequestInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MandateResponse", propOrder = {
    "returnCode",
    "returnDesc",
    "mandate",
    "requestInfo"
})
@XmlSeeAlso({
    AddMandateResponse.class,
    ActivateMandateResponse.class,
    SuspendMandateResponse.class,
    EditMandateResponse.class,
    ReactivateSuspendedMandateResponse.class,
    ViewMandateResponse.class,
    CancelMandateResponse.class
})
public abstract class MandateResponse {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String returnCode;
    protected String returnDesc;
    @XmlElement(name = "Mandate")
    protected ResponseMandate mandate;
    @XmlElement(name = "RequestInfo")
    protected RequestInfo requestInfo;

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
     * Gets the value of the mandate property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseMandate }
     *     
     */
    public ResponseMandate getMandate() {
        return mandate;
    }

    /**
     * Sets the value of the mandate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseMandate }
     *     
     */
    public void setMandate(ResponseMandate value) {
        this.mandate = value;
    }

    /**
     * Gets the value of the requestInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RequestInfo }
     *     
     */
    public RequestInfo getRequestInfo() {
        return requestInfo;
    }

    /**
     * Sets the value of the requestInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestInfo }
     *     
     */
    public void setRequestInfo(RequestInfo value) {
        this.requestInfo = value;
    }

}
