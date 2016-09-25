package proyectos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import java.util.List;
import ve.usb.cohesion.runtime.Pair;

public class FMetodologia extends org.apache.struts.action.ActionForm {
    
    
    public FMetodologia() {
        super();
        idMetodologia = 0l;
        nombre = "";
        clasificacion = "";
        proyectoModelo = 0l;
        listProyecto = null;

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        idMetodologia = 0l;
        nombre = "";
        clasificacion = "";
        proyectoModelo = 0l;
        listProyecto = null;

    }

    public static FMetodologia clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        FMetodologia fFMetodologia = (FMetodologia) sess.getAttribute("FMetodologia");
        if (fFMetodologia == null) {
            fFMetodologia = new FMetodologia();
            sess.setAttribute("FMetodologia", fFMetodologia);
        } else {
            fFMetodologia.reset(mapping, request);
        }
        return fFMetodologia;
    }

//    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors errors = new ActionErrors();
//
//        return errors;
//    }

    /**
     * Holds value of property idMetodologia.
     */
    private Long idMetodologia;

    /**
     * Getter for property idMetodologia.
     * @return Value of property idMetodologia.
     */
    public Long getIdMetodologia() {
        return this.idMetodologia;
    }

    /**
     * Setter for property idMetodologia.
     * @param idMetodologia New value of property idMetodologia.
     */
    public void setIdMetodologia(Long idMetodologia) {
        this.idMetodologia = idMetodologia;
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
     * Holds value of property clasificacion.
     */
    private String clasificacion;

    /**
     * Getter for property clasificacion.
     * @return Value of property clasificacion.
     */
    public String getClasificacion() {
        return this.clasificacion;
    }

    /**
     * Setter for property clasificacion.
     * @param clasificacion New value of property clasificacion.
     */
    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    /**
     * Holds value of property proyectoModelo.
     */
    private Long proyectoModelo;

    /**
     * Getter for property proyectoModelo.
     * @return Value of property proyectoModelo.
     */
    public Long getProyectoModelo() {
        return this.proyectoModelo;
    }

    /**
     * Setter for property proyectoModelo.
     * @param proyectoModelo New value of property proyectoModelo.
     */
    public void setProyectoModelo(Long proyectoModelo) {
        this.proyectoModelo = proyectoModelo;
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




}