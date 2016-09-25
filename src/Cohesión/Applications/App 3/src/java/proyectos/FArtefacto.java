package proyectos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import java.util.List;
import ve.usb.cohesion.runtime.Pair;

public class FArtefacto extends org.apache.struts.action.ActionForm {
    
    
    public FArtefacto() {
        super();
        idArtefacto = 0l;
        titulo = "";
        tamano = 0l;
        contenido = "";
        actividad = 0l;
        listActividad = null;

    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        idArtefacto = 0l;
        titulo = "";
        tamano = 0l;
        contenido = "";
        actividad = 0l;
        listActividad = null;

    }

    public static FArtefacto clear(ActionMapping mapping, HttpServletRequest request) {
        HttpSession sess = request.getSession();
        FArtefacto fFArtefacto = (FArtefacto) sess.getAttribute("FArtefacto");
        if (fFArtefacto == null) {
            fFArtefacto = new FArtefacto();
            sess.setAttribute("FArtefacto", fFArtefacto);
        } else {
            fFArtefacto.reset(mapping, request);
        }
        return fFArtefacto;
    }

//    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors errors = new ActionErrors();
//
//        return errors;
//    }

    /**
     * Holds value of property idArtefacto.
     */
    private Long idArtefacto;

    /**
     * Getter for property idArtefacto.
     * @return Value of property idArtefacto.
     */
    public Long getIdArtefacto() {
        return this.idArtefacto;
    }

    /**
     * Setter for property idArtefacto.
     * @param idArtefacto New value of property idArtefacto.
     */
    public void setIdArtefacto(Long idArtefacto) {
        this.idArtefacto = idArtefacto;
    }

    /**
     * Holds value of property titulo.
     */
    private String titulo;

    /**
     * Getter for property titulo.
     * @return Value of property titulo.
     */
    public String getTitulo() {
        return this.titulo;
    }

    /**
     * Setter for property titulo.
     * @param titulo New value of property titulo.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Holds value of property tamano.
     */
    private Long tamano;

    /**
     * Getter for property tamano.
     * @return Value of property tamano.
     */
    public Long getTamano() {
        return this.tamano;
    }

    /**
     * Setter for property tamano.
     * @param tamano New value of property tamano.
     */
    public void setTamano(Long tamano) {
        this.tamano = tamano;
    }

    /**
     * Holds value of property contenido.
     */
    private String contenido;

    /**
     * Getter for property contenido.
     * @return Value of property contenido.
     */
    public String getContenido() {
        return this.contenido;
    }

    /**
     * Setter for property contenido.
     * @param contenido New value of property contenido.
     */
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    /**
     * Holds value of property actividad.
     */
    private Long actividad;

    /**
     * Getter for property actividad.
     * @return Value of property actividad.
     */
    public Long getActividad() {
        return this.actividad;
    }

    /**
     * Setter for property actividad.
     * @param actividad New value of property actividad.
     */
    public void setActividad(Long actividad) {
        this.actividad = actividad;
    }

    /**
     * Holds value of property listActividad.
     */
    private List<Pair> listActividad;

    /**
     * Getter for property listActividad.
     * @return Value of property listActividad.
     */
    public List<Pair> getListActividad() {
        return this.listActividad;
    }

    /**
     * Setter for property listActividad.
     * @param listActividad New value of property listActividad.
     */
    public void setListActividad(List<Pair> listActividad) {
        this.listActividad = listActividad;
    }




}