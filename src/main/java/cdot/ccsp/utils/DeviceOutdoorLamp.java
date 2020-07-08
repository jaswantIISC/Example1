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

import cdot.onem2m.resource.xsd.ChildResourceRef;
import cdot.onem2m.resource.xsd.FlexContainerResource;
import cdot.onem2m.resource.xsd.Subscription;


/**
 * <p>Java class for deviceOutdoorLamp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deviceOutdoorLamp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}flexContainerResource">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="childResource" type="{http://www.onem2m.org/xml/protocols}childResourceRef" maxOccurs="unbounded"/>
 *           &lt;choice maxOccurs="unbounded">
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}binarySwitch"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}brightness"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}motionSensor"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}airQualitySensor"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}uvSensor"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}timer"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}faultDetection"/>
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
@XmlType(name = "deviceOutdoorLamp", propOrder = {
    "childResource",
    "binarySwitchOrBrightnessOrMotionSensor"
})
public class DeviceOutdoorLamp
    extends FlexContainerResource
{

    protected List<ChildResourceRef> childResource;
    @XmlElements({
        @XmlElement(name = "binarySwitch", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = BinarySwitch.class),
        @XmlElement(name = "brightness", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = Brightness.class),
        @XmlElement(name = "motionSensor", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = MotionSensor.class),
        @XmlElement(name = "airQualitySensor", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = AirQualitySensor.class),
        @XmlElement(name = "uvSensor", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = UvSensor.class),
        @XmlElement(name = "timer", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = Timer.class),
        @XmlElement(name = "faultDetection", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = FaultDetection.class),
        @XmlElement(name = "subscription", namespace = "http://www.onem2m.org/xml/protocols", type = Subscription.class)
    })
    protected List<Object> binarySwitchOrBrightnessOrMotionSensor;

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
     * Gets the value of the binarySwitchOrBrightnessOrMotionSensor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the binarySwitchOrBrightnessOrMotionSensor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBinarySwitchOrBrightnessOrMotionSensor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BinarySwitch }
     * {@link Brightness }
     * {@link MotionSensor }
     * {@link AirQualitySensor }
     * {@link UvSensor }
     * {@link Timer }
     * {@link FaultDetection }
     * {@link Subscription }
     * 
     * 
     */
    public List<Object> getBinarySwitchOrBrightnessOrMotionSensor() {
        if (binarySwitchOrBrightnessOrMotionSensor == null) {
            binarySwitchOrBrightnessOrMotionSensor = new ArrayList<Object>();
        }
        return this.binarySwitchOrBrightnessOrMotionSensor;
    }

}
