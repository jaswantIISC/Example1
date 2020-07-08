//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.17 at 02:51:19 PM IST 
//


package cdot.ccsp.utils;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import cdot.onem2m.resource.xsd.ChildResourceRef;
import cdot.onem2m.resource.xsd.FlexContainerResource;
import cdot.onem2m.resource.xsd.Subscription;


/**
 * <p>Java class for bodyCompositionAnalyser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bodyCompositionAnalyser">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}flexContainerResource">
 *       &lt;sequence>
 *         &lt;element name="bodyLength" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="bmi" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="fatFreeMass" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="softLeanMass" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="muscleMass" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="basalMetabolism" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="impedance" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="childResource" type="{http://www.onem2m.org/xml/protocols}childResourceRef" maxOccurs="unbounded"/>
 *           &lt;choice maxOccurs="unbounded">
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
@XmlType(name = "bodyCompositionAnalyser", propOrder = {
    "bodyLength",
    "bmi",
    "fatFreeMass",
    "softLeanMass",
    "muscleMass",
    "basalMetabolism",
    "impedance",
    "childResource",
    "subscription"
})
public class BodyCompositionAnalyser
    extends FlexContainerResource
{

    protected Float bodyLength;
    protected Float bmi;
    protected Float fatFreeMass;
    protected Float softLeanMass;
    protected Float muscleMass;
    protected Float basalMetabolism;
    protected Float impedance;
    protected List<ChildResourceRef> childResource;
    @XmlElement(namespace = "http://www.onem2m.org/xml/protocols")
    protected List<Subscription> subscription;

    /**
     * Gets the value of the bodyLength property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBodyLength() {
        return bodyLength;
    }

    /**
     * Sets the value of the bodyLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBodyLength(Float value) {
        this.bodyLength = value;
    }

    /**
     * Gets the value of the bmi property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBmi() {
        return bmi;
    }

    /**
     * Sets the value of the bmi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBmi(Float value) {
        this.bmi = value;
    }

    /**
     * Gets the value of the fatFreeMass property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFatFreeMass() {
        return fatFreeMass;
    }

    /**
     * Sets the value of the fatFreeMass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFatFreeMass(Float value) {
        this.fatFreeMass = value;
    }

    /**
     * Gets the value of the softLeanMass property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSoftLeanMass() {
        return softLeanMass;
    }

    /**
     * Sets the value of the softLeanMass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSoftLeanMass(Float value) {
        this.softLeanMass = value;
    }

    /**
     * Gets the value of the muscleMass property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMuscleMass() {
        return muscleMass;
    }

    /**
     * Sets the value of the muscleMass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMuscleMass(Float value) {
        this.muscleMass = value;
    }

    /**
     * Gets the value of the basalMetabolism property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBasalMetabolism() {
        return basalMetabolism;
    }

    /**
     * Sets the value of the basalMetabolism property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBasalMetabolism(Float value) {
        this.basalMetabolism = value;
    }

    /**
     * Gets the value of the impedance property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getImpedance() {
        return impedance;
    }

    /**
     * Sets the value of the impedance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setImpedance(Float value) {
        this.impedance = value;
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
     * Gets the value of the subscription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Subscription }
     * 
     * 
     */
    public List<Subscription> getSubscription() {
        if (subscription == null) {
            subscription = new ArrayList<Subscription>();
        }
        return this.subscription;
    }

}