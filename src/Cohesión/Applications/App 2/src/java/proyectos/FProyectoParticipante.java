package proyectos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import java.util.List;
import ve.usb.cohesion.runtime.Pair;

public class FProyectoParticipante extends org.apache.struts.action.ActionForm {
    
    
    public FProyectoParticipante() {
        super();
        idProyectoParticipante = 0l;
        proyecto = 0l;
        listProyecto = null;
        participante = 0l;
        listParticipantes = null;
        fechaIngreso = null;

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        idProyectoParticipante = 0l;
        proyecto = 0l;
        listProyecto = null;
        participante = 0l;
        listParticipantes = null;
        fechaIngreso = null;

    }

    public static FProyectoParticipante clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        FProyectoParticipante fFProyectoParticipante = (FProyectoParticipante) sess.getAttribute("FProyectoParticipante");
        if (fFProyectoParticipante == null) {
            fFProyectoParticipante = new FProyectoParticipante();
            sess.setAttribute("FProyectoParticipante", fFProyectoParticipante);
        } else {
            fFProyectoParticipante.reset(mapping, request);
        }
        return fFProyectoParticipante;
    }

//    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors errors = new ActionErrors();
//
//        return errors;
//    }

    /**
     * Holds value of property idProyectoParticipante.
     */
    private Long idProyectoParticipante;

    /**
     * Getter for property idProyectoParticipante.
     * @return Value of property idProyectoParticipante.
     */
    public Long getIdProyectoParticipante() {
        return this.idProyectoParticipante;
    }

    /**
     * Setter for property idProyectoParticipante.
     * @param idProyectoParticipante New value of property idProyectoParticipante.
     */
    public void setIdProyectoParticipante(Long idProyectoParticipante) {
        this.idProyectoParticipante = idProyectoParticipante;
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
     * Holds value of property fechaIngreso.
     */
    private String fechaIngreso;

    /**
     * Getter for property fechaIngreso.
     * @return Value of property fechaIngreso.
     */
    public String getFechaIngreso() {
        return this.fechaIngreso;
    }

    /**
     * Setter for property fechaIngreso.
     * @param fechaIngreso New value of property fechaIngreso.
     */
    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }




}