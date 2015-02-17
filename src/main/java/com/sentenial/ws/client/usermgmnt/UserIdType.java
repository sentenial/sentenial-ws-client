
package com.sentenial.ws.client.usermgmnt;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for UserIdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserIdType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UsrNm" type="{urn:com:sentenial:origix:ws:common:types}Max70AlphaNumForUsername" minOccurs="0"/>
 *         &lt;element name="UnqId" type="{urn:com:sentenial:origix:ws:common:types}Max70AlphaNumForUsername" minOccurs="0"/>
 *         &lt;element name="RlCrdnts" type="{urn:com:sentenial:origix:ws:usermgmnt-ws}RoleCoordinatesType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserIdType", propOrder = {
    "usrNm",
    "unqId",
    "rlCrdnts"
})
@XmlSeeAlso({
    UserType.class
})
public class UserIdType {

    @XmlElement(name = "UsrNm")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String usrNm;
    @XmlElement(name = "UnqId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String unqId;
    @XmlElement(name = "RlCrdnts", required = true)
    protected List<RoleCoordinatesType> rlCrdnts;

    /**
     * Gets the value of the usrNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsrNm() {
        return usrNm;
    }

    /**
     * Sets the value of the usrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsrNm(String value) {
        this.usrNm = value;
    }

    /**
     * Gets the value of the unqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnqId() {
        return unqId;
    }

    /**
     * Sets the value of the unqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnqId(String value) {
        this.unqId = value;
    }

    /**
     * Gets the value of the rlCrdnts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rlCrdnts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRlCrdnts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoleCoordinatesType }
     * 
     * 
     */
    public List<RoleCoordinatesType> getRlCrdnts() {
        if (rlCrdnts == null) {
            rlCrdnts = new ArrayList<RoleCoordinatesType>();
        }
        return this.rlCrdnts;
    }

}
