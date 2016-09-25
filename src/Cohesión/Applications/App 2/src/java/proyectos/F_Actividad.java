package proyectos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import java.util.List;
import ve.usb.cohesion.runtime.Pair;

public class F_Actividad extends org.apache.struts.action.ActionForm {
    
    
    public F_Actividad() {
        super();
        idActividad = 0l;
        descripcion = "";
        avance = 0;
        fechaInicio = null;
        fechaFin = null;
        superactividad = 0l;
        listActividad = null;
        proyecto = 0l;
        listProyecto = null;
        tiempoEstimado = "";

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        idActividad = 0l;
        descripcion = "";
        avance = 0;
        fechaInicio = null;
        fechaFin = null;
        superactividad = 0l;
        listActividad = null;
        proyecto = 0l;
        listProyecto = null;
        tiempoEstimado = "";

    }

    public static F_Actividad clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        F_Actividad fF_Actividad = (F_Actividad) sess.getAttribute("F_Actividad");
        if (fF_Actividad == null) {
            fF_Actividad = new F_Actividad();
            sess.setAttribute("F_Actividad", fF_Actividad);
        } else {
            fF_Actividad.reset(mapping, request);
        }
        return fF_Actividad;
    }

//    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors errors = new ActionErrors();
//
//        return errors;
//    }

    /**
     * Holds value of property idActividad.
     */
    private Long idActividad;

    /**
     * Getter for property idActividad.
     * @return Value of property idActividad.
     */
    public Long getIdActividad() {
        return this.idActividad;
    }

    /**
     * Setter for property idActividad.
     * @param idActividad New value of property idActividad.
     */
    public void setIdActividad(Long idActividad) {
        this.idActividad = idActividad;
    }

    /**
     * Holds value of property descripcion.
     */
    private String descripcion;

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
    private String fechaInicio;

    /**
     * Getter for property fechaInicio.
     * @return Value of property fechaInicio.
     */
    public String getFechaInicio() {
        return this.fechaInicio;
    }

    /**
     * Setter for property fechaInicio.
     * @param fechaInicio New value of property fechaInicio.
     */
    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * Holds value of property fechaFin.
     */
    private String fechaFin;

    /**
     * Getter for property fechaFin.
     * @return Value of property fechaFin.
     */
    public String getFechaFin() {
        return this.fechaFin;
    }

    /**
     * Setter for property fechaFin.
     * @param fechaFin New value of property fechaFin.
     */
    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    /**
     * Holds value of property superactividad.
     */
    private Long superactividad;

    /**
     * Getter for property superactividad.
     * @return Value of property superactividad.
     */
    public Long getSuperactividad() {
        return this.superactividad;
    }

    /**
     * Setter for property superactividad.
     * @param superactividad New value of property superactividad.
     */
    public void setSuperactividad(Long superactividad) {
        this.superactividad = superactividad;
    }

    /**
     * Holds value of property listActividad.
     */
    private List<Pair> listActividad;

    /**
     * Getter for property listActividad.
     * @return Value of property listActividad.
     */
    public List<Pair> getListActividad() {
        return this.listActividad;
    }

    /**
     * Setter for property listActividad.
     * @param listActividad New value of property listActividad.
     */
    public void setListActividad(List<Pair> listActividad) {
        this.listActividad = listActividad;
    }

    /**
     * Holds value of property proyecto.
     */
    private Long proyecto;

    /**
     * Getter for property proyecto.
     * @return Value of property proyecto.
     */
    public Long getProyecto() {
        return this.proyecto;
    }

    /**
     * Setter for property proyecto.
     * @param proyecto New value of property proyecto.
     */
    public void setProyecto(Long proyecto) {
        this.proyecto = proyecto;
    }

    /**
     * Holds value of property listProyecto.
     */
    private List<Pair> listProyecto;

    /**
     * Getter for property listProyecto.
     * @return Value of property listProyecto.
     */
    public List<Pair> getListProyecto() {
        return this.listProyecto;
    }

    /**
     * Setter for property listProyecto.
     * @param listProyecto New value of property listProyecto.
     */
    public void setListProyecto(List<Pair> listProyecto) {
        this.listProyecto = listProyecto;
    }

    /**
     * Holds value of property tiempoEstimado.
     */
    private String tiempoEstimado;

    /**
     * Getter for property tiempoEstimado.
     * @return Value of property tiempoEstimado.
     */
    public String getTiempoEstimado() {
        return this.tiempoEstimado;
    }

    /**
     * Setter for property tiempoEstimado.
     * @param tiempoEstimado New value of property tiempoEstimado.
     */
    public void setTiempoEstimado(String tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }




}