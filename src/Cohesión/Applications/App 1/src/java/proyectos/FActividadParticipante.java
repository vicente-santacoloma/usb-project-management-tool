package proyectos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import java.util.List;
import ve.usb.cohesion.runtime.Pair;

public class FActividadParticipante extends org.apache.struts.action.ActionForm {
    
    
    public FActividadParticipante() {
        super();
        idActividadParticipante = 0l;
        actividad = 0l;
        listActividad = null;
        participante = 0l;
        listParticipantes = null;
        tiempoParticipacion = "";

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        idActividadParticipante = 0l;
        actividad = 0l;
        listActividad = null;
        participante = 0l;
        listParticipantes = null;
        tiempoParticipacion = "";

    }

    public static FActividadParticipante clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        FActividadParticipante fFActividadParticipante = (FActividadParticipante) sess.getAttribute("FActividadParticipante");
        if (fFActividadParticipante == null) {
            fFActividadParticipante = new FActividadParticipante();
            sess.setAttribute("FActividadParticipante", fFActividadParticipante);
        } else {
            fFActividadParticipante.reset(mapping, request);
        }
        return fFActividadParticipante;
    }

//    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors errors = new ActionErrors();
//
//        return errors;
//    }

    /**
     * Holds value of property idActividadParticipante.
     */
    private Long idActividadParticipante;

    /**
     * Getter for property idActividadParticipante.
     * @return Value of property idActividadParticipante.
     */
    public Long getIdActividadParticipante() {
        return this.idActividadParticipante;
    }

    /**
     * Setter for property idActividadParticipante.
     * @param idActividadParticipante New value of property idActividadParticipante.
     */
    public void setIdActividadParticipante(Long idActividadParticipante) {
        this.idActividadParticipante = idActividadParticipante;
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
     * Holds value of property participante.
     */
    private Long participante;

    /**
     * Getter for property participante.
     * @return Value of property participante.
     */
    public Long getParticipante() {
        return this.participante;
    }

    /**
     * Setter for property participante.
     * @param participante New value of property participante.
     */
    public void setParticipante(Long participante) {
        this.participante = participante;
    }

    /**
     * Holds value of property listParticipantes.
     */
    private List<Pair> listParticipantes;

    /**
     * Getter for property listParticipantes.
     * @return Value of property listParticipantes.
     */
    public List<Pair> getListParticipantes() {
        return this.listParticipantes;
    }

    /**
     * Setter for property listParticipantes.
     * @param listParticipantes New value of property listParticipantes.
     */
    public void setListParticipantes(List<Pair> listParticipantes) {
        this.listParticipantes = listParticipantes;
    }

    /**
     * Holds value of property tiempoParticipacion.
     */
    private String tiempoParticipacion;

    /**
     * Getter for property tiempoParticipacion.
     * @return Value of property tiempoParticipacion.
     */
    public String getTiempoParticipacion() {
        return this.tiempoParticipacion;
    }

    /**
     * Setter for property tiempoParticipacion.
     * @param tiempoParticipacion New value of property tiempoParticipacion.
     */
    public void setTiempoParticipacion(String tiempoParticipacion) {
        this.tiempoParticipacion = tiempoParticipacion;
    }




}