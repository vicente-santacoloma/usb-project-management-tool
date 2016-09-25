package proyectos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class F_RegistrarUsuario extends org.apache.struts.action.ActionForm {
    
    
    public F_RegistrarUsuario() {
        super();
        nombre = "";
        apellido = "";
        fechaNacimiento = "";
        carnet = "";
        area = "";
        correoElectronico = "";
        correoElectronicoConfirmacion = "";
        clave = "";
        claveConfirmacion = "";

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        nombre = "";
        apellido = "";
        fechaNacimiento = "";
        carnet = "";
        area = "";
        correoElectronico = "";
        correoElectronicoConfirmacion = "";
        clave = "";
        claveConfirmacion = "";

    }

    public static F_RegistrarUsuario clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        F_RegistrarUsuario fF_RegistrarUsuario = (F_RegistrarUsuario) sess.getAttribute("F_RegistrarUsuario");
        if (fF_RegistrarUsuario == null) {
            fF_RegistrarUsuario = new F_RegistrarUsuario();
            sess.setAttribute("F_RegistrarUsuario", fF_RegistrarUsuario);
        } else {
            fF_RegistrarUsuario.reset(mapping, request);
        }
        return fF_RegistrarUsuario;
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
     * Holds value of property fechaNacimiento.
     */
    private String fechaNacimiento;

    /**
     * Getter for property fechaNacimiento.
     * @return Value of property fechaNacimiento.
     */
    public String getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    /**
     * Setter for property fechaNacimiento.
     * @param fechaNacimiento New value of property fechaNacimiento.
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Holds value of property carnet.
     */
    private String carnet;

    /**
     * Getter for property carnet.
     * @return Value of property carnet.
     */
    public String getCarnet() {
        return this.carnet;
    }

    /**
     * Setter for property carnet.
     * @param carnet New value of property carnet.
     */
    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    /**
     * Holds value of property area.
     */
    private String area;

    /**
     * Getter for property area.
     * @return Value of property area.
     */
    public String getArea() {
        return this.area;
    }

    /**
     * Setter for property area.
     * @param area New value of property area.
     */
    public void setArea(String area) {
        this.area = area;
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

    /**
     * Holds value of property correoElectronicoConfirmacion.
     */
    private String correoElectronicoConfirmacion;

    /**
     * Getter for property correoElectronicoConfirmacion.
     * @return Value of property correoElectronicoConfirmacion.
     */
    public String getCorreoElectronicoConfirmacion() {
        return this.correoElectronicoConfirmacion;
    }

    /**
     * Setter for property correoElectronicoConfirmacion.
     * @param correoElectronicoConfirmacion New value of property correoElectronicoConfirmacion.
     */
    public void setCorreoElectronicoConfirmacion(String correoElectronicoConfirmacion) {
        this.correoElectronicoConfirmacion = correoElectronicoConfirmacion;
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
     * Holds value of property claveConfirmacion.
     */
    private String claveConfirmacion;

    /**
     * Getter for property claveConfirmacion.
     * @return Value of property claveConfirmacion.
     */
    public String getClaveConfirmacion() {
        return this.claveConfirmacion;
    }

    /**
     * Setter for property claveConfirmacion.
     * @param claveConfirmacion New value of property claveConfirmacion.
     */
    public void setClaveConfirmacion(String claveConfirmacion) {
        this.claveConfirmacion = claveConfirmacion;
    }




}