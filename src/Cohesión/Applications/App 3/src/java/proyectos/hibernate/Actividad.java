package proyectos.hibernate;

import ve.usb.cohesion.runtime.LocalDate;import java.util.HashSet;
import java.util.Set;

public class Actividad implements java.io.Serializable, ve.usb.cohesion.runtime.Auditable {

    /** Creates a new instance of Actividad */
    public Actividad() {}
    
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
     * Holds value of property idActividad.
     */
    private long idActividad;

    /**
     * Getter for property idActividad.
     * @return Value of property idActividad.
     */
    public long getIdActividad() {
        return this.idActividad;
    }

    /**
     * Setter for property idActividad.
     * @param idActividad New value of property idActividad.
     */
    public void setIdActividad(long idActividad) {
        this.id = this.idActividad = idActividad;
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
     * Holds value of property avance.
     */
    private int avance;

    /**
     * Getter for property avance.
     * @return Value of property avance.
     */
    public int getAvance() {
        return this.avance;
    }

    /**
     * Setter for property avance.
     * @param avance New value of property avance.
     */
    public void setAvance(int avance) {
        this.avance = avance;
    }

    /**
     * Holds value of property fechaInicio.
     */
    private java.util.Date fechaInicio;

    /**
     * Getter for property fechaInicio.
     * @return Value of property fechaInicio.
     */
    public java.util.Date getFechaInicio() {
        return this.fechaInicio;
    }

    /**
     * Setter for property fechaInicio.
     * @param fechaInicio New value of property fechaInicio.
     */
    public void setFechaInicio(java.util.Date fechaInicio) {
        if (fechaInicio==null || fechaInicio instanceof LocalDate)
            this.fechaInicio = fechaInicio;
        else this.fechaInicio = new LocalDate(fechaInicio);
    }

    /**
     * Holds value of property fechaFin.
     */
    private java.util.Date fechaFin;

    /**
     * Getter for property fechaFin.
     * @return Value of property fechaFin.
     */
    public java.util.Date getFechaFin() {
        return this.fechaFin;
    }

    /**
     * Setter for property fechaFin.
     * @param fechaFin New value of property fechaFin.
     */
    public void setFechaFin(java.util.Date fechaFin) {
        if (fechaFin==null || fechaFin instanceof LocalDate)
            this.fechaFin = fechaFin;
        else this.fechaFin = new LocalDate(fechaFin);
    }

    /**
     * Holds value of property participantes.
     */
    private Set<ActividadParticipante> participantes = new HashSet<ActividadParticipante>();

    /**
     * Getter for property participantes.
     * @return Value of property participantes.
     */
    public Set<ActividadParticipante> getParticipantes() {
        return this.participantes;
    }

    /**
     * Setter for property participantes.
     * @param participantes New value of property participantes.
     */
    public void setParticipantes(Set<ActividadParticipante> participantes) {
        this.participantes = participantes;
    }

    /**
     * Add an element to set property participantes
     * and sets elements's property actividad.
     * @param element New element to be added to participantes.
     */
    public void addToParticipantes(ActividadParticipante element) {
        element.setActividad(this);
        participantes.add(element);
    }

    /**
     * Removes and old element from set participantes
     * and sets element's property actividad to null.
     * @param old The element to be removed from participantes
     */
    public void removeFromParticipantes(ActividadParticipante old) {
        participantes.remove(old);
        old.setActividad(null);
    }
    /**
     * Holds value of property roles.
     */
    private Set<RolActividad> roles = new HashSet<RolActividad>();

    /**
     * Getter for property roles.
     * @return Value of property roles.
     */
    public Set<RolActividad> getRoles() {
        return this.roles;
    }

    /**
     * Setter for property roles.
     * @param roles New value of property roles.
     */
    public void setRoles(Set<RolActividad> roles) {
        this.roles = roles;
    }

    /**
     * Add an element to set property roles
     * and sets elements's property actividad.
     * @param element New element to be added to roles.
     */
    public void addToRoles(RolActividad element) {
        element.setActividad(this);
        roles.add(element);
    }

    /**
     * Removes and old element from set roles
     * and sets element's property actividad to null.
     * @param old The element to be removed from roles
     */
    public void removeFromRoles(RolActividad old) {
        roles.remove(old);
        old.setActividad(null);
    }
    /**
     * Holds value of property prerequisitos.
     */
    private Set<ActividadPre> prerequisitos = new HashSet<ActividadPre>();

    /**
     * Getter for property prerequisitos.
     * @return Value of property prerequisitos.
     */
    public Set<ActividadPre> getPrerequisitos() {
        return this.prerequisitos;
    }

    /**
     * Setter for property prerequisitos.
     * @param prerequisitos New value of property prerequisitos.
     */
    public void setPrerequisitos(Set<ActividadPre> prerequisitos) {
        this.prerequisitos = prerequisitos;
    }

    /**
     * Add an element to set property prerequisitos
     * and sets elements's property prerequisito.
     * @param element New element to be added to prerequisitos.
     */
    public void addToPrerequisitos(ActividadPre element) {
        element.setPrerequisito(this);
        prerequisitos.add(element);
    }

    /**
     * Removes and old element from set prerequisitos
     * and sets element's property prerequisito to null.
     * @param old The element to be removed from prerequisitos
     */
    public void removeFromPrerequisitos(ActividadPre old) {
        prerequisitos.remove(old);
        old.setPrerequisito(null);
    }
    /**
     * Holds value of property superactividad.
     */
    private Actividad superactividad;

    /**
     * Getter for property superactividad.
     * @return Value of property superactividad.
     */
    public Actividad getSuperactividad() {
        return this.superactividad;
    }

    /**
     * Setter for property superactividad.
     * @param superactividad New value of property superactividad.
     */
    public void setSuperactividad(Actividad superactividad) {
        this.superactividad = superactividad;
    }
    /**
     * Holds value of property proyecto.
     */
    private Proyecto proyecto;

    /**
     * Getter for property proyecto.
     * @return Value of property proyecto.
     */
    public Proyecto getProyecto() {
        return this.proyecto;
    }

    /**
     * Setter for property proyecto.
     * @param proyecto New value of property proyecto.
     */
    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }
    /**
     * Holds value of property sucesores.
     */
    private Set<Actividad> sucesores = new HashSet<Actividad>();

