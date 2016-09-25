package proyectos.hibernate;

import java.util.HashSet;
import java.util.Set;

public class Rol implements java.io.Serializable, ve.usb.cohesion.runtime.Auditable {

    /** Creates a new instance of Rol */
    public Rol() {}
    
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
     * Holds value of property idRol.
     */
    private long idRol;

    /**
     * Getter for property idRol.
     * @return Value of property idRol.
     */
    public long getIdRol() {
        return this.idRol;
    }

    /**
     * Setter for property idRol.
     * @param idRol New value of property idRol.
     */
    public void setIdRol(long idRol) {
        this.id = this.idRol = idRol;
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
     * Holds value of property participantes.
     */
    private Set<RolParticipante> participantes = new HashSet<RolParticipante>();

    /**
     * Getter for property participantes.
     * @return Value of property participantes.
     */
    public Set<RolParticipante> getParticipantes() {
        return this.participantes;
    }

    /**
     * Setter for property participantes.
     * @param participantes New value of property participantes.
     */
    public void setParticipantes(Set<RolParticipante> participantes) {
        this.participantes = participantes;
    }

    /**
     * Add an element to set property participantes
     * and sets elements's property rol.
     * @param element New element to be added to participantes.
     */
    public void addToParticipantes(RolParticipante element) {
        element.setRol(this);
        participantes.add(element);
    }

    /**
     * Removes and old element from set participantes
     * and sets element's property rol to null.
     * @param old The element to be removed from participantes
     */
    public void removeFromParticipantes(RolParticipante old) {
        participantes.remove(old);
        old.setRol(null);
    }
    /**
     * Holds value of property metodologia.
     */
    private Metodologia metodologia;

    /**
     * Getter for property metodologia.
     * @return Value of property metodologia.
     */
    public Metodologia getMetodologia() {
        return this.metodologia;
    }

    /**
     * Setter for property metodologia.
     * @param metodologia New value of property metodologia.
     */
    public void setMetodologia(Metodologia metodologia) {
        this.metodologia = metodologia;
    }



    public String toString() {
        return "<Rol id='C" + this.id +
      //idRol
      "\" nombre =\"" + nombre +
      "\" descripcion =\"" + descripcion +
      //participantes
        ((metodologia==null) ? "" : "\" metodologia =\"C" + metodologia.getId()) +


        "'/>";
    }

}