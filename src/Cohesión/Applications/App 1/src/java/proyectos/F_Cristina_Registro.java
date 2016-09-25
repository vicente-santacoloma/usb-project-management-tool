package proyectos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class F_Cristina_Registro extends org.apache.struts.action.ActionForm {
    
    
    public F_Cristina_Registro() {
        super();
        usuario = "";
        nombre = "";
        clave = "";
        correoE = "";
        telefono = "";

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        usuario = "";
        nombre = "";
        clave = "";
        correoE = "";
        telefono = "";

    }

    public static F_Cristina_Registro clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        F_Cristina_Registro fF_Cristina_Registro = (F_Cristina_Registro) sess.getAttribute("F_Cristina_Registro");
        if (fF_Cristina_Registro == null) {
            fF_Cristina_Registro = new F_Cristina_Registro();
            sess.setAttribute("F_Cristina_Registro", fF_Cristina_Registro);
        } else {
            fF_Cristina_Registro.reset(mapping, request);
        }
        return fF_Cristina_Registro;
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

    /**
     * Holds value of property clave.
     */
    private String clave;

    /**
     * Getter for property clave.
     * @return Value of property clave.
     */
    public String getClave() {
        return this.clave;
    }

    /**
     * Setter for property clave.
     * @param clave New value of property clave.
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * Holds value of property correoE.
     */
    private String correoE;

    /**
     * Getter for property correoE.
     * @return Value of property correoE.
     */
    public String getCorreoE() {
        return this.correoE;
    }

    /**
     * Setter for property correoE.
     * @param correoE New value of property correoE.
     */
    public void setCorreoE(String correoE) {
        this.correoE = correoE;
    }

    /**
     * Holds value of property telefono.
     */
    private String telefono;

    /**
     * Getter for property telefono.
     * @return Value of property telefono.
     */
    public String getTelefono() {
        return this.telefono;
    }

    /**
     * Setter for property telefono.
     * @param telefono New value of property telefono.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }




}