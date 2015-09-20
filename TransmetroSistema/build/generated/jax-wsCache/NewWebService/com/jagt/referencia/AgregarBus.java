
package com.jagt.referencia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para agregarBus complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="agregarBus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idBus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="booleanB" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agregarBus", propOrder = {
    "idBus",
    "booleanB"
})
public class AgregarBus {

    protected String idBus;
    protected boolean booleanB;

    /**
     * Obtiene el valor de la propiedad idBus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdBus() {
        return idBus;
    }

    /**
     * Define el valor de la propiedad idBus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdBus(String value) {
        this.idBus = value;
    }

    /**
     * Obtiene el valor de la propiedad booleanB.
     * 
     */
    public boolean isBooleanB() {
        return booleanB;
    }

    /**
     * Define el valor de la propiedad booleanB.
     * 
     */
    public void setBooleanB(boolean value) {
        this.booleanB = value;
    }

}
