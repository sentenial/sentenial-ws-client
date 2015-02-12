package com.sentenial.ws.service.mandate;

import com.sentenial.ws.client.mandate.*;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class MandateServiceDefaultTest {

    @Test
    public void testAddMandate() throws Exception {
        //Given
        final MandateServiceDefault mandateServiceDefault = new MandateServiceDefault();

        final AddMandateRequest request = new AddMandateRequest();
        request.setMandate(new RequestMandate());
        request.setRequestInfo(new RequestInfo());
        request.getMandate().setCreditor(new Creditor());
        request.getMandate().getCreditor().setCreditorScheme(new CreditorScheme());
        request.getMandate().getCreditor().getCreditorScheme().setCreditorSchemeId("IE26AUA00700001");
        request.getMandate().getCreditor().getCreditorScheme().setScheme(SchemeType.CORE);
        request.getMandate().setDebtor(new Debtor());
        request.getMandate().getDebtor().setAddress(new SepaAddress());
        request.getMandate().getDebtor().setLanguage(CommunicationLanguage.EN);
        request.getMandate().getDebtor().setName("The Roost");
        request.getMandate().getDebtor().getAddress().setCountry("IE");
        request.getMandate().getDebtor().getAddress().setLine1("2 Main Street");
        request.getMandate().getDebtor().getAddress().setState("Co. Kildare");
        request.getMandate().getDebtor().getAddress().setTown("Maynooth");
        request.getMandate().setMandateInfo(new RequestMandateInfo());
        request.getMandate().getMandateInfo().setMandateId("mandateId1");
        request.getMandate().getMandateInfo().setContractRef("contractref");
        request.getMandate().getMandateInfo().setDomesticMandateId("123456789012");
        request.getMandate().getMandateInfo().setType(MandateType.RCUR);
        request.getMandate().getMandateInfo().setDomesticOriginatorNumber("123123123123");
        request.getMandate().getMandateInfo().setResendMandateForSignature(SignatureResubmitRequiredRule.DEFAULT);
        request.getMandate().getMandateInfo().setMigratingMandate(true);
        request.getMandate().setDebtorAccount(new DebtorAccount());
        request.getMandate().getDebtorAccount().setIban("BE61310126985517");
        request.getMandate().setCreditorAccount(new CreditorAccount());
        request.getMandate().getCreditorAccount().setIban("BE87723540479194");
        request.getMandate().getCreditorAccount().setBic("ABNABEBRXXX");
        request.getMandate().setFormat(DomesticFormat.DF_SCHEME);
        request.getMandate().setOmitPdf(false);
        request.getMandate().setSelfPrintMandate(true);

        //When
        final AddMandateResponse response = mandateServiceDefault.addMandate(request);

        //Then
        assertNotNull(response.getMandate());
    }
}