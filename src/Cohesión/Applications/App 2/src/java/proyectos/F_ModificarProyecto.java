package proyectos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class F_ModificarProyecto extends org.apache.struts.action.ActionForm {
    
    
    public F_ModificarProyecto() {
        super();
        titulo = "";
        tiempoEstimado = "";
        descripcion = "";
        fechaInicio = "";
        fechaFin = "";
        costo = 0;
        metodologia = "";
        actividades = "";
        participantes = "";
        lider = "";

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        titulo = "";
        tiempoEstimado = "";
        descripcion = "";
        fechaInicio = "";
        fechaFin = "";
        costo = 0;
        metodologia = "";
        actividades = "";
        participantes = "";
        lider = "";

    }

    public static F_ModificarProyecto clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        F_ModificarProyecto fF_ModificarProyecto = (F_ModificarProyecto) sess.getAttribute("F_ModificarProyecto");
        if (fF_ModificarProyecto == null) {
            fF_ModificarProyecto = new F_ModificarProyecto();
            sess.setAttribute("F_ModificarProyecto", fF_ModificarProyecto);
        } else {
            fF_ModificarProyecto.reset(mapping, request);
        }
        return fF_ModificarProyecto;
    }

//    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors errors = new ActionErrors();
//
//        return errors;
//    }

    /**
     * Holds value of property titulo.
     */
    private String titulo;

    /**
     * Getter for property titulo.
     * @return Value of property titulo.
     */
    public String getTitulo() {
        return this.titulo;
    }

    /**
     * Setter for property titulo.
     * @param titulo New value of property titulo.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
     * Holds value of property metodologia.
     */
    private String metodologia;

    /**
     * Getter for property metodologia.
     * @return Value of property metodologia.
     */
    public String getMetodologia() {
        return this.metodologia;
    }

    /**
     * Setter for property metodologia.
     * @param metodologia New value of property metodologia.
     */
    public void setMetodologia(String metodologia) {
        this.metodologia = metodologia;
    }

    /**
     * Holds value of property actividades.
     */
    private String actividades;

    /**
     * Getter for property actividades.
     * @return Value of property actividades.
     */
    public String getActividades() {
        return this.actividades;
    }

    /**
     * Setter for property actividades.
     * @param actividades New value of property actividades.
     */
    public void setActividades(String actividades) {
        this.actividades = actividades;
    }

    /**
     * Holds value of property participantes.
     */
    private String participantes;

    /**
     * Getter for property participantes.
     * @return Value of property participantes.
     */
    public String getParticipantes() {
        return this.participantes;
    }

    /**
     * Setter for property participantes.
     * @param participantes New value of property participantes.
     */
    public void setParticipantes(String participantes) {
        this.participantes = participantes;
    }

    /**
     * Holds value of property lider.
     */
    private String lider;

    /**
     * Getter for property lider.
     * @return Value of property lider.
     */
    public String getLider() {
        return this.lider;
    }

    /**
     * Setter for property lider.
     * @param lider New value of property lider.
     */
    public void setLider(String lider) {
        this.lider = lider;
    }




}