package com.sentenial.ws.service.paymentschedule;

import com.sentenial.ws.client.paymentschedule.*;
import com.sentenial.ws.service.WsHelper;

/**
 * Copyright of Sentenial
 * User: christian.reichel
 */
public class PaymentScheduleServiceDefault implements PaymentScheduleService {

    private PaymentScheduleWs paymentScheduleWs;

    public PaymentScheduleServiceDefault() {
        paymentScheduleWs = (new WsHelper<PaymentScheduleWsService>()).buildWsClient(new PaymentScheduleWsService(), PaymentScheduleWs.class);
    }

    @Override
    public AddPaymentScheduleResponse addPaymentSchedule(AddPaymentScheduleRequest addPaymentScheduleRequest) {
        return paymentScheduleWs.addPaymentSchedule(addPaymentScheduleRequest);
    }

    @Override
    public EditPaymentScheduleResponse editPaymentSchedule(EditPaymentScheduleRequest editPaymentScheduleRequest) {
        return paymentScheduleWs.editPaymentSchedule(editPaymentScheduleRequest);
    }
}
