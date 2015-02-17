package com.sentenial.ws.service.paymentschedule;

import com.sentenial.ws.client.paymentschedule.*;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import org.junit.Test;

import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.util.Calendar;

public class PaymentScheduleServiceDefaultTest {

    @Test
    public void testAddPaymentSchedule() throws Exception {
        //Given
        final PaymentScheduleService paymentScheduleService = new PaymentScheduleServiceDefault();
        //When
        final XMLGregorianCalendar xmlDate = new XMLGregorianCalendarImpl();
        xmlDate.setYear(2015);
        xmlDate.setMonth(Calendar.DECEMBER);
        xmlDate.setDay(28);
        final AddPaymentScheduleRequest request = new AddPaymentScheduleRequest();
        request.setCreditor(new Creditor());
        request.getCreditor().setCreditorScheme(new CreditorScheme());
        request.getCreditor().getCreditorScheme().setCreditorSchemeId("BE31XXX12345");
        request.getCreditor().getCreditorScheme().setScheme(SchemeType.CORE);
        request.setMandateInfo(new MandateInfo());
        request.getMandateInfo().setMandateId("mandateId1");
        request.getMandateInfo().setDomesticMandateId("123456789012");
        request.setPaymentScheduleInfo(new PaymentScheduleInfo());
        request.getPaymentScheduleInfo().setScheduleId("123");
        request.getPaymentScheduleInfo().setFrequency(PaymentFrequency.DAILY);
        request.getPaymentScheduleInfo().setPmtType(PaymentType.FIXED_LENGTH);
        request.getPaymentScheduleInfo().setStartDate(xmlDate);
        request.getPaymentScheduleInfo().setNoOfPayments("5");
        request.getPaymentScheduleInfo().setPmtAmt(new BigDecimal("102.12"));
        request.getPaymentScheduleInfo().setRemittanceInfo("Remittance Info");
        //Then
        final AddPaymentScheduleResponse response = paymentScheduleService.addPaymentSchedule(request);
    }
}
