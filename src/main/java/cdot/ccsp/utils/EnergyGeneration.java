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
import javax.xml.bind.annotation.XmlType;

import cdot.onem2m.resource.xsd.ChildResourceRef;
import cdot.onem2m.resource.xsd.FlexContainerResource;
import cdot.onem2m.resource.xsd.Subscription;


/**
 * <p>Java class for energyGeneration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="energyGeneration">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}flexContainerResource">
 *       &lt;sequence>
 *         &lt;element name="powerGenerationData" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="roundingEnergyGeneration" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="significantDigits" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="multiplyingFactors" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="generationSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "energyGeneration", propOrder = {
    "powerGenerationData",
    "roundingEnergyGeneration",
    "significantDigits",
    "multiplyingFactors",
    "generationSource",
    "childResource",
    "subscription"
})
public class EnergyGeneration
    extends FlexContainerResource
{

    protected Float powerGenerationData;
    protected BigInteger roundingEnergyGeneration;
    protected BigInteger significantDigits;
    protected BigInteger multiplyingFactors;
    protected String generationSource;
    protected List<ChildResourceRef> childResource;
    @XmlElement(namespace = "http://www.onem2m.org/xml/protocols")
    protected List<Subscription> subscription;

    /**
     * Gets the value of the powerGenerationData property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPowerGenerationData() {
        return powerGenerationData;
    }

    /**
     * Sets the value of the powerGenerationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPowerGenerationData(Float value) {
        this.powerGenerationData = value;
    }

    /**
     * Gets the value of the roundingEnergyGeneration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRoundingEnergyGeneration() {
        return roundingEnergyGeneration;
    }

    /**
     * Sets the value of the roundingEnergyGeneration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRoundingEnergyGeneration(BigInteger value) {
        this.roundingEnergyGeneration = value;
    }

    /**
     * Gets the value of the significantDigits property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSignificantDigits() {
        return significantDigits;
    }

    /**
     * Sets the value of the significantDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSignificantDigits(BigInteger value) {
        this.significantDigits = value;
    }

    /**
     * Gets the value of the multiplyingFactors property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMultiplyingFactors() {
        return multiplyingFactors;
    }

    /**
     * Sets the value of the multiplyingFactors property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMultiplyingFactors(BigInteger value) {
        this.multiplyingFactors = value;
    }

    /**
     * Gets the value of the generationSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenerationSource() {
        return generationSource;
    }

    /**
     * Sets the value of the generationSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenerationSource(String value) {
        this.generationSource = value;
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
