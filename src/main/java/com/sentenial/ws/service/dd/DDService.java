package com.sentenial.ws.service.dd;

import com.sentenial.ws.client.dd.*;

/**
 * Copyright of Sentenial
 * User: christian.reichel
 */
public interface DDService {

    /**
     *
     * @param viewDirectDebitRequest
     * @return
     *     returns com.sentenial.ws.client.dd.ViewDirectDebitResponse
     */
    ViewDirectDebitResponse viewDirectDebit(ViewDirectDebitRequest viewDirectDebitRequest);

    /**
     *
     * @param revokeDirectDebitRequest
     * @return
     *     returns com.sentenial.ws.client.dd.RevokeDirectDebitResponse
     */
    RevokeDirectDebitResponse revokeDirectdebit(RevokeDirectDebitRequest revokeDirectDebitRequest);

    /**
     *
     * @param cancelDirectDebitRequest
     * @return
     *     returns com.sentenial.ws.client.dd.CancelDirectDebitResponse
     */
    CancelDirectDebitResponse cancelDirectdebit(CancelDirectDebitRequest cancelDirectDebitRequest);

    /**
     *
     * @param listDirectDebitRequest
     * @return
     *     returns com.sentenial.ws.client.dd.ListDirectDebitResponse
     */
    ListDirectDebitResponse listDirectdebit(ListDirectDebitRequest listDirectDebitRequest);

    /**
     *
     * @param activateRevokedDirectDebitRequest
     * @return
     *     returns com.sentenial.ws.client.dd.ActivateRevokedDirectDebitResponse
     */
    ActivateRevokedDirectDebitResponse activateRevokedDirectDebit(ActivateRevokedDirectDebitRequest activateRevokedDirectDebitRequest);

    /**
     *
     * @param revokeAllDirectDebitsRequest
     * @return
     *     returns com.sentenial.ws.client.dd.RevokeAllDirectDebitsResponse
     */
    RevokeAllDirectDebitsResponse revokeAllDirectDebits(RevokeAllDirectDebitsRequest revokeAllDirectDebitsRequest);

    /**
     *
     * @param listFailingDirectDebitsRequest
     * @return
     *     returns com.sentenial.ws.client.dd.ListFailingDirectDebitsResponse
     */
    ListFailingDirectDebitsResponse listFailedPayments(ListFailingDirectDebitsRequest listFailingDirectDebitsRequest);

    /**
     *
     * @param representFailedDirectDebitRequest
     * @return
     *     returns com.sentenial.ws.client.dd.RepresentFailedDirectDebitResponse
     */
    RepresentFailedDirectDebitResponse representFailedDirectDebit(RepresentFailedDirectDebitRequest representFailedDirectDebitRequest);

    /**
     *
     * @param addSinglePaymentRequest
     * @return
     *     returns com.sentenial.ws.client.dd.AddSinglePaymentResponse
     */
    AddSinglePaymentResponse addSinglePayment(AddSinglePaymentRequest addSinglePaymentRequest);

    /**
     *
     * @param reverseDirectDebitRequest
     * @return
     *     returns com.sentenial.ws.client.dd.ReverseDirectDebitResponse
     */
    ReverseDirectDebitResponse reverseDirectdebit(ReverseDirectDebitRequest reverseDirectDebitRequest);

}
