
package com.sentenial.ws.client.usermgmnt;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sentenial.ws.client.usermgmnt package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RemoveUser_QNAME = new QName("urn:com:sentenial:origix:ws:usermgmnt-ws", "RemoveUser");
    private final static QName _EditUserResponse_QNAME = new QName("urn:com:sentenial:origix:ws:usermgmnt-ws", "EditUserResponse");
    private final static QName _AddUserResponse_QNAME = new QName("urn:com:sentenial:origix:ws:usermgmnt-ws", "AddUserResponse");
    private final static QName _ActivateUserResponse_QNAME = new QName("urn:com:sentenial:origix:ws:usermgmnt-ws", "ActivateUserResponse");
    private final static QName _ActivateUser_QNAME = new QName("urn:com:sentenial:origix:ws:usermgmnt-ws", "ActivateUser");
    private final static QName _ViewUser_QNAME = new QName("urn:com:sentenial:origix:ws:usermgmnt-ws", "ViewUser");
    private final static QName _ViewUserResponse_QNAME = new QName("urn:com:sentenial:origix:ws:usermgmnt-ws", "ViewUserResponse");
    private final static QName _RemoveUserResponse_QNAME = new QName("urn:com:sentenial:origix:ws:usermgmnt-ws", "RemoveUserResponse");
    private final static QName _DeactivateUser_QNAME = new QName("urn:com:sentenial:origix:ws:usermgmnt-ws", "DeactivateUser");
    private final static QName _UserReconciliation_QNAME = new QName("urn:com:sentenial:origix:ws:usermgmnt-ws", "UserReconciliation");
    private final static QName _DeactivateUserResponse_QNAME = new QName("urn:com:sentenial:origix:ws:usermgmnt-ws", "DeactivateUserResponse");
    private final static QName _EditUser_QNAME = new QName("urn:com:sentenial:origix:ws:usermgmnt-ws", "EditUser");
    private final static QName _UserReconciliationResponse_QNAME = new QName("urn:com:sentenial:origix:ws:usermgmnt-ws", "UserReconciliationResponse");
    private final static QName _AddUser_QNAME = new QName("urn:com:sentenial:origix:ws:usermgmnt-ws", "AddUser");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sentenial.ws.client.usermgmnt
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UserResponseType }
     * 
     */
    public UserResponseType createUserResponseType() {
        return new UserResponseType();
    }

    /**
     * Create an instance of {@link UserStatusListType }
     * 
     */
    public UserStatusListType createUserStatusListType() {
        return new UserStatusListType();
    }

    /**
     * Create an instance of {@link UserType }
     * 
     */
    public UserType createUserType() {
        return new UserType();
    }

    /**
     * Create an instance of {@link UserIdType }
     * 
     */
    public UserIdType createUserIdType() {
        return new UserIdType();
    }

    /**
     * Create an instance of {@link UserResponseListType }
     * 
     */
    public UserResponseListType createUserResponseListType() {
        return new UserResponseListType();
    }

    /**
     * Create an instance of {@link RoleCoordinatesType }
     * 
     */
    public RoleCoordinatesType createRoleCoordinatesType() {
        return new RoleCoordinatesType();
    }

    /**
     * Create an instance of {@link UserStatusType }
     * 
     */
    public UserStatusType createUserStatusType() {
        return new UserStatusType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:sentenial:origix:ws:usermgmnt-ws", name = "RemoveUser")
    public JAXBElement<UserIdType> createRemoveUser(UserIdType value) {
        return new JAXBElement<UserIdType>(_RemoveUser_QNAME, UserIdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:sentenial:origix:ws:usermgmnt-ws", name = "EditUserResponse")
    public JAXBElement<UserResponseType> createEditUserResponse(UserResponseType value) {
        return new JAXBElement<UserResponseType>(_EditUserResponse_QNAME, UserResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:sentenial:origix:ws:usermgmnt-ws", name = "AddUserResponse")
    public JAXBElement<UserResponseType> createAddUserResponse(UserResponseType value) {
        return new JAXBElement<UserResponseType>(_AddUserResponse_QNAME, UserResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:sentenial:origix:ws:usermgmnt-ws", name = "ActivateUserResponse")
    public JAXBElement<UserResponseType> createActivateUserResponse(UserResponseType value) {
        return new JAXBElement<UserResponseType>(_ActivateUserResponse_QNAME, UserResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:sentenial:origix:ws:usermgmnt-ws", name = "ActivateUser")
    public JAXBElement<UserIdType> createActivateUser(UserIdType value) {
        return new JAXBElement<UserIdType>(_ActivateUser_QNAME, UserIdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:sentenial:origix:ws:usermgmnt-ws", name = "ViewUser")
    public JAXBElement<UserIdType> createViewUser(UserIdType value) {
        return new JAXBElement<UserIdType>(_ViewUser_QNAME, UserIdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:sentenial:origix:ws:usermgmnt-ws", name = "ViewUserResponse")
    public JAXBElement<UserResponseType> createViewUserResponse(UserResponseType value) {
        return new JAXBElement<UserResponseType>(_ViewUserResponse_QNAME, UserResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:sentenial:origix:ws:usermgmnt-ws", name = "RemoveUserResponse")
    public JAXBElement<UserResponseType> createRemoveUserResponse(UserResponseType value) {
        return new JAXBElement<UserResponseType>(_RemoveUserResponse_QNAME, UserResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:sentenial:origix:ws:usermgmnt-ws", name = "DeactivateUser")
    public JAXBElement<UserIdType> createDeactivateUser(UserIdType value) {
        return new JAXBElement<UserIdType>(_DeactivateUser_QNAME, UserIdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserStatusListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:sentenial:origix:ws:usermgmnt-ws", name = "UserReconciliation")
    public JAXBElement<UserStatusListType> createUserReconciliation(UserStatusListType value) {
        return new JAXBElement<UserStatusListType>(_UserReconciliation_QNAME, UserStatusListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:sentenial:origix:ws:usermgmnt-ws", name = "DeactivateUserResponse")
    public JAXBElement<UserResponseType> createDeactivateUserResponse(UserResponseType value) {
        return new JAXBElement<UserResponseType>(_DeactivateUserResponse_QNAME, UserResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:sentenial:origix:ws:usermgmnt-ws", name = "EditUser")
    public JAXBElement<UserType> createEditUser(UserType value) {
        return new JAXBElement<UserType>(_EditUser_QNAME, UserType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserResponseListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:sentenial:origix:ws:usermgmnt-ws", name = "UserReconciliationResponse")
    public JAXBElement<UserResponseListType> createUserReconciliationResponse(UserResponseListType value) {
        return new JAXBElement<UserResponseListType>(_UserReconciliationResponse_QNAME, UserResponseListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:sentenial:origix:ws:usermgmnt-ws", name = "AddUser")
    public JAXBElement<UserType> createAddUser(UserType value) {
        return new JAXBElement<UserType>(_AddUser_QNAME, UserType.class, null, value);
    }

}
