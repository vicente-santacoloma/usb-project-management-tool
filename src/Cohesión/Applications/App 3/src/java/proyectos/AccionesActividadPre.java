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

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import ve.usb.cohesion.runtime.HibernateUtil;
import proyectos.hibernate.*;


/**
 * 
 */
public class AccionesActividadPre extends CohesionAction {
    
/**
     * Called by Struts for the execution of action APreCrear_actividadPre.
     * 
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @return The Struts name of the following step.
     * @throws java.lang.Exception For untreated exceptions. 
     * These exceptios will normally be treated with 
     * the default exception action.
     */
    public ActionForward APreCrear_actividadPre(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"VCrear_actividadPre", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FActividadPre fFActividadPre = FActividadPre.clear(mapping, request);

             //Feed for combo listActividad.
             {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
                (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
                "select new ve.usb.cohesion.runtime.Pair(descripcion, idActividad) " + 
                "from Actividad").list();
              list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
              fFActividadPre.setListActividad(list);
             }


            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action APreListar_actividadPre.
     * 
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @return The Struts name of the following step.
     * @throws java.lang.Exception For untreated exceptions. 
     * These exceptios will normally be treated with 
     * the default exception action.
     */
    public ActionForward APreListar_actividadPre(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"VListar_actividadPre", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            String crit = (String)request.getSession().getAttribute("ABuscar_actividadPre_campo");
            java.util.List<ActividadPre> list;
            if (crit==null) {
                list = (java.util.List<ActividadPre>)s.createQuery("from ActividadPre").list();
            } else {
                String valor = (String)request.getSession().getAttribute("ABuscar_actividadPre_valor");
                list = (java.util.List<ActividadPre>)
                   s.createQuery("from ActividadPre where "+crit+" like :valor")
                    .setString("valor", valor).list();
                request.getSession().removeAttribute("ABuscar_actividadPre_campo");
                request.getSession().removeAttribute("ABuscar_actividadPre_valor");
            }
            request.setAttribute("L_ActividadPre", list);
            for (ActividadPre actividadPre:list) {
                if (actividadPre.getActividad()!=null) actividadPre.getActividad().getDescripcion();
            }


            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action APre_actividadPre.
     * 
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @return The Struts name of the following step.
     * @throws java.lang.Exception For untreated exceptions. 
     * These exceptios will normally be treated with 
     * the default exception action.
     */
    public ActionForward APre_actividadPre(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_actividadPre", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            Long idActividadPre = lookup_Long(request, "idActividadPre");
            
            FActividadPre fFActividadPre = FActividadPre.clear(mapping, request);
            ActividadPre actividadPre = (ActividadPre)s.load(ActividadPre.class, idActividadPre);
            fFActividadPre.setIdActividadPre(actividadPre.getIdActividadPre());

            fFActividadPre.setPrerequisito(actividadPre.getPrerequisito().getIdActividad());

            if (actividadPre.getActividad()!=null) {
                fFActividadPre.setActividad(actividadPre.getActividad().getIdActividad());
            } else {
                fFActividadPre.setActividad(0L);
            }

            //Feed for combo listActividad.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(descripcion, idActividad) " + 
               "from Actividad").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFActividadPre.setListActividad(list);
            }


            request.getSession().setAttribute("idActividad_super", fFActividadPre.getPrerequisito());

            request.getSession().setAttribute("idActividadPre", idActividadPre);
            request.getSession().setAttribute("idActividadPre_super", idActividadPre);

            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action AAct_actividadPre.
     * 
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @return The Struts name of the following step.
     * @throws java.lang.Exception For untreated exceptions. 
     * These exceptios will normally be treated with 
     * the default exception action.
     */
    public ActionForward AAct_actividadPre(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_actividadPre", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FActividadPre fFActividadPre = (FActividadPre)form;
            ActividadPre actividadPre = (ActividadPre)s.load(ActividadPre.class, fFActividadPre.getIdActividadPre());
            if (fFActividadPre.getActividad()==0) actividadPre.setActividad(null);
            else if ((actividadPre.getActividad()==null) ||
                    (actividadPre.getActividad().getIdActividad()!=fFActividadPre.getActividad())) {
                Actividad __obj = (Actividad)s.load(Actividad.class, fFActividadPre.getActividad());
                actividadPre.setActividad(__obj);
            }


            //Feed for combo listActividad.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(descripcion, idActividad) " + 
               "from Actividad").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFActividadPre.setListActividad(list);
            }

            request.getSession().setAttribute("idActividadPre", actividadPre.getIdActividadPre());
            request.getSession().setAttribute("idActividadPre_super", actividadPre.getIdActividadPre());

            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("AAct_actividadPre.msg0"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action AElim_actividadPre.
     * 
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @return The Struts name of the following step.
     * @throws java.lang.Exception For untreated exceptions. 
     * These exceptios will normally be treated with 
     * the default exception action.
     */
    public ActionForward AElim_actividadPre(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"APreListar_actividadPre", "V_actividadPre", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            Long idActividadPre = lookup_Long(request, "idActividadPre");
            ActividadPre actividadPre = (ActividadPre)s.load(ActividadPre.class, idActividadPre);
            s.delete(actividadPre);
            try {
                s.flush();
            } catch (Exception ex1) {
                ex1.printStackTrace();
                salida = SALIDA_1;
            }

            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("AElim_actividadPre.msg0"));
        }
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("AElim_actividadPre.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action ACrear_actividadPre.
     * 
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @return The Struts name of the following step.
     * @throws java.lang.Exception For untreated exceptions. 
     * These exceptios will normally be treated with 
     * the default exception action.
     */
    public ActionForward ACrear_actividadPre(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_actividadPre", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FActividadPre fFActividadPre = (FActividadPre)form;
            ActividadPre actividadPre = new ActividadPre();
            if (fFActividadPre.getActividad()==0) actividadPre.setActividad(null);
            else {
                Actividad __obj = (Actividad)s.load(Actividad.class, fFActividadPre.getActividad());
                actividadPre.setActividad(__obj);
            }

            s.save(actividadPre);
            s.flush();
            fFActividadPre.setIdActividadPre(actividadPre.getIdActividadPre());

            //Feed for combo listActividad.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(descripcion, idActividad) " + 
               "from Actividad").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFActividadPre.setListActividad(list);
            }

            request.getSession().setAttribute("idActividadPre", actividadPre.getIdActividadPre());
            request.getSession().setAttribute("idActividadPre_super", actividadPre.getIdActividadPre());

            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("ACrear_actividadPre.msg0"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action APreCrear_actividadPre_actividad.
     * 
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @return The Struts name of the following step.
     * @throws java.lang.Exception For untreated exceptions. 
     * These exceptios will normally be treated with 
     * the default exception action.
     */
    public ActionForward APreCrear_actividadPre_actividad(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"VCrear_actividadPre_actividad", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FActividadPre fFActividadPre = FActividadPre.clear(mapping, request);

            //Feed for combo listActividad.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(descripcion, idActividad) " + 
               "from Actividad").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFActividadPre.setListActividad(list);
            }

            fFActividadPre.setPrerequisito(Long.parseLong((String)request.getParameter("idActividad_super")));

            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        return mapping.findForward(SALIDAS[salida]);
    }



}