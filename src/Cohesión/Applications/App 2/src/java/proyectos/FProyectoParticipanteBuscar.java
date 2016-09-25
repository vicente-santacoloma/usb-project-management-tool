package proyectos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class FProyectoParticipanteBuscar extends org.apache.struts.action.ActionForm {
    
    
    public FProyectoParticipanteBuscar() {
        super();
        fechaIngreso = "";

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        fechaIngreso = "";

    }

    public static FProyectoParticipanteBuscar clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        FProyectoParticipanteBuscar fFProyectoParticipanteBuscar = (FProyectoParticipanteBuscar) sess.getAttribute("FProyectoParticipanteBuscar");
        if (fFProyectoParticipanteBuscar == null) {
            fFProyectoParticipanteBuscar = new FProyectoParticipanteBuscar();
            sess.setAttribute("FProyectoParticipanteBuscar", fFProyectoParticipanteBuscar);
        } else {
            fFProyectoParticipanteBuscar.reset(mapping, request);
        }
        return fFProyectoParticipanteBuscar;
    }

//    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors errors = new ActionErrors();
//
//        return errors;
//    }

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