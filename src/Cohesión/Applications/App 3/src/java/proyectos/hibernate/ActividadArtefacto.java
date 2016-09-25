package proyectos.hibernate;



public class ActividadArtefacto implements java.io.Serializable, ve.usb.cohesion.runtime.Auditable {

    /** Creates a new instance of ActividadArtefacto */
    public ActividadArtefacto() {}
    
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
     * Holds value of property idActividadArtefacto.
     */
    private long idActividadArtefacto;

    /**
     * Getter for property idActividadArtefacto.
     * @return Value of property idActividadArtefacto.
     */
    public long getIdActividadArtefacto() {
        return this.idActividadArtefacto;
    }

    /**
     * Setter for property idActividadArtefacto.
     * @param idActividadArtefacto New value of property idActividadArtefacto.
     */
    public void setIdActividadArtefacto(long idActividadArtefacto) {
        this.id = this.idActividadArtefacto = idActividadArtefacto;
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
    /**
     * Holds value of property artefacto.
     */
    private Artefacto artefacto;

    /**
     * Getter for property artefacto.
     * @return Value of property artefacto.
     */
    public Artefacto getArtefacto() {
        return this.artefacto;
    }

    /**
     * Setter for property artefacto.
     * @param artefacto New value of property artefacto.
     */
    public void setArtefacto(Artefacto artefacto) {
        this.artefacto = artefacto;
    }



    public String toString() {
        return "<ActividadArtefacto id='C" + this.id +
      //idActividadArtefacto
        ((actividad==null) ? "" : "\" actividad =\"C" + actividad.getId()) +

        ((artefacto==null) ? "" : "\" artefacto =\"C" + artefacto.getId()) +


        "'/>";
    }

}