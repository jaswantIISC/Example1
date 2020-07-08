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
 * <p>Java class for deviceDehumidifierAnnc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deviceDehumidifierAnnc">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}announcedFlexContainerResource">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="childResource" type="{http://www.onem2m.org/xml/protocols}childResourceRef" maxOccurs="unbounded"/>
 *           &lt;choice maxOccurs="unbounded">
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}binarySwitch"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}binarySwitchAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}relativeHumidity"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}relativeHumidityAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}runState"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}runStateAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}dehumidifierJobMode"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}dehumidifierJobModeAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}dehumidifierOperationMode"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}dehumidifierOperationModeAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}timer"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}timerAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}powerSave"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}powerSaveAnnc"/>
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
@XmlType(name = "deviceDehumidifierAnnc", propOrder = {
    "childResource",
    "binarySwitchOrBinarySwitchAnncOrRelativeHumidity"
})
public class DeviceDehumidifierAnnc
    extends AnnouncedFlexContainerResource
{

    protected List<ChildResourceRef> childResource;
    @XmlElements({
        @XmlElement(name = "binarySwitch", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = BinarySwitch.class),
        @XmlElement(name = "binarySwitchAnnc", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = BinarySwitchAnnc.class),
        @XmlElement(name = "relativeHumidity", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = RelativeHumidity.class),
        @XmlElement(name = "relativeHumidityAnnc", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = RelativeHumidityAnnc.class),
        @XmlElement(name = "runState", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = RunState.class),
        @XmlElement(name = "runStateAnnc", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = RunStateAnnc.class),
        @XmlElement(name = "dehumidifierJobMode", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DehumidifierJobMode.class),
        @XmlElement(name = "dehumidifierJobModeAnnc", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = DehumidifierJobModeAnnc.class),
        @XmlElement(name = "dehumidifierOperationMode", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = OperationMode.class),
        @XmlElement(name = "dehumidifierOperationModeAnnc", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = OperationModeAnnc.class),
        @XmlElement(name = "timer", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = Timer.class),
        @XmlElement(name = "timerAnnc", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = TimerAnnc.class),
        @XmlElement(name = "powerSave", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = PowerSave.class),
        @XmlElement(name = "powerSaveAnnc", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = PowerSaveAnnc.class),
        @XmlElement(name = "subscription", namespace = "http://www.onem2m.org/xml/protocols", type = Subscription.class)
    })
    protected List<Object> binarySwitchOrBinarySwitchAnncOrRelativeHumidity;

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
     * Gets the value of the binarySwitchOrBinarySwitchAnncOrRelativeHumidity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the binarySwitchOrBinarySwitchAnncOrRelativeHumidity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBinarySwitchOrBinarySwitchAnncOrRelativeHumidity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BinarySwitch }
     * {@link BinarySwitchAnnc }
     * {@link RelativeHumidity }
     * {@link RelativeHumidityAnnc }
     * {@link RunState }
     * {@link RunStateAnnc }
     * {@link DehumidifierJobMode }
     * {@link DehumidifierJobModeAnnc }
     * {@link OperationMode }
     * {@link OperationModeAnnc }
     * {@link Timer }
     * {@link TimerAnnc }
     * {@link PowerSave }
     * {@link PowerSaveAnnc }
     * {@link Subscription }
     * 
     * 
     */
    public List<Object> getBinarySwitchOrBinarySwitchAnncOrRelativeHumidity() {
        if (binarySwitchOrBinarySwitchAnncOrRelativeHumidity == null) {
            binarySwitchOrBinarySwitchAnncOrRelativeHumidity = new ArrayList<Object>();
        }
        return this.binarySwitchOrBinarySwitchAnncOrRelativeHumidity;
    }

}
