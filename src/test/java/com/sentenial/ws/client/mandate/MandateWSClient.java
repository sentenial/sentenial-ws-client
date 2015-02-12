package com.sentenial.ws.client.mandate;

import com.sentenial.ws.client.AuthHandler;
import com.sun.xml.ws.transport.http.client.HttpTransportPipe;
import org.junit.Before;
import org.junit.Test;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Copyright of Sentenial
 * User: christian.reichel
 */
public class MandateWSClient {

    private static final String WS_URL = "http://localhost:8080/origix-webservice/ws/services";

    @Before
    public void setUp(){
        System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
        System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
    }

    @Test
    public void addMandate() throws Exception{
        HttpTransportPipe.dump = true;

        final MandateWsService mandateWsService = new MandateWsService();
        mandateWsService.setHandlerResolver(new HandlerResolver() {
            @Override
            public List<Handler> getHandlerChain(PortInfo portInfo) {
                final List<Handler> handlerList = new ArrayList<Handler>();
                handlerList.add(new AuthHandler("sampleuser", "123SecretPass"));
                return handlerList;
            }
        });

        //final MandateWs mandateWs = mandateWsService.getPort(MandateWs.class);
        final MandateWs mandateWs = mandateWsService.getMandateWsSoap11();
        final BindingProvider bindingProvider = (BindingProvider) mandateWs;
        final Map<String, Object> req_ctx = bindingProvider.getRequestContext();
        req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, WS_URL);
        bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, WS_URL);

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

        final AddMandateResponse response = mandateWs.addMandate(request);
    }

}

