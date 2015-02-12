
package com.sentenial.ws.client.ct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FailedCtDtls complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FailedCtDtls">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreditTransfer" type="{urn:com:sentenial:origix:ws:credittransfer-ws}CreditTransferDetails"/>
 *         &lt;element name="RjctDtls" type="{urn:com:sentenial:origix:ws:credittransfer-ws}RjctDtls"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FailedCtDtls", propOrder = {
    "creditTransfer",
    "rjctDtls"
})
public class FailedCtDtls {

    @XmlElement(name = "CreditTransfer", required = true)
    protected CreditTransferDetails creditTransfer;
    @XmlElement(name = "RjctDtls", required = true)
    protected RjctDtls rjctDtls;

    /**
     * Gets the value of the creditTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link CreditTransferDetails }
     *     
     */
    public CreditTransferDetails getCreditTransfer() {
        return creditTransfer;
    }

    /**
     * Sets the value of the creditTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditTransferDetails }
     *     
     */
    public void setCreditTransfer(CreditTransferDetails value) {
        this.creditTransfer = value;
    }

    /**
     * Gets the value of the rjctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link RjctDtls }
     *     
     */
    public RjctDtls getRjctDtls() {
        return rjctDtls;
    }

    /**
     * Sets the value of the rjctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RjctDtls }
     *     
     */
    public void setRjctDtls(RjctDtls value) {
        this.rjctDtls = value;
    }

}
