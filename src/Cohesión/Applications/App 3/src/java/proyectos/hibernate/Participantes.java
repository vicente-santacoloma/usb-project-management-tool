package proyectos.hibernate;

import java.util.HashSet;
import java.util.Set;

public class Participantes implements java.io.Serializable, ve.usb.cohesion.runtime.Auditable {

    /** Creates a new instance of Participantes */
    public Participantes() {}
    
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
     * Holds value of property idParticipantes.
     */
    private long idParticipantes;

    /**
     * Getter for property idParticipantes.
     * @return Value of property idParticipantes.
     */
    public long getIdParticipantes() {
        return this.idParticipantes;
    }

    /**
     * Setter for property idParticipantes.
     * @param idParticipantes New value of property idParticipantes.
     */
    public void setIdParticipantes(long idParticipantes) {
        this.id = this.idParticipantes = idParticipantes;
    }

    /**
     * Holds value of property roles.
     */
    private Set<RolParticipante> roles = new HashSet<RolParticipante>();

    /**
     * Getter for property roles.
     * @return Value of property roles.
     */
    public Set<RolParticipante> getRoles() {
        return this.roles;
    }

    /**
     * Setter for property roles.
     * @param roles New value of property roles.
     */
    public void setRoles(Set<RolParticipante> roles) {
        this.roles = roles;
    }

    /**
     * Add an element to set property roles
     * and sets elements's property participante.
     * @param element New element to be added to roles.
     */
    public void addToRoles(RolParticipante element) {
        element.setParticipante(this);
        roles.add(element);
    }

    /**
     * Removes and old element from set roles
     * and sets element's property participante to null.
     * @param old The element to be removed from roles
     */
    public void removeFromRoles(RolParticipante old) {
        roles.remove(old);
        old.setParticipante(null);
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
     * Holds value of property proyectos.
     */
    private Set<ProyectoParticipante> proyectos = new HashSet<ProyectoParticipante>();

    /**
     * Getter for property proyectos.
     * @return Value of property proyectos.
     */
    public Set<ProyectoParticipante> getProyectos() {
        return this.proyectos;
    }

    /**
     * Setter for property proyectos.
     * @param proyectos New value of property proyectos.
     */
    public void setProyectos(Set<ProyectoParticipante> proyectos) {
        this.proyectos = proyectos;
    }

    /**
     * Add an element to set property proyectos
     * and sets elements's property participante.
     * @param element New element to be added to proyectos.
     */
    public void addToProyectos(ProyectoParticipante element) {
        element.setParticipante(this);
        proyectos.add(element);
    }

    /**
     * Removes and old element from set proyectos
     * and sets element's property participante to null.
     * @param old The element to be removed from proyectos
     */
    public void removeFromProyectos(ProyectoParticipante old) {
        proyectos.remove(old);
        old.setParticipante(null);
    }
    /**
     * Holds value of property actividades.
     */
    private Set<ActividadParticipante> actividades = new HashSet<ActividadParticipante>();

    /**
     * Getter for property actividades.
     * @return Value of property actividades.
     */
    public Set<ActividadParticipante> getActividades() {
        return this.actividades;
    }

    /**
     * Setter for property actividades.
     * @param actividades New value of property actividades.
     */
    public void setActividades(Set<ActividadParticipante> actividades) {
        this.actividades = actividades;
    }

    /**
     * Add an element to set property actividades
     * and sets elements's property participante.
     * @param element New element to be added to actividades.
     */
    public void addToActividades(ActividadParticipante element) {
        element.setParticipante(this);
        actividades.add(element);
    }

    /**
     * Removes and old element from set actividades
     * and sets element's property participante to null.
     * @param old The element to be removed from actividades
     */
    public void removeFromActividades(ActividadParticipante old) {
        actividades.remove(old);
        old.setParticipante(null);
    }
    /**
     * Holds value of property usuario.
     */
    private String usuario = "";

    /**
     * Getter for property usuario.
     * @return Value of property usuario.
     */
    public String getUsuario() {
        return this.usuario;
    }

    /**
     * Setter for property usuario.
     * @param usuario New value of property usuario.
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Holds value of property clave.
     */
    private String clave = "";

    /**
     * Getter for property clave.
     * @return Value of property clave.
     */
    public String getClave() {
        return this.clave;
    }

    /**
     * Setter for property clave.
     * @param clave New value of property clave.
     */
    public void setClave(String clave) {
        this.clave = clave;
    }




    public String toString() {
        return "<Participantes id='C" + this.id +
      //idParticipantes
      //roles
      "\" nombre =\"" + nombre +
      //proyectos
      //actividades
      "\" usuario =\"" + usuario +
      "\" clave =\"" + clave +

        "'/>";
    }

}