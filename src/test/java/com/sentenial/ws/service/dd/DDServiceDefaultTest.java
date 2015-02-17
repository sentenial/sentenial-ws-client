package com.sentenial.ws.service.dd;

import com.sentenial.ws.client.dd.*;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import org.junit.Test;

import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.util.Calendar;

public class DDServiceDefaultTest {

    @Test
    public void testListDirectdebitByCreditor() throws Exception {
        //Given
        final DDService ddService = new DDServiceDefault();
        final ListDirectDebitRequest request = new ListDirectDebitRequest();
        request.setCreditor(new Creditor());
        request.getCreditor().setCreditorScheme(new CreditorScheme());
        request.getCreditor().getCreditorScheme().setCreditorSchemeId("IE26AUA00700001");
        request.getCreditor().getCreditorScheme().setScheme(SchemeType.CORE);
        request.setMandateInfo(new MandateInfo());
        //When
        final ListDirectDebitResponse response = ddService.listDirectdebit(request);
        //Then
    }

    @Test
    public void testListDirectdebitByMandate() throws Exception {
        //Given
        final DDService ddService = new DDServiceDefault();
        final ListDirectDebitRequest request = new ListDirectDebitRequest();
        request.setCreditor(new Creditor());
        request.getCreditor().setCreditorScheme(new CreditorScheme());
        request.getCreditor().getCreditorScheme().setScheme(SchemeType.CORE);
        request.setMandateInfo(new MandateInfo());
        request.getMandateInfo().setMandateId("mandateId1");
        request.getMandateInfo().setDomesticMandateId("123456789012");
        //When
        final ListDirectDebitResponse response = ddService.listDirectdebit(request);
        //Then
    }

    @Test
    public void testAddSinglePayment() throws Exception {
        //Given
        final XMLGregorianCalendar date = new XMLGregorianCalendarImpl();
        date.setYear(2015);
        date.setMonth(Calendar.DECEMBER);
        date.setDay(28);
        final DDService ddService = new DDServiceDefault();
        final AddSinglePaymentRequest request = new AddSinglePaymentRequest();
        request.setCreditor(new Creditor());
        request.getCreditor().setCreditorScheme(new CreditorScheme());
        request.getCreditor().getCreditorScheme().setScheme(SchemeType.CORE);
        request.getCreditor().getCreditorScheme().setCreditorSchemeId("BE31XXX12345");
        request.setMandateInfo(new MandateInfo());
        request.getMandateInfo().setDomesticMandateId("123456789012");
        request.setPmtDate(date);
        request.setPmtAmt(new BigDecimal("102.34"));
        //When
        final AddSinglePaymentResponse response = ddService.addSinglePayment(request);
        //Then
    }

    @Test
    public void testRevokePayment() throws Exception{
        final DDService ddService = new DDServiceDefault();
        final RevokeDirectDebitRequest request = new RevokeDirectDebitRequest();
        request.setCreditor(new Creditor());
        request.getCreditor().setCreditorScheme(new CreditorScheme());
        request.getCreditor().getCreditorScheme().setScheme(SchemeType.CORE);
        request.getCreditor().getCreditorScheme().setCreditorSchemeId("BE31XXX12345");
        request.setMandateInfo(new MandateInfo());
        request.setPmtEndToEndId("thePaymnentIdToBeCancel");
        final RevokeDirectDebitResponse response = ddService.revokeDirectdebit(request);
    }
}

