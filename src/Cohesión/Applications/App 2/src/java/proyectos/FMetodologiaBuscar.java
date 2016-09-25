package proyectos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class FMetodologiaBuscar extends org.apache.struts.action.ActionForm {
    
    
    public FMetodologiaBuscar() {
        super();
        nombre = "";

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        nombre = "";

    }

    public static FMetodologiaBuscar clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        FMetodologiaBuscar fFMetodologiaBuscar = (FMetodologiaBuscar) sess.getAttribute("FMetodologiaBuscar");
        if (fFMetodologiaBuscar == null) {
            fFMetodologiaBuscar = new FMetodologiaBuscar();
            sess.setAttribute("FMetodologiaBuscar", fFMetodologiaBuscar);
        } else {
            fFMetodologiaBuscar.reset(mapping, request);
        }
        return fFMetodologiaBuscar;
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