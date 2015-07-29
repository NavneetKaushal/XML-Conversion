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
 *         &lt;element name="CASPP087" type="{}STRING_50" minOccurs="0"/>
 *         &lt;element name="CASPP088" type="{}STRING_50" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="ID_RSSD" use="required" type="{}INTEGER" />
 *       &lt;attribute name="D_DT" use="required" type="{}DATE_TIME" />
 *       &lt;attribute name="CCARP092" use="required" type="{}STRING_50" />
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
@XmlRootElement(name = "SMRY_Data_Collect_OTTI_ACT")
public class SMRYDataCollectOTTIACT {

    @XmlElement(name = "CASPP087")
    protected String caspp087;
    @XmlElement(name = "CASPP088")
    protected String caspp088;
    @XmlAttribute(name = "ID_RSSD", required = true)
    protected int idrssd;
    @XmlAttribute(name = "D_DT", required = true)
    protected XMLGregorianCalendar ddt;
    @XmlAttribute(name = "CCARP092", required = true)
    protected String ccarp092;
    @XmlAttribute(name = "CCARP084", required = true)
    protected String ccarp084;
    @XmlAttribute(name = "TRANSTYPE", required = true)
    protected TRANSTYPEIUD transtype;

    /**
     * Gets the value of the caspp087 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCASPP087() {
        return caspp087;
    }

    /**
     * Sets the value of the caspp087 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCASPP087(String value) {
        this.caspp087 = value;
    }

    /**
     * Gets the value of the caspp088 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCASPP088() {
        return caspp088;
    }

    /**
     * Sets the value of the caspp088 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCASPP088(String value) {
        this.caspp088 = value;
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
     * Gets the value of the ccarp092 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCARP092() {
        return ccarp092;
    }

    /**
     * Sets the value of the ccarp092 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCARP092(String value) {
        this.ccarp092 = value;
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