
package soapauthclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soapauthclient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _HelloResponse_QNAME = new QName("http://eceitem.me.org/", "helloResponse");
    private final static QName _GetExamineInfoResponse_QNAME = new QName("http://eceitem.me.org/", "getExamineInfoResponse");
    private final static QName _GetOrder_QNAME = new QName("http://eceitem.me.org/", "getOrder");
    private final static QName _GetOrderResponse_QNAME = new QName("http://eceitem.me.org/", "getOrderResponse");
    private final static QName _GetTakeInfo_QNAME = new QName("http://eceitem.me.org/", "getTakeInfo");
    private final static QName _GetTakeInfoResponse_QNAME = new QName("http://eceitem.me.org/", "getTakeInfoResponse");
    private final static QName _GetLastOrderResponse_QNAME = new QName("http://eceitem.me.org/", "getLastOrderResponse");
    private final static QName _Hello_QNAME = new QName("http://eceitem.me.org/", "hello");
    private final static QName _GetExamineInfo_QNAME = new QName("http://eceitem.me.org/", "getExamineInfo");
    private final static QName _GetLastOrder_QNAME = new QName("http://eceitem.me.org/", "getLastOrder");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soapauthclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link GetExamineInfoResponse }
     * 
     */
    public GetExamineInfoResponse createGetExamineInfoResponse() {
        return new GetExamineInfoResponse();
    }

    /**
     * Create an instance of {@link GetOrder }
     * 
     */
    public GetOrder createGetOrder() {
        return new GetOrder();
    }

    /**
     * Create an instance of {@link GetExamineInfo }
     * 
     */
    public GetExamineInfo createGetExamineInfo() {
        return new GetExamineInfo();
    }

    /**
     * Create an instance of {@link GetLastOrder }
     * 
     */
    public GetLastOrder createGetLastOrder() {
        return new GetLastOrder();
    }

    /**
     * Create an instance of {@link GetTakeInfoResponse }
     * 
     */
    public GetTakeInfoResponse createGetTakeInfoResponse() {
        return new GetTakeInfoResponse();
    }

    /**
     * Create an instance of {@link GetLastOrderResponse }
     * 
     */
    public GetLastOrderResponse createGetLastOrderResponse() {
        return new GetLastOrderResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link GetOrderResponse }
     * 
     */
    public GetOrderResponse createGetOrderResponse() {
        return new GetOrderResponse();
    }

    /**
     * Create an instance of {@link GetTakeInfo }
     * 
     */
    public GetTakeInfo createGetTakeInfo() {
        return new GetTakeInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eceitem.me.org/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExamineInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eceitem.me.org/", name = "getExamineInfoResponse")
    public JAXBElement<GetExamineInfoResponse> createGetExamineInfoResponse(GetExamineInfoResponse value) {
        return new JAXBElement<GetExamineInfoResponse>(_GetExamineInfoResponse_QNAME, GetExamineInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eceitem.me.org/", name = "getOrder")
    public JAXBElement<GetOrder> createGetOrder(GetOrder value) {
        return new JAXBElement<GetOrder>(_GetOrder_QNAME, GetOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eceitem.me.org/", name = "getOrderResponse")
    public JAXBElement<GetOrderResponse> createGetOrderResponse(GetOrderResponse value) {
        return new JAXBElement<GetOrderResponse>(_GetOrderResponse_QNAME, GetOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTakeInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eceitem.me.org/", name = "getTakeInfo")
    public JAXBElement<GetTakeInfo> createGetTakeInfo(GetTakeInfo value) {
        return new JAXBElement<GetTakeInfo>(_GetTakeInfo_QNAME, GetTakeInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTakeInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eceitem.me.org/", name = "getTakeInfoResponse")
    public JAXBElement<GetTakeInfoResponse> createGetTakeInfoResponse(GetTakeInfoResponse value) {
        return new JAXBElement<GetTakeInfoResponse>(_GetTakeInfoResponse_QNAME, GetTakeInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLastOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eceitem.me.org/", name = "getLastOrderResponse")
    public JAXBElement<GetLastOrderResponse> createGetLastOrderResponse(GetLastOrderResponse value) {
        return new JAXBElement<GetLastOrderResponse>(_GetLastOrderResponse_QNAME, GetLastOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eceitem.me.org/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExamineInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eceitem.me.org/", name = "getExamineInfo")
    public JAXBElement<GetExamineInfo> createGetExamineInfo(GetExamineInfo value) {
        return new JAXBElement<GetExamineInfo>(_GetExamineInfo_QNAME, GetExamineInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLastOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eceitem.me.org/", name = "getLastOrder")
    public JAXBElement<GetLastOrder> createGetLastOrder(GetLastOrder value) {
        return new JAXBElement<GetLastOrder>(_GetLastOrder_QNAME, GetLastOrder.class, null, value);
    }

}
