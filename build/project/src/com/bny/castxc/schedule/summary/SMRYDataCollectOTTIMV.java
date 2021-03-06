//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.15 at 01:11:28 PM CST 
//


package com.bny.castxc.schedule.summary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="CASMN243" type="{}STRING_300" minOccurs="0"/>
 *         &lt;element name="CASMN245" type="{}STRING_300" minOccurs="0"/>
 *         &lt;element name="CASMN246" type="{}STRING_300" minOccurs="0"/>
 *         &lt;element name="CASMN247" type="{}STRING_300" minOccurs="0"/>
 *         &lt;element name="CASMN248" type="{}STRING_300" minOccurs="0"/>
 *         &lt;element name="CASMN240" type="{}STRING_300" minOccurs="0"/>
 *         &lt;element name="CASMN241" type="{}STRING_300" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="ID_RSSD" use="required" type="{}INTEGER" />
 *       &lt;attribute name="D_DT" use="required" type="{}DATE_TIME" />
 *       &lt;attribute name="CCARP084" use="required" type="{}STRING_100" />
 *       &lt;attribute name="TRANSTYPE" use="required" type="{}TRANSTYPE_IUD" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "SMRY_Data_Collect_OTTI_MV")
public class SMRYDataCollectOTTIMV {

    @XmlElement(name = "CASMN243")
    protected String casmn243;
    @XmlElement(name = "CASMN245")
    protected String casmn245;
    @XmlElement(name = "CASMN246")
    protected String casmn246;
    @XmlElement(name = "CASMN247")
    protected String casmn247;
    @XmlElement(name = "CASMN248")
    protected String casmn248;
    @XmlElement(name = "CASMN240")
    protected String casmn240;
    @XmlElement(name = "CASMN241")
    protected String casmn241;
    @XmlAttribute(name = "ID_RSSD", required = true)
    protected int idrssd;
    @XmlAttribute(name = "D_DT", required = true)
    protected XMLGregorianCalendar ddt;
    @XmlAttribute(name = "CCARP084", required = true)
    protected String ccarp084;
    @XmlAttribute(name = "TRANSTYPE", required = true)
    protected TRANSTYPEIUD transtype;

    /**
     * Gets the value of the casmn243 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCASMN243() {
        return casmn243;
    }

    /**
     * Sets the value of the casmn243 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCASMN243(String value) {
        this.casmn243 = value;
    }

    /**
     * Gets the value of the casmn245 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCASMN245() {
        return casmn245;
    }

    /**
     * Sets the value of the casmn245 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCASMN245(String value) {
        this.casmn245 = value;
    }

    /**
     * Gets the value of the casmn246 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCASMN246() {
        return casmn246;
    }

    /**
     * Sets the value of the casmn246 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCASMN246(String value) {
        this.casmn246 = value;
    }

    /**
     * Gets the value of the casmn247 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCASMN247() {
        return casmn247;
    }

    /**
     * Sets the value of the casmn247 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCASMN247(String value) {
        this.casmn247 = value;
    }

    /**
     * Gets the value of the casmn248 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCASMN248() {
        return casmn248;
    }

    /**
     * Sets the value of the casmn248 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCASMN248(String value) {
        this.casmn248 = value;
    }

    /**
     * Gets the value of the casmn240 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCASMN240() {
        return casmn240;
    }

    /**
     * Sets the value of the casmn240 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCASMN240(String value) {
        this.casmn240 = value;
    }

    /**
     * Gets the value of the casmn241 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCASMN241() {
        return casmn241;
    }

    /**
     * Sets the value of the casmn241 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCASMN241(String value) {
        this.casmn241 = value;
    }

    /**
     * Gets the value of the idrssd property.
     * 
     */
    public int getIDRSSD() {
        return idrssd;
    }

    /**
     * Sets the value of the idrssd property.
     * 
     */
    public void setIDRSSD(int value) {
        this.idrssd = value;
    }

    /**
     * Gets the value of the ddt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDDT() {
        return ddt;
    }

    /**
     * Sets the value of the ddt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDDT(XMLGregorianCalendar value) {
        this.ddt = value;
    }

    /**
     * Gets the value of the ccarp084 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCARP084() {
        return ccarp084;
    }

    /**
     * Sets the value of the ccarp084 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCARP084(String value) {
        this.ccarp084 = value;
    }

    /**
     * Gets the value of the transtype property.
     * 
     * @return
     *     possible object is
     *     {@link TRANSTYPEIUD }
     *     
     */
    public TRANSTYPEIUD getTRANSTYPE() {
        return transtype;
    }

    /**
     * Sets the value of the transtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRANSTYPEIUD }
     *     
     */
    public void setTRANSTYPE(TRANSTYPEIUD value) {
        this.transtype = value;
    }

}
