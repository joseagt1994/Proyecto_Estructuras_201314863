
package com.jagt.referencia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para actualizarChofer complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="actualizarChofer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="correoa" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "actualizarChofer", propOrder = {
    "correoa",
    "datoa",
    "tipoa"
})
public class ActualizarChofer {

    protected int correoa;
    protected String datoa;
    protected String tipoa;

    /**
     * Obtiene el valor de la propiedad correoa.
     * 
     */
    public int getCorreoa() {
        return correoa;
    }

    /**
     * Define el valor de la propiedad correoa.
     * 
     */
    public void setCorreoa(int value) {
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
