package proyectos.hibernate;



public class ActividadParticipante implements java.io.Serializable, ve.usb.cohesion.runtime.Auditable {

    /** Creates a new instance of ActividadParticipante */
    public ActividadParticipante() {}
    
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
     * Holds value of property idActividadParticipante.
     */
    private long idActividadParticipante;

    /**
     * Getter for property idActividadParticipante.
     * @return Value of property idActividadParticipante.
     */
    public long getIdActividadParticipante() {
        return this.idActividadParticipante;
    }

    /**
     * Setter for property idActividadParticipante.
     * @param idActividadParticipante New value of property idActividadParticipante.
     */
    public void setIdActividadParticipante(long idActividadParticipante) {
        this.id = this.idActividadParticipante = idActividadParticipante;
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
     * Holds value of property participante.
     */
    private Participante participante;

    /**
     * Getter for property participante.
     * @return Value of property participante.
     */
    public Participante getParticipante() {
        return this.participante;
    }

    /**
     * Setter for property participante.
     * @param participante New value of property participante.
     */
    public void setParticipante(Participante participante) {
        this.participante = participante;
    }
    /**
     * Holds value of property tiempoParticipacion.
     */
    private java.util.Date tiempoParticipacion;

    /**
     * Getter for property tiempoParticipacion.
     * @return Value of property tiempoParticipacion.
     */
    public java.util.Date getTiempoParticipacion() {
        return this.tiempoParticipacion;
    }

    /**
     * Setter for property tiempoParticipacion.
     * @param tiempoParticipacion New value of property tiempoParticipacion.
     */
    public void setTiempoParticipacion(java.util.Date tiempoParticipacion) {
        this.tiempoParticipacion = tiempoParticipacion;
    }




    public String toString() {
        return "<ActividadParticipante id='C" + this.id +
      //idActividadParticipante
        ((actividad==null) ? "" : "\" actividad =\"C" + actividad.getId()) +

        ((participante==null) ? "" : "\" participante =\"C" + participante.getId()) +

      "\" tiempoParticipacion =\"" + tiempoParticipacion +

        "'/>";
    }

}