
package com.jagt.referencia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para guardarEE complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="guardarEE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ideE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="contraEE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreEE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cantEE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "guardarEE", propOrder = {
    "ideE",
    "contraEE",
    "nombreEE",
    "cantEE"
})
public class GuardarEE {

    protected int ideE;
    protected String contraEE;
    protected String nombreEE;
    protected int cantEE;

    /**
     * Obtiene el valor de la propiedad ideE.
     * 
     */
    public int getIdeE() {
        return ideE;
    }

    /**
     * Define el valor de la propiedad ideE.
     * 
     */
    public void setIdeE(int value) {
        this.ideE = value;
    }

    /**
     * Obtiene el valor de la propiedad contraEE.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContraEE() {
        return contraEE;
    }

    /**
     * Define el valor de la propiedad contraEE.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContraEE(String value) {
        this.contraEE = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreEE.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreEE() {
        return nombreEE;
    }

    /**
     * Define el valor de la propiedad nombreEE.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreEE(String value) {
        this.nombreEE = value;
    }

    /**
     * Obtiene el valor de la propiedad cantEE.
     * 
     */
    public int getCantEE() {
        return cantEE;
    }

    /**
     * Define el valor de la propiedad cantEE.
     * 
     */
    public void setCantEE(int value) {
        this.cantEE = value;
    }

}
