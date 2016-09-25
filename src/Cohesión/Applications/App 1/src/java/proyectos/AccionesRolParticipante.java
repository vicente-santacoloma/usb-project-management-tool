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
public class AccionesRolParticipante extends CohesionAction {
    
/**
     * Called by Struts for the execution of action APreCrear_rolParticipante_participantes.
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
    public ActionForward APreCrear_rolParticipante_participantes(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"VCrear_rolParticipante_participantes", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FRolParticipante fFRolParticipante = FRolParticipante.clear(mapping, request);
             
            //Feed for combo listRol.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(descripcion, idRol) " + 
               "from Rol").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFRolParticipante.setListRol(list);
            }
            //Feed for combo listParticipantes.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(nombre, idParticipantes) " + 
               "from Participantes").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFRolParticipante.setListParticipantes(list);
            }

            fFRolParticipante.setParticipante(Long.parseLong((String)request.getParameter("idParticipantes_super")));

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
     * Called by Struts for the execution of action APreCrear_rolParticipante_rol.
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
    public ActionForward APreCrear_rolParticipante_rol(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"VCrear_rolParticipante_rol", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FRolParticipante fFRolParticipante = FRolParticipante.clear(mapping, request);
             
            //Feed for combo listRol.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(descripcion, idRol) " + 
               "from Rol").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFRolParticipante.setListRol(list);
            }
            //Feed for combo listParticipantes.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(nombre, idParticipantes) " + 
               "from Participantes").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFRolParticipante.setListParticipantes(list);
            }

            fFRolParticipante.setRol(Long.parseLong((String)request.getParameter("idRol_super")));

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
     * Called by Struts for the execution of action APre_rolParticipante.
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
    public ActionForward APre_rolParticipante(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_rolParticipante", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            Long idRolParticipante = lookup_Long(request, "idRolParticipante");
            
            FRolParticipante fFRolParticipante = FRolParticipante.clear(mapping, request);
            RolParticipante rolParticipante = (RolParticipante)s.load(RolParticipante.class, idRolParticipante);
            fFRolParticipante.setIdRolParticipante(rolParticipante.getIdRolParticipante());

            fFRolParticipante.setParticipante(rolParticipante.getParticipante().getIdParticipantes());

            fFRolParticipante.setRol(rolParticipante.getRol().getIdRol());

            if (rolParticipante.getParticipante()!=null) {
                fFRolParticipante.setParticipante(rolParticipante.getParticipante().getIdParticipantes());
            } else {
                fFRolParticipante.setParticipante(0L);
            }

            //Feed for combo listRol.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(descripcion, idRol) " + 
               "from Rol").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFRolParticipante.setListRol(list);
            }
            //Feed for combo listParticipantes.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(nombre, idParticipantes) " + 
               "from Participantes").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFRolParticipante.setListParticipantes(list);
            }


            request.getSession().setAttribute("idParticipantes_super", fFRolParticipante.getParticipante());

            request.getSession().setAttribute("idRol_super", fFRolParticipante.getRol());

            request.getSession().setAttribute("idRolParticipante", idRolParticipante);
            request.getSession().setAttribute("idRolParticipante_super", idRolParticipante);

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
     * Called by Struts for the execution of action AAct_rolParticipante.
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
    public ActionForward AAct_rolParticipante(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_rolParticipante", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FRolParticipante fFRolParticipante = (FRolParticipante)form;
            RolParticipante rolParticipante = (RolParticipante)s.load(RolParticipante.class, fFRolParticipante.getIdRolParticipante());
            if (fFRolParticipante.getParticipante()==0) rolParticipante.setParticipante(null);
            else if ((rolParticipante.getParticipante()==null) ||
                    (rolParticipante.getParticipante().getIdParticipantes()!=fFRolParticipante.getParticipante())) {
                Participantes __obj = (Participantes)s.load(Participantes.class, fFRolParticipante.getParticipante());
                rolParticipante.setParticipante(__obj);
            }


            //Feed for combo listRol.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(descripcion, idRol) " + 
               "from Rol").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFRolParticipante.setListRol(list);
            }
            //Feed for combo listParticipantes.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(nombre, idParticipantes) " + 
               "from Participantes").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFRolParticipante.setListParticipantes(list);
            }


            request.getSession().setAttribute("idParticipantes_super", fFRolParticipante.getParticipante());

            request.getSession().setAttribute("idRol_super", fFRolParticipante.getRol());

            request.getSession().setAttribute("idRolParticipante", rolParticipante.getIdRolParticipante());

            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("AAct_rolParticipante.msg0"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action AElim_rolParticipante.
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
    public ActionForward AElim_rolParticipante(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"APre_participantes", "V_rolParticipante", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            Long idRolParticipante = lookup_Long(request, "idRolParticipante");
            RolParticipante rolParticipante = (RolParticipante)s.load(RolParticipante.class, idRolParticipante);

            long idParticipantes_super = rolParticipante.getParticipante().getIdParticipantes();
            rolParticipante.getParticipante().removeFromRoles(rolParticipante);

            long idRol_super = rolParticipante.getRol().getIdRol();
            rolParticipante.getRol().removeFromParticipantes(rolParticipante);

            try {
                s.flush();
                request.getSession().setAttribute("idRolParticipante", idRolParticipante);

                request.getSession().setAttribute("idParticipantes_super", idParticipantes_super);

                request.getSession().setAttribute("idRol_super", idRol_super);

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
            getResources(request).getMessage("AElim_rolParticipante.msg0"));
        }
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("AElim_rolParticipante.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action ACrear_rolParticipante.
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
    public ActionForward ACrear_rolParticipante(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_rolParticipante", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FRolParticipante fFRolParticipante = (FRolParticipante)form;
            RolParticipante rolParticipante = new RolParticipante();
            if (fFRolParticipante.getParticipante()==0) rolParticipante.setParticipante(null);
            else {
                Participantes __obj = (Participantes)s.load(Participantes.class, fFRolParticipante.getParticipante());
                rolParticipante.setParticipante(__obj);
            }


            {Participantes obj = (Participantes)s.load(Participantes.class, fFRolParticipante.getParticipante());
             obj.addToRoles(rolParticipante);
            }

            {Rol obj = (Rol)s.load(Rol.class, fFRolParticipante.getRol());
             obj.addToParticipantes(rolParticipante);
            }

            s.flush();
            fFRolParticipante.setIdRolParticipante(rolParticipante.getIdRolParticipante());
            //Feed for combo listRol.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(descripcion, idRol) " + 
               "from Rol").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFRolParticipante.setListRol(list);
            }
            //Feed for combo listParticipantes.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(nombre, idParticipantes) " + 
               "from Participantes").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFRolParticipante.setListParticipantes(list);
            }


            //fFRolParticipante.setParticipante(rolParticipante.getParticipante().getIdParticipantes());
            request.getSession().setAttribute("idParticipantes_super", fFRolParticipante.getParticipante());

            //fFRolParticipante.setRol(rolParticipante.getRol().getIdRol());
            request.getSession().setAttribute("idRol_super", fFRolParticipante.getRol());

            request.getSession().setAttribute("idRolParticipante", rolParticipante.getIdRolParticipante());
            request.getSession().setAttribute("idRolParticipante_super", rolParticipante.getIdRolParticipante());

            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("ACrear_rolParticipante.msg0"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }



}