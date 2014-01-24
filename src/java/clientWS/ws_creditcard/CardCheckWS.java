
package ws_creditcard;

import java.util.List;
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
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CardCheckWS", targetNamespace = "http://WS_CreditCard/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CardCheckWS {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "VerifyCard")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "VerifyCard", targetNamespace = "http://WS_CreditCard/", className = "ws_creditcard.VerifyCard")
    @ResponseWrapper(localName = "VerifyCardResponse", targetNamespace = "http://WS_CreditCard/", className = "ws_creditcard.VerifyCardResponse")
    @Action(input = "http://WS_CreditCard/CardCheckWS/VerifyCardRequest", output = "http://WS_CreditCard/CardCheckWS/VerifyCardResponse")
    public String verifyCard(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ismod10", targetNamespace = "http://WS_CreditCard/", className = "ws_creditcard.Ismod10")
    @ResponseWrapper(localName = "ismod10Response", targetNamespace = "http://WS_CreditCard/", className = "ws_creditcard.Ismod10Response")
    @Action(input = "http://WS_CreditCard/CardCheckWS/ismod10Request", output = "http://WS_CreditCard/CardCheckWS/ismod10Response")
    public boolean ismod10(
        @WebParam(name = "arg0", targetNamespace = "")
        List<Integer> arg0);

}
