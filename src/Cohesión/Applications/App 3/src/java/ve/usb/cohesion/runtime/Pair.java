
package ve.usb.cohesion.runtime;

/**
 *
 * @author suarez
 */
public class Pair implements java.io.Serializable {
    
    /** Creates a new instance of Pair */
    public Pair() {
    }

    /** Creates a new instance of Pair */
    public Pair(String label, String value) {
        this.label = label;
        this.value = value;
    }

    /** Creates a new instance of Pair */
    public Pair(String label, int value) {
        this.label = label;
        this.value = value+"";
    }

    /** Creates a new instance of Pair */
    public Pair(String label, long value) {
        this.label = label;
        this.value = value+"";
    }

    /** Creates a new instance of Pair */
    public Pair(Object label, long value) {
        this.label = label.toString();
        this.value = value+"";
    }

    /**
     * Holds value of property label.
     */
    private String label;

    /**
     * Getter for property label.
     * @return Value of property label.
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * Setter for property label.
     * @param label New value of property label.
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Holds value of property value.
     */
    private String value;

    /**
     * Getter for property value.
     * @return Value of property value.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Setter for property value.
     * @param value New value of property value.
     */
    public void setValue(String value) {
        this.value = value;
    }
    
    public String toString() {
        return "<" + label.toString() +  "," + value.toString() + ">";
    }
    
}
