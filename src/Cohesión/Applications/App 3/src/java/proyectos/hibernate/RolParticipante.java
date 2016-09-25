package proyectos.hibernate;



public class RolParticipante implements java.io.Serializable, ve.usb.cohesion.runtime.Auditable {

    /** Creates a new instance of RolParticipante */
    public RolParticipante() {}
    
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
     * Holds value of property idRolParticipante.
     */
    private long idRolParticipante;

    /**
     * Getter for property idRolParticipante.
     * @return Value of property idRolParticipante.
     */
    public long getIdRolParticipante() {
        return this.idRolParticipante;
    }

    /**
     * Setter for property idRolParticipante.
     * @param idRolParticipante New value of property idRolParticipante.
     */
    public void setIdRolParticipante(long idRolParticipante) {
        this.id = this.idRolParticipante = idRolParticipante;
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



    public String toString() {
        return "<RolParticipante id='C" + this.id +
      //idRolParticipante
        ((rol==null) ? "" : "\" rol =\"C" + rol.getId()) +

        ((participante==null) ? "" : "\" participante =\"C" + participante.getId()) +


        "'/>";
    }

}