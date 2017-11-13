/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soapauthclient;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

/**
 *
 * @author soulq
 */
public class SoapAuthClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(getExamineInfo(5));
    }

    private static String hello(java.lang.String name) {
        soapauthclient.ECEItemWS_Service service = new soapauthclient.ECEItemWS_Service();
        soapauthclient.ECEItemWS port = service.getECEItemWSPort();
        
        Map<String,Object> reqMap = ((BindingProvider) port).getRequestContext();
        reqMap.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://www.yenaura.com/ECEItemWS?wsdl");
        Map<String,List<String>> header =new HashMap<>();
        header.put("Username", Collections.singletonList("happysoap"));
        header.put("Password", Collections.singletonList("1234"));
        reqMap.put(MessageContext.HTTP_REQUEST_HEADERS, header);
        
        return port.hello(name);
    }

    private static String getLastOrder() {
        soapauthclient.ECEItemWS_Service service = new soapauthclient.ECEItemWS_Service();
        soapauthclient.ECEItemWS port = service.getECEItemWSPort();
        
        Map<String,Object> reqMap = ((BindingProvider) port).getRequestContext();
        reqMap.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://www.yenaura.com/ECEItemWS?wsdl");
        Map<String,List<String>> header =new HashMap<>();
        header.put("Username", Collections.singletonList("happysoap"));
        header.put("Password", Collections.singletonList("1234"));
        reqMap.put(MessageContext.HTTP_REQUEST_HEADERS, header);
        
        return port.getLastOrder();
    }

    private static String getExamineInfo(int orderNumber) {
        soapauthclient.ECEItemWS_Service service = new soapauthclient.ECEItemWS_Service();
        soapauthclient.ECEItemWS port = service.getECEItemWSPort();
        
        Map<String,Object> reqMap = ((BindingProvider) port).getRequestContext();
        reqMap.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://www.yenaura.com/ECEItemWS?wsdl");
        Map<String,List<String>> header =new HashMap<>();
        header.put("Username", Collections.singletonList("happysoap"));
        header.put("Password", Collections.singletonList("1234"));
        reqMap.put(MessageContext.HTTP_REQUEST_HEADERS, header);        
        
        return port.getExamineInfo(orderNumber);
    }

    private static String getOrder(int orderNumber) {
        soapauthclient.ECEItemWS_Service service = new soapauthclient.ECEItemWS_Service();
        soapauthclient.ECEItemWS port = service.getECEItemWSPort();
        
        Map<String,Object> reqMap = ((BindingProvider) port).getRequestContext();
        reqMap.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://www.yenaura.com/ECEItemWS?wsdl");
        Map<String,List<String>> header =new HashMap<>();
        header.put("Username", Collections.singletonList("happysoap"));
        header.put("Password", Collections.singletonList("1234"));
        reqMap.put(MessageContext.HTTP_REQUEST_HEADERS, header);        
        
        return port.getOrder(orderNumber);
    }

    private static String getTakeInfo(int orderNumber) {
        soapauthclient.ECEItemWS_Service service = new soapauthclient.ECEItemWS_Service();
        soapauthclient.ECEItemWS port = service.getECEItemWSPort();
        
        Map<String,Object> reqMap = ((BindingProvider) port).getRequestContext();
        reqMap.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://www.yenaura.com/ECEItemWS?wsdl");
        Map<String,List<String>> header =new HashMap<>();
        header.put("Username", Collections.singletonList("happysoap"));
        header.put("Password", Collections.singletonList("1234"));
        reqMap.put(MessageContext.HTTP_REQUEST_HEADERS, header);        
        
        return port.getTakeInfo(orderNumber);
    }

   
    
    
}
