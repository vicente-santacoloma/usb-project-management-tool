package proyectos.hibernate;



public class MetodologiaProceso implements java.io.Serializable, ve.usb.cohesion.runtime.Auditable {

    /** Creates a new instance of MetodologiaProceso */
    public MetodologiaProceso() {}
    
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
     * Holds value of property idMetodologiaProceso.
     */
    private long idMetodologiaProceso;

    /**
     * Getter for property idMetodologiaProceso.
     * @return Value of property idMetodologiaProceso.
     */
    public long getIdMetodologiaProceso() {
        return this.idMetodologiaProceso;
    }

    /**
     * Setter for property idMetodologiaProceso.
     * @param idMetodologiaProceso New value of property idMetodologiaProceso.
     */
    public void setIdMetodologiaProceso(long idMetodologiaProceso) {
        this.id = this.idMetodologiaProceso = idMetodologiaProceso;
    }

    /**
     * Holds value of property metodologia.
     */
    private Metodologia metodologia;

    /**
     * Getter for property metodologia.
     * @return Value of property metodologia.
     */
    public Metodologia getMetodologia() {
        return this.metodologia;
    }

    /**
     * Setter for property metodologia.
     * @param metodologia New value of property metodologia.
     */
    public void setMetodologia(Metodologia metodologia) {
        this.metodologia = metodologia;
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
        return "<MetodologiaProceso id='C" + this.id +
      //idMetodologiaProceso
        ((metodologia==null) ? "" : "\" metodologia =\"C" + metodologia.getId()) +

        ((procesoSoftware==null) ? "" : "\" procesoSoftware =\"C" + procesoSoftware.getId()) +


        "'/>";
    }

}