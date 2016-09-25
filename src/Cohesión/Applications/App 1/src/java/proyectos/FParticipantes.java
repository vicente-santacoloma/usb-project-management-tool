package proyectos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class FParticipantes extends org.apache.struts.action.ActionForm {
    
    
    public FParticipantes() {
        super();
        idParticipantes = 0l;
        nombre = "";
        usuario = "";
        clave = "";

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        idParticipantes = 0l;
        nombre = "";
        usuario = "";
        clave = "";

    }

    public static FParticipantes clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        FParticipantes fFParticipantes = (FParticipantes) sess.getAttribute("FParticipantes");
        if (fFParticipantes == null) {
            fFParticipantes = new FParticipantes();
            sess.setAttribute("FParticipantes", fFParticipantes);
        } else {
            fFParticipantes.reset(mapping, request);
        }
        return fFParticipantes;
    }

//    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors errors = new ActionErrors();
//
//        return errors;
//    }

    /**
     * Holds value of property idParticipantes.
     */
    private Long idParticipantes;

    /**
     * Getter for property idParticipantes.
     * @return Value of property idParticipantes.
     */
    public Long getIdParticipantes() {
        return this.idParticipantes;
    }

    /**
     * Setter for property idParticipantes.
     * @param idParticipantes New value of property idParticipantes.
     */
    public void setIdParticipantes(Long idParticipantes) {
        this.idParticipantes = idParticipantes;
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




}