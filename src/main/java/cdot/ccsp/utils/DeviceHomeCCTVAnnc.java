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
 * <p>Java class for deviceHomeCCTVAnnc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deviceHomeCCTVAnnc">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}announcedFlexContainerResource">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="childResource" type="{http://www.onem2m.org/xml/protocols}childResourceRef" maxOccurs="unbounded"/>
 *           &lt;choice maxOccurs="unbounded">
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}binarySwitch"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}binarySwitchAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}sessionDescription"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}sessionDescriptionAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}playerControl"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}playerControlAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}runState"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}runStateAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}motionSensor"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}motionSensorAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}airQualitySensor"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}airQualitySensorAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}ozoneMeter"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}ozoneMeterAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}smokeSensor"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}smokeSensorAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}acousticSensor"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}acousticSensorAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}impactSensor"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}impactSensorAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}faultDetection"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}faultDetectionAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}alarmSpeaker"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}alarmSpeakerAnnc"/>
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
@XmlType(name = "deviceHomeCCTVAnnc", propOrder = {
    "childResource",
    "binarySwitchOrBinarySwitchAnncOrSessionDescription"
})
public class DeviceHomeCCTVAnnc
    extends AnnouncedFlexContainerResource
{

    protected List<ChildResourceRef> childResource;
    @XmlElements({
        @XmlElement(name = "binarySwitch", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = BinarySwitch.class),
        @XmlElement(name = "binarySwitchAnnc", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = BinarySwitchAnnc.class),
        @XmlElement(name = "sessionDescription", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = SessionDescription.class),
        @XmlElement(name = "sessionDescriptionAnnc", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = SessionDescriptionAnnc.class),
        @XmlElement(name = "playerControl", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = PlayerControl.class),
        @XmlElement(name = "playerControlAnnc", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = PlayerControlAnnc.class),
        @XmlElement(name = "runState", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = RunState.class),
        @XmlElement(name = "runStateAnnc", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = RunStateAnnc.class),
        @XmlElement(name = "motionSensor", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = MotionSensor.class),
        @XmlElement(name = "motionSensorAnnc", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = MotionSensorAnnc.class),
        @XmlElement(name = "airQualitySensor", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = AirQualitySensor.class),
        @XmlElement(name = "airQualitySensorAnnc", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = AirQualitySensorAnnc.class),
        @XmlElement(name = "ozoneMeter", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = OzoneMeter.class),
        @XmlElement(name = "ozoneMeterAnnc", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = OzoneMeterAnnc.class),
        @XmlElement(name = "smokeSensor", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = SmokeSensor.class),
        @XmlElement(name = "smokeSensorAnnc", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = SmokeSensorAnnc.class),
        @XmlElement(name = "acousticSensor", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = AcousticSensor.class),
        @XmlElement(name = "acousticSensorAnnc", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = AcousticSensorAnnc.class),
        @XmlElement(name = "impactSensor", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = ImpactSensor.class),
        @XmlElement(name = "impactSensorAnnc", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = ImpactSensorAnnc.class),
        @XmlElement(name = "faultDetection", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = FaultDetection.class),
        @XmlElement(name = "faultDetectionAnnc", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = FaultDetectionAnnc.class),
        @XmlElement(name = "alarmSpeaker", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = AlarmSpeaker.class),
        @XmlElement(name = "alarmSpeakerAnnc", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = AlarmSpeakerAnnc.class),
        @XmlElement(name = "subscription", namespace = "http://www.onem2m.org/xml/protocols", type = Subscription.class)
    })
    protected List<Object> binarySwitchOrBinarySwitchAnncOrSessionDescription;

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
     * Gets the value of the binarySwitchOrBinarySwitchAnncOrSessionDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the binarySwitchOrBinarySwitchAnncOrSessionDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBinarySwitchOrBinarySwitchAnncOrSessionDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BinarySwitch }
     * {@link BinarySwitchAnnc }
     * {@link SessionDescription }
     * {@link SessionDescriptionAnnc }
     * {@link PlayerControl }
     * {@link PlayerControlAnnc }
     * {@link RunState }
     * {@link RunStateAnnc }
     * {@link MotionSensor }
     * {@link MotionSensorAnnc }
     * {@link AirQualitySensor }
     * {@link AirQualitySensorAnnc }
     * {@link OzoneMeter }
     * {@link OzoneMeterAnnc }
     * {@link SmokeSensor }
     * {@link SmokeSensorAnnc }
     * {@link AcousticSensor }
     * {@link AcousticSensorAnnc }
     * {@link ImpactSensor }
     * {@link ImpactSensorAnnc }
     * {@link FaultDetection }
     * {@link FaultDetectionAnnc }
     * {@link AlarmSpeaker }
     * {@link AlarmSpeakerAnnc }
     * {@link Subscription }
     * 
     * 
     */
    public List<Object> getBinarySwitchOrBinarySwitchAnncOrSessionDescription() {
        if (binarySwitchOrBinarySwitchAnncOrSessionDescription == null) {
            binarySwitchOrBinarySwitchAnncOrSessionDescription = new ArrayList<Object>();
        }
        return this.binarySwitchOrBinarySwitchAnncOrSessionDescription;
    }

}