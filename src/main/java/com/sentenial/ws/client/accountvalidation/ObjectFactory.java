
package com.sentenial.ws.client.accountvalidation;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sentenial.ws.client.accountvalidation package. 
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

    private final static QName _BaseValidateIBANRequest_QNAME = new QName("urn:com:sentenial:origix:ws:accountvalidation-ws", "BaseValidateIBANRequest");
    private final static QName _BaseValidateDomesticAccRequest_QNAME = new QName("urn:com:sentenial:origix:ws:accountvalidation-ws", "BaseValidateDomesticAccRequest");
    private final static QName _BaseValidateAccResponse_QNAME = new QName("urn:com:sentenial:origix:ws:accountvalidation-ws", "BaseValidateAccResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sentenial.ws.client.accountvalidation
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidateDomesticAccountRequest }
     * 
     */
    public ValidateDomesticAccountRequest createValidateDomesticAccountRequest() {
        return new ValidateDomesticAccountRequest();
    }

    /**
     * Create an instance of {@link BaseValidateDomesticAccRequest }
     * 
     */
    public BaseValidateDomesticAccRequest createBaseValidateDomesticAccRequest() {
        return new BaseValidateDomesticAccRequest();
    }

    /**
     * Create an instance of {@link ValidateAccountResponse }
     * 
     */
    public ValidateAccountResponse createValidateAccountResponse() {
        return new ValidateAccountResponse();
    }

    /**
     * Create an instance of {@link BaseValidateAccResponse }
     * 
     */
    public BaseValidateAccResponse createBaseValidateAccResponse() {
        return new BaseValidateAccResponse();
    }

    /**
     * Create an instance of {@link BaseValidateIBANRequest }
     * 
     */
    public BaseValidateIBANRequest createBaseValidateIBANRequest() {
        return new BaseValidateIBANRequest();
    }

    /**
     * Create an instance of {@link ValidateIBANAccountRequest }
     * 
     */
    public ValidateIBANAccountRequest createValidateIBANAccountRequest() {
        return new ValidateIBANAccountRequest();
    }

    /**
     * Create an instance of {@link Creditor }
     * 
     */
    public Creditor createCreditor() {
        return new Creditor();
    }

    /**
     * Create an instance of {@link PaymentScheduleInfo }
     * 
     */
    public PaymentScheduleInfo createPaymentScheduleInfo() {
        return new PaymentScheduleInfo();
    }

    /**
     * Create an instance of {@link MandateInfo }
     * 
     */
    public MandateInfo createMandateInfo() {
        return new MandateInfo();
    }

    /**
     * Create an instance of {@link CreditorScheme }
     * 
     */
    public CreditorScheme createCreditorScheme() {
        return new CreditorScheme();
    }

    /**
     * Create an instance of {@link DirectDebitInfo }
     * 
     */
    public DirectDebitInfo createDirectDebitInfo() {
        return new DirectDebitInfo();
    }

    /**
     * Create an instance of {@link DirectDebit }
     * 
     */
    public DirectDebit createDirectDebit() {
        return new DirectDebit();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseValidateIBANRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:sentenial:origix:ws:accountvalidation-ws", name = "BaseValidateIBANRequest")
    public JAXBElement<BaseValidateIBANRequest> createBaseValidateIBANRequest(BaseValidateIBANRequest value) {
        return new JAXBElement<BaseValidateIBANRequest>(_BaseValidateIBANRequest_QNAME, BaseValidateIBANRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseValidateDomesticAccRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:sentenial:origix:ws:accountvalidation-ws", name = "BaseValidateDomesticAccRequest")
    public JAXBElement<BaseValidateDomesticAccRequest> createBaseValidateDomesticAccRequest(BaseValidateDomesticAccRequest value) {
        return new JAXBElement<BaseValidateDomesticAccRequest>(_BaseValidateDomesticAccRequest_QNAME, BaseValidateDomesticAccRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseValidateAccResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:sentenial:origix:ws:accountvalidation-ws", name = "BaseValidateAccResponse")
    public JAXBElement<BaseValidateAccResponse> createBaseValidateAccResponse(BaseValidateAccResponse value) {
        return new JAXBElement<BaseValidateAccResponse>(_BaseValidateAccResponse_QNAME, BaseValidateAccResponse.class, null, value);
    }

}
