package proyectos.hibernate;



public class ActividadPre implements java.io.Serializable, ve.usb.cohesion.runtime.Auditable {

    /** Creates a new instance of ActividadPre */
    public ActividadPre() {}
    
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
     * Holds value of property idActividadPre.
     */
    private long idActividadPre;

    /**
     * Getter for property idActividadPre.
     * @return Value of property idActividadPre.
     */
    public long getIdActividadPre() {
        return this.idActividadPre;
    }

    /**
     * Setter for property idActividadPre.
     * @param idActividadPre New value of property idActividadPre.
     */
    public void setIdActividadPre(long idActividadPre) {
        this.id = this.idActividadPre = idActividadPre;
    }

    /**
     * Holds value of property prerequisito.
     */
    private Actividad prerequisito;

    /**
     * Getter for property prerequisito.
     * @return Value of property prerequisito.
     */
    public Actividad getPrerequisito() {
        return this.prerequisito;
    }

    /**
     * Setter for property prerequisito.
     * @param prerequisito New value of property prerequisito.
     */
    public void setPrerequisito(Actividad prerequisito) {
        this.prerequisito = prerequisito;
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
        return "<ActividadPre id='C" + this.id +
      //idActividadPre
        ((prerequisito==null) ? "" : "\" prerequisito =\"C" + prerequisito.getId()) +

        ((actividad==null) ? "" : "\" actividad =\"C" + actividad.getId()) +


        "'/>";
    }

}