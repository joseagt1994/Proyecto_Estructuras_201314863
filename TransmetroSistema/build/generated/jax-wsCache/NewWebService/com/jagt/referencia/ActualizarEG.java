
package com.jagt.referencia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para actualizarEG complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="actualizarEG">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="correoeg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="datoeg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoeg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actualizarEG", propOrder = {
    "correoeg",
    "datoeg",
    "tipoeg"
})
public class ActualizarEG {

    protected int correoeg;
    protected String datoeg;
    protected String tipoeg;

    /**
     * Obtiene el valor de la propiedad correoeg.
     * 
     */
    public int getCorreoeg() {
        return correoeg;
    }

    /**
     * Define el valor de la propiedad correoeg.
     * 
     */
    public void setCorreoeg(int value) {
        this.correoeg = value;
    }

    /**
     * Obtiene el valor de la propiedad datoeg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoeg() {
        return datoeg;
    }

    /**
     * Define el valor de la propiedad datoeg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoeg(String value) {
        this.datoeg = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoeg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoeg() {
        return tipoeg;
    }

    /**
     * Define el valor de la propiedad tipoeg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoeg(String value) {
        this.tipoeg = value;
    }

}
