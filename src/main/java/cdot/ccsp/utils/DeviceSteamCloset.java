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
 * <p>Java class for deviceSteamCloset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deviceSteamCloset">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}flexContainerResource">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="childResource" type="{http://www.onem2m.org/xml/protocols}childResourceRef" maxOccurs="unbounded"/>
 *           &lt;choice maxOccurs="unbounded">
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}binarySwitch"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}runState"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}steamClosetJobMode"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}steamClosetOperationMode"/>
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
@XmlType(name = "deviceSteamCloset", propOrder = {
    "childResource",
    "binarySwitchOrRunStateOrSteamClosetJobMode"
})
public class DeviceSteamCloset
    extends FlexContainerResource
{

    protected List<ChildResourceRef> childResource;
    @XmlElements({
        @XmlElement(name = "binarySwitch", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = BinarySwitch.class),
        @XmlElement(name = "runState", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = RunState.class),
        @XmlElement(name = "steamClosetJobMode", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = SteamClosetJobMode.class),
        @XmlElement(name = "steamClosetOperationMode", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = OperationMode.class),
        @XmlElement(name = "subscription", namespace = "http://www.onem2m.org/xml/protocols", type = Subscription.class)
    })
    protected List<Object> binarySwitchOrRunStateOrSteamClosetJobMode;

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
     * Gets the value of the binarySwitchOrRunStateOrSteamClosetJobMode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the binarySwitchOrRunStateOrSteamClosetJobMode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBinarySwitchOrRunStateOrSteamClosetJobMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BinarySwitch }
     * {@link RunState }
     * {@link SteamClosetJobMode }
     * {@link OperationMode }
     * {@link Subscription }
     * 
     * 
     */
    public List<Object> getBinarySwitchOrRunStateOrSteamClosetJobMode() {
        if (binarySwitchOrRunStateOrSteamClosetJobMode == null) {
            binarySwitchOrRunStateOrSteamClosetJobMode = new ArrayList<Object>();
        }
        return this.binarySwitchOrRunStateOrSteamClosetJobMode;
    }

}
