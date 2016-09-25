package proyectos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import java.util.List;
import ve.usb.cohesion.runtime.Pair;

public class F_invitarParticipanteProyecto extends org.apache.struts.action.ActionForm {
    
    
    public F_invitarParticipanteProyecto() {
        super();
        participantes = null;

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        participantes = null;

    }

    public static F_invitarParticipanteProyecto clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        F_invitarParticipanteProyecto fF_invitarParticipanteProyecto = (F_invitarParticipanteProyecto) sess.getAttribute("F_invitarParticipanteProyecto");
        if (fF_invitarParticipanteProyecto == null) {
            fF_invitarParticipanteProyecto = new F_invitarParticipanteProyecto();
            sess.setAttribute("F_invitarParticipanteProyecto", fF_invitarParticipanteProyecto);
        } else {
            fF_invitarParticipanteProyecto.reset(mapping, request);
        }
        return fF_invitarParticipanteProyecto;
    }

//    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors errors = new ActionErrors();
//
//        return errors;
//    }

    /**
     * Holds value of property participantes.
     */
    private List<Pair> participantes;

    /**
     * Getter for property participantes.
     * @return Value of property participantes.
     */
    public List<Pair> getParticipantes() {
        return this.participantes;
    }

    /**
     * Setter for property participantes.
     * @param participantes New value of property participantes.
     */
    public void setParticipantes(List<Pair> participantes) {
        this.participantes = participantes;
    }




}