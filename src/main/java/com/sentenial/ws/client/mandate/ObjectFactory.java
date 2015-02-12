
package com.sentenial.ws.client.mandate;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sentenial.ws.client.mandate package. 
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

    private final static QName _MandateResponse_QNAME = new QName("urn:com:sentenial:origix:ws:mandate-ws", "MandateResponse");
    private final static QName _MandateRequest_QNAME = new QName("urn:com:sentenial:origix:ws:mandate-ws", "MandateRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sentenial.ws.client.mandate
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreditorAccount }
     * 
     */
    public CreditorAccount createCreditorAccount() {
        return new CreditorAccount();
    }

    /**
     * Create an instance of {@link RequestMandateInfo }
     * 
     */
    public RequestMandateInfo createRequestMandateInfo() {
        return new RequestMandateInfo();
    }

    /**
     * Create an instance of {@link DebtorAccount }
     * 
     */
    public DebtorAccount createDebtorAccount() {
        return new DebtorAccount();
    }

    /**
     * Create an instance of {@link Debtor }
     * 
     */
    public Debtor createDebtor() {
        return new Debtor();
    }

    /**
     * Create an instance of {@link RequestInfo }
     * 
     */
    public RequestInfo createRequestInfo() {
        return new RequestInfo();
    }

    /**
     * Create an instance of {@link ResponseMandateInfo }
     * 
     */
    public ResponseMandateInfo createResponseMandateInfo() {
        return new ResponseMandateInfo();
    }

    /**
     * Create an instance of {@link RequestMandate }
     * 
     */
    public RequestMandate createRequestMandate() {
        return new RequestMandate();
    }

    /**
     * Create an instance of {@link ResponseMandate }
     * 
     */
    public ResponseMandate createResponseMandate() {
        return new ResponseMandate();
    }

    /**
     * Create an instance of {@link SepaAddress }
     * 
     */
    public SepaAddress createSepaAddress() {
        return new SepaAddress();
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
     * Create an instance of {@link CancelMandateResponse }
     * 
     */
    public CancelMandateResponse createCancelMandateResponse() {
        return new CancelMandateResponse();
    }

    /**
     * Create an instance of {@link ViewMandateResponse }
     * 
     */
    public ViewMandateResponse createViewMandateResponse() {
        return new ViewMandateResponse();
    }

    /**
     * Create an instance of {@link ReactivateSuspendedMandateResponse }
     * 
     */
    public ReactivateSuspendedMandateResponse createReactivateSuspendedMandateResponse() {
        return new ReactivateSuspendedMandateResponse();
    }

    /**
     * Create an instance of {@link ReactivateSuspendedMandateRequest }
     * 
     */
    public ReactivateSuspendedMandateRequest createReactivateSuspendedMandateRequest() {
        return new ReactivateSuspendedMandateRequest();
    }

    /**
     * Create an instance of {@link EditMandateResponse }
     * 
     */
    public EditMandateResponse createEditMandateResponse() {
        return new EditMandateResponse();
    }

    /**
     * Create an instance of {@link ActivateMandateRequest }
     * 
     */
    public ActivateMandateRequest createActivateMandateRequest() {
        return new ActivateMandateRequest();
    }

    /**
     * Create an instance of {@link EditMandateRequest }
     * 
     */
    public EditMandateRequest createEditMandateRequest() {
        return new EditMandateRequest();
    }

    /**
     * Create an instance of {@link SuspendMandateResponse }
     * 
     */
    public SuspendMandateResponse createSuspendMandateResponse() {
        return new SuspendMandateResponse();
    }

    /**
     * Create an instance of {@link CancelMandateRequest }
     * 
     */
    public CancelMandateRequest createCancelMandateRequest() {
        return new CancelMandateRequest();
    }

    /**
     * Create an instance of {@link SuspendMandateRequest }
     * 
     */
    public SuspendMandateRequest createSuspendMandateRequest() {
        return new SuspendMandateRequest();
    }

    /**
     * Create an instance of {@link AddMandateRequest }
     * 
     */
    public AddMandateRequest createAddMandateRequest() {
        return new AddMandateRequest();
    }

    /**
     * Create an instance of {@link ActivateMandateResponse }
     * 
     */
    public ActivateMandateResponse createActivateMandateResponse() {
        return new ActivateMandateResponse();
    }

    /**
     * Create an instance of {@link ViewMandateRequest }
     * 
     */
    public ViewMandateRequest createViewMandateRequest() {
        return new ViewMandateRequest();
    }

    /**
     * Create an instance of {@link AddMandateResponse }
     * 
     */
    public AddMandateResponse createAddMandateResponse() {
        return new AddMandateResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MandateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:sentenial:origix:ws:mandate-ws", name = "MandateResponse")
    public JAXBElement<MandateResponse> createMandateResponse(MandateResponse value) {
        return new JAXBElement<MandateResponse>(_MandateResponse_QNAME, MandateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MandateRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:sentenial:origix:ws:mandate-ws", name = "MandateRequest")
    public JAXBElement<MandateRequest> createMandateRequest(MandateRequest value) {
        return new JAXBElement<MandateRequest>(_MandateRequest_QNAME, MandateRequest.class, null, value);
    }

}
