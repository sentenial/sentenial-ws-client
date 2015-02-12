
package com.sentenial.ws.client.usermgmnt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for RoleCoordinatesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoleCoordinatesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtOrgId" type="{urn:com:sentenial:origix:ws:common:types}Max35TextMandatory"/>
 *         &lt;element name="UsrRl" type="{urn:com:sentenial:origix:ws:common:types}Max70TextMandatory"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoleCoordinatesType", propOrder = {
    "extOrgId",
    "usrRl"
})
public class RoleCoordinatesType {

    @XmlElement(name = "ExtOrgId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String extOrgId;
    @XmlElement(name = "UsrRl", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String usrRl;

    /**
     * Gets the value of the extOrgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtOrgId() {
        return extOrgId;
    }

    /**
     * Sets the value of the extOrgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtOrgId(String value) {
        this.extOrgId = value;
    }

    /**
     * Gets the value of the usrRl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsrRl() {
        return usrRl;
    }

    /**
     * Sets the value of the usrRl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsrRl(String value) {
        this.usrRl = value;
    }

}
