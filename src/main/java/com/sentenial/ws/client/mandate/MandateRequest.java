
package com.sentenial.ws.client.mandate;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for MandateRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MandateRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Mandate" type="{urn:com:sentenial:origix:ws:mandate}RequestMandate"/>
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
@XmlType(name = "MandateRequest", propOrder = {
    "mandate",
    "requestInfo"
})
@XmlSeeAlso({
    ViewMandateRequest.class,
    AddMandateRequest.class,
    SuspendMandateRequest.class,
    CancelMandateRequest.class,
    EditMandateRequest.class,
    ActivateMandateRequest.class,
    ReactivateSuspendedMandateRequest.class
})
public abstract class MandateRequest {

    @XmlElement(name = "Mandate", required = true)
    protected RequestMandate mandate;
    @XmlElement(name = "RequestInfo")
    protected RequestInfo requestInfo;

    /**
     * Gets the value of the mandate property.
     * 
     * @return
     *     possible object is
     *     {@link RequestMandate }
     *     
     */
    public RequestMandate getMandate() {
        return mandate;
    }

    /**
     * Sets the value of the mandate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestMandate }
     *     
     */
    public void setMandate(RequestMandate value) {
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
