package proyectos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class FParticipantesBuscar extends org.apache.struts.action.ActionForm {
    
    
    public FParticipantesBuscar() {
        super();
        nombre = "";

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        nombre = "";

    }

    public static FParticipantesBuscar clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        FParticipantesBuscar fFParticipantesBuscar = (FParticipantesBuscar) sess.getAttribute("FParticipantesBuscar");
        if (fFParticipantesBuscar == null) {
            fFParticipantesBuscar = new FParticipantesBuscar();
            sess.setAttribute("FParticipantesBuscar", fFParticipantesBuscar);
        } else {
            fFParticipantesBuscar.reset(mapping, request);
        }
        return fFParticipantesBuscar;
    }

//    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors errors = new ActionErrors();
//
//        return errors;
//    }

    /**
     * Holds value of property nombre.
     */
    private String nombre;

    /**
     * Getter for property nombre.
     * @return Value of property nombre.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Setter for property nombre.
     * @param nombre New value of property nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




}