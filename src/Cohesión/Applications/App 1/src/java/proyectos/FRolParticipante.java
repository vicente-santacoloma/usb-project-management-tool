package proyectos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import java.util.List;
import ve.usb.cohesion.runtime.Pair;

public class FRolParticipante extends org.apache.struts.action.ActionForm {
    
    
    public FRolParticipante() {
        super();
        idRolParticipante = 0l;
        rol = 0l;
        listRol = null;
        participante = 0l;
        listParticipantes = null;

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        idRolParticipante = 0l;
        rol = 0l;
        listRol = null;
        participante = 0l;
        listParticipantes = null;

    }

    public static FRolParticipante clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        FRolParticipante fFRolParticipante = (FRolParticipante) sess.getAttribute("FRolParticipante");
        if (fFRolParticipante == null) {
            fFRolParticipante = new FRolParticipante();
            sess.setAttribute("FRolParticipante", fFRolParticipante);
        } else {
            fFRolParticipante.reset(mapping, request);
        }
        return fFRolParticipante;
    }

//    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors errors = new ActionErrors();
//
//        return errors;
//    }

    /**
     * Holds value of property idRolParticipante.
     */
    private Long idRolParticipante;

    /**
     * Getter for property idRolParticipante.
     * @return Value of property idRolParticipante.
     */
    public Long getIdRolParticipante() {
        return this.idRolParticipante;
    }

    /**
     * Setter for property idRolParticipante.
     * @param idRolParticipante New value of property idRolParticipante.
     */
    public void setIdRolParticipante(Long idRolParticipante) {
        this.idRolParticipante = idRolParticipante;
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




}