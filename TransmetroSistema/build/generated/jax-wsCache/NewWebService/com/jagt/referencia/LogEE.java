
package com.jagt.referencia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para logEE complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="logEE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="contraE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "logEE", propOrder = {
    "idE",
    "contraE"
})
public class LogEE {

    protected int idE;
    protected String contraE;

    /**
     * Obtiene el valor de la propiedad idE.
     * 
     */
    public int getIdE() {
        return idE;
    }

    /**
     * Define el valor de la propiedad idE.
     * 
     */
    public void setIdE(int value) {
        this.idE = value;
    }

    /**
     * Obtiene el valor de la propiedad contraE.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContraE() {
        return contraE;
    }

    /**
     * Define el valor de la propiedad contraE.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContraE(String value) {
        this.contraE = value;
    }

}
