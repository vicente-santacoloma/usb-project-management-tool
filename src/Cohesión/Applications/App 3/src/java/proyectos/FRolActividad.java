package proyectos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import java.util.List;
import ve.usb.cohesion.runtime.Pair;

public class FRolActividad extends org.apache.struts.action.ActionForm {
    
    
    public FRolActividad() {
        super();
        idRolActividad = 0l;
        rol = 0l;
        listRol = null;
        actividad = 0l;
        listActividad = null;

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        idRolActividad = 0l;
        rol = 0l;
        listRol = null;
        actividad = 0l;
        listActividad = null;

    }

    public static FRolActividad clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        FRolActividad fFRolActividad = (FRolActividad) sess.getAttribute("FRolActividad");
        if (fFRolActividad == null) {
            fFRolActividad = new FRolActividad();
            sess.setAttribute("FRolActividad", fFRolActividad);
        } else {
            fFRolActividad.reset(mapping, request);
        }
        return fFRolActividad;
    }

//    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors errors = new ActionErrors();
//
//        return errors;
//    }

    /**
     * Holds value of property idRolActividad.
     */
    private Long idRolActividad;

    /**
     * Getter for property idRolActividad.
     * @return Value of property idRolActividad.
     */
    public Long getIdRolActividad() {
        return this.idRolActividad;
    }

    /**
     * Setter for property idRolActividad.
     * @param idRolActividad New value of property idRolActividad.
     */
    public void setIdRolActividad(Long idRolActividad) {
        this.idRolActividad = idRolActividad;
    }

    /**
     * Holds value of property rol.
     */
    private Long rol;

    /**
     * Getter for property rol.
     * @return Value of property rol.
     */
    public Long getRol() {
        return this.rol;
    }

    /**
     * Setter for property rol.
     * @param rol New value of property rol.
     */
    public void setRol(Long rol) {
        this.rol = rol;
    }

    /**
     * Holds value of property listRol.
     */
    private List<Pair> listRol;

    /**
     * Getter for property listRol.
     * @return Value of property listRol.
     */
    public List<Pair> getListRol() {
        return this.listRol;
    }

    /**
     * Setter for property listRol.
     * @param listRol New value of property listRol.
     */
    public void setListRol(List<Pair> listRol) {
        this.listRol = listRol;
    }

    /**
     * Holds value of property actividad.
     */
    private Long actividad;

    /**
     * Getter for property actividad.
     * @return Value of property actividad.
     */
    public Long getActividad() {
        return this.actividad;
    }

    /**
     * Setter for property actividad.
     * @param actividad New value of property actividad.
     */
    public void setActividad(Long actividad) {
        this.actividad = actividad;
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




}