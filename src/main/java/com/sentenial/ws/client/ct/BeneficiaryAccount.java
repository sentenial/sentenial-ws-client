
package com.sentenial.ws.client.ct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BeneficiaryAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BeneficiaryAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountInfo" type="{urn:com:sentenial:origix:ws:credittransfer-ws}AccountInfo" minOccurs="0"/>
 *         &lt;element name="DomAccountInfo" type="{urn:com:sentenial:origix:ws:credittransfer-ws}DomAccountInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BeneficiaryAccount", propOrder = {
    "accountInfo",
    "domAccountInfo"
})
public class BeneficiaryAccount {

    @XmlElement(name = "AccountInfo")
    protected AccountInfo accountInfo;
    @XmlElement(name = "DomAccountInfo")
    protected DomAccountInfo domAccountInfo;

    /**
     * Gets the value of the accountInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AccountInfo }
     *     
     */
    public AccountInfo getAccountInfo() {
        return accountInfo;
    }

    /**
     * Sets the value of the accountInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountInfo }
     *     
     */
    public void setAccountInfo(AccountInfo value) {
        this.accountInfo = value;
    }

    /**
     * Gets the value of the domAccountInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DomAccountInfo }
     *     
     */
    public DomAccountInfo getDomAccountInfo() {
        return domAccountInfo;
    }

    /**
     * Sets the value of the domAccountInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomAccountInfo }
     *     
     */
    public void setDomAccountInfo(DomAccountInfo value) {
        this.domAccountInfo = value;
    }

}
