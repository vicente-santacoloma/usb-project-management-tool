package proyectos.hibernate;

import ve.usb.cohesion.runtime.LocalDate;import java.util.HashSet;
import java.util.Set;

public class Proyecto implements java.io.Serializable, ve.usb.cohesion.runtime.Auditable {

    /** Creates a new instance of Proyecto */
    public Proyecto() {}
    
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
     * Holds value of property idProyecto.
     */
    private long idProyecto;

    /**
     * Getter for property idProyecto.
     * @return Value of property idProyecto.
     */
    public long getIdProyecto() {
        return this.idProyecto;
    }

    /**
     * Setter for property idProyecto.
     * @param idProyecto New value of property idProyecto.
     */
    public void setIdProyecto(long idProyecto) {
        this.id = this.idProyecto = idProyecto;
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
     * Holds value of property tiempo_Estimado.
     */
    private int tiempo_Estimado;

    /**
     * Getter for property tiempo_Estimado.
     * @return Value of property tiempo_Estimado.
     */
    public int getTiempo_Estimado() {
        return this.tiempo_Estimado;
    }

    /**
     * Setter for property tiempo_Estimado.
     * @param tiempo_Estimado New value of property tiempo_Estimado.
     */
    public void setTiempo_Estimado(int tiempo_Estimado) {
        this.tiempo_Estimado = tiempo_Estimado;
    }

    /**
     * Holds value of property area.
     */
    private String area = "";

    /**
     * Getter for property area.
     * @return Value of property area.
     */
    public String getArea() {
        return this.area;
    }

    /**
     * Setter for property area.
     * @param area New value of property area.
     */
    public void setArea(String area) {
        this.area = area;
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
     * Holds value of property fecha_de_Inicio.
     */
    private java.util.Date fecha_de_Inicio;

    /**
     * Getter for property fecha_de_Inicio.
     * @return Value of property fecha_de_Inicio.
     */
    public java.util.Date getFecha_de_Inicio() {
        return this.fecha_de_Inicio;
    }

    /**
     * Setter for property fecha_de_Inicio.
     * @param fecha_de_Inicio New value of property fecha_de_Inicio.
     */
    public void setFecha_de_Inicio(java.util.Date fecha_de_Inicio) {
        if (fecha_de_Inicio==null || fecha_de_Inicio instanceof LocalDate)
            this.fecha_de_Inicio = fecha_de_Inicio;
        else this.fecha_de_Inicio = new LocalDate(fecha_de_Inicio);
    }

    /**
     * Holds value of property fecha_de_Fin.
     */
    private java.util.Date fecha_de_Fin;

    /**
     * Getter for property fecha_de_Fin.
     * @return Value of property fecha_de_Fin.
     */
    public java.util.Date getFecha_de_Fin() {
        return this.fecha_de_Fin;
    }

    /**
     * Setter for property fecha_de_Fin.
     * @param fecha_de_Fin New value of property fecha_de_Fin.
     */
    public void setFecha_de_Fin(java.util.Date fecha_de_Fin) {
        if (fecha_de_Fin==null || fecha_de_Fin instanceof LocalDate)
            this.fecha_de_Fin = fecha_de_Fin;
        else this.fecha_de_Fin = new LocalDate(fecha_de_Fin);
    }

    /**
     * Holds value of property costo.
     */
    private int costo;

    /**
     * Getter for property costo.
     * @return Value of property costo.
     */
    public int getCosto() {
        return this.costo;
    }

    /**
     * Setter for property costo.
     * @param costo New value of property costo.
     */
    public void setCosto(int costo) {
        this.costo = costo;
    }

    /**
     * Holds value of property encargado.
     */
    private String encargado = "";

    /**
     * Getter for property encargado.
     * @return Value of property encargado.
     */
    public String getEncargado() {
        return this.encargado;
    }

    /**
     * Setter for property encargado.
     * @param encargado New value of property encargado.
     */
    public void setEncargado(String encargado) {
        this.encargado = encargado;
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
     * Holds value of property actividades.
     */
    private Set<Actividad> actividades = new HashSet<Actividad>();

    /**
     * Getter for property actividades.
     * @return Value of property actividades.
     */
    public Set<Actividad> getActividades() {
        return this.actividades;
    }

    /**
     * Setter for property actividades.
     * @param actividades New value of property actividades.
     */
    public void setActividades(Set<Actividad> actividades) {
        this.actividades = actividades;
    }

    /**
     * Add an element to set property actividades
     * and sets elements's property proyecto.
     * @param element New element to be added to actividades.
     */
    public void addToActividades(Actividad element) {
        element.setProyecto(this);
        actividades.add(element);
    }

    /**
     * Removes and old element from set actividades
     * and sets element's property proyecto to null.
     * @param old The element to be removed from actividades
     */
    public void removeFromActividades(Actividad old) {
        actividades.remove(old);
        old.setProyecto(null);
    }



    public String toString() {
        return "<Proyecto id='C" + this.id +
      //idProyecto
      "\" nombre =\"" + nombre +
      "\" tiempo_Estimado =\"" + tiempo_Estimado +
      "\" area =\"" + area +
      "\" descripcion =\"" + descripcion +
      "\" fecha_de_Inicio =\"" + fecha_de_Inicio +
      "\" fecha_de_Fin =\"" + fecha_de_Fin +
      "\" costo =\"" + costo +
      "\" encargado =\"" + encargado +
        ((metodologia==null) ? "" : "\" metodologia =\"C" + metodologia.getId()) +

      //actividades

        "'/>";
    }

}