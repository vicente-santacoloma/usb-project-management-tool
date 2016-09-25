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
public class AccionesActividadArtefacto extends CohesionAction {
    
/**
     * Called by Struts for the execution of action APreCrear_actividadArtefacto.
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
    public ActionForward APreCrear_actividadArtefacto(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"VCrear_actividadArtefacto", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FActividadArtefacto fFActividadArtefacto = FActividadArtefacto.clear(mapping, request);

             //Feed for combo listActividad.
             {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
                (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
                "select new ve.usb.cohesion.runtime.Pair(descripcion, idActividad) " + 
                "from Actividad").list();
              list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
              fFActividadArtefacto.setListActividad(list);
             }
             //Feed for combo listArtefacto.
             {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
                (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
                "select new ve.usb.cohesion.runtime.Pair(titulo, idArtefacto) " + 
                "from Artefacto").list();
              list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
              fFActividadArtefacto.setListArtefacto(list);
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
     * Called by Struts for the execution of action APreListar_actividadArtefacto.
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
    public ActionForward APreListar_actividadArtefacto(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"VListar_actividadArtefacto", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            String crit = (String)request.getSession().getAttribute("ABuscar_actividadArtefacto_campo");
            java.util.List<ActividadArtefacto> list;
            if (crit==null) {
                list = (java.util.List<ActividadArtefacto>)s.createQuery("from ActividadArtefacto").list();
            } else {
                String valor = (String)request.getSession().getAttribute("ABuscar_actividadArtefacto_valor");
                list = (java.util.List<ActividadArtefacto>)
                   s.createQuery("from ActividadArtefacto where "+crit+" like :valor")
                    .setString("valor", valor).list();
                request.getSession().removeAttribute("ABuscar_actividadArtefacto_campo");
                request.getSession().removeAttribute("ABuscar_actividadArtefacto_valor");
            }
            request.setAttribute("L_ActividadArtefacto", list);
            for (ActividadArtefacto actividadArtefacto:list) {
                if (actividadArtefacto.getActividad()!=null) actividadArtefacto.getActividad().getDescripcion();
            }
            for (ActividadArtefacto actividadArtefacto:list) {
                if (actividadArtefacto.getArtefacto()!=null) actividadArtefacto.getArtefacto().getTitulo();
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
     * Called by Struts for the execution of action APre_actividadArtefacto.
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
    public ActionForward APre_actividadArtefacto(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_actividadArtefacto", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            Long idActividadArtefacto = lookup_Long(request, "idActividadArtefacto");
            
            FActividadArtefacto fFActividadArtefacto = FActividadArtefacto.clear(mapping, request);
            ActividadArtefacto actividadArtefacto = (ActividadArtefacto)s.load(ActividadArtefacto.class, idActividadArtefacto);
            fFActividadArtefacto.setIdActividadArtefacto(actividadArtefacto.getIdActividadArtefacto());

            fFActividadArtefacto.setDocumento(actividadArtefacto.getDocumento().getIdArtefacto());

            if (actividadArtefacto.getActividad()!=null) {
                fFActividadArtefacto.setActividad(actividadArtefacto.getActividad().getIdActividad());
            } else {
                fFActividadArtefacto.setActividad(0L);
            }
            if (actividadArtefacto.getArtefacto()!=null) {
                fFActividadArtefacto.setArtefacto(actividadArtefacto.getArtefacto().getIdArtefacto());
            } else {
                fFActividadArtefacto.setArtefacto(0L);
            }

            //Feed for combo listActividad.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(descripcion, idActividad) " + 
               "from Actividad").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFActividadArtefacto.setListActividad(list);
            }
            //Feed for combo listArtefacto.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(titulo, idArtefacto) " + 
               "from Artefacto").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFActividadArtefacto.setListArtefacto(list);
            }


            request.getSession().setAttribute("idArtefacto_super", fFActividadArtefacto.getDocumento());

            request.getSession().setAttribute("idActividadArtefacto", idActividadArtefacto);
            request.getSession().setAttribute("idActividadArtefacto_super", idActividadArtefacto);

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
     * Called by Struts for the execution of action AAct_actividadArtefacto.
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
    public ActionForward AAct_actividadArtefacto(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_actividadArtefacto", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FActividadArtefacto fFActividadArtefacto = (FActividadArtefacto)form;
            ActividadArtefacto actividadArtefacto = (ActividadArtefacto)s.load(ActividadArtefacto.class, fFActividadArtefacto.getIdActividadArtefacto());
            if (fFActividadArtefacto.getActividad()==0) actividadArtefacto.setActividad(null);
            else if ((actividadArtefacto.getActividad()==null) ||
                    (actividadArtefacto.getActividad().getIdActividad()!=fFActividadArtefacto.getActividad())) {
                Actividad __obj = (Actividad)s.load(Actividad.class, fFActividadArtefacto.getActividad());
                actividadArtefacto.setActividad(__obj);
            }
            if (fFActividadArtefacto.getArtefacto()==0) actividadArtefacto.setArtefacto(null);
            else if ((actividadArtefacto.getArtefacto()==null) ||
                    (actividadArtefacto.getArtefacto().getIdArtefacto()!=fFActividadArtefacto.getArtefacto())) {
                Artefacto __obj = (Artefacto)s.load(Artefacto.class, fFActividadArtefacto.getArtefacto());
                actividadArtefacto.setArtefacto(__obj);
            }


            //Feed for combo listActividad.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(descripcion, idActividad) " + 
               "from Actividad").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFActividadArtefacto.setListActividad(list);
            }
            //Feed for combo listArtefacto.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(titulo, idArtefacto) " + 
               "from Artefacto").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFActividadArtefacto.setListArtefacto(list);
            }

            request.getSession().setAttribute("idActividadArtefacto", actividadArtefacto.getIdActividadArtefacto());
            request.getSession().setAttribute("idActividadArtefacto_super", actividadArtefacto.getIdActividadArtefacto());

            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("AAct_actividadArtefacto.msg0"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action AElim_actividadArtefacto.
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
    public ActionForward AElim_actividadArtefacto(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"APreListar_actividadArtefacto", "V_actividadArtefacto", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            Long idActividadArtefacto = lookup_Long(request, "idActividadArtefacto");
            ActividadArtefacto actividadArtefacto = (ActividadArtefacto)s.load(ActividadArtefacto.class, idActividadArtefacto);
            s.delete(actividadArtefacto);
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
            getResources(request).getMessage("AElim_actividadArtefacto.msg0"));
        }
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("AElim_actividadArtefacto.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action ACrear_actividadArtefacto.
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
    public ActionForward ACrear_actividadArtefacto(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_actividadArtefacto", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FActividadArtefacto fFActividadArtefacto = (FActividadArtefacto)form;
            ActividadArtefacto actividadArtefacto = new ActividadArtefacto();
            if (fFActividadArtefacto.getActividad()==0) actividadArtefacto.setActividad(null);
            else {
                Actividad __obj = (Actividad)s.load(Actividad.class, fFActividadArtefacto.getActividad());
                actividadArtefacto.setActividad(__obj);
            }
            if (fFActividadArtefacto.getArtefacto()==0) actividadArtefacto.setArtefacto(null);
            else {
                Artefacto __obj = (Artefacto)s.load(Artefacto.class, fFActividadArtefacto.getArtefacto());
                actividadArtefacto.setArtefacto(__obj);
            }

            s.save(actividadArtefacto);
            s.flush();
            fFActividadArtefacto.setIdActividadArtefacto(actividadArtefacto.getIdActividadArtefacto());

            //Feed for combo listActividad.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(descripcion, idActividad) " + 
               "from Actividad").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFActividadArtefacto.setListActividad(list);
            }
            //Feed for combo listArtefacto.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(titulo, idArtefacto) " + 
               "from Artefacto").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFActividadArtefacto.setListArtefacto(list);
            }

            request.getSession().setAttribute("idActividadArtefacto", actividadArtefacto.getIdActividadArtefacto());
            request.getSession().setAttribute("idActividadArtefacto_super", actividadArtefacto.getIdActividadArtefacto());

            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("ACrear_actividadArtefacto.msg0"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action APreCrear_actividadArtefacto_artefacto.
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
    public ActionForward APreCrear_actividadArtefacto_artefacto(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"VCrear_actividadArtefacto_artefacto", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FActividadArtefacto fFActividadArtefacto = FActividadArtefacto.clear(mapping, request);

            //Feed for combo listActividad.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(descripcion, idActividad) " + 
               "from Actividad").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFActividadArtefacto.setListActividad(list);
            }
            //Feed for combo listArtefacto.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(titulo, idArtefacto) " + 
               "from Artefacto").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFActividadArtefacto.setListArtefacto(list);
            }

            fFActividadArtefacto.setDocumento(Long.parseLong((String)request.getParameter("idArtefacto_super")));

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