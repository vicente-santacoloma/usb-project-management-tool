package proyectos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import java.util.List;
import ve.usb.cohesion.runtime.Pair;

public class FActividadArtefacto extends org.apache.struts.action.ActionForm {
    
    
    public FActividadArtefacto() {
        super();
        idActividadArtefacto = 0l;
        actividad = 0l;
        listActividad = null;
        artefacto = 0l;
        listArtefacto = null;

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        idActividadArtefacto = 0l;
        actividad = 0l;
        listActividad = null;
        artefacto = 0l;
        listArtefacto = null;

    }

    public static FActividadArtefacto clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        FActividadArtefacto fFActividadArtefacto = (FActividadArtefacto) sess.getAttribute("FActividadArtefacto");
        if (fFActividadArtefacto == null) {
            fFActividadArtefacto = new FActividadArtefacto();
            sess.setAttribute("FActividadArtefacto", fFActividadArtefacto);
        } else {
            fFActividadArtefacto.reset(mapping, request);
        }
        return fFActividadArtefacto;
    }

//    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors errors = new ActionErrors();
//
//        return errors;
//    }

    /**
     * Holds value of property idActividadArtefacto.
     */
    private Long idActividadArtefacto;

    /**
     * Getter for property idActividadArtefacto.
     * @return Value of property idActividadArtefacto.
     */
    public Long getIdActividadArtefacto() {
        return this.idActividadArtefacto;
    }

    /**
     * Setter for property idActividadArtefacto.
     * @param idActividadArtefacto New value of property idActividadArtefacto.
     */
    public void setIdActividadArtefacto(Long idActividadArtefacto) {
        this.idActividadArtefacto = idActividadArtefacto;
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

    /**
     * Holds value of property artefacto.
     */
    private Long artefacto;

    /**
     * Getter for property artefacto.
     * @return Value of property artefacto.
     */
    public Long getArtefacto() {
        return this.artefacto;
    }

    /**
     * Setter for property artefacto.
     * @param artefacto New value of property artefacto.
     */
    public void setArtefacto(Long artefacto) {
        this.artefacto = artefacto;
    }

    /**
     * Holds value of property listArtefacto.
     */
    private List<Pair> listArtefacto;

    /**
     * Getter for property listArtefacto.
     * @return Value of property listArtefacto.
     */
    public List<Pair> getListArtefacto() {
        return this.listArtefacto;
    }

    /**
     * Setter for property listArtefacto.
     * @param listArtefacto New value of property listArtefacto.
     */
    public void setListArtefacto(List<Pair> listArtefacto) {
        this.listArtefacto = listArtefacto;
    }




}