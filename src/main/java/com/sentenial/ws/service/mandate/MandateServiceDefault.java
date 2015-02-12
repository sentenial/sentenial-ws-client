package com.sentenial.ws.service.mandate;

import com.sentenial.ws.client.mandate.*;
import com.sentenial.ws.service.WsHelper;

/**
 * Default implementation of the real service.
 * Copyright of Sentenial
 * User: christian.reichel
 */
public class MandateServiceDefault implements MandateService{

    private final MandateWs mandateWs;

    public MandateServiceDefault() {
        mandateWs = (new WsHelper<MandateWsService>()).buildWsClient(new MandateWsService(), MandateWs.class);
    }

    @Override
    public AddMandateResponse addMandate(AddMandateRequest addMandateRequest) {
        return mandateWs.addMandate(addMandateRequest);
    }

    @Override
    public EditMandateResponse editMandate(EditMandateRequest editMandateRequest) {
        return mandateWs.editMandate(editMandateRequest);
    }

    @Override
    public ViewMandateResponse viewMandate(ViewMandateRequest viewMandateRequest) {
        return mandateWs.viewMandate(viewMandateRequest);
    }

    @Override
    public CancelMandateResponse cancelMandate(CancelMandateRequest cancelMandateRequest) {
        return mandateWs.cancelMandate(cancelMandateRequest);
    }

    @Override
    public SuspendMandateResponse suspendMandate(SuspendMandateRequest suspendMandateRequest) {
        return mandateWs.suspendMandate(suspendMandateRequest);
    }

    @Override
    public ReactivateSuspendedMandateResponse reactivateSuspendedMandate(ReactivateSuspendedMandateRequest reactivateSuspendedMandateRequest) {
        return mandateWs.reactivateSuspendedMandate(reactivateSuspendedMandateRequest);
    }

    @Override
    public ActivateMandateResponse activateMandate(ActivateMandateRequest activateMandateRequest) {
        return mandateWs.activateMandate(activateMandateRequest);
    }
}
