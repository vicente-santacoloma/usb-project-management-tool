package proyectos.hibernate;



public class RolActividad implements java.io.Serializable, ve.usb.cohesion.runtime.Auditable {

    /** Creates a new instance of RolActividad */
    public RolActividad() {}
    
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
     * Holds value of property idRolActividad.
     */
    private long idRolActividad;

    /**
     * Getter for property idRolActividad.
     * @return Value of property idRolActividad.
     */
    public long getIdRolActividad() {
        return this.idRolActividad;
    }

    /**
     * Setter for property idRolActividad.
     * @param idRolActividad New value of property idRolActividad.
     */
    public void setIdRolActividad(long idRolActividad) {
        this.id = this.idRolActividad = idRolActividad;
    }

    /**
     * Holds value of property rol.
     */
    private Rol rol;

    /**
     * Getter for property rol.
     * @return Value of property rol.
     */
    public Rol getRol() {
        return this.rol;
    }

    /**
     * Setter for property rol.
     * @param rol New value of property rol.
     */
    public void setRol(Rol rol) {
        this.rol = rol;
    }
    /**
     * Holds value of property actividad.
     */
    private Actividad actividad;

    /**
     * Getter for property actividad.
     * @return Value of property actividad.
     */
    public Actividad getActividad() {
        return this.actividad;
    }

    /**
     * Setter for property actividad.
     * @param actividad New value of property actividad.
     */
    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }



    public String toString() {
        return "<RolActividad id='C" + this.id +
      //idRolActividad
        ((rol==null) ? "" : "\" rol =\"C" + rol.getId()) +

        ((actividad==null) ? "" : "\" actividad =\"C" + actividad.getId()) +


        "'/>";
    }

}