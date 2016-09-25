package proyectos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class F_linda_Login extends org.apache.struts.action.ActionForm {
    
    
    public F_linda_Login() {
        super();
        usuario = "";
        clave = "";

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        usuario = "";
        clave = "";

    }

    public static F_linda_Login clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        F_linda_Login fF_linda_Login = (F_linda_Login) sess.getAttribute("F_linda_Login");
        if (fF_linda_Login == null) {
            fF_linda_Login = new F_linda_Login();
            sess.setAttribute("F_linda_Login", fF_linda_Login);
        } else {
            fF_linda_Login.reset(mapping, request);
        }
        return fF_linda_Login;
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