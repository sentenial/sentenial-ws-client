package com.sentenial.ws.service.dd;

import com.sentenial.ws.client.dd.*;
import com.sentenial.ws.service.WsHelper;

/**
 * Copyright of Sentenial
 * User: christian.reichel
 */
public class DDServiceDefault implements DDService{

    private final DirectdebitWs directdebitWs;

    public DDServiceDefault() {
        this.directdebitWs = (new WsHelper<DirectdebitWsService>()).buildWsClient(new DirectdebitWsService(), DirectdebitWs.class);
    }

    @Override
    public ViewDirectDebitResponse viewDirectDebit(ViewDirectDebitRequest viewDirectDebitRequest) {
        return directdebitWs.viewDirectDebit(viewDirectDebitRequest);
    }

    @Override
    public RevokeDirectDebitResponse revokeDirectdebit(RevokeDirectDebitRequest revokeDirectDebitRequest) {
        return directdebitWs.revokeDirectdebit(revokeDirectDebitRequest);
    }

    @Override
    public CancelDirectDebitResponse cancelDirectdebit(CancelDirectDebitRequest cancelDirectDebitRequest) {
        return directdebitWs.cancelDirectdebit(cancelDirectDebitRequest);
    }

    @Override
    public ListDirectDebitResponse listDirectdebit(ListDirectDebitRequest listDirectDebitRequest) {
        return directdebitWs.listDirectdebit(listDirectDebitRequest);
    }

    @Override
    public ActivateRevokedDirectDebitResponse activateRevokedDirectDebit(ActivateRevokedDirectDebitRequest activateRevokedDirectDebitRequest) {
        return directdebitWs.activateRevokedDirectDebit(activateRevokedDirectDebitRequest);
    }

    @Override
    public RevokeAllDirectDebitsResponse revokeAllDirectDebits(RevokeAllDirectDebitsRequest revokeAllDirectDebitsRequest) {
        return directdebitWs.revokeAllDirectDebits(revokeAllDirectDebitsRequest);
    }

    @Override
    public ListFailingDirectDebitsResponse listFailedPayments(ListFailingDirectDebitsRequest listFailingDirectDebitsRequest) {
        return directdebitWs.listFailedPayments(listFailingDirectDebitsRequest);
    }

    @Override
    public RepresentFailedDirectDebitResponse representFailedDirectDebit(RepresentFailedDirectDebitRequest representFailedDirectDebitRequest) {
        return directdebitWs.representFailedDirectDebit(representFailedDirectDebitRequest);
    }

    @Override
    public AddSinglePaymentResponse addSinglePayment(AddSinglePaymentRequest addSinglePaymentRequest) {
        return directdebitWs.addSinglePayment(addSinglePaymentRequest);
    }

    @Override
    public ReverseDirectDebitResponse reverseDirectdebit(ReverseDirectDebitRequest reverseDirectDebitRequest) {
        return directdebitWs.reverseDirectdebit(reverseDirectDebitRequest);
    }
}
