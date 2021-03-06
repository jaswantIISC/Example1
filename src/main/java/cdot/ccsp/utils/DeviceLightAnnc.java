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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;

import cdot.onem2m.resource.xsd.AnnouncedFlexContainerResource;
import cdot.onem2m.resource.xsd.ChildResourceRef;
import cdot.onem2m.resource.xsd.Subscription;


/**
 * <p>Java class for deviceLightAnnc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deviceLightAnnc">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}announcedFlexContainerResource">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="childResource" type="{http://www.onem2m.org/xml/protocols}childResourceRef" maxOccurs="unbounded"/>
 *           &lt;choice maxOccurs="unbounded">
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}faultDetection"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}faultDetectionAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}binarySwitch"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}binarySwitchAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}runState"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}runStateAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}colour"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}colourAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}colourSaturation"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}colourSaturationAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}brightness"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}brightnessAnnc"/>
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
@XmlType(name = "deviceLightAnnc", propOrder = {
    "childResource",
    "faultDetectionOrFaultDetectionAnncOrBinarySwitch"
})
public class DeviceLightAnnc
    extends AnnouncedFlexContainerResource
{

    protected List<ChildResourceRef> childResource;
    @XmlElements({
        @XmlElement(name = "faultDetection", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = FaultDetection.class),
        @XmlElement(name = "faultDetectionAnnc", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = FaultDetectionAnnc.class),
        @XmlElement(name = "binarySwitch", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = BinarySwitch.class),
        @XmlElement(name = "binarySwitchAnnc", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = BinarySwitchAnnc.class),
        @XmlElement(name = "runState", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = RunState.class),
        @XmlElement(name = "runStateAnnc", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = RunStateAnnc.class),
        @XmlElement(name = "colour", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = Colour.class),
        @XmlElement(name = "colourAnnc", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = ColourAnnc.class),
        @XmlElement(name = "colourSaturation", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = ColourSaturation.class),
        @XmlElement(name = "colourSaturationAnnc", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = ColourSaturationAnnc.class),
        @XmlElement(name = "brightness", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = Brightness.class),
        @XmlElement(name = "brightnessAnnc", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = BrightnessAnnc.class),
        @XmlElement(name = "subscription", namespace = "http://www.onem2m.org/xml/protocols", type = Subscription.class)
    })
    protected List<Object> faultDetectionOrFaultDetectionAnncOrBinarySwitch;

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
     * Gets the value of the faultDetectionOrFaultDetectionAnncOrBinarySwitch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the faultDetectionOrFaultDetectionAnncOrBinarySwitch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFaultDetectionOrFaultDetectionAnncOrBinarySwitch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FaultDetection }
     * {@link FaultDetectionAnnc }
     * {@link BinarySwitch }
     * {@link BinarySwitchAnnc }
     * {@link RunState }
     * {@link RunStateAnnc }
     * {@link Colour }
     * {@link ColourAnnc }
     * {@link ColourSaturation }
     * {@link ColourSaturationAnnc }
     * {@link Brightness }
     * {@link BrightnessAnnc }
     * {@link Subscription }
     * 
     * 
     */
    public List<Object> getFaultDetectionOrFaultDetectionAnncOrBinarySwitch() {
        if (faultDetectionOrFaultDetectionAnncOrBinarySwitch == null) {
            faultDetectionOrFaultDetectionAnncOrBinarySwitch = new ArrayList<Object>();
        }
        return this.faultDetectionOrFaultDetectionAnncOrBinarySwitch;
    }

}
