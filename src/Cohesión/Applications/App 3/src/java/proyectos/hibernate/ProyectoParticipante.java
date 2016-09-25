package proyectos.hibernate;

import ve.usb.cohesion.runtime.LocalDate;

public class ProyectoParticipante implements java.io.Serializable, ve.usb.cohesion.runtime.Auditable {

    /** Creates a new instance of ProyectoParticipante */
    public ProyectoParticipante() {}
    
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
     * Holds value of property idProyectoParticipante.
     */
    private long idProyectoParticipante;

    /**
     * Getter for property idProyectoParticipante.
     * @return Value of property idProyectoParticipante.
     */
    public long getIdProyectoParticipante() {
        return this.idProyectoParticipante;
    }

    /**
     * Setter for property idProyectoParticipante.
     * @param idProyectoParticipante New value of property idProyectoParticipante.
     */
    public void setIdProyectoParticipante(long idProyectoParticipante) {
        this.id = this.idProyectoParticipante = idProyectoParticipante;
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
     * Holds value of property participante.
     */
    private Participantes participante;

    /**
     * Getter for property participante.
     * @return Value of property participante.
     */
    public Participantes getParticipante() {
        return this.participante;
    }

    /**
     * Setter for property participante.
     * @param participante New value of property participante.
     */
    public void setParticipante(Participantes participante) {
        this.participante = participante;
    }
    /**
     * Holds value of property fechaIngreso.
     */
    private java.util.Date fechaIngreso;

    /**
     * Getter for property fechaIngreso.
     * @return Value of property fechaIngreso.
     */
    public java.util.Date getFechaIngreso() {
        return this.fechaIngreso;
    }

    /**
     * Setter for property fechaIngreso.
     * @param fechaIngreso New value of property fechaIngreso.
     */
    public void setFechaIngreso(java.util.Date fechaIngreso) {
        if (fechaIngreso==null || fechaIngreso instanceof LocalDate)
            this.fechaIngreso = fechaIngreso;
        else this.fechaIngreso = new LocalDate(fechaIngreso);
    }




    public String toString() {
        return "<ProyectoParticipante id='C" + this.id +
      //idProyectoParticipante
        ((proyecto==null) ? "" : "\" proyecto =\"C" + proyecto.getId()) +

        ((participante==null) ? "" : "\" participante =\"C" + participante.getId()) +

      "\" fechaIngreso =\"" + fechaIngreso +

        "'/>";
    }

}