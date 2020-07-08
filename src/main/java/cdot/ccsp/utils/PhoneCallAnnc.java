//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.17 at 02:51:19 PM IST 
//


package cdot.ccsp.utils;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;

import cdot.onem2m.resource.xsd.AnnouncedFlexContainerResource;
import cdot.onem2m.resource.xsd.ChildResourceRef;
import cdot.onem2m.resource.xsd.Subscription;


/**
 * <p>Java class for phoneCallAnnc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="phoneCallAnnc">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}announcedFlexContainerResource">
 *       &lt;sequence>
 *         &lt;element name="callerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callState" type="{http://www.onem2m.org/xml/protocols/homedomain}enumCallState" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="childResource" type="{http://www.onem2m.org/xml/protocols}childResourceRef" maxOccurs="unbounded"/>
 *           &lt;choice maxOccurs="unbounded">
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}call"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}answer"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}hangup"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}subscription"/>
 *           &lt;/choice>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "phoneCallAnnc", propOrder = {
    "callerID",
    "recipientID",
    "callState",
    "childResource",
    "callOrAnswerOrHangup"
})
public class PhoneCallAnnc
    extends AnnouncedFlexContainerResource
{

    protected String callerID;
    protected String recipientID;
    protected BigInteger callState;
    protected List<ChildResourceRef> childResource;
    @XmlElements({
        @XmlElement(name = "call", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = Call.class),
        @XmlElement(name = "answer", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = Answer.class),
        @XmlElement(name = "hangup", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = Hangup.class),
        @XmlElement(name = "subscription", namespace = "http://www.onem2m.org/xml/protocols", type = Subscription.class)
    })
    protected List<Object> callOrAnswerOrHangup;

    /**
     * Gets the value of the callerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallerID() {
        return callerID;
    }

    /**
     * Sets the value of the callerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallerID(String value) {
        this.callerID = value;
    }

    /**
     * Gets the value of the recipientID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientID() {
        return recipientID;
    }

    /**
     * Sets the value of the recipientID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientID(String value) {
        this.recipientID = value;
    }

    /**
     * Gets the value of the callState property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCallState() {
        return callState;
    }

    /**
     * Sets the value of the callState property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCallState(BigInteger value) {
        this.callState = value;
    }

    /**
     * Gets the value of the childResource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childResource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildResource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChildResourceRef }
     * 
     * 
     */
    public List<ChildResourceRef> getChildResource() {
        if (childResource == null) {
            childResource = new ArrayList<ChildResourceRef>();
        }
        return this.childResource;
    }

    /**
     * Gets the value of the callOrAnswerOrHangup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callOrAnswerOrHangup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallOrAnswerOrHangup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Call }
     * {@link Answer }
     * {@link Hangup }
     * {@link Subscription }
     * 
     * 
     */
    public List<Object> getCallOrAnswerOrHangup() {
        if (callOrAnswerOrHangup == null) {
            callOrAnswerOrHangup = new ArrayList<Object>();
        }
        return this.callOrAnswerOrHangup;
    }

}
