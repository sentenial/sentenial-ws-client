package com.sentenial.ws.service.paymentschedule;

import com.sentenial.ws.client.paymentschedule.AddPaymentScheduleRequest;
import com.sentenial.ws.client.paymentschedule.AddPaymentScheduleResponse;
import com.sentenial.ws.client.paymentschedule.EditPaymentScheduleRequest;
import com.sentenial.ws.client.paymentschedule.EditPaymentScheduleResponse;

/**
 *
 */
public interface PaymentScheduleService {

    AddPaymentScheduleResponse addPaymentSchedule(AddPaymentScheduleRequest addPaymentScheduleRequest);

    EditPaymentScheduleResponse editPaymentSchedule(EditPaymentScheduleRequest editPaymentScheduleRequest);

}
