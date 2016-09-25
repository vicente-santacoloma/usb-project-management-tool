package proyectos.hibernate;

import java.util.HashSet;
import java.util.Set;

public class Artefacto implements java.io.Serializable, ve.usb.cohesion.runtime.Auditable {

    /** Creates a new instance of Artefacto */
    public Artefacto() {}
    
    /**
     * Holds value of property id.
     */
    private Long id;

    /**
     * Getter for property id.
     * @return Value of property id.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Holds value of property idArtefacto.
     */
    private long idArtefacto;

    /**
     * Getter for property idArtefacto.
     * @return Value of property idArtefacto.
     */
    public long getIdArtefacto() {
        return this.idArtefacto;
    }

    /**
     * Setter for property idArtefacto.
     * @param idArtefacto New value of property idArtefacto.
     */
    public void setIdArtefacto(long idArtefacto) {
        this.id = this.idArtefacto = idArtefacto;
    }

    /**
     * Holds value of property titulo.
     */
    private String titulo = "";

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
    private long tamano;

    /**
     * Getter for property tamano.
     * @return Value of property tamano.
     */
    public long getTamano() {
        return this.tamano;
    }

    /**
     * Setter for property tamano.
     * @param tamano New value of property tamano.
     */
    public void setTamano(long tamano) {
        this.tamano = tamano;
    }

    /**
     * Holds value of property contenido.
     */
    private byte[] contenido;

    /**
     * Getter for property contenido.
     * @return Value of property contenido.
     */
    public byte[] getContenido() {
        return this.contenido;
    }

    /**
     * Setter for property contenido.
     * @param contenido New value of property contenido.
     */
    public void setContenido(byte[] contenido) {
        this.contenido = contenido;
    }

    /**
     * Holds value of property actividad.
     */
    private Actividad actividad;

    /**
     * Getter for property actividad.
     * @return Value of property actividad.
     */
    public Actividad getActividad() {
        return this.actividad;
    }

    /**
     * Setter for property actividad.
     * @param actividad New value of property actividad.
     */
    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }
    /**
     * Holds value of property usos.
     */
    private Set<ActividadArtefacto> usos = new HashSet<ActividadArtefacto>();

    /**
     * Getter for property usos.
     * @return Value of property usos.
     */
    public Set<ActividadArtefacto> getUsos() {
        return this.usos;
    }

    /**
     * Setter for property usos.
     * @param usos New value of property usos.
     */
    public void setUsos(Set<ActividadArtefacto> usos) {
        this.usos = usos;
    }

    /**
     * Add an element to set property usos
     * and sets elements's property documento.
     * @param element New element to be added to usos.
     */
    public void addToUsos(ActividadArtefacto element) {
        element.setDocumento(this);
        usos.add(element);
    }

    /**
     * Removes and old element from set usos
     * and sets element's property documento to null.
     * @param old The element to be removed from usos
     */
    public void removeFromUsos(ActividadArtefacto old) {
        usos.remove(old);
        old.setDocumento(null);
    }



    public String toString() {
        return "<Artefacto id='C" + this.id +
      //idArtefacto
      "\" titulo =\"" + titulo +
      "\" tamano =\"" + tamano +
      "\" contenido =\"" + contenido +
        ((actividad==null) ? "" : "\" actividad =\"C" + actividad.getId()) +

      //usos

        "'/>";
    }

}