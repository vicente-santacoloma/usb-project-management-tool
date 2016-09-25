package proyectos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import java.util.List;
import ve.usb.cohesion.runtime.Pair;

public class F_Rol extends org.apache.struts.action.ActionForm {
    
    
    public F_Rol() {
        super();
        idRol = 0l;
        descripcion = "";
        metodologia = 0l;
        listMetodologia = null;
        nombre = "";

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        idRol = 0l;
        descripcion = "";
        metodologia = 0l;
        listMetodologia = null;
        nombre = "";

    }

    public static F_Rol clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        F_Rol fF_Rol = (F_Rol) sess.getAttribute("F_Rol");
        if (fF_Rol == null) {
            fF_Rol = new F_Rol();
            sess.setAttribute("F_Rol", fF_Rol);
        } else {
            fF_Rol.reset(mapping, request);
        }
        return fF_Rol;
    }

//    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors errors = new ActionErrors();
//
//        return errors;
//    }

    /**
     * Holds value of property idRol.
     */
    private Long idRol;

    /**
     * Getter for property idRol.
     * @return Value of property idRol.
     */
    public Long getIdRol() {
        return this.idRol;
    }

    /**
     * Setter for property idRol.
     * @param idRol New value of property idRol.
     */
    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }

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

    /**
     * Holds value of property metodologia.
     */
    private Long metodologia;

    /**
     * Getter for property metodologia.
     * @return Value of property metodologia.
     */
    public Long getMetodologia() {
        return this.metodologia;
    }

    /**
     * Setter for property metodologia.
     * @param metodologia New value of property metodologia.
     */
    public void setMetodologia(Long metodologia) {
        this.metodologia = metodologia;
    }

    /**
     * Holds value of property listMetodologia.
     */
    private List<Pair> listMetodologia;

    /**
     * Getter for property listMetodologia.
     * @return Value of property listMetodologia.
     */
    public List<Pair> getListMetodologia() {
        return this.listMetodologia;
    }

    /**
     * Setter for property listMetodologia.
     * @param listMetodologia New value of property listMetodologia.
     */
    public void setListMetodologia(List<Pair> listMetodologia) {
        this.listMetodologia = listMetodologia;
    }

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