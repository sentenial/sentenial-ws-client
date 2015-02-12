
package com.sentenial.ws.client.usermgmnt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for UserType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com:sentenial:origix:ws:usermgmnt-ws}UserIdType">
 *       &lt;sequence>
 *         &lt;element name="UsrTtle" type="{urn:com:sentenial:origix:ws:usermgmnt-ws}UserTitleType"/>
 *         &lt;element name="UsrFrstNm" type="{urn:com:sentenial:origix:ws:common:types}Max30AlphaNumNoSpace"/>
 *         &lt;element name="UsrLstNm" type="{urn:com:sentenial:origix:ws:common:types}Max30AlphaNumNoSpace"/>
 *         &lt;element name="UsrPhnNmbr" type="{urn:com:sentenial:origix:ws:common:types}Max30Number" minOccurs="0"/>
 *         &lt;element name="UsrMblNmbr" type="{urn:com:sentenial:origix:ws:common:types}Max30Number" minOccurs="0"/>
 *         &lt;element name="UsrEmail" type="{urn:com:sentenial:origix:ws:usermgmnt-ws}Email254" minOccurs="0"/>
 *         &lt;element name="UsrFaxNm" type="{urn:com:sentenial:origix:ws:common:types}Max30Number" minOccurs="0"/>
 *         &lt;element name="CmmnNm" type="{urn:com:sentenial:origix:ws:common:types}Max70AlphaNum" minOccurs="0"/>
 *         &lt;element name="UsrPsswrd" type="{urn:com:sentenial:origix:ws:usermgmnt-ws}Password35Type" minOccurs="0"/>
 *         &lt;element name="UsrLng" type="{urn:com:sentenial:origix:ws:usermgmnt-ws}LanguageType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserType", propOrder = {
    "usrTtle",
    "usrFrstNm",
    "usrLstNm",
    "usrPhnNmbr",
    "usrMblNmbr",
    "usrEmail",
    "usrFaxNm",
    "cmmnNm",
    "usrPsswrd",
    "usrLng"
})
@XmlSeeAlso({
    UserStatusType.class
})
public class UserType
    extends UserIdType
{

    @XmlElement(name = "UsrTtle", required = true)
    protected UserTitleType usrTtle;
    @XmlElement(name = "UsrFrstNm", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String usrFrstNm;
    @XmlElement(name = "UsrLstNm", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String usrLstNm;
    @XmlElement(name = "UsrPhnNmbr")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String usrPhnNmbr;
    @XmlElement(name = "UsrMblNmbr")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String usrMblNmbr;
    @XmlElement(name = "UsrEmail")
    protected String usrEmail;
    @XmlElement(name = "UsrFaxNm")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String usrFaxNm;
    @XmlElement(name = "CmmnNm")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String cmmnNm;
    @XmlElement(name = "UsrPsswrd")
    protected String usrPsswrd;
    @XmlElement(name = "UsrLng", defaultValue = "EN")
    protected LanguageType usrLng;

    /**
     * Gets the value of the usrTtle property.
     * 
     * @return
     *     possible object is
     *     {@link UserTitleType }
     *     
     */
    public UserTitleType getUsrTtle() {
        return usrTtle;
    }

    /**
     * Sets the value of the usrTtle property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserTitleType }
     *     
     */
    public void setUsrTtle(UserTitleType value) {
        this.usrTtle = value;
    }

    /**
     * Gets the value of the usrFrstNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsrFrstNm() {
        return usrFrstNm;
    }

    /**
     * Sets the value of the usrFrstNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsrFrstNm(String value) {
        this.usrFrstNm = value;
    }

    /**
     * Gets the value of the usrLstNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsrLstNm() {
        return usrLstNm;
    }

    /**
     * Sets the value of the usrLstNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsrLstNm(String value) {
        this.usrLstNm = value;
    }

    /**
     * Gets the value of the usrPhnNmbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsrPhnNmbr() {
        return usrPhnNmbr;
    }

    /**
     * Sets the value of the usrPhnNmbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsrPhnNmbr(String value) {
        this.usrPhnNmbr = value;
    }

    /**
     * Gets the value of the usrMblNmbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsrMblNmbr() {
        return usrMblNmbr;
    }

    /**
     * Sets the value of the usrMblNmbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsrMblNmbr(String value) {
        this.usrMblNmbr = value;
    }

    /**
     * Gets the value of the usrEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsrEmail() {
        return usrEmail;
    }

    /**
     * Sets the value of the usrEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsrEmail(String value) {
        this.usrEmail = value;
    }

    /**
     * Gets the value of the usrFaxNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsrFaxNm() {
        return usrFaxNm;
    }

    /**
     * Sets the value of the usrFaxNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsrFaxNm(String value) {
        this.usrFaxNm = value;
    }

    /**
     * Gets the value of the cmmnNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmmnNm() {
        return cmmnNm;
    }

    /**
     * Sets the value of the cmmnNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmmnNm(String value) {
        this.cmmnNm = value;
    }

    /**
     * Gets the value of the usrPsswrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsrPsswrd() {
        return usrPsswrd;
    }

    /**
     * Sets the value of the usrPsswrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsrPsswrd(String value) {
        this.usrPsswrd = value;
    }

    /**
     * Gets the value of the usrLng property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageType }
     *     
     */
    public LanguageType getUsrLng() {
        return usrLng;
    }

    /**
     * Sets the value of the usrLng property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageType }
     *     
     */
    public void setUsrLng(LanguageType value) {
        this.usrLng = value;
    }

}
