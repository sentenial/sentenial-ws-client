
package com.sentenial.ws.client.accountvalidation;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for BaseValidateIBANRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseValidateIBANRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Iban" type="{urn:com:sentenial:origix:ws:common:types}IbanIdentifier"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseValidateIBANRequest", namespace = "urn:com:sentenial:origix:ws:accountvalidation-ws", propOrder = {
    "iban"
})
@XmlSeeAlso({
    ValidateIBANAccountRequest.class
})
public class BaseValidateIBANRequest {

    @XmlElement(name = "Iban", required = true)
    protected String iban;

    /**
     * Gets the value of the iban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIban() {
        return iban;
    }

    /**
     * Sets the value of the iban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIban(String value) {
        this.iban = value;
    }

}
