package com.sentenial.ws.service;

import com.sentenial.ws.client.AuthHandler;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @param <T>
 */
public final class WsHelper<T extends Service> {

    public <I> I buildWsClient(T wsServiceImplementation, Class<I> ifaceImplementationClass){
	return buildWsClient(wsServiceImplementation, ifaceImplementationClass,new ArrayList<Handler>());
    }
    public <I> I buildWsClient(T wsServiceImplementation, Class<I> ifaceImplementationClass, final List<Handler>extraHandlers){

        final WsSettings settings = WsSettingsLoader.loadSettings();

        wsServiceImplementation.setHandlerResolver(new HandlerResolver() {
            @Override
            public List<Handler> getHandlerChain(PortInfo portInfo) {
                final List<Handler> handlerList = new ArrayList<Handler>();
                handlerList.add(new AuthHandler(settings.getUsername(), settings.getPassword()));
		handlerList.addAll(extraHandlers);
                return handlerList;
            }
        });

        final I serviceIface = wsServiceImplementation.getPort(ifaceImplementationClass);
        final BindingProvider bindingProvider = (BindingProvider) serviceIface;

        final Map<String, Object> req_ctx = bindingProvider.getRequestContext();
        req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, settings.getWsUrl());
        bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, settings.getWsUrl());

        return serviceIface;
    }
}
