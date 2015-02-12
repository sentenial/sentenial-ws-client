
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

    private final static QName _PaymentScheduleResponse_QNAME = new QName("urn:com:sentenial:origix:ws:paymentschedule-ws", "PaymentScheduleResponse");
    private final static QName _PaymentScheduleRequest_QNAME = new QName("urn:com:sentenial:origix:ws:paymentschedule-ws", "PaymentScheduleRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sentenial.ws.client.accountvalidation
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EditPaymentScheduleResponse }
     * 
     */
    public EditPaymentScheduleResponse createEditPaymentScheduleResponse() {
        return new EditPaymentScheduleResponse();
    }

    /**
     * Create an instance of {@link Creditor }
     * 
     */
    public Creditor createCreditor() {
        return new Creditor();
    }

    /**
     * Create an instance of {@link MandateInfo }
     * 
     */
    public MandateInfo createMandateInfo() {
        return new MandateInfo();
    }

    /**
     * Create an instance of {@link PaymentScheduleInfo }
     * 
     */
    public PaymentScheduleInfo createPaymentScheduleInfo() {
        return new PaymentScheduleInfo();
    }

    /**
     * Create an instance of {@link DirectDebitInfo }
     * 
     */
    public DirectDebitInfo createDirectDebitInfo() {
        return new DirectDebitInfo();
    }

    /**
     * Create an instance of {@link AddPaymentScheduleResponse }
     * 
     */
    public AddPaymentScheduleResponse createAddPaymentScheduleResponse() {
        return new AddPaymentScheduleResponse();
    }

    /**
     * Create an instance of {@link EditPaymentScheduleRequest }
     * 
     */
    public EditPaymentScheduleRequest createEditPaymentScheduleRequest() {
        return new EditPaymentScheduleRequest();
    }

    /**
     * Create an instance of {@link AddPaymentScheduleRequest }
     * 
     */
    public AddPaymentScheduleRequest createAddPaymentScheduleRequest() {
        return new AddPaymentScheduleRequest();
    }

    /**
     * Create an instance of {@link CreditorScheme }
     * 
     */
    public CreditorScheme createCreditorScheme() {
        return new CreditorScheme();
    }

    /**
     * Create an instance of {@link DirectDebit }
     * 
     */
    public DirectDebit createDirectDebit() {
        return new DirectDebit();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentScheduleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:sentenial:origix:ws:paymentschedule-ws", name = "PaymentScheduleResponse")
    public JAXBElement<PaymentScheduleResponse> createPaymentScheduleResponse(PaymentScheduleResponse value) {
        return new JAXBElement<PaymentScheduleResponse>(_PaymentScheduleResponse_QNAME, PaymentScheduleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentScheduleRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:sentenial:origix:ws:paymentschedule-ws", name = "PaymentScheduleRequest")
    public JAXBElement<PaymentScheduleRequest> createPaymentScheduleRequest(PaymentScheduleRequest value) {
        return new JAXBElement<PaymentScheduleRequest>(_PaymentScheduleRequest_QNAME, PaymentScheduleRequest.class, null, value);
    }

}
