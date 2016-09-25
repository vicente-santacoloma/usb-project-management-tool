package proyectos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import java.util.List;
import ve.usb.cohesion.runtime.Pair;

public class FProyecto extends org.apache.struts.action.ActionForm {
    
    
    public FProyecto() {
        super();
        idProyecto = 0l;
        nombre = "";
        tiempo_Estimado = 0;
        area = "";
        descripcion = "";
        fecha_de_Inicio = null;
        fecha_de_Fin = null;
        costo = 0;
        encargado = "";
        metodologia = 0l;
        listMetodologia = null;

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        idProyecto = 0l;
        nombre = "";
        tiempo_Estimado = 0;
        area = "";
        descripcion = "";
        fecha_de_Inicio = null;
        fecha_de_Fin = null;
        costo = 0;
        encargado = "";
        metodologia = 0l;
        listMetodologia = null;

    }

    public static FProyecto clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        FProyecto fFProyecto = (FProyecto) sess.getAttribute("FProyecto");
        if (fFProyecto == null) {
            fFProyecto = new FProyecto();
            sess.setAttribute("FProyecto", fFProyecto);
        } else {
            fFProyecto.reset(mapping, request);
        }
        return fFProyecto;
    }

//    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors errors = new ActionErrors();
//
//        return errors;
//    }

    /**
     * Holds value of property idProyecto.
     */
    private Long idProyecto;

    /**
     * Getter for property idProyecto.
     * @return Value of property idProyecto.
     */
    public Long getIdProyecto() {
        return this.idProyecto;
    }

    /**
     * Setter for property idProyecto.
     * @param idProyecto New value of property idProyecto.
     */
    public void setIdProyecto(Long idProyecto) {
        this.idProyecto = idProyecto;
    }

    /**
     * Holds value of property nombre.
     */
    private String nombre;

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
    private String area;

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
     * Holds value of property fecha_de_Inicio.
     */
    private String fecha_de_Inicio;

    /**
     * Getter for property fecha_de_Inicio.
     * @return Value of property fecha_de_Inicio.
     */
    public String getFecha_de_Inicio() {
        return this.fecha_de_Inicio;
    }

    /**
     * Setter for property fecha_de_Inicio.
     * @param fecha_de_Inicio New value of property fecha_de_Inicio.
     */
    public void setFecha_de_Inicio(String fecha_de_Inicio) {
        this.fecha_de_Inicio = fecha_de_Inicio;
    }

    /**
     * Holds value of property fecha_de_Fin.
     */
    private String fecha_de_Fin;

    /**
     * Getter for property fecha_de_Fin.
     * @return Value of property fecha_de_Fin.
     */
    public String getFecha_de_Fin() {
        return this.fecha_de_Fin;
    }

    /**
     * Setter for property fecha_de_Fin.
     * @param fecha_de_Fin New value of property fecha_de_Fin.
     */
    public void setFecha_de_Fin(String fecha_de_Fin) {
        this.fecha_de_Fin = fecha_de_Fin;
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
    private String encargado;

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
    private Long metodologia;

    /**
     * Getter for property metodologia.
     * @return Value of property metodologia.
     */
    public Long getMetodologia() {
        return this.metodologia;
    }

    /**
     * Setter for property metodologia.
     * @param metodologia New value of property metodologia.
     */
    public void setMetodologia(Long metodologia) {
        this.metodologia = metodologia;
    }

    /**
     * Holds value of property listMetodologia.
     */
    private List<Pair> listMetodologia;

    /**
     * Getter for property listMetodologia.
     * @return Value of property listMetodologia.
     */
    public List<Pair> getListMetodologia() {
        return this.listMetodologia;
    }

    /**
     * Setter for property listMetodologia.
     * @param listMetodologia New value of property listMetodologia.
     */
    public void setListMetodologia(List<Pair> listMetodologia) {
        this.listMetodologia = listMetodologia;
    }




}