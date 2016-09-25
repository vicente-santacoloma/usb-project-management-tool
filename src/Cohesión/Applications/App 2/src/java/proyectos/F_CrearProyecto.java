package proyectos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class F_CrearProyecto extends org.apache.struts.action.ActionForm {
    
    
    public F_CrearProyecto() {
        super();
        nombreProyecto = "";
        descripcionProy = "";
        miembrosAParticipar = "";
        duracionAproximada = 0;

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        nombreProyecto = "";
        descripcionProy = "";
        miembrosAParticipar = "";
        duracionAproximada = 0;

    }

    public static F_CrearProyecto clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        F_CrearProyecto fF_CrearProyecto = (F_CrearProyecto) sess.getAttribute("F_CrearProyecto");
        if (fF_CrearProyecto == null) {
            fF_CrearProyecto = new F_CrearProyecto();
            sess.setAttribute("F_CrearProyecto", fF_CrearProyecto);
        } else {
            fF_CrearProyecto.reset(mapping, request);
        }
        return fF_CrearProyecto;
    }

//    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors errors = new ActionErrors();
//
//        return errors;
//    }

    /**
     * Holds value of property nombreProyecto.
     */
    private String nombreProyecto;

    /**
     * Getter for property nombreProyecto.
     * @return Value of property nombreProyecto.
     */
    public String getNombreProyecto() {
        return this.nombreProyecto;
    }

    /**
     * Setter for property nombreProyecto.
     * @param nombreProyecto New value of property nombreProyecto.
     */
    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    /**
     * Holds value of property descripcionProy.
     */
    private String descripcionProy;

    /**
     * Getter for property descripcionProy.
     * @return Value of property descripcionProy.
     */
    public String getDescripcionProy() {
        return this.descripcionProy;
    }

    /**
     * Setter for property descripcionProy.
     * @param descripcionProy New value of property descripcionProy.
     */
    public void setDescripcionProy(String descripcionProy) {
        this.descripcionProy = descripcionProy;
    }

    /**
     * Holds value of property miembrosAParticipar.
     */
    private String miembrosAParticipar;

    /**
     * Getter for property miembrosAParticipar.
     * @return Value of property miembrosAParticipar.
     */
    public String getMiembrosAParticipar() {
        return this.miembrosAParticipar;
    }

    /**
     * Setter for property miembrosAParticipar.
     * @param miembrosAParticipar New value of property miembrosAParticipar.
     */
    public void setMiembrosAParticipar(String miembrosAParticipar) {
        this.miembrosAParticipar = miembrosAParticipar;
    }

    /**
     * Holds value of property duracionAproximada.
     */
    private int duracionAproximada;

    /**
     * Getter for property duracionAproximada.
     * @return Value of property duracionAproximada.
     */
    public int getDuracionAproximada() {
        return this.duracionAproximada;
    }

    /**
     * Setter for property duracionAproximada.
     * @param duracionAproximada New value of property duracionAproximada.
     */
    public void setDuracionAproximada(int duracionAproximada) {
        this.duracionAproximada = duracionAproximada;
    }




}