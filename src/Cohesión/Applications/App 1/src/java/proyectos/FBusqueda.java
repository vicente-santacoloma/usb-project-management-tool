package proyectos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class FBusqueda extends org.apache.struts.action.ActionForm {
    
    
    public FBusqueda() {
        super();
        palabras = "";

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        palabras = "";

    }

    public static FBusqueda clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        FBusqueda fFBusqueda = (FBusqueda) sess.getAttribute("FBusqueda");
        if (fFBusqueda == null) {
            fFBusqueda = new FBusqueda();
            sess.setAttribute("FBusqueda", fFBusqueda);
        } else {
            fFBusqueda.reset(mapping, request);
        }
        return fFBusqueda;
    }

//    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors errors = new ActionErrors();
//
//        return errors;
//    }

    /**
     * Holds value of property palabras.
     */
    private String palabras;

    /**
     * Getter for property palabras.
     * @return Value of property palabras.
     */
    public String getPalabras() {
        return this.palabras;
    }

    /**
     * Setter for property palabras.
     * @param palabras New value of property palabras.
     */
    public void setPalabras(String palabras) {
        this.palabras = palabras;
    }




}