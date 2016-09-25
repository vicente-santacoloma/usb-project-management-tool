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
public class AccionesRolActividad extends CohesionAction {
    
/**
     * Called by Struts for the execution of action APreCrear_rolActividad.
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
    public ActionForward APreCrear_rolActividad(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"VCrear_rolActividad", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FRolActividad fFRolActividad = FRolActividad.clear(mapping, request);

             //Feed for combo listRol.
             {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
                (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
                "select new ve.usb.cohesion.runtime.Pair(descripcion, idRol) " + 
                "from Rol").list();
              list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
              fFRolActividad.setListRol(list);
             }
             //Feed for combo listActividad.
             {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
                (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
                "select new ve.usb.cohesion.runtime.Pair(descripcion, idActividad) " + 
                "from Actividad").list();
              list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
              fFRolActividad.setListActividad(list);
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
     * Called by Struts for the execution of action APreListar_rolActividad.
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
    public ActionForward APreListar_rolActividad(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"VListar_rolActividad", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            String crit = (String)request.getSession().getAttribute("ABuscar_rolActividad_campo");
            java.util.List<RolActividad> list;
            if (crit==null) {
                list = (java.util.List<RolActividad>)s.createQuery("from RolActividad").list();
            } else {
                String valor = (String)request.getSession().getAttribute("ABuscar_rolActividad_valor");
                list = (java.util.List<RolActividad>)
                   s.createQuery("from RolActividad where "+crit+" like :valor")
                    .setString("valor", valor).list();
                request.getSession().removeAttribute("ABuscar_rolActividad_campo");
                request.getSession().removeAttribute("ABuscar_rolActividad_valor");
            }
            request.setAttribute("L_RolActividad", list);
            for (RolActividad rolActividad:list) {
                if (rolActividad.getRol()!=null) rolActividad.getRol().getDescripcion();
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
     * Called by Struts for the execution of action APre_rolActividad.
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
    public ActionForward APre_rolActividad(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_rolActividad", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            Long idRolActividad = lookup_Long(request, "idRolActividad");
            
            FRolActividad fFRolActividad = FRolActividad.clear(mapping, request);
            RolActividad rolActividad = (RolActividad)s.load(RolActividad.class, idRolActividad);
            fFRolActividad.setIdRolActividad(rolActividad.getIdRolActividad());

            fFRolActividad.setActividad(rolActividad.getActividad().getIdActividad());

            if (rolActividad.getRol()!=null) {
                fFRolActividad.setRol(rolActividad.getRol().getIdRol());
            } else {
                fFRolActividad.setRol(0L);
            }

            //Feed for combo listRol.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(descripcion, idRol) " + 
               "from Rol").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFRolActividad.setListRol(list);
            }
            //Feed for combo listActividad.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(descripcion, idActividad) " + 
               "from Actividad").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFRolActividad.setListActividad(list);
            }


            request.getSession().setAttribute("idActividad_super", fFRolActividad.getActividad());

            request.getSession().setAttribute("idRolActividad", idRolActividad);
            request.getSession().setAttribute("idRolActividad_super", idRolActividad);

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
     * Called by Struts for the execution of action AAct_rolActividad.
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
    public ActionForward AAct_rolActividad(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_rolActividad", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FRolActividad fFRolActividad = (FRolActividad)form;
            RolActividad rolActividad = (RolActividad)s.load(RolActividad.class, fFRolActividad.getIdRolActividad());
            if (fFRolActividad.getRol()==0) rolActividad.setRol(null);
            else if ((rolActividad.getRol()==null) ||
                    (rolActividad.getRol().getIdRol()!=fFRolActividad.getRol())) {
                Rol __obj = (Rol)s.load(Rol.class, fFRolActividad.getRol());
                rolActividad.setRol(__obj);
            }


            //Feed for combo listRol.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(descripcion, idRol) " + 
               "from Rol").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFRolActividad.setListRol(list);
            }
            //Feed for combo listActividad.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(descripcion, idActividad) " + 
               "from Actividad").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFRolActividad.setListActividad(list);
            }

            request.getSession().setAttribute("idRolActividad", rolActividad.getIdRolActividad());
            request.getSession().setAttribute("idRolActividad_super", rolActividad.getIdRolActividad());

            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("AAct_rolActividad.msg0"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action AElim_rolActividad.
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
    public ActionForward AElim_rolActividad(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"APreListar_rolActividad", "V_rolActividad", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            Long idRolActividad = lookup_Long(request, "idRolActividad");
            RolActividad rolActividad = (RolActividad)s.load(RolActividad.class, idRolActividad);
            s.delete(rolActividad);
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
            getResources(request).getMessage("AElim_rolActividad.msg0"));
        }
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("AElim_rolActividad.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action ACrear_rolActividad.
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
    public ActionForward ACrear_rolActividad(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_rolActividad", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FRolActividad fFRolActividad = (FRolActividad)form;
            RolActividad rolActividad = new RolActividad();
            if (fFRolActividad.getRol()==0) rolActividad.setRol(null);
            else {
                Rol __obj = (Rol)s.load(Rol.class, fFRolActividad.getRol());
                rolActividad.setRol(__obj);
            }

            s.save(rolActividad);
            s.flush();
            fFRolActividad.setIdRolActividad(rolActividad.getIdRolActividad());

            //Feed for combo listRol.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(descripcion, idRol) " + 
               "from Rol").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFRolActividad.setListRol(list);
            }
            //Feed for combo listActividad.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(descripcion, idActividad) " + 
               "from Actividad").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFRolActividad.setListActividad(list);
            }

            request.getSession().setAttribute("idRolActividad", rolActividad.getIdRolActividad());
            request.getSession().setAttribute("idRolActividad_super", rolActividad.getIdRolActividad());

            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("ACrear_rolActividad.msg0"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action APreCrear_rolActividad_actividad.
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
    public ActionForward APreCrear_rolActividad_actividad(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"VCrear_rolActividad_actividad", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FRolActividad fFRolActividad = FRolActividad.clear(mapping, request);

            //Feed for combo listRol.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(descripcion, idRol) " + 
               "from Rol").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFRolActividad.setListRol(list);
            }
            //Feed for combo listActividad.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(descripcion, idActividad) " + 
               "from Actividad").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFRolActividad.setListActividad(list);
            }

            fFRolActividad.setActividad(Long.parseLong((String)request.getParameter("idActividad_super")));

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