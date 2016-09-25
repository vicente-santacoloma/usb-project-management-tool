package ve.usb.cohesion.runtime;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.actions.MappingDispatchAction;



/**
 * Registro y conexión de usuarios. Incluye la página principal de la aplicación.<br>
 */
public class CohesionAction extends MappingDispatchAction {

    /**
     * Helper method to add messages for the Struts error handling.
     * @param request The request structure.
     * @param msg The message to be sent.
     * @param args Its optional argument (arg[0]).
     */
    public void addError(HttpServletRequest request, String msg, String... args) {
        ActionMessages err = getErrors(request);
        if (args.length>0) {
            err.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(msg,args[0]));
        } else err.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(msg));
        addErrors(request, err);
    }

    /**
     * Helper method to lookup for an attribute among the parameters, the reques, or the session.
     * @param request The request structure.
     * @param attribute Attribute name to llok for.
     * @return The value of the attribute. Null when not found.
     */
    public static Object lookup(HttpServletRequest request, String attribute) {
        Object result = request.getAttribute(attribute);
        if (result == null) {
            result = request.getParameter(attribute);
            if (result == null) {
                result = request.getSession().getAttribute(attribute);
            }
        }

        return result;
    }

    /**
     * Helper method to lookup for a long attribute among the parameters, the reques, or the session.
     * @param reques the request structure.
     * @param attribute attribute name to llok for.
     * @return The long value of the attribute. 0l when not found.
     */
    public static long lookup_long(HttpServletRequest request, String attribute) {
        Object objectResult = lookup(request, attribute);
        if (objectResult!=null) {
            if (objectResult instanceof Long) return ((Long)objectResult).longValue();
            else if (objectResult instanceof String) {
                try {
                    return Long.parseLong((String)objectResult);
                } catch (Exception e) {}
            }
        }

        return 0l;
    }

    /**
     * Helper method to lookup for a long attribute among the parameters, the reques, or the session.
     * @param reques the request structure.
     * @param attribute attribute name to llok for.
     * @return The Long value of the attribute. Null when not found.
     */
    public static Long lookup_Long(HttpServletRequest request, String attribute) {
        Object objectResult = lookup(request, attribute);
        if (objectResult!=null) {
            if (objectResult instanceof Long) return (Long)objectResult;
            else if (objectResult instanceof String) {
                try {
                    return new Long((String)objectResult);
                } catch (Exception e) {}
            }
        }

        return null;
    }

    /**
     * Checks if str is null o an empty string.
     * @param str A string to check
     * @return true when str es null or an empty string.
     */
    public static boolean isEmpty(String str) {
        return (str==null || str.length()==0);
    }

}