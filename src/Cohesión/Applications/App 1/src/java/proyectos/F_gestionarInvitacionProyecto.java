package proyectos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import java.util.List;
import ve.usb.cohesion.runtime.Pair;

public class F_gestionarInvitacionProyecto extends org.apache.struts.action.ActionForm {
    
    
    public F_gestionarInvitacionProyecto() {
        super();
        notificaciones = null;

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        notificaciones = null;

    }

    public static F_gestionarInvitacionProyecto clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        F_gestionarInvitacionProyecto fF_gestionarInvitacionProyecto = (F_gestionarInvitacionProyecto) sess.getAttribute("F_gestionarInvitacionProyecto");
        if (fF_gestionarInvitacionProyecto == null) {
            fF_gestionarInvitacionProyecto = new F_gestionarInvitacionProyecto();
            sess.setAttribute("F_gestionarInvitacionProyecto", fF_gestionarInvitacionProyecto);
        } else {
            fF_gestionarInvitacionProyecto.reset(mapping, request);
        }
        return fF_gestionarInvitacionProyecto;
    }

//    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors errors = new ActionErrors();
//
//        return errors;
//    }

    /**
     * Holds value of property notificaciones.
     */
    private List<Pair> notificaciones;

    /**
     * Getter for property notificaciones.
     * @return Value of property notificaciones.
     */
    public List<Pair> getNotificaciones() {
        return this.notificaciones;
    }

    /**
     * Setter for property notificaciones.
     * @param notificaciones New value of property notificaciones.
     */
    public void setNotificaciones(List<Pair> notificaciones) {
        this.notificaciones = notificaciones;
    }




}