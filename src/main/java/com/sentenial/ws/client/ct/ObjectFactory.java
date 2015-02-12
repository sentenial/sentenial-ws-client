
package com.sentenial.ws.client.ct;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sentenial.ws.client.ct package. 
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

    private final static QName _CreditTransferRecallResponse_QNAME = new QName("urn:com:sentenial:origix:ws:credittransfer-ws", "CreditTransferRecallResponse");
    private final static QName _BeneficiaryResponse_QNAME = new QName("urn:com:sentenial:origix:ws:credittransfer-ws", "BeneficiaryResponse");
    private final static QName _CreditTransferListResponse_QNAME = new QName("urn:com:sentenial:origix:ws:credittransfer-ws", "CreditTransferListResponse");
    private final static QName _CreditTransferListRequest_QNAME = new QName("urn:com:sentenial:origix:ws:credittransfer-ws", "CreditTransferListRequest");
    private final static QName _CreditTransferRequest_QNAME = new QName("urn:com:sentenial:origix:ws:credittransfer-ws", "CreditTransferRequest");
    private final static QName _BeneficiaryViewRequest_QNAME = new QName("urn:com:sentenial:origix:ws:credittransfer-ws", "BeneficiaryViewRequest");
    private final static QName _CreditTransferRecallRequest_QNAME = new QName("urn:com:sentenial:origix:ws:credittransfer-ws", "CreditTransferRecallRequest");
    private final static QName _BeneficiaryEditRequest_QNAME = new QName("urn:com:sentenial:origix:ws:credittransfer-ws", "BeneficiaryEditRequest");
    private final static QName _CreditTransferViewResponse_QNAME = new QName("urn:com:sentenial:origix:ws:credittransfer-ws", "CreditTransferViewResponse");
    private final static QName _FailedCreditTransferRequest_QNAME = new QName("urn:com:sentenial:origix:ws:credittransfer-ws", "FailedCreditTransferRequest");
    private final static QName _FailedCreditTransferResponse_QNAME = new QName("urn:com:sentenial:origix:ws:credittransfer-ws", "FailedCreditTransferResponse");
    private final static QName _BeneficiaryRequest_QNAME = new QName("urn:com:sentenial:origix:ws:credittransfer-ws", "BeneficiaryRequest");
    private final static QName _CreditTransferResponse_QNAME = new QName("urn:com:sentenial:origix:ws:credittransfer-ws", "CreditTransferResponse");
    private final static QName _CreditTransferViewRequest_QNAME = new QName("urn:com:sentenial:origix:ws:credittransfer-ws", "CreditTransferViewRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sentenial.ws.client.ct
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ViewCreditTransferResponse }
     * 
     */
    public ViewCreditTransferResponse createViewCreditTransferResponse() {
        return new ViewCreditTransferResponse();
    }

    /**
     * Create an instance of {@link CreditTransferDetails }
     * 
     */
    public CreditTransferDetails createCreditTransferDetails() {
        return new CreditTransferDetails();
    }

    /**
     * Create an instance of {@link ViewBeneficiaryRequest }
     * 
     */
    public ViewBeneficiaryRequest createViewBeneficiaryRequest() {
        return new ViewBeneficiaryRequest();
    }

    /**
     * Create an instance of {@link RecallCreditTransferRequest }
     * 
     */
    public RecallCreditTransferRequest createRecallCreditTransferRequest() {
        return new RecallCreditTransferRequest();
    }

    /**
     * Create an instance of {@link AddCreditTransferResponse }
     * 
     */
    public AddCreditTransferResponse createAddCreditTransferResponse() {
        return new AddCreditTransferResponse();
    }

    /**
     * Create an instance of {@link AddBeneficiaryResponse }
     * 
     */
    public AddBeneficiaryResponse createAddBeneficiaryResponse() {
        return new AddBeneficiaryResponse();
    }

    /**
     * Create an instance of {@link PostalAddress }
     * 
     */
    public PostalAddress createPostalAddress() {
        return new PostalAddress();
    }

    /**
     * Create an instance of {@link ContactInfo }
     * 
     */
    public ContactInfo createContactInfo() {
        return new ContactInfo();
    }

    /**
     * Create an instance of {@link BeneficiaryAccount }
     * 
     */
    public BeneficiaryAccount createBeneficiaryAccount() {
        return new BeneficiaryAccount();
    }

    /**
     * Create an instance of {@link ListCreditTransferResponse }
     * 
     */
    public ListCreditTransferResponse createListCreditTransferResponse() {
        return new ListCreditTransferResponse();
    }

    /**
     * Create an instance of {@link EditBeneficiaryResponse }
     * 
     */
    public EditBeneficiaryResponse createEditBeneficiaryResponse() {
        return new EditBeneficiaryResponse();
    }

    /**
     * Create an instance of {@link RecallCreditTransferResponse }
     * 
     */
    public RecallCreditTransferResponse createRecallCreditTransferResponse() {
        return new RecallCreditTransferResponse();
    }

    /**
     * Create an instance of {@link FailedCreditTransferResponse }
     * 
     */
    public FailedCreditTransferResponse createFailedCreditTransferResponse() {
        return new FailedCreditTransferResponse();
    }

    /**
     * Create an instance of {@link FailedCreditTransferRequest }
     * 
     */
    public FailedCreditTransferRequest createFailedCreditTransferRequest() {
        return new FailedCreditTransferRequest();
    }

    /**
     * Create an instance of {@link ViewBeneficiaryResponse }
     * 
     */
    public ViewBeneficiaryResponse createViewBeneficiaryResponse() {
        return new ViewBeneficiaryResponse();
    }

    /**
     * Create an instance of {@link ListFailedCreditTransferRequest }
     * 
     */
    public ListFailedCreditTransferRequest createListFailedCreditTransferRequest() {
        return new ListFailedCreditTransferRequest();
    }

    /**
     * Create an instance of {@link ListCreditTransferRequest }
     * 
     */
    public ListCreditTransferRequest createListCreditTransferRequest() {
        return new ListCreditTransferRequest();
    }

    /**
     * Create an instance of {@link ListTransferAccountDetails }
     * 
     */
    public ListTransferAccountDetails createListTransferAccountDetails() {
        return new ListTransferAccountDetails();
    }

    /**
     * Create an instance of {@link EditBeneficiaryRequest }
     * 
     */
    public EditBeneficiaryRequest createEditBeneficiaryRequest() {
        return new EditBeneficiaryRequest();
    }

    /**
     * Create an instance of {@link ListFailedCreditTransferResponse }
     * 
     */
    public ListFailedCreditTransferResponse createListFailedCreditTransferResponse() {
        return new ListFailedCreditTransferResponse();
    }

    /**
     * Create an instance of {@link FailedCtDtls }
     * 
     */
    public FailedCtDtls createFailedCtDtls() {
        return new FailedCtDtls();
    }

    /**
     * Create an instance of {@link AddBeneficiaryRequest }
     * 
     */
    public AddBeneficiaryRequest createAddBeneficiaryRequest() {
        return new AddBeneficiaryRequest();
    }

    /**
     * Create an instance of {@link AddCreditTransferRequest }
     * 
     */
    public AddCreditTransferRequest createAddCreditTransferRequest() {
        return new AddCreditTransferRequest();
    }

    /**
     * Create an instance of {@link TransferAccountDetails }
     * 
     */
    public TransferAccountDetails createTransferAccountDetails() {
        return new TransferAccountDetails();
    }

    /**
     * Create an instance of {@link PaymentInfo }
     * 
     */
    public PaymentInfo createPaymentInfo() {
        return new PaymentInfo();
    }

    /**
     * Create an instance of {@link ViewCreditTransferRequest }
     * 
     */
    public ViewCreditTransferRequest createViewCreditTransferRequest() {
        return new ViewCreditTransferRequest();
    }

    /**
     * Create an instance of {@link PaymentInfoResponse }
     * 
     */
    public PaymentInfoResponse createPaymentInfoResponse() {
        return new PaymentInfoResponse();
    }

    /**
     * Create an instance of {@link AccountInfo }
     * 
     */
    public AccountInfo createAccountInfo() {
        return new AccountInfo();
    }

    /**
     * Create an instance of {@link RjctDtls }
     * 
     */
    public RjctDtls createRjctDtls() {
        return new RjctDtls();
    }

    /**
     * Create an instance of {@link EditAccountInfo }
     * 
     */
    public EditAccountInfo createEditAccountInfo() {
        return new EditAccountInfo();
    }

    /**
     * Create an instance of {@link DomAccountInfo }
     * 
     */
    public DomAccountInfo createDomAccountInfo() {
        return new DomAccountInfo();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditTransferRecallResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:sentenial:origix:ws:credittransfer-ws", name = "CreditTransferRecallResponse")
    public JAXBElement<CreditTransferRecallResponse> createCreditTransferRecallResponse(CreditTransferRecallResponse value) {
        return new JAXBElement<CreditTransferRecallResponse>(_CreditTransferRecallResponse_QNAME, CreditTransferRecallResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BeneficiaryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:sentenial:origix:ws:credittransfer-ws", name = "BeneficiaryResponse")
    public JAXBElement<BeneficiaryResponse> createBeneficiaryResponse(BeneficiaryResponse value) {
        return new JAXBElement<BeneficiaryResponse>(_BeneficiaryResponse_QNAME, BeneficiaryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditTransferListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:sentenial:origix:ws:credittransfer-ws", name = "CreditTransferListResponse")
    public JAXBElement<CreditTransferListResponse> createCreditTransferListResponse(CreditTransferListResponse value) {
        return new JAXBElement<CreditTransferListResponse>(_CreditTransferListResponse_QNAME, CreditTransferListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditTransferListRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:sentenial:origix:ws:credittransfer-ws", name = "CreditTransferListRequest")
    public JAXBElement<CreditTransferListRequest> createCreditTransferListRequest(CreditTransferListRequest value) {
        return new JAXBElement<CreditTransferListRequest>(_CreditTransferListRequest_QNAME, CreditTransferListRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditTransferRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:sentenial:origix:ws:credittransfer-ws", name = "CreditTransferRequest")
    public JAXBElement<CreditTransferRequest> createCreditTransferRequest(CreditTransferRequest value) {
        return new JAXBElement<CreditTransferRequest>(_CreditTransferRequest_QNAME, CreditTransferRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BeneficiaryViewRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:sentenial:origix:ws:credittransfer-ws", name = "BeneficiaryViewRequest")
    public JAXBElement<BeneficiaryViewRequest> createBeneficiaryViewRequest(BeneficiaryViewRequest value) {
        return new JAXBElement<BeneficiaryViewRequest>(_BeneficiaryViewRequest_QNAME, BeneficiaryViewRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditTransferRecallRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:sentenial:origix:ws:credittransfer-ws", name = "CreditTransferRecallRequest")
    public JAXBElement<CreditTransferRecallRequest> createCreditTransferRecallRequest(CreditTransferRecallRequest value) {
        return new JAXBElement<CreditTransferRecallRequest>(_CreditTransferRecallRequest_QNAME, CreditTransferRecallRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BeneficiaryEditRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:sentenial:origix:ws:credittransfer-ws", name = "BeneficiaryEditRequest")
    public JAXBElement<BeneficiaryEditRequest> createBeneficiaryEditRequest(BeneficiaryEditRequest value) {
        return new JAXBElement<BeneficiaryEditRequest>(_BeneficiaryEditRequest_QNAME, BeneficiaryEditRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditTransferViewResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:sentenial:origix:ws:credittransfer-ws", name = "CreditTransferViewResponse")
    public JAXBElement<CreditTransferViewResponse> createCreditTransferViewResponse(CreditTransferViewResponse value) {
        return new JAXBElement<CreditTransferViewResponse>(_CreditTransferViewResponse_QNAME, CreditTransferViewResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FailedCreditTransferRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:sentenial:origix:ws:credittransfer-ws", name = "FailedCreditTransferRequest")
    public JAXBElement<FailedCreditTransferRequest> createFailedCreditTransferRequest(FailedCreditTransferRequest value) {
        return new JAXBElement<FailedCreditTransferRequest>(_FailedCreditTransferRequest_QNAME, FailedCreditTransferRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FailedCreditTransferResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:sentenial:origix:ws:credittransfer-ws", name = "FailedCreditTransferResponse")
    public JAXBElement<FailedCreditTransferResponse> createFailedCreditTransferResponse(FailedCreditTransferResponse value) {
        return new JAXBElement<FailedCreditTransferResponse>(_FailedCreditTransferResponse_QNAME, FailedCreditTransferResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BeneficiaryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:sentenial:origix:ws:credittransfer-ws", name = "BeneficiaryRequest")
    public JAXBElement<BeneficiaryRequest> createBeneficiaryRequest(BeneficiaryRequest value) {
        return new JAXBElement<BeneficiaryRequest>(_BeneficiaryRequest_QNAME, BeneficiaryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditTransferResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:sentenial:origix:ws:credittransfer-ws", name = "CreditTransferResponse")
    public JAXBElement<CreditTransferResponse> createCreditTransferResponse(CreditTransferResponse value) {
        return new JAXBElement<CreditTransferResponse>(_CreditTransferResponse_QNAME, CreditTransferResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditTransferViewRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:sentenial:origix:ws:credittransfer-ws", name = "CreditTransferViewRequest")
    public JAXBElement<CreditTransferViewRequest> createCreditTransferViewRequest(CreditTransferViewRequest value) {
        return new JAXBElement<CreditTransferViewRequest>(_CreditTransferViewRequest_QNAME, CreditTransferViewRequest.class, null, value);
    }

}
