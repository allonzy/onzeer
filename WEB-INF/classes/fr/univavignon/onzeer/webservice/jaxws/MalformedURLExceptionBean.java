
package fr.univavignon.onzeer.webservice.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2.9
 * 
 */
@XmlRootElement(name = "MalformedURLException", namespace = "http://webservice.onzeer.univavignon.fr/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MalformedURLException", namespace = "http://webservice.onzeer.univavignon.fr/")
public class MalformedURLExceptionBean {

    private String message;

    /**
     * 
     * @return
     *     returns String
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * 
     * @param message
     *     the value for the message property
     */
    public void setMessage(String message) {
        this.message = message;
    }

}
