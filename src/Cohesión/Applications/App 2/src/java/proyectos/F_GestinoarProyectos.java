package proyectos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class F_GestinoarProyectos extends org.apache.struts.action.ActionForm {
    
    
    public F_GestinoarProyectos() {
        super();
        listaProyectos = "";

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        listaProyectos = "";

    }

    public static F_GestinoarProyectos clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        F_GestinoarProyectos fF_GestinoarProyectos = (F_GestinoarProyectos) sess.getAttribute("F_GestinoarProyectos");
        if (fF_GestinoarProyectos == null) {
            fF_GestinoarProyectos = new F_GestinoarProyectos();
            sess.setAttribute("F_GestinoarProyectos", fF_GestinoarProyectos);
        } else {
            fF_GestinoarProyectos.reset(mapping, request);
        }
        return fF_GestinoarProyectos;
    }

//    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors errors = new ActionErrors();
//
//        return errors;
//    }

    /**
     * Holds value of property listaProyectos.
     */
    private String listaProyectos;

    /**
     * Getter for property listaProyectos.
     * @return Value of property listaProyectos.
     */
    public String getListaProyectos() {
        return this.listaProyectos;
    }

    /**
     * Setter for property listaProyectos.
     * @param listaProyectos New value of property listaProyectos.
     */
    public void setListaProyectos(String listaProyectos) {
        this.listaProyectos = listaProyectos;
    }




}