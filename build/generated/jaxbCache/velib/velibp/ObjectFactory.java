//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.03.27 à 02:28:55 PM CET 
//


package velibp;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the velibp package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: velibp
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Carto }
     * 
     */
    public Carto createCarto() {
        return new Carto();
    }

    /**
     * Create an instance of {@link Carto.Arrondissements }
     * 
     */
    public Carto.Arrondissements createCartoArrondissements() {
        return new Carto.Arrondissements();
    }

    /**
     * Create an instance of {@link Carto.Markers }
     * 
     */
    public Carto.Markers createCartoMarkers() {
        return new Carto.Markers();
    }

    /**
     * Create an instance of {@link Carto.Arrondissements.Arrondissement }
     * 
     */
    public Carto.Arrondissements.Arrondissement createCartoArrondissementsArrondissement() {
        return new Carto.Arrondissements.Arrondissement();
    }

    /**
     * Create an instance of {@link Carto.Markers.Marker }
     * 
     */
    public Carto.Markers.Marker createCartoMarkersMarker() {
        return new Carto.Markers.Marker();
    }

}
