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
 * <p>Java class for deviceMultiFunctionPrinterAnnc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deviceMultiFunctionPrinterAnnc">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}announcedFlexContainerResource">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="childResource" type="{http://www.onem2m.org/xml/protocols}childResourceRef" maxOccurs="unbounded"/>
 *           &lt;choice maxOccurs="unbounded">
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}binarySwitch"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}binarySwitchAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}printerRunState"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}printerRunStateAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}scannerRunState"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}scannerRunStateAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}autoDocumentFeeder"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}autoDocumentFeederAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}printQueue"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}printQueueAnnc"/>
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
@XmlType(name = "deviceMultiFunctionPrinterAnnc", propOrder = {
    "childResource",
    "binarySwitchOrBinarySwitchAnncOrPrinterRunState"
})
public class DeviceMultiFunctionPrinterAnnc
    extends AnnouncedFlexContainerResource
{

    protected List<ChildResourceRef> childResource;
    @XmlElementRefs({
        @XmlElementRef(name = "printerRunState", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "binarySwitch", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "binarySwitchAnnc", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "printQueueAnnc", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "autoDocumentFeederAnnc", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "scannerRunState", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "scannerRunStateAnnc", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "printerRunStateAnnc", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "subscription", namespace = "http://www.onem2m.org/xml/protocols", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "printQueue", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "autoDocumentFeeder", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> binarySwitchOrBinarySwitchAnncOrPrinterRunState;

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
     * Gets the value of the binarySwitchOrBinarySwitchAnncOrPrinterRunState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the binarySwitchOrBinarySwitchAnncOrPrinterRunState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBinarySwitchOrBinarySwitchAnncOrPrinterRunState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link RunState }{@code >}
     * {@link JAXBElement }{@code <}{@link BinarySwitch }{@code >}
     * {@link JAXBElement }{@code <}{@link BinarySwitchAnnc }{@code >}
     * {@link JAXBElement }{@code <}{@link PrintQueueAnnc }{@code >}
     * {@link JAXBElement }{@code <}{@link AutoDocumentFeederAnnc }{@code >}
     * {@link JAXBElement }{@code <}{@link RunState }{@code >}
     * {@link JAXBElement }{@code <}{@link RunStateAnnc }{@code >}
     * {@link JAXBElement }{@code <}{@link RunStateAnnc }{@code >}
     * {@link JAXBElement }{@code <}{@link Subscription }{@code >}
     * {@link JAXBElement }{@code <}{@link PrintQueue }{@code >}
     * {@link JAXBElement }{@code <}{@link AutoDocumentFeeder }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getBinarySwitchOrBinarySwitchAnncOrPrinterRunState() {
        if (binarySwitchOrBinarySwitchAnncOrPrinterRunState == null) {
            binarySwitchOrBinarySwitchAnncOrPrinterRunState = new ArrayList<JAXBElement<?>>();
        }
        return this.binarySwitchOrBinarySwitchAnncOrPrinterRunState;
    }

}
