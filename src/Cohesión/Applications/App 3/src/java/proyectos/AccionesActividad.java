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
public class AccionesActividad extends CohesionAction {
    
/**
     * Called by Struts for the execution of action APreCrear_actividad_actividad.
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
    public ActionForward APreCrear_actividad_actividad(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"VCrear_actividad_actividad", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FActividad fFActividad = FActividad.clear(mapping, request);
             
            //Feed for combo listActividad.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(descripcion, idActividad) " + 
               "from Actividad").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFActividad.setListActividad(list);
            }
            //Feed for combo listProyecto.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(nombre, idProyecto) " + 
               "from Proyecto").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFActividad.setListProyecto(list);
            }

            fFActividad.setPrerequisito(Long.parseLong((String)request.getParameter("idActividad_super")));

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
     * Called by Struts for the execution of action APreCrear_actividad_proyecto.
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
    public ActionForward APreCrear_actividad_proyecto(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"VCrear_actividad_proyecto", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FActividad fFActividad = FActividad.clear(mapping, request);
             
            //Feed for combo listActividad.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(descripcion, idActividad) " + 
               "from Actividad").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFActividad.setListActividad(list);
            }
            //Feed for combo listProyecto.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(nombre, idProyecto) " + 
               "from Proyecto").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFActividad.setListProyecto(list);
            }

            fFActividad.setProyecto(Long.parseLong((String)request.getParameter("idProyecto_super")));

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
     * Called by Struts for the execution of action APre_actividad.
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
    public ActionForward APre_actividad(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_actividad", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            Long idActividad = lookup_Long(request, "idActividad");
            
            FActividad fFActividad = FActividad.clear(mapping, request);
            Actividad actividad = (Actividad)s.load(Actividad.class, idActividad);
            fFActividad.setIdActividad(actividad.getIdActividad());

            fFActividad.setPrerequisito(actividad.getPrerequisito().getIdActividad());

            fFActividad.setProyecto(actividad.getProyecto().getIdProyecto());

            fFActividad.setDescripcion(actividad.getDescripcion());
            fFActividad.setAvance(actividad.getAvance());
            fFActividad.setFechaInicio(actividad.getFechaInicio().toString());
            fFActividad.setFechaFin(actividad.getFechaFin().toString());
            if (actividad.getSuperactividad()!=null) {
                fFActividad.setSuperactividad(actividad.getSuperactividad().getIdActividad());
            } else {
                fFActividad.setSuperactividad(0L);
            }
            fFActividad.setTiempoEstimado(actividad.getTiempoEstimado());

            //Feed for combo listActividad.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(descripcion, idActividad) " + 
               "from Actividad").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFActividad.setListActividad(list);
            }
            //Feed for combo listProyecto.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(nombre, idProyecto) " + 
               "from Proyecto").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFActividad.setListProyecto(list);
            }

            for (ActividadParticipante _ActividadParticipante : actividad.getParticipantes()) {
                if (_ActividadParticipante.getActividad()!=null) Hibernate.initialize(_ActividadParticipante.getActividad());
                if (_ActividadParticipante.getParticipante()!=null) Hibernate.initialize(_ActividadParticipante.getParticipante());
            }
            request.setAttribute("L_ActividadParticipante", actividad.getParticipantes());
            for (RolActividad _RolActividad : actividad.getRoles()) {
                if (_RolActividad.getRol()!=null) Hibernate.initialize(_RolActividad.getRol());
                if (_RolActividad.getActividad()!=null) Hibernate.initialize(_RolActividad.getActividad());
            }
            request.setAttribute("L_RolActividad", actividad.getRoles());
            for (ActividadPre _ActividadPre : actividad.getPrerequisitos()) {
                if (_ActividadPre.getPrerequisito()!=null) Hibernate.initialize(_ActividadPre.getPrerequisito());
                if (_ActividadPre.getActividad()!=null) Hibernate.initialize(_ActividadPre.getActividad());
            }
            request.setAttribute("L_ActividadPre", actividad.getPrerequisitos());
            for (Actividad _Actividad : actividad.getSucesores()) {
                if (_Actividad.getSuperactividad()!=null) Hibernate.initialize(_Actividad.getSuperactividad());
                if (_Actividad.getProyecto()!=null) Hibernate.initialize(_Actividad.getProyecto());
            }
            request.setAttribute("L_Actividad", actividad.getSucesores());


            request.getSession().setAttribute("idActividad_super", fFActividad.getPrerequisito());

            request.getSession().setAttribute("idProyecto_super", fFActividad.getProyecto());

            request.getSession().setAttribute("idActividad", idActividad);
            request.getSession().setAttribute("idActividad_super", idActividad);

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
     * Called by Struts for the execution of action AAct_actividad.
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
    public ActionForward AAct_actividad(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_actividad", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FActividad fFActividad = (FActividad)form;
            Actividad actividad = (Actividad)s.load(Actividad.class, fFActividad.getIdActividad());
            actividad.setDescripcion(fFActividad.getDescripcion());
            actividad.setAvance(fFActividad.getAvance());
            actividad.setFechaInicio(new ve.usb.cohesion.runtime.LocalDate(fFActividad.getFechaInicio()));
            actividad.setFechaFin(new ve.usb.cohesion.runtime.LocalDate(fFActividad.getFechaFin()));
            if (fFActividad.getSuperactividad()==0) actividad.setSuperactividad(null);
            else if ((actividad.getSuperactividad()==null) ||
                    (actividad.getSuperactividad().getIdActividad()!=fFActividad.getSuperactividad())) {
                Actividad __obj = (Actividad)s.load(Actividad.class, fFActividad.getSuperactividad());
                actividad.setSuperactividad(__obj);
            }
            actividad.setTiempoEstimado(fFActividad.getTiempoEstimado());


            //Feed for combo listActividad.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(descripcion, idActividad) " + 
               "from Actividad").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFActividad.setListActividad(list);
            }
            //Feed for combo listProyecto.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(nombre, idProyecto) " + 
               "from Proyecto").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFActividad.setListProyecto(list);
            }

            for (ActividadParticipante _ActividadParticipante : actividad.getParticipantes()) {
                if (_ActividadParticipante.getActividad()!=null) Hibernate.initialize(_ActividadParticipante.getActividad());
                if (_ActividadParticipante.getParticipante()!=null) Hibernate.initialize(_ActividadParticipante.getParticipante());
            }
            request.setAttribute("L_ActividadParticipante", actividad.getParticipantes());
            for (RolActividad _RolActividad : actividad.getRoles()) {
                if (_RolActividad.getRol()!=null) Hibernate.initialize(_RolActividad.getRol());
                if (_RolActividad.getActividad()!=null) Hibernate.initialize(_RolActividad.getActividad());
            }
            request.setAttribute("L_RolActividad", actividad.getRoles());
            for (ActividadPre _ActividadPre : actividad.getPrerequisitos()) {
                if (_ActividadPre.getPrerequisito()!=null) Hibernate.initialize(_ActividadPre.getPrerequisito());
                if (_ActividadPre.getActividad()!=null) Hibernate.initialize(_ActividadPre.getActividad());
            }
            request.setAttribute("L_ActividadPre", actividad.getPrerequisitos());
            for (Actividad _Actividad : actividad.getSucesores()) {
                if (_Actividad.getSuperactividad()!=null) Hibernate.initialize(_Actividad.getSuperactividad());
                if (_Actividad.getProyecto()!=null) Hibernate.initialize(_Actividad.getProyecto());
            }
            request.setAttribute("L_Actividad", actividad.getSucesores());


            request.getSession().setAttribute("idActividad_super", fFActividad.getPrerequisito());

            request.getSession().setAttribute("idProyecto_super", fFActividad.getProyecto());

            request.getSession().setAttribute("idActividad", actividad.getIdActividad());

            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("AAct_actividad.msg0"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action AElim_actividad.
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
    public ActionForward AElim_actividad(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"APre_actividad", "V_actividad", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            Long idActividad = lookup_Long(request, "idActividad");
            Actividad actividad = (Actividad)s.load(Actividad.class, idActividad);

            long idActividad_super = actividad.getPrerequisito().getIdActividad();
            actividad.getPrerequisito().removeFromPrerequisitos(actividad);

            long idProyecto_super = actividad.getProyecto().getIdProyecto();
            actividad.getProyecto().removeFromActividades(actividad);

            try {
                s.flush();
                request.getSession().setAttribute("idActividad", idActividad);

                request.getSession().setAttribute("idActividad_super", idActividad_super);

                request.getSession().setAttribute("idProyecto_super", idProyecto_super);

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
            getResources(request).getMessage("AElim_actividad.msg0"));
        }
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("AElim_actividad.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action ACrear_actividad.
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
    public ActionForward ACrear_actividad(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_actividad", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FActividad fFActividad = (FActividad)form;
            Actividad actividad = new Actividad();
            actividad.setDescripcion(fFActividad.getDescripcion());
            actividad.setAvance(fFActividad.getAvance());
            actividad.setFechaInicio(new ve.usb.cohesion.runtime.LocalDate(fFActividad.getFechaInicio()));
            actividad.setFechaFin(new ve.usb.cohesion.runtime.LocalDate(fFActividad.getFechaFin()));
            if (fFActividad.getSuperactividad()==0) actividad.setSuperactividad(null);
            else {
                Actividad __obj = (Actividad)s.load(Actividad.class, fFActividad.getSuperactividad());
                actividad.setSuperactividad(__obj);
            }
            actividad.setTiempoEstimado(fFActividad.getTiempoEstimado());


            {Actividad obj = (Actividad)s.load(Actividad.class, fFActividad.getPrerequisito());
             obj.addToPrerequisitos(actividad);
            }

            {Proyecto obj = (Proyecto)s.load(Proyecto.class, fFActividad.getProyecto());
             obj.addToActividades(actividad);
            }

            s.flush();
            fFActividad.setIdActividad(actividad.getIdActividad());
            //Feed for combo listActividad.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(descripcion, idActividad) " + 
               "from Actividad").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFActividad.setListActividad(list);
            }
            //Feed for combo listProyecto.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(nombre, idProyecto) " + 
               "from Proyecto").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFActividad.setListProyecto(list);
            }


            //fFActividad.setPrerequisito(actividad.getPrerequisito().getIdActividad());
            request.getSession().setAttribute("idActividad_super", fFActividad.getPrerequisito());

            //fFActividad.setProyecto(actividad.getProyecto().getIdProyecto());
            request.getSession().setAttribute("idProyecto_super", fFActividad.getProyecto());

            request.getSession().setAttribute("idActividad", actividad.getIdActividad());
            request.getSession().setAttribute("idActividad_super", actividad.getIdActividad());

            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("ACrear_actividad.msg0"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }



}