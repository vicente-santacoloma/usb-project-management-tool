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
public class AccionesProyecto extends CohesionAction {
    
/**
     * Called by Struts for the execution of action APreCrear_proyecto_metodologia.
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
    public ActionForward APreCrear_proyecto_metodologia(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"VCrear_proyecto_metodologia", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FProyecto fFProyecto = FProyecto.clear(mapping, request);
             
            //Feed for combo listMetodologia.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(nombre, idMetodologia) " + 
               "from Metodologia").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFProyecto.setListMetodologia(list);
            }

            fFProyecto.setMetodologia(Long.parseLong((String)request.getParameter("idMetodologia_super")));

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
     * Called by Struts for the execution of action APre_proyecto.
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
    public ActionForward APre_proyecto(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_proyecto", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            Long idProyecto = lookup_Long(request, "idProyecto");
            
            FProyecto fFProyecto = FProyecto.clear(mapping, request);
            Proyecto proyecto = (Proyecto)s.load(Proyecto.class, idProyecto);
            fFProyecto.setIdProyecto(proyecto.getIdProyecto());

            fFProyecto.setMetodologia(proyecto.getMetodologia().getIdMetodologia());

            fFProyecto.setNombre(proyecto.getNombre());
            fFProyecto.setTiempo_Estimado(proyecto.getTiempo_Estimado());
            fFProyecto.setArea(proyecto.getArea());
            fFProyecto.setDescripcion(proyecto.getDescripcion());
            fFProyecto.setFecha_de_Inicio(proyecto.getFecha_de_Inicio().toString());
            fFProyecto.setFecha_de_Fin(proyecto.getFecha_de_Fin().toString());
            fFProyecto.setCosto(proyecto.getCosto());
            fFProyecto.setEncargado(proyecto.getEncargado());

            //Feed for combo listMetodologia.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(nombre, idMetodologia) " + 
               "from Metodologia").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFProyecto.setListMetodologia(list);
            }

            for (Actividad _Actividad : proyecto.getActividades()) {
                if (_Actividad.getSuperactividad()!=null) Hibernate.initialize(_Actividad.getSuperactividad());
                if (_Actividad.getProyecto()!=null) Hibernate.initialize(_Actividad.getProyecto());
            }
            request.setAttribute("L_Actividad", proyecto.getActividades());


            request.getSession().setAttribute("idMetodologia_super", fFProyecto.getMetodologia());

            request.getSession().setAttribute("idProyecto", idProyecto);
            request.getSession().setAttribute("idProyecto_super", idProyecto);

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
     * Called by Struts for the execution of action AAct_proyecto.
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
    public ActionForward AAct_proyecto(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_proyecto", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FProyecto fFProyecto = (FProyecto)form;
            Proyecto proyecto = (Proyecto)s.load(Proyecto.class, fFProyecto.getIdProyecto());
            proyecto.setNombre(fFProyecto.getNombre());
            proyecto.setTiempo_Estimado(fFProyecto.getTiempo_Estimado());
            proyecto.setArea(fFProyecto.getArea());
            proyecto.setDescripcion(fFProyecto.getDescripcion());
            proyecto.setFecha_de_Inicio(new ve.usb.cohesion.runtime.LocalDate(fFProyecto.getFecha_de_Inicio()));
            proyecto.setFecha_de_Fin(new ve.usb.cohesion.runtime.LocalDate(fFProyecto.getFecha_de_Fin()));
            proyecto.setCosto(fFProyecto.getCosto());
            proyecto.setEncargado(fFProyecto.getEncargado());


            //Feed for combo listMetodologia.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(nombre, idMetodologia) " + 
               "from Metodologia").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFProyecto.setListMetodologia(list);
            }

            for (Actividad _Actividad : proyecto.getActividades()) {
                if (_Actividad.getSuperactividad()!=null) Hibernate.initialize(_Actividad.getSuperactividad());
                if (_Actividad.getProyecto()!=null) Hibernate.initialize(_Actividad.getProyecto());
            }
            request.setAttribute("L_Actividad", proyecto.getActividades());


            request.getSession().setAttribute("idMetodologia_super", fFProyecto.getMetodologia());

            request.getSession().setAttribute("idProyecto", proyecto.getIdProyecto());

            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("AAct_proyecto.msg0"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action AElim_proyecto.
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
    public ActionForward AElim_proyecto(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"APre_metodologia", "V_proyecto", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            Long idProyecto = lookup_Long(request, "idProyecto");
            Proyecto proyecto = (Proyecto)s.load(Proyecto.class, idProyecto);

            long idMetodologia_super = proyecto.getMetodologia().getIdMetodologia();
            proyecto.getMetodologia().removeFromProyectos(proyecto);

            try {
                s.flush();
                request.getSession().setAttribute("idProyecto", idProyecto);

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
            getResources(request).getMessage("AElim_proyecto.msg0"));
        }
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("AElim_proyecto.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action ACrear_proyecto.
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
    public ActionForward ACrear_proyecto(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_proyecto", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FProyecto fFProyecto = (FProyecto)form;
            Proyecto proyecto = new Proyecto();
            proyecto.setNombre(fFProyecto.getNombre());
            proyecto.setTiempo_Estimado(fFProyecto.getTiempo_Estimado());
            proyecto.setArea(fFProyecto.getArea());
            proyecto.setDescripcion(fFProyecto.getDescripcion());
            proyecto.setFecha_de_Inicio(new ve.usb.cohesion.runtime.LocalDate(fFProyecto.getFecha_de_Inicio()));
            proyecto.setFecha_de_Fin(new ve.usb.cohesion.runtime.LocalDate(fFProyecto.getFecha_de_Fin()));
            proyecto.setCosto(fFProyecto.getCosto());
            proyecto.setEncargado(fFProyecto.getEncargado());


            {Metodologia obj = (Metodologia)s.load(Metodologia.class, fFProyecto.getMetodologia());
             obj.addToProyectos(proyecto);
            }

            s.flush();
            fFProyecto.setIdProyecto(proyecto.getIdProyecto());
            //Feed for combo listMetodologia.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(nombre, idMetodologia) " + 
               "from Metodologia").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFProyecto.setListMetodologia(list);
            }


            //fFProyecto.setMetodologia(proyecto.getMetodologia().getIdMetodologia());
            request.getSession().setAttribute("idMetodologia_super", fFProyecto.getMetodologia());

            request.getSession().setAttribute("idProyecto", proyecto.getIdProyecto());
            request.getSession().setAttribute("idProyecto_super", proyecto.getIdProyecto());

            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("ACrear_proyecto.msg0"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }



}