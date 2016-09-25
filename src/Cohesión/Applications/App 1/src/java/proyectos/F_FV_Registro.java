package proyectos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class F_FV_Registro extends org.apache.struts.action.ActionForm {
    
    
    public F_FV_Registro() {
        super();
        nombre = "";
        apellido = "";
        sexo = "";
        usuario = "";
        clave = "";
        confirmarclave = "";
        email = "";

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        nombre = "";
        apellido = "";
        sexo = "";
        usuario = "";
        clave = "";
        confirmarclave = "";
        email = "";

    }

    public static F_FV_Registro clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        F_FV_Registro fF_FV_Registro = (F_FV_Registro) sess.getAttribute("F_FV_Registro");
        if (fF_FV_Registro == null) {
            fF_FV_Registro = new F_FV_Registro();
            sess.setAttribute("F_FV_Registro", fF_FV_Registro);
        } else {
            fF_FV_Registro.reset(mapping, request);
        }
        return fF_FV_Registro;
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
     * Holds value of property sexo.
     */
    private String sexo;

    /**
     * Getter for property sexo.
     * @return Value of property sexo.
     */
    public String getSexo() {
        return this.sexo;
    }

    /**
     * Setter for property sexo.
     * @param sexo New value of property sexo.
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

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
     * Holds value of property confirmarclave.
     */
    private String confirmarclave;

    /**
     * Getter for property confirmarclave.
     * @return Value of property confirmarclave.
     */
    public String getConfirmarclave() {
        return this.confirmarclave;
    }

    /**
     * Setter for property confirmarclave.
     * @param confirmarclave New value of property confirmarclave.
     */
    public void setConfirmarclave(String confirmarclave) {
        this.confirmarclave = confirmarclave;
    }

    /**
     * Holds value of property email.
     */
    private String email;

    /**
     * Getter for property email.
     * @return Value of property email.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Setter for property email.
     * @param email New value of property email.
     */
    public void setEmail(String email) {
        this.email = email;
    }




}