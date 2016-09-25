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
public class AccionesRol extends CohesionAction {
    
/**
     * Called by Struts for the execution of action APreCrear_rol_metodologia.
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
    public ActionForward APreCrear_rol_metodologia(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"VCrear_rol_metodologia", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FRol fFRol = FRol.clear(mapping, request);
             
            //Feed for combo listMetodologia.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(nombre, idMetodologia) " + 
               "from Metodologia").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFRol.setListMetodologia(list);
            }

            fFRol.setMetodologia(Long.parseLong((String)request.getParameter("idMetodologia_super")));

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
     * Called by Struts for the execution of action APre_rol.
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
    public ActionForward APre_rol(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_rol", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            Long idRol = lookup_Long(request, "idRol");
            
            FRol fFRol = FRol.clear(mapping, request);
            Rol rol = (Rol)s.load(Rol.class, idRol);
            fFRol.setIdRol(rol.getIdRol());

            fFRol.setMetodologia(rol.getMetodologia().getIdMetodologia());

            fFRol.setDescripcion(rol.getDescripcion());
            fFRol.setNombre(rol.getNombre());

            //Feed for combo listMetodologia.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(nombre, idMetodologia) " + 
               "from Metodologia").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFRol.setListMetodologia(list);
            }

            for (RolParticipante _RolParticipante : rol.getParticipantes()) {
                if (_RolParticipante.getRol()!=null) Hibernate.initialize(_RolParticipante.getRol());
                if (_RolParticipante.getParticipante()!=null) Hibernate.initialize(_RolParticipante.getParticipante());
            }
            request.setAttribute("L_RolParticipante", rol.getParticipantes());


            request.getSession().setAttribute("idMetodologia_super", fFRol.getMetodologia());

            request.getSession().setAttribute("idRol", idRol);
            request.getSession().setAttribute("idRol_super", idRol);

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
     * Called by Struts for the execution of action AAct_rol.
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
    public ActionForward AAct_rol(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_rol", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FRol fFRol = (FRol)form;
            Rol rol = (Rol)s.load(Rol.class, fFRol.getIdRol());
            rol.setDescripcion(fFRol.getDescripcion());
            rol.setNombre(fFRol.getNombre());


            //Feed for combo listMetodologia.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(nombre, idMetodologia) " + 
               "from Metodologia").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFRol.setListMetodologia(list);
            }

            for (RolParticipante _RolParticipante : rol.getParticipantes()) {
                if (_RolParticipante.getRol()!=null) Hibernate.initialize(_RolParticipante.getRol());
                if (_RolParticipante.getParticipante()!=null) Hibernate.initialize(_RolParticipante.getParticipante());
            }
            request.setAttribute("L_RolParticipante", rol.getParticipantes());


            request.getSession().setAttribute("idMetodologia_super", fFRol.getMetodologia());

            request.getSession().setAttribute("idRol", rol.getIdRol());

            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("AAct_rol.msg0"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action AElim_rol.
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
    public ActionForward AElim_rol(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"APre_metodologia", "V_rol", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            Long idRol = lookup_Long(request, "idRol");
            Rol rol = (Rol)s.load(Rol.class, idRol);

            long idMetodologia_super = rol.getMetodologia().getIdMetodologia();
            rol.getMetodologia().removeFromRoles(rol);

            try {
                s.flush();
                request.getSession().setAttribute("idRol", idRol);

                request.getSession().setAttribute("idMetodologia_super", idMetodologia_super);

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
            getResources(request).getMessage("AElim_rol.msg0"));
        }
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("AElim_rol.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action ACrear_rol.
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
    public ActionForward ACrear_rol(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_rol", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FRol fFRol = (FRol)form;
            Rol rol = new Rol();
            rol.setDescripcion(fFRol.getDescripcion());
            rol.setNombre(fFRol.getNombre());


            {Metodologia obj = (Metodologia)s.load(Metodologia.class, fFRol.getMetodologia());
             obj.addToRoles(rol);
            }

            s.flush();
            fFRol.setIdRol(rol.getIdRol());
            //Feed for combo listMetodologia.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(nombre, idMetodologia) " + 
               "from Metodologia").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFRol.setListMetodologia(list);
            }


            //fFRol.setMetodologia(rol.getMetodologia().getIdMetodologia());
            request.getSession().setAttribute("idMetodologia_super", fFRol.getMetodologia());

            request.getSession().setAttribute("idRol", rol.getIdRol());
            request.getSession().setAttribute("idRol_super", rol.getIdRol());

            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("ACrear_rol.msg0"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }



}