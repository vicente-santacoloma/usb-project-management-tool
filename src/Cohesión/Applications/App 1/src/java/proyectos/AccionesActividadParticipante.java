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
public class AccionesActividadParticipante extends CohesionAction {
    
/**
     * Called by Struts for the execution of action APreCrear_actividadParticipante.
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
    public ActionForward APreCrear_actividadParticipante(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"VCrear_actividadParticipante", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FActividadParticipante fFActividadParticipante = FActividadParticipante.clear(mapping, request);

             //Feed for combo listActividad.
             {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
                (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
                "select new ve.usb.cohesion.runtime.Pair(descripcion, idActividad) " + 
                "from Actividad").list();
              list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
              fFActividadParticipante.setListActividad(list);
             }
             //Feed for combo listParticipantes.
             {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
                (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
                "select new ve.usb.cohesion.runtime.Pair(nombre, idParticipantes) " + 
                "from Participantes").list();
              list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
              fFActividadParticipante.setListParticipantes(list);
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
     * Called by Struts for the execution of action APreBuscar_actividadParticipante.
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
    public ActionForward APreBuscar_actividadParticipante(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"VBuscar_actividadParticipante", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FActividadParticipanteBuscar.clear(mapping, request);

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
     * Called by Struts for the execution of action ABuscar_actividadParticipante.
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
    public ActionForward ABuscar_actividadParticipante(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"APreListar_actividadParticipante", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FActividadParticipanteBuscar fFActividadParticipanteBuscar = (FActividadParticipanteBuscar)form;
            request.getSession().setAttribute("ABuscar_actividadParticipante_campo", "tiempoParticipacion");
            request.getSession().setAttribute("ABuscar_actividadParticipante_valor", "%" + fFActividadParticipanteBuscar.getTiempoParticipacion() + "%");

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
     * Called by Struts for the execution of action APreListar_actividadParticipante.
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
    public ActionForward APreListar_actividadParticipante(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"VListar_actividadParticipante", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            String crit = (String)request.getSession().getAttribute("ABuscar_actividadParticipante_campo");
            java.util.List<ActividadParticipante> list;
            if (crit==null) {
                list = (java.util.List<ActividadParticipante>)s.createQuery("from ActividadParticipante").list();
            } else {
                String valor = (String)request.getSession().getAttribute("ABuscar_actividadParticipante_valor");
                list = (java.util.List<ActividadParticipante>)
                   s.createQuery("from ActividadParticipante where "+crit+" like :valor")
                    .setString("valor", valor).list();
                request.getSession().removeAttribute("ABuscar_actividadParticipante_campo");
                request.getSession().removeAttribute("ABuscar_actividadParticipante_valor");
            }
            request.setAttribute("L_ActividadParticipante", list);
            for (ActividadParticipante actividadParticipante:list) {
                if (actividadParticipante.getParticipante()!=null) actividadParticipante.getParticipante().getNombre();
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
     * Called by Struts for the execution of action APre_actividadParticipante.
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
    public ActionForward APre_actividadParticipante(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_actividadParticipante", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            Long idActividadParticipante = lookup_Long(request, "idActividadParticipante");
            
            FActividadParticipante fFActividadParticipante = FActividadParticipante.clear(mapping, request);
            ActividadParticipante actividadParticipante = (ActividadParticipante)s.load(ActividadParticipante.class, idActividadParticipante);
            fFActividadParticipante.setIdActividadParticipante(actividadParticipante.getIdActividadParticipante());

            fFActividadParticipante.setParticipante(actividadParticipante.getParticipante().getIdParticipantes());

            fFActividadParticipante.setActividad(actividadParticipante.getActividad().getIdActividad());

            if (actividadParticipante.getParticipante()!=null) {
                fFActividadParticipante.setParticipante(actividadParticipante.getParticipante().getIdParticipantes());
            } else {
                fFActividadParticipante.setParticipante(0L);
            }
            fFActividadParticipante.setTiempoParticipacion(actividadParticipante.getTiempoParticipacion());

            //Feed for combo listActividad.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(descripcion, idActividad) " + 
               "from Actividad").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFActividadParticipante.setListActividad(list);
            }
            //Feed for combo listParticipantes.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(nombre, idParticipantes) " + 
               "from Participantes").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFActividadParticipante.setListParticipantes(list);
            }


            request.getSession().setAttribute("idParticipantes_super", fFActividadParticipante.getParticipante());

            request.getSession().setAttribute("idActividad_super", fFActividadParticipante.getActividad());

            request.getSession().setAttribute("idActividadParticipante", idActividadParticipante);
            request.getSession().setAttribute("idActividadParticipante_super", idActividadParticipante);

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
     * Called by Struts for the execution of action AAct_actividadParticipante.
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
    public ActionForward AAct_actividadParticipante(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_actividadParticipante", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FActividadParticipante fFActividadParticipante = (FActividadParticipante)form;
            ActividadParticipante actividadParticipante = (ActividadParticipante)s.load(ActividadParticipante.class, fFActividadParticipante.getIdActividadParticipante());
            if (fFActividadParticipante.getParticipante()==0) actividadParticipante.setParticipante(null);
            else if ((actividadParticipante.getParticipante()==null) ||
                    (actividadParticipante.getParticipante().getIdParticipantes()!=fFActividadParticipante.getParticipante())) {
                Participantes __obj = (Participantes)s.load(Participantes.class, fFActividadParticipante.getParticipante());
                actividadParticipante.setParticipante(__obj);
            }
            actividadParticipante.setTiempoParticipacion(fFActividadParticipante.getTiempoParticipacion());


            //Feed for combo listActividad.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(descripcion, idActividad) " + 
               "from Actividad").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFActividadParticipante.setListActividad(list);
            }
            //Feed for combo listParticipantes.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(nombre, idParticipantes) " + 
               "from Participantes").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFActividadParticipante.setListParticipantes(list);
            }

            request.getSession().setAttribute("idActividadParticipante", actividadParticipante.getIdActividadParticipante());
            request.getSession().setAttribute("idActividadParticipante_super", actividadParticipante.getIdActividadParticipante());

            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("AAct_actividadParticipante.msg0"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action AElim_actividadParticipante.
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
    public ActionForward AElim_actividadParticipante(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"APreListar_actividadParticipante", "V_actividadParticipante", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            Long idActividadParticipante = lookup_Long(request, "idActividadParticipante");
            ActividadParticipante actividadParticipante = (ActividadParticipante)s.load(ActividadParticipante.class, idActividadParticipante);
            s.delete(actividadParticipante);
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
            getResources(request).getMessage("AElim_actividadParticipante.msg0"));
        }
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("AElim_actividadParticipante.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action ACrear_actividadParticipante.
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
    public ActionForward ACrear_actividadParticipante(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_actividadParticipante", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FActividadParticipante fFActividadParticipante = (FActividadParticipante)form;
            ActividadParticipante actividadParticipante = new ActividadParticipante();
            if (fFActividadParticipante.getParticipante()==0) actividadParticipante.setParticipante(null);
            else {
                Participantes __obj = (Participantes)s.load(Participantes.class, fFActividadParticipante.getParticipante());
                actividadParticipante.setParticipante(__obj);
            }
            actividadParticipante.setTiempoParticipacion(fFActividadParticipante.getTiempoParticipacion());

            s.save(actividadParticipante);
            s.flush();
            fFActividadParticipante.setIdActividadParticipante(actividadParticipante.getIdActividadParticipante());

            //Feed for combo listActividad.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(descripcion, idActividad) " + 
               "from Actividad").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFActividadParticipante.setListActividad(list);
            }
            //Feed for combo listParticipantes.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(nombre, idParticipantes) " + 
               "from Participantes").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFActividadParticipante.setListParticipantes(list);
            }

            request.getSession().setAttribute("idActividadParticipante", actividadParticipante.getIdActividadParticipante());
            request.getSession().setAttribute("idActividadParticipante_super", actividadParticipante.getIdActividadParticipante());

            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("ACrear_actividadParticipante.msg0"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action APreCrear_actividadParticipante_participantes.
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
    public ActionForward APreCrear_actividadParticipante_participantes(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"VCrear_actividadParticipante_participantes", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FActividadParticipante fFActividadParticipante = FActividadParticipante.clear(mapping, request);

            //Feed for combo listActividad.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(descripcion, idActividad) " + 
               "from Actividad").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFActividadParticipante.setListActividad(list);
            }
            //Feed for combo listParticipantes.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(nombre, idParticipantes) " + 
               "from Participantes").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFActividadParticipante.setListParticipantes(list);
            }

            fFActividadParticipante.setParticipante(Long.parseLong((String)request.getParameter("idParticipantes_super")));

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
     * Called by Struts for the execution of action APreCrear_actividadParticipante_actividad.
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
    public ActionForward APreCrear_actividadParticipante_actividad(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"VCrear_actividadParticipante_actividad", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FActividadParticipante fFActividadParticipante = FActividadParticipante.clear(mapping, request);

            //Feed for combo listActividad.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(descripcion, idActividad) " + 
               "from Actividad").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFActividadParticipante.setListActividad(list);
            }
            //Feed for combo listParticipantes.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(nombre, idParticipantes) " + 
               "from Participantes").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFActividadParticipante.setListParticipantes(list);
            }

            fFActividadParticipante.setActividad(Long.parseLong((String)request.getParameter("idActividad_super")));

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