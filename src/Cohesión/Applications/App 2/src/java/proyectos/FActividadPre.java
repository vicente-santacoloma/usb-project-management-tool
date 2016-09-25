package proyectos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import java.util.List;
import ve.usb.cohesion.runtime.Pair;

public class FActividadPre extends org.apache.struts.action.ActionForm {
    
    
    public FActividadPre() {
        super();
        idActividadPre = 0l;
        prerequisito = 0l;
        listActividad = null;
        actividad = 0l;

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        idActividadPre = 0l;
        prerequisito = 0l;
        listActividad = null;
        actividad = 0l;

    }

    public static FActividadPre clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        FActividadPre fFActividadPre = (FActividadPre) sess.getAttribute("FActividadPre");
        if (fFActividadPre == null) {
            fFActividadPre = new FActividadPre();
            sess.setAttribute("FActividadPre", fFActividadPre);
        } else {
            fFActividadPre.reset(mapping, request);
        }
        return fFActividadPre;
    }

//    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors errors = new ActionErrors();
//
//        return errors;
//    }

    /**
     * Holds value of property idActividadPre.
     */
    private Long idActividadPre;

    /**
     * Getter for property idActividadPre.
     * @return Value of property idActividadPre.
     */
    public Long getIdActividadPre() {
        return this.idActividadPre;
    }

    /**
     * Setter for property idActividadPre.
     * @param idActividadPre New value of property idActividadPre.
     */
    public void setIdActividadPre(Long idActividadPre) {
        this.idActividadPre = idActividadPre;
    }

    /**
     * Holds value of property prerequisito.
     */
    private Long prerequisito;

    /**
     * Getter for property prerequisito.
     * @return Value of property prerequisito.
     */
    public Long getPrerequisito() {
        return this.prerequisito;
    }

    /**
     * Setter for property prerequisito.
     * @param prerequisito New value of property prerequisito.
     */
    public void setPrerequisito(Long prerequisito) {
        this.prerequisito = prerequisito;
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




}