package proyectos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class F_ListaRoles extends org.apache.struts.action.ActionForm {
    
    
    public F_ListaRoles() {
        super();
        roles = "";

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        roles = "";

    }

    public static F_ListaRoles clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        F_ListaRoles fF_ListaRoles = (F_ListaRoles) sess.getAttribute("F_ListaRoles");
        if (fF_ListaRoles == null) {
            fF_ListaRoles = new F_ListaRoles();
            sess.setAttribute("F_ListaRoles", fF_ListaRoles);
        } else {
            fF_ListaRoles.reset(mapping, request);
        }
        return fF_ListaRoles;
    }

//    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors errors = new ActionErrors();
//
//        return errors;
//    }

    /**
     * Holds value of property roles.
     */
    private String roles;

    /**
     * Getter for property roles.
     * @return Value of property roles.
     */
    public String getRoles() {
        return this.roles;
    }

    /**
     * Setter for property roles.
     * @param roles New value of property roles.
     */
    public void setRoles(String roles) {
        this.roles = roles;
    }




}