package proyectos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class F_linda_Registro extends org.apache.struts.action.ActionForm {
    
    
    public F_linda_Registro() {
        super();
        nombre = "";
        apellido = "";
        telefono_ = 0;
        clave = "";
        direccion = "";
        correoElectronico = "";

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        nombre = "";
        apellido = "";
        telefono_ = 0;
        clave = "";
        direccion = "";
        correoElectronico = "";

    }

    public static F_linda_Registro clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        F_linda_Registro fF_linda_Registro = (F_linda_Registro) sess.getAttribute("F_linda_Registro");
        if (fF_linda_Registro == null) {
            fF_linda_Registro = new F_linda_Registro();
            sess.setAttribute("F_linda_Registro", fF_linda_Registro);
        } else {
            fF_linda_Registro.reset(mapping, request);
        }
        return fF_linda_Registro;
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

    /**
     * Holds value of property apellido.
     */
    private String apellido;

    /**
     * Getter for property apellido.
     * @return Value of property apellido.
     */
    public String getApellido() {
        return this.apellido;
    }

    /**
     * Setter for property apellido.
     * @param apellido New value of property apellido.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Holds value of property telefono_.
     */
    private int telefono_;

    /**
     * Getter for property telefono_.
     * @return Value of property telefono_.
     */
    public int getTelefono_() {
        return this.telefono_;
    }

    /**
     * Setter for property telefono_.
     * @param telefono_ New value of property telefono_.
     */
    public void setTelefono_(int telefono_) {
        this.telefono_ = telefono_;
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
     * Holds value of property direccion.
     */
    private String direccion;

    /**
     * Getter for property direccion.
     * @return Value of property direccion.
     */
    public String getDireccion() {
        return this.direccion;
    }

    /**
     * Setter for property direccion.
     * @param direccion New value of property direccion.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Holds value of property correoElectronico.
     */
    private String correoElectronico;

    /**
     * Getter for property correoElectronico.
     * @return Value of property correoElectronico.
     */
    public String getCorreoElectronico() {
        return this.correoElectronico;
    }

    /**
     * Setter for property correoElectronico.
     * @param correoElectronico New value of property correoElectronico.
     */
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }




}