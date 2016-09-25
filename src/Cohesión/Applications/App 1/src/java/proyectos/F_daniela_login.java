package proyectos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class F_daniela_login extends org.apache.struts.action.ActionForm {
    
    
    public F_daniela_login() {
        super();
        usuario = "";
        contrase_a = "";

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        usuario = "";
        contrase_a = "";

    }

    public static F_daniela_login clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        F_daniela_login fF_daniela_login = (F_daniela_login) sess.getAttribute("F_daniela_login");
        if (fF_daniela_login == null) {
            fF_daniela_login = new F_daniela_login();
            sess.setAttribute("F_daniela_login", fF_daniela_login);
        } else {
            fF_daniela_login.reset(mapping, request);
        }
        return fF_daniela_login;
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
     * Holds value of property contrase_a.
     */
    private String contrase_a;

    /**
     * Getter for property contrase_a.
     * @return Value of property contrase_a.
     */
    public String getContrase_a() {
        return this.contrase_a;
    }

    /**
     * Setter for property contrase_a.
     * @param contrase_a New value of property contrase_a.
     */
    public void setContrase_a(String contrase_a) {
        this.contrase_a = contrase_a;
    }




}