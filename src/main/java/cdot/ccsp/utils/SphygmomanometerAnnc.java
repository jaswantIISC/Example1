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

import cdot.onem2m.resource.xsd.AnnouncedFlexContainerResource;
import cdot.onem2m.resource.xsd.ChildResourceRef;
import cdot.onem2m.resource.xsd.Subscription;


/**
 * <p>Java class for sphygmomanometerAnnc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sphygmomanometerAnnc">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}announcedFlexContainerResource">
 *       &lt;sequence>
 *         &lt;element name="diastolicPressure" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="systolicPressure" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="meanPressure" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
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
@XmlType(name = "sphygmomanometerAnnc", propOrder = {
    "diastolicPressure",
    "systolicPressure",
    "meanPressure",
    "childResource",
    "subscription"
})
public class SphygmomanometerAnnc
    extends AnnouncedFlexContainerResource
{

    protected Float diastolicPressure;
    protected Float systolicPressure;
    protected Float meanPressure;
    protected List<ChildResourceRef> childResource;
    @XmlElement(namespace = "http://www.onem2m.org/xml/protocols")
    protected List<Subscription> subscription;

    /**
     * Gets the value of the diastolicPressure property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDiastolicPressure() {
        return diastolicPressure;
    }

    /**
     * Sets the value of the diastolicPressure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDiastolicPressure(Float value) {
        this.diastolicPressure = value;
    }

    /**
     * Gets the value of the systolicPressure property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSystolicPressure() {
        return systolicPressure;
    }

    /**
     * Sets the value of the systolicPressure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSystolicPressure(Float value) {
        this.systolicPressure = value;
    }

    /**
     * Gets the value of the meanPressure property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMeanPressure() {
        return meanPressure;
    }

    /**
     * Sets the value of the meanPressure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMeanPressure(Float value) {
        this.meanPressure = value;
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
