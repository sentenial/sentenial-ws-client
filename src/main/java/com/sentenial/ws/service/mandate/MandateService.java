package com.sentenial.ws.service.mandate;

import com.sentenial.ws.client.mandate.*;

/**
 *
 */
public interface MandateService {

    /**
     *
     * @param addMandateRequest
     * @return
     */
    AddMandateResponse addMandate(AddMandateRequest addMandateRequest);

    /**
     *
     * @param editMandateRequest
     * @return
     */
    EditMandateResponse editMandate(EditMandateRequest editMandateRequest);

    /**
     *
     * @param viewMandateRequest
     * @return
     */
    ViewMandateResponse viewMandate(ViewMandateRequest viewMandateRequest);

    /**
     *
     * @param cancelMandateRequest
     * @return
     */
    CancelMandateResponse cancelMandate(CancelMandateRequest cancelMandateRequest);

    /**
     *
     * @param suspendMandateRequest
     * @return
     */
    SuspendMandateResponse suspendMandate(SuspendMandateRequest suspendMandateRequest);

    /**
     *
     * @param reactivateSuspendedMandateRequest
     * @return
     */
    ReactivateSuspendedMandateResponse reactivateSuspendedMandate(ReactivateSuspendedMandateRequest reactivateSuspendedMandateRequest);

    /**
     *
     * @param activateMandateRequest
     * @return
     */
    ActivateMandateResponse activateMandate(ActivateMandateRequest activateMandateRequest);
}
