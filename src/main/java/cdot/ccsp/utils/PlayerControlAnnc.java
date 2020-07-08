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
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;

import cdot.onem2m.resource.xsd.AnnouncedFlexContainerResource;
import cdot.onem2m.resource.xsd.ChildResourceRef;
import cdot.onem2m.resource.xsd.Subscription;


/**
 * <p>Java class for playerControlAnnc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="playerControlAnnc">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}announcedFlexContainerResource">
 *       &lt;sequence>
 *         &lt;element name="currentPlayerMode" type="{http://www.onem2m.org/xml/protocols/homedomain}enumPlayerMode" minOccurs="0"/>
 *         &lt;element name="currentPlayerModeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supportedPlayerModes" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;list itemType="{http://www.onem2m.org/xml/protocols/homedomain}enumPlayerMode" />
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="speedFactor" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="childResource" type="{http://www.onem2m.org/xml/protocols}childResourceRef" maxOccurs="unbounded"/>
 *           &lt;choice maxOccurs="unbounded">
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}nextTrack"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}previousTrack"/>
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
@XmlType(name = "playerControlAnnc", propOrder = {
    "currentPlayerMode",
    "currentPlayerModeName",
    "supportedPlayerModes",
    "speedFactor",
    "childResource",
    "nextTrackOrPreviousTrackOrSubscription"
})
public class PlayerControlAnnc
    extends AnnouncedFlexContainerResource
{

    protected BigInteger currentPlayerMode;
    protected String currentPlayerModeName;
    @XmlList
    protected List<BigInteger> supportedPlayerModes;
    protected Float speedFactor;
    protected List<ChildResourceRef> childResource;
    @XmlElements({
        @XmlElement(name = "nextTrack", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = NextTrack.class),
        @XmlElement(name = "previousTrack", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = PreviousTrack.class),
        @XmlElement(name = "subscription", namespace = "http://www.onem2m.org/xml/protocols", type = Subscription.class)
    })
    protected List<Object> nextTrackOrPreviousTrackOrSubscription;

    /**
     * Gets the value of the currentPlayerMode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCurrentPlayerMode() {
        return currentPlayerMode;
    }

    /**
     * Sets the value of the currentPlayerMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCurrentPlayerMode(BigInteger value) {
        this.currentPlayerMode = value;
    }

    /**
     * Gets the value of the currentPlayerModeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentPlayerModeName() {
        return currentPlayerModeName;
    }

    /**
     * Sets the value of the currentPlayerModeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentPlayerModeName(String value) {
        this.currentPlayerModeName = value;
    }

    /**
     * Gets the value of the supportedPlayerModes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedPlayerModes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedPlayerModes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getSupportedPlayerModes() {
        if (supportedPlayerModes == null) {
            supportedPlayerModes = new ArrayList<BigInteger>();
        }
        return this.supportedPlayerModes;
    }

    /**
     * Gets the value of the speedFactor property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSpeedFactor() {
        return speedFactor;
    }

    /**
     * Sets the value of the speedFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSpeedFactor(Float value) {
        this.speedFactor = value;
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
     * Gets the value of the nextTrackOrPreviousTrackOrSubscription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nextTrackOrPreviousTrackOrSubscription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNextTrackOrPreviousTrackOrSubscription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NextTrack }
     * {@link PreviousTrack }
     * {@link Subscription }
     * 
     * 
     */
    public List<Object> getNextTrackOrPreviousTrackOrSubscription() {
        if (nextTrackOrPreviousTrackOrSubscription == null) {
            nextTrackOrPreviousTrackOrSubscription = new ArrayList<Object>();
        }
        return this.nextTrackOrPreviousTrackOrSubscription;
    }

}