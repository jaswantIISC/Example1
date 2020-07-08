//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.17 at 02:51:19 PM IST 
//


package cdot.ccsp.utils;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;

import cdot.onem2m.resource.xsd.AnnouncedFlexContainerResource;
import cdot.onem2m.resource.xsd.ChildResourceRef;
import cdot.onem2m.resource.xsd.Subscription;


/**
 * <p>Java class for deviceCoffeeMachineAnnc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deviceCoffeeMachineAnnc">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}announcedFlexContainerResource">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="childResource" type="{http://www.onem2m.org/xml/protocols}childResourceRef" maxOccurs="unbounded"/>
 *           &lt;choice maxOccurs="unbounded">
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}faultDetection"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}faultDetectionAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}runState"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}runStateAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}clock"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}clockAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}brewing"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}brewingAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}waterStatus"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}waterStatusAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}milkStatus"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}milkStatusAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}grinder"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}grinderAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}milkFoaming"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}milkFoamingAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}milkQuantity"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}milkQuantityAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}brewingSwitch"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}brewingSwitchAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}keepWarm"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}keepWarmAnnc"/>
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
@XmlType(name = "deviceCoffeeMachineAnnc", propOrder = {
    "childResource",
    "faultDetectionOrFaultDetectionAnncOrRunState"
})
public class DeviceCoffeeMachineAnnc
    extends AnnouncedFlexContainerResource
{

    protected List<ChildResourceRef> childResource;
    @XmlElementRefs({
        @XmlElementRef(name = "waterStatus", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "milkStatus", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "milkFoaming", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "grinder", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "keepWarm", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "clockAnnc", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "runState", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "waterStatusAnnc", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "keepWarmAnnc", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "milkFoamingAnnc", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "grinderAnnc", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "brewingSwitch", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "faultDetectionAnnc", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "runStateAnnc", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "milkQuantityAnnc", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "faultDetection", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "milkQuantity", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "clock", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "subscription", namespace = "http://www.onem2m.org/xml/protocols", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "brewingAnnc", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "brewingSwitchAnnc", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "milkStatusAnnc", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "brewing", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> faultDetectionOrFaultDetectionAnncOrRunState;

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
     * Gets the value of the faultDetectionOrFaultDetectionAnncOrRunState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the faultDetectionOrFaultDetectionAnncOrRunState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFaultDetectionOrFaultDetectionAnncOrRunState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link LiquidRemaining }{@code >}
     * {@link JAXBElement }{@code <}{@link LiquidRemaining }{@code >}
     * {@link JAXBElement }{@code <}{@link Foaming }{@code >}
     * {@link JAXBElement }{@code <}{@link Grinder }{@code >}
     * {@link JAXBElement }{@code <}{@link KeepWarm }{@code >}
     * {@link JAXBElement }{@code <}{@link ClockAnnc }{@code >}
     * {@link JAXBElement }{@code <}{@link RunState }{@code >}
     * {@link JAXBElement }{@code <}{@link LiquidRemainingAnnc }{@code >}
     * {@link JAXBElement }{@code <}{@link KeepWarmAnnc }{@code >}
     * {@link JAXBElement }{@code <}{@link FoamingAnnc }{@code >}
     * {@link JAXBElement }{@code <}{@link GrinderAnnc }{@code >}
     * {@link JAXBElement }{@code <}{@link BinarySwitch }{@code >}
     * {@link JAXBElement }{@code <}{@link FaultDetectionAnnc }{@code >}
     * {@link JAXBElement }{@code <}{@link RunStateAnnc }{@code >}
     * {@link JAXBElement }{@code <}{@link LiquidLevelAnnc }{@code >}
     * {@link JAXBElement }{@code <}{@link FaultDetection }{@code >}
     * {@link JAXBElement }{@code <}{@link LiquidLevel }{@code >}
     * {@link JAXBElement }{@code <}{@link Clock }{@code >}
     * {@link JAXBElement }{@code <}{@link Subscription }{@code >}
     * {@link JAXBElement }{@code <}{@link BrewingAnnc }{@code >}
     * {@link JAXBElement }{@code <}{@link BinarySwitchAnnc }{@code >}
     * {@link JAXBElement }{@code <}{@link LiquidRemainingAnnc }{@code >}
     * {@link JAXBElement }{@code <}{@link Brewing }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getFaultDetectionOrFaultDetectionAnncOrRunState() {
        if (faultDetectionOrFaultDetectionAnncOrRunState == null) {
            faultDetectionOrFaultDetectionAnncOrRunState = new ArrayList<JAXBElement<?>>();
        }
        return this.faultDetectionOrFaultDetectionAnncOrRunState;
    }

}
