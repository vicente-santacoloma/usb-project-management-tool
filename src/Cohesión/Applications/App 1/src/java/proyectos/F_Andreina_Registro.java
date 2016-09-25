package proyectos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class F_Andreina_Registro extends org.apache.struts.action.ActionForm {
    
    
    public F_Andreina_Registro() {
        super();
        usuario = "";
        nombre = "";
        clave = "";
        correo = "";
        tlf = "";

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        usuario = "";
        nombre = "";
        clave = "";
        correo = "";
        tlf = "";

    }

    public static F_Andreina_Registro clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        F_Andreina_Registro fF_Andreina_Registro = (F_Andreina_Registro) sess.getAttribute("F_Andreina_Registro");
        if (fF_Andreina_Registro == null) {
            fF_Andreina_Registro = new F_Andreina_Registro();
            sess.setAttribute("F_Andreina_Registro", fF_Andreina_Registro);
        } else {
            fF_Andreina_Registro.reset(mapping, request);
        }
        return fF_Andreina_Registro;
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
     * Holds value of property correo.
     */
    private String correo;

    /**
     * Getter for property correo.
     * @return Value of property correo.
     */
    public String getCorreo() {
        return this.correo;
    }

    /**
     * Setter for property correo.
     * @param correo New value of property correo.
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Holds value of property tlf.
     */
    private String tlf;

    /**
     * Getter for property tlf.
     * @return Value of property tlf.
     */
    public String getTlf() {
        return this.tlf;
    }

    /**
     * Setter for property tlf.
     * @param tlf New value of property tlf.
     */
    public void setTlf(String tlf) {
        this.tlf = tlf;
    }




}