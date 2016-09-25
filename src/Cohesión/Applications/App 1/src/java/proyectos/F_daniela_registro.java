package proyectos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class F_daniela_registro extends org.apache.struts.action.ActionForm {
    
    
    public F_daniela_registro() {
        super();
        nombre_Apelido = "";
        correo = "";

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        nombre_Apelido = "";
        correo = "";

    }

    public static F_daniela_registro clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        F_daniela_registro fF_daniela_registro = (F_daniela_registro) sess.getAttribute("F_daniela_registro");
        if (fF_daniela_registro == null) {
            fF_daniela_registro = new F_daniela_registro();
            sess.setAttribute("F_daniela_registro", fF_daniela_registro);
        } else {
            fF_daniela_registro.reset(mapping, request);
        }
        return fF_daniela_registro;
    }

//    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors errors = new ActionErrors();
//
//        return errors;
//    }

    /**
     * Holds value of property nombre_Apelido.
     */
    private String nombre_Apelido;

    /**
     * Getter for property nombre_Apelido.
     * @return Value of property nombre_Apelido.
     */
    public String getNombre_Apelido() {
        return this.nombre_Apelido;
    }

    /**
     * Setter for property nombre_Apelido.
     * @param nombre_Apelido New value of property nombre_Apelido.
     */
    public void setNombre_Apelido(String nombre_Apelido) {
        this.nombre_Apelido = nombre_Apelido;
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




}