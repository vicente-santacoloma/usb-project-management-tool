package proyectos.hibernate;



public class RolProceso implements java.io.Serializable, ve.usb.cohesion.runtime.Auditable {

    /** Creates a new instance of RolProceso */
    public RolProceso() {}
    
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
     * Holds value of property idRolProceso.
     */
    private long idRolProceso;

    /**
     * Getter for property idRolProceso.
     * @return Value of property idRolProceso.
     */
    public long getIdRolProceso() {
        return this.idRolProceso;
    }

    /**
     * Setter for property idRolProceso.
     * @param idRolProceso New value of property idRolProceso.
     */
    public void setIdRolProceso(long idRolProceso) {
        this.id = this.idRolProceso = idRolProceso;
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
     * Holds value of property procesoSoftware.
     */
    private ProcesoSoftware procesoSoftware;

    /**
     * Getter for property procesoSoftware.
     * @return Value of property procesoSoftware.
     */
    public ProcesoSoftware getProcesoSoftware() {
        return this.procesoSoftware;
    }

    /**
     * Setter for property procesoSoftware.
     * @param procesoSoftware New value of property procesoSoftware.
     */
    public void setProcesoSoftware(ProcesoSoftware procesoSoftware) {
        this.procesoSoftware = procesoSoftware;
    }



    public String toString() {
        return "<RolProceso id='C" + this.id +
      //idRolProceso
        ((rol==null) ? "" : "\" rol =\"C" + rol.getId()) +

        ((procesoSoftware==null) ? "" : "\" procesoSoftware =\"C" + procesoSoftware.getId()) +


        "'/>";
    }

}