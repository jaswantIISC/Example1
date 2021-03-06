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
import javax.xml.bind.annotation.XmlType;

import cdot.onem2m.resource.xsd.ChildResourceRef;
import cdot.onem2m.resource.xsd.FlexContainerResource;
import cdot.onem2m.resource.xsd.Subscription;


/**
 * <p>Java class for threeDPrinter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="threeDPrinter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}flexContainerResource">
 *       &lt;sequence>
 *         &lt;element name="printType" type="{http://www.onem2m.org/xml/protocols/homedomain}enum3DPrinterTechnology"/>
 *         &lt;element name="printSizeX" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="printSizeY" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="printSizeZ" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="network" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="memorySize" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="childResource" type="{http://www.onem2m.org/xml/protocols}childResourceRef" maxOccurs="unbounded"/>
 *           &lt;choice maxOccurs="unbounded">
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}start3Dprint"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols/homedomain}stop3Dprint"/>
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
@XmlType(name = "threeDPrinter", propOrder = {
    "printType",
    "printSizeX",
    "printSizeY",
    "printSizeZ",
    "network",
    "memorySize",
    "childResource",
    "start3DprintOrStop3DprintOrSubscription"
})
public class ThreeDPrinter
    extends FlexContainerResource
{

    @XmlElement(required = true)
    protected BigInteger printType;
    protected float printSizeX;
    protected float printSizeY;
    protected float printSizeZ;
    protected boolean network;
    protected float memorySize;
    protected List<ChildResourceRef> childResource;
    @XmlElements({
        @XmlElement(name = "start3Dprint", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = Start3Dprint.class),
        @XmlElement(name = "stop3Dprint", namespace = "http://www.onem2m.org/xml/protocols/homedomain", type = Stop3Dprint.class),
        @XmlElement(name = "subscription", namespace = "http://www.onem2m.org/xml/protocols", type = Subscription.class)
    })
    protected List<Object> start3DprintOrStop3DprintOrSubscription;

    /**
     * Gets the value of the printType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPrintType() {
        return printType;
    }

    /**
     * Sets the value of the printType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPrintType(BigInteger value) {
        this.printType = value;
    }

    /**
     * Gets the value of the printSizeX property.
     * 
     */
    public float getPrintSizeX() {
        return printSizeX;
    }

    /**
     * Sets the value of the printSizeX property.
     * 
     */
    public void setPrintSizeX(float value) {
        this.printSizeX = value;
    }

    /**
     * Gets the value of the printSizeY property.
     * 
     */
    public float getPrintSizeY() {
        return printSizeY;
    }

    /**
     * Sets the value of the printSizeY property.
     * 
     */
    public void setPrintSizeY(float value) {
        this.printSizeY = value;
    }

    /**
     * Gets the value of the printSizeZ property.
     * 
     */
    public float getPrintSizeZ() {
        return printSizeZ;
    }

    /**
     * Sets the value of the printSizeZ property.
     * 
     */
    public void setPrintSizeZ(float value) {
        this.printSizeZ = value;
    }

    /**
     * Gets the value of the network property.
     * 
     */
    public boolean isNetwork() {
        return network;
    }

    /**
     * Sets the value of the network property.
     * 
     */
    public void setNetwork(boolean value) {
        this.network = value;
    }

    /**
     * Gets the value of the memorySize property.
     * 
     */
    public float getMemorySize() {
        return memorySize;
    }

    /**
     * Sets the value of the memorySize property.
     * 
     */
    public void setMemorySize(float value) {
        this.memorySize = value;
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
     * Gets the value of the start3DprintOrStop3DprintOrSubscription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the start3DprintOrStop3DprintOrSubscription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStart3DprintOrStop3DprintOrSubscription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Start3Dprint }
     * {@link Stop3Dprint }
     * {@link Subscription }
     * 
     * 
     */
    public List<Object> getStart3DprintOrStop3DprintOrSubscription() {
        if (start3DprintOrStop3DprintOrSubscription == null) {
            start3DprintOrStop3DprintOrSubscription = new ArrayList<Object>();
        }
        return this.start3DprintOrStop3DprintOrSubscription;
    }

}
