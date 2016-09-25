package proyectos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class F_ArtefactoBuscar extends org.apache.struts.action.ActionForm {
    
    
    public F_ArtefactoBuscar() {
        super();
        titulo = "";

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        titulo = "";

    }

    public static F_ArtefactoBuscar clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        F_ArtefactoBuscar fF_ArtefactoBuscar = (F_ArtefactoBuscar) sess.getAttribute("F_ArtefactoBuscar");
        if (fF_ArtefactoBuscar == null) {
            fF_ArtefactoBuscar = new F_ArtefactoBuscar();
            sess.setAttribute("F_ArtefactoBuscar", fF_ArtefactoBuscar);
        } else {
            fF_ArtefactoBuscar.reset(mapping, request);
        }
        return fF_ArtefactoBuscar;
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