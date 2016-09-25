package proyectos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class FRecuperarContrasena extends org.apache.struts.action.ActionForm {
    
    
    public FRecuperarContrasena() {
        super();
        usuario = "";

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        usuario = "";

    }

    public static FRecuperarContrasena clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        FRecuperarContrasena fFRecuperarContrasena = (FRecuperarContrasena) sess.getAttribute("FRecuperarContrasena");
        if (fFRecuperarContrasena == null) {
            fFRecuperarContrasena = new FRecuperarContrasena();
            sess.setAttribute("FRecuperarContrasena", fFRecuperarContrasena);
        } else {
            fFRecuperarContrasena.reset(mapping, request);
        }
        return fFRecuperarContrasena;
    }

//    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors errors = new ActionErrors();
//
//        return errors;
//    }

    /**
     * Holds value of property usuario.
     */
    private String usuario;

    /**
     * Getter for property usuario.
     * @return Value of property usuario.
     */
    public String getUsuario() {
        return this.usuario;
    }

    /**
     * Setter for property usuario.
     * @param usuario New value of property usuario.
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }




}