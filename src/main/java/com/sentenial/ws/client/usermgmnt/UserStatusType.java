
package com.sentenial.ws.client.usermgmnt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserStatusType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:sentenial:origix:ws:usermgmnt-ws}UserType">
 *       &lt;sequence>
 *         &lt;element name="UsrSts" type="{urn:com:sentenial:origix:ws:usermgmnt-ws}StatusType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserStatusType", propOrder = {
    "usrSts"
})
@XmlSeeAlso({
    UserResponseType.class
})
public class UserStatusType
    extends UserType
{

    @XmlElement(name = "UsrSts", required = true)
    protected StatusType usrSts;

    /**
     * Gets the value of the usrSts property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getUsrSts() {
        return usrSts;
    }

    /**
     * Sets the value of the usrSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setUsrSts(StatusType value) {
        this.usrSts = value;
    }

}
