
package com.jagt.referencia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para actualizarAdmin complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="actualizarAdmin">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="correoa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datoa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actualizarAdmin", propOrder = {
    "correoa",
    "datoa",
    "tipoa"
})
public class ActualizarAdmin {

    protected String correoa;
    protected String datoa;
    protected String tipoa;

    /**
     * Obtiene el valor de la propiedad correoa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreoa() {
        return correoa;
    }

    /**
     * Define el valor de la propiedad correoa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreoa(String value) {
        this.correoa = value;
    }

    /**
     * Obtiene el valor de la propiedad datoa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoa() {
        return datoa;
    }

    /**
     * Define el valor de la propiedad datoa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoa(String value) {
        this.datoa = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoa() {
        return tipoa;
    }

    /**
     * Define el valor de la propiedad tipoa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoa(String value) {
        this.tipoa = value;
    }

}
