package proyectos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import ve.usb.cohesion.runtime.CohesionAction;


/**
 * <br>
 */
public class Acciones_tooltips extends CohesionAction {
    
/**
     * Acci??n llamada por Struts para ejecutar la acci??n tooltip.
     * 
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    public ActionForward tooltip(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        //Salidas
        final String SALIDA_0 = "Info";

        String salida = SALIDA_0;

        String name = request.getParameter("V");
        if (name==null && name.length()==0) name="null";
        request.setAttribute("title", name+".title");
        request.setAttribute("contents", name+".contents");


            return mapping.findForward(salida);
    }



}