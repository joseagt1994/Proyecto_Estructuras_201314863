
package com.jagt.referencia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para logEG complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="logEG">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="contrac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "logEG", propOrder = {
    "idc",
    "contrac"
})
public class LogEG {

    protected int idc;
    protected String contrac;

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

}
