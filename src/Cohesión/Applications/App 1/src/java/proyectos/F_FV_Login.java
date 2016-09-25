package proyectos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class F_FV_Login extends org.apache.struts.action.ActionForm {
    
    
    public F_FV_Login() {
        super();
        usuario = "";
        clave = "";

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        usuario = "";
        clave = "";

    }

    public static F_FV_Login clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        F_FV_Login fF_FV_Login = (F_FV_Login) sess.getAttribute("F_FV_Login");
        if (fF_FV_Login == null) {
            fF_FV_Login = new F_FV_Login();
            sess.setAttribute("F_FV_Login", fF_FV_Login);
        } else {
            fF_FV_Login.reset(mapping, request);
        }
        return fF_FV_Login;
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

    /**
     * Holds value of property clave.
     */
    private String clave;

    /**
     * Getter for property clave.
     * @return Value of property clave.
     */
    public String getClave() {
        return this.clave;
    }

    /**
     * Setter for property clave.
     * @param clave New value of property clave.
     */
    public void setClave(String clave) {
        this.clave = clave;
    }




}