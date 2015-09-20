
package com.jagt.referencia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para guardarEG complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="guardarEG">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ideg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="contraEG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreEG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cantEG" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "guardarEG", propOrder = {
    "ideg",
    "contraEG",
    "nombreEG",
    "cantEG"
})
public class GuardarEG {

    protected int ideg;
    protected String contraEG;
    protected String nombreEG;
    protected int cantEG;

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

    /**
     * Obtiene el valor de la propiedad contraEG.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContraEG() {
        return contraEG;
    }

    /**
     * Define el valor de la propiedad contraEG.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContraEG(String value) {
        this.contraEG = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreEG.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreEG() {
        return nombreEG;
    }

    /**
     * Define el valor de la propiedad nombreEG.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreEG(String value) {
        this.nombreEG = value;
    }

    /**
     * Obtiene el valor de la propiedad cantEG.
     * 
     */
    public int getCantEG() {
        return cantEG;
    }

    /**
     * Define el valor de la propiedad cantEG.
     * 
     */
    public void setCantEG(int value) {
        this.cantEG = value;
    }

}
