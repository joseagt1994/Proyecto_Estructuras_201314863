
package com.jagt.referencia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ReporteBusesChofer complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ReporteBusesChofer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idchof" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReporteBusesChofer", propOrder = {
    "idchof"
})
public class ReporteBusesChofer {

    protected int idchof;

    /**
     * Obtiene el valor de la propiedad idchof.
     * 
     */
    public int getIdchof() {
        return idchof;
    }

    /**
     * Define el valor de la propiedad idchof.
     * 
     */
    public void setIdchof(int value) {
        this.idchof = value;
    }

}
