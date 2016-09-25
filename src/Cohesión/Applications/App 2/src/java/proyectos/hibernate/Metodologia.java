package proyectos.hibernate;

import java.util.HashSet;
import java.util.Set;

public class Metodologia implements java.io.Serializable, ve.usb.cohesion.runtime.Auditable {

    /** Creates a new instance of Metodologia */
    public Metodologia() {}
    
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
     * Holds value of property idMetodologia.
     */
    private long idMetodologia;

    /**
     * Getter for property idMetodologia.
     * @return Value of property idMetodologia.
     */
    public long getIdMetodologia() {
        return this.idMetodologia;
    }

    /**
     * Setter for property idMetodologia.
     * @param idMetodologia New value of property idMetodologia.
     */
    public void setIdMetodologia(long idMetodologia) {
        this.id = this.idMetodologia = idMetodologia;
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
     * Holds value of property clasificacion.
     */
    private String clasificacion = "";

    /**
     * Getter for property clasificacion.
     * @return Value of property clasificacion.
     */
    public String getClasificacion() {
        return this.clasificacion;
    }

    /**
     * Setter for property clasificacion.
     * @param clasificacion New value of property clasificacion.
     */
    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    /**
     * Holds value of property esPrivada.
     */
    private boolean esPrivada;

    /**
     * Getter for property esPrivada.
     * @return Value of property esPrivada.
     */
    public boolean getEsPrivada() {
        return this.esPrivada;
    }

    /**
     * Setter for property esPrivada.
     * @param esPrivada New value of property esPrivada.
     */
    public void setEsPrivada(boolean esPrivada) {
        this.esPrivada = esPrivada;
    }

    /**
     * Holds value of property proyectos.
     */
    private Set<Proyecto> proyectos = new HashSet<Proyecto>();

    /**
     * Getter for property proyectos.
     * @return Value of property proyectos.
     */
    public Set<Proyecto> getProyectos() {
        return this.proyectos;
    }

    /**
     * Setter for property proyectos.
     * @param proyectos New value of property proyectos.
     */
    public void setProyectos(Set<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }

    /**
     * Add an element to set property proyectos
     * and sets elements's property metodologia.
     * @param element New element to be added to proyectos.
     */
    public void addToProyectos(Proyecto element) {
        element.setMetodologia(this);
        proyectos.add(element);
    }

    /**
     * Removes and old element from set proyectos
     * and sets element's property metodologia to null.
     * @param old The element to be removed from proyectos
     */
    public void removeFromProyectos(Proyecto old) {
        proyectos.remove(old);
        old.setMetodologia(null);
    }
    /**
     * Holds value of property roles.
     */
    private Set<Rol> roles = new HashSet<Rol>();

    /**
     * Getter for property roles.
     * @return Value of property roles.
     */
    public Set<Rol> getRoles() {
        return this.roles;
    }

    /**
     * Setter for property roles.
     * @param roles New value of property roles.
     */
    public void setRoles(Set<Rol> roles) {
        this.roles = roles;
    }

    /**
     * Add an element to set property roles
     * and sets elements's property metodologia.
     * @param element New element to be added to roles.
     */
    public void addToRoles(Rol element) {
        element.setMetodologia(this);
        roles.add(element);
    }

    /**
     * Removes and old element from set roles
     * and sets element's property metodologia to null.
     * @param old The element to be removed from roles
     */
    public void removeFromRoles(Rol old) {
        roles.remove(old);
        old.setMetodologia(null);
    }
    /**
     * Holds value of property lider.
     */
    private Participante lider;

    /**
     * Getter for property lider.
     * @return Value of property lider.
     */
    public Participante getLider() {
        return this.lider;
    }

    /**
     * Setter for property lider.
     * @param lider New value of property lider.
     */
    public void setLider(Participante lider) {
        this.lider = lider;
    }
    /**
     * Holds value of property proceso.
     */
    private MetodologiaProceso proceso;

    /**
     * Getter for property proceso.
     * @return Value of property proceso.
     */
    public MetodologiaProceso getProceso() {
        return this.proceso;
    }

    /**
     * Setter for property proceso.
     * @param proceso New value of property proceso.
     */
    public void setProceso(MetodologiaProceso proceso) {
        this.proceso = proceso;
    }



    public String toString() {
        return "<Metodologia id='C" + this.id +
      //idMetodologia
      "\" nombre =\"" + nombre +
      "\" descripcion =\"" + descripcion +
      "\" clasificacion =\"" + clasificacion +
      "\" esPrivada =\"" + esPrivada +
      //proyectos
      //roles
        ((lider==null) ? "" : "\" lider =\"C" + lider.getId()) +

        ((proceso==null) ? "" : "\" proceso =\"C" + proceso.getId()) +


        "'/>";
    }

}