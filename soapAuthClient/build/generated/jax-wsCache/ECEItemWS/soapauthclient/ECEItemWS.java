
package soapauthclient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ECEItemWS", targetNamespace = "http://eceitem.me.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ECEItemWS {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://eceitem.me.org/", className = "soapauthclient.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://eceitem.me.org/", className = "soapauthclient.HelloResponse")
    @Action(input = "http://eceitem.me.org/ECEItemWS/helloRequest", output = "http://eceitem.me.org/ECEItemWS/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getLastOrder", targetNamespace = "http://eceitem.me.org/", className = "soapauthclient.GetLastOrder")
    @ResponseWrapper(localName = "getLastOrderResponse", targetNamespace = "http://eceitem.me.org/", className = "soapauthclient.GetLastOrderResponse")
    @Action(input = "http://eceitem.me.org/ECEItemWS/getLastOrderRequest", output = "http://eceitem.me.org/ECEItemWS/getLastOrderResponse")
    public String getLastOrder();

    /**
     * 
     * @param orderNumber
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getExamineInfo", targetNamespace = "http://eceitem.me.org/", className = "soapauthclient.GetExamineInfo")
    @ResponseWrapper(localName = "getExamineInfoResponse", targetNamespace = "http://eceitem.me.org/", className = "soapauthclient.GetExamineInfoResponse")
    @Action(input = "http://eceitem.me.org/ECEItemWS/getExamineInfoRequest", output = "http://eceitem.me.org/ECEItemWS/getExamineInfoResponse")
    public String getExamineInfo(
        @WebParam(name = "orderNumber", targetNamespace = "")
        int orderNumber);

    /**
     * 
     * @param orderNumber
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTakeInfo", targetNamespace = "http://eceitem.me.org/", className = "soapauthclient.GetTakeInfo")
    @ResponseWrapper(localName = "getTakeInfoResponse", targetNamespace = "http://eceitem.me.org/", className = "soapauthclient.GetTakeInfoResponse")
    @Action(input = "http://eceitem.me.org/ECEItemWS/getTakeInfoRequest", output = "http://eceitem.me.org/ECEItemWS/getTakeInfoResponse")
    public String getTakeInfo(
        @WebParam(name = "orderNumber", targetNamespace = "")
        int orderNumber);

    /**
     * 
     * @param orderNumber
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getOrder", targetNamespace = "http://eceitem.me.org/", className = "soapauthclient.GetOrder")
    @ResponseWrapper(localName = "getOrderResponse", targetNamespace = "http://eceitem.me.org/", className = "soapauthclient.GetOrderResponse")
    @Action(input = "http://eceitem.me.org/ECEItemWS/getOrderRequest", output = "http://eceitem.me.org/ECEItemWS/getOrderResponse")
    public String getOrder(
        @WebParam(name = "orderNumber", targetNamespace = "")
        int orderNumber);

}