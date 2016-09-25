

package ve.usb.cohesion.runtime;

import java.text.DateFormat;
import java.util.Date;

/** An instance of Date that prints dates based on the 
 * current locale instead of English.
 */
public class LocalDate extends Date {

    public static DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM);
    
    public LocalDate(Date date) {
        setTime(date.getTime());
    }
    
    public LocalDate(String date) {
        try {
            setTime(dateFormat.parse(date).getTime());
        } catch (Exception e) {}
    }
    
    public String toString() {
        return dateFormat.format(this);
    }
    
}
