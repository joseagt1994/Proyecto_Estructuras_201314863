
package com.jagt.referencia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para logAdmin complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="logAdmin">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="correoa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contraa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "logAdmin", propOrder = {
    "correoa",
    "contraa"
})
public class LogAdmin {

    protected String correoa;
    protected String contraa;

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
     * Obtiene el valor de la propiedad contraa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContraa() {
        return contraa;
    }

    /**
     * Define el valor de la propiedad contraa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContraa(String value) {
        this.contraa = value;
    }

}
