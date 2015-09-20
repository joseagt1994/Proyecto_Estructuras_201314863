
package com.jagt.referencia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para guardarChofer complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="guardarChofer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="correoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contrac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombrec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apellidoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="booleanC" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "guardarChofer", propOrder = {
    "idc",
    "correoc",
    "contrac",
    "nombrec",
    "apellidoc",
    "booleanC"
})
public class GuardarChofer {

    protected int idc;
    protected String correoc;
    protected String contrac;
    protected String nombrec;
    protected String apellidoc;
    protected boolean booleanC;

    /**
     * Obtiene el valor de la propiedad idc.
     * 
     */
    public int getIdc() {
        return idc;
    }

    /**
     * Define el valor de la propiedad idc.
     * 
     */
    public void setIdc(int value) {
        this.idc = value;
    }

    /**
     * Obtiene el valor de la propiedad correoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreoc() {
        return correoc;
    }

    /**
     * Define el valor de la propiedad correoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreoc(String value) {
        this.correoc = value;
    }

    /**
     * Obtiene el valor de la propiedad contrac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContrac() {
        return contrac;
    }

    /**
     * Define el valor de la propiedad contrac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContrac(String value) {
        this.contrac = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrec.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrec() {
        return nombrec;
    }

    /**
     * Define el valor de la propiedad nombrec.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrec(String value) {
        this.nombrec = value;
    }

    /**
     * Obtiene el valor de la propiedad apellidoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoc() {
        return apellidoc;
    }

    /**
     * Define el valor de la propiedad apellidoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoc(String value) {
        this.apellidoc = value;
    }

    /**
     * Obtiene el valor de la propiedad booleanC.
     * 
     */
    public boolean isBooleanC() {
        return booleanC;
    }

    /**
     * Define el valor de la propiedad booleanC.
     * 
     */
    public void setBooleanC(boolean value) {
        this.booleanC = value;
    }

}
