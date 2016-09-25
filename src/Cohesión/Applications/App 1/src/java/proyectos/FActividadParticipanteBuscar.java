package proyectos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class FActividadParticipanteBuscar extends org.apache.struts.action.ActionForm {
    
    
    public FActividadParticipanteBuscar() {
        super();
        tiempoParticipacion = "";

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        tiempoParticipacion = "";

    }

    public static FActividadParticipanteBuscar clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        FActividadParticipanteBuscar fFActividadParticipanteBuscar = (FActividadParticipanteBuscar) sess.getAttribute("FActividadParticipanteBuscar");
        if (fFActividadParticipanteBuscar == null) {
            fFActividadParticipanteBuscar = new FActividadParticipanteBuscar();
            sess.setAttribute("FActividadParticipanteBuscar", fFActividadParticipanteBuscar);
        } else {
            fFActividadParticipanteBuscar.reset(mapping, request);
        }
        return fFActividadParticipanteBuscar;
    }

//    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors errors = new ActionErrors();
//
//        return errors;
//    }

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