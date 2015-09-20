
package com.jagt.referencia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para eliminarEG complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="eliminarEG">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ideg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eliminarEG", propOrder = {
    "ideg"
})
public class EliminarEG {

    protected int ideg;

    /**
     * Obtiene el valor de la propiedad ideg.
     * 
     */
    public int getIdeg() {
        return ideg;
    }

    /**
     * Define el valor de la propiedad ideg.
     * 
     */
    public void setIdeg(int value) {
        this.ideg = value;
    }

}
