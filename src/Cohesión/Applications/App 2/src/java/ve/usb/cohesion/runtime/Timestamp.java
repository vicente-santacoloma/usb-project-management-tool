package ve.usb.cohesion.runtime;

import java.text.SimpleDateFormat;
import java.util.Date;

/** An instance of Date that prints dates as a taimestamp.
 */
public class Timestamp extends Date {

    public static SimpleDateFormat timestampFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.S");

    public Timestamp(Date date) {
        setTime(date.getTime());
    }

    public Timestamp(String date) {
        try {
            setTime(timestampFormat.parse(date).getTime());
        } catch (Exception e) {}
    }

    public String toString() {
        return timestampFormat.format(this);
    }

}
