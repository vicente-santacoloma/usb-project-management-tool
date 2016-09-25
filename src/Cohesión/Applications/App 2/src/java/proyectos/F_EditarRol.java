package proyectos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class F_EditarRol extends org.apache.struts.action.ActionForm {
    
    
    public F_EditarRol() {
        super();
        descripcion = "";

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        descripcion = "";

    }

    public static F_EditarRol clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        F_EditarRol fF_EditarRol = (F_EditarRol) sess.getAttribute("F_EditarRol");
        if (fF_EditarRol == null) {
            fF_EditarRol = new F_EditarRol();
            sess.setAttribute("F_EditarRol", fF_EditarRol);
        } else {
            fF_EditarRol.reset(mapping, request);
        }
        return fF_EditarRol;
    }

//    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors errors = new ActionErrors();
//
//        return errors;
//    }

    /**
     * Holds value of property descripcion.
     */
    private String descripcion;

    /**
     * Getter for property descripcion.
     * @return Value of property descripcion.
     */
    public String getDescripcion() {
        return this.descripcion;
    }

    /**
     * Setter for property descripcion.
     * @param descripcion New value of property descripcion.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }




}