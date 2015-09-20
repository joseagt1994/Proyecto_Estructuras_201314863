
package com.jagt.referencia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ReporteHorasBuses complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ReporteHorasBuses">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idCh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idBus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReporteHorasBuses", propOrder = {
    "idCh",
    "idBus"
})
public class ReporteHorasBuses {

    protected String idCh;
    protected String idBus;

    /**
     * Obtiene el valor de la propiedad idCh.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCh() {
        return idCh;
    }

    /**
     * Define el valor de la propiedad idCh.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCh(String value) {
        this.idCh = value;
    }

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

}
