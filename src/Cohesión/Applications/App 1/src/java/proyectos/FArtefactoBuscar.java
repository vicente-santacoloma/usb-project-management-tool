package proyectos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class FArtefactoBuscar extends org.apache.struts.action.ActionForm {
    
    
    public FArtefactoBuscar() {
        super();
        titulo = "";

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        titulo = "";

    }

    public static FArtefactoBuscar clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        FArtefactoBuscar fFArtefactoBuscar = (FArtefactoBuscar) sess.getAttribute("FArtefactoBuscar");
        if (fFArtefactoBuscar == null) {
            fFArtefactoBuscar = new FArtefactoBuscar();
            sess.setAttribute("FArtefactoBuscar", fFArtefactoBuscar);
        } else {
            fFArtefactoBuscar.reset(mapping, request);
        }
        return fFArtefactoBuscar;
    }

//    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors errors = new ActionErrors();
//
//        return errors;
//    }

    /**
     * Holds value of property titulo.
     */
    private String titulo;

    /**
     * Getter for property titulo.
     * @return Value of property titulo.
     */
    public String getTitulo() {
        return this.titulo;
    }

    /**
     * Setter for property titulo.
     * @param titulo New value of property titulo.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }




}