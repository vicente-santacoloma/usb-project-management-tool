package proyectos.hibernate;

import java.util.HashSet;
import java.util.Set;

public class ProcesoSoftware implements java.io.Serializable, ve.usb.cohesion.runtime.Auditable {

    /** Creates a new instance of ProcesoSoftware */
    public ProcesoSoftware() {}
    
    /**
     * Holds value of property id.
     */
    private Long id;

    /**
     * Getter for property id.
     * @return Value of property id.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Holds value of property idProcesoSoftware.
     */
    private long idProcesoSoftware;

    /**
     * Getter for property idProcesoSoftware.
     * @return Value of property idProcesoSoftware.
     */
    public long getIdProcesoSoftware() {
        return this.idProcesoSoftware;
    }

    /**
     * Setter for property idProcesoSoftware.
     * @param idProcesoSoftware New value of property idProcesoSoftware.
     */
    public void setIdProcesoSoftware(long idProcesoSoftware) {
        this.id = this.idProcesoSoftware = idProcesoSoftware;
    }

    /**
     * Holds value of property nombre.
     */
    private String nombre = "";

    /**
     * Getter for property nombre.
     * @return Value of property nombre.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Setter for property nombre.
     * @param nombre New value of property nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Holds value of property descripcion.
     */
    private String descripcion = "";

    /**
     * Getter for property descripcion.
     * @return Value of property descripcion.
     */
    public String getDescripcion() {
        return this.descripcion;
    }

    /**
     * Setter for property descripcion.
     * @param descripcion New value of property descripcion.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Holds value of property tipo.
     */
    private int tipo;

    /**
     * Getter for property tipo.
     * @return Value of property tipo.
     */
    public int getTipo() {
        return this.tipo;
    }

    /**
     * Setter for property tipo.
     * @param tipo New value of property tipo.
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    /**
     * Holds value of property actividades.
     */
    private Set<Actividad> actividades = new HashSet<Actividad>();

    /**
     * Getter for property actividades.
     * @return Value of property actividades.
     */
    public Set<Actividad> getActividades() {
        return this.actividades;
    }

    /**
     * Setter for property actividades.
     * @param actividades New value of property actividades.
     */
    public void setActividades(Set<Actividad> actividades) {
        this.actividades = actividades;
    }

    /**
     * Add an element to set property actividades
     * and sets elements's property procesoSoftware.
     * @param element New element to be added to actividades.
     */
    public void addToActividades(Actividad element) {
        element.setProcesoSoftware(this);
        actividades.add(element);
    }

    /**
     * Removes and old element from set actividades
     * and sets element's property procesoSoftware to null.
     * @param old The element to be removed from actividades
     */
    public void removeFromActividades(Actividad old) {
        actividades.remove(old);
        old.setProcesoSoftware(null);
    }



    public String toString() {
        return "<ProcesoSoftware id='C" + this.id +
      //idProcesoSoftware
      "\" nombre =\"" + nombre +
      "\" descripcion =\"" + descripcion +
      "\" tipo =\"" + tipo +
      //actividades

        "'/>";
    }

}