    /**
     * Getter for property sucesores.
     * @return Value of property sucesores.
     */
    public Set<Actividad> getSucesores() {
        return this.sucesores;
    }

    /**
     * Setter for property sucesores.
     * @param sucesores New value of property sucesores.
     */
    public void setSucesores(Set<Actividad> sucesores) {
        this.sucesores = sucesores;
    }

    /**
     * Add an element to set property sucesores
     * and sets elements's property superactividad.
     * @param element New element to be added to sucesores.
     */
    public void addToSucesores(Actividad element) {
        element.setSuperactividad(this);
        sucesores.add(element);
    }

    /**
     * Removes and old element from set sucesores
     * and sets element's property superactividad to null.
     * @param old The element to be removed from sucesores
     */
    public void removeFromSucesores(Actividad old) {
        sucesores.remove(old);
        old.setSuperactividad(null);
    }
    /**
     * Holds value of property tiempoEstimado.
     */
    private java.util.Date tiempoEstimado;

    /**
     * Getter for property tiempoEstimado.
     * @return Value of property tiempoEstimado.
     */
    public java.util.Date getTiempoEstimado() {
        return this.tiempoEstimado;
    }

    /**
     * Setter for property tiempoEstimado.
     * @param tiempoEstimado New value of property tiempoEstimado.
     */
    public void setTiempoEstimado(java.util.Date tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }




    public String toString() {
        return "<Actividad id='C" + this.id +
      //idActividad
      "\" descripcion =\"" + descripcion +
      "\" avance =\"" + avance +
      "\" fechaInicio =\"" + fechaInicio +
      "\" fechaFin =\"" + fechaFin +
      //participantes
      //roles
      //prerequisitos
        ((superactividad==null) ? "" : "\" superactividad =\"C" + superactividad.getId()) +

        ((proyecto==null) ? "" : "\" proyecto =\"C" + proyecto.getId()) +

      //sucesores
      "\" tiempoEstimado =\"" + tiempoEstimado +

        "'/>";
    }

}