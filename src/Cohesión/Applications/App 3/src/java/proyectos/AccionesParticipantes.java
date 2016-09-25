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
public class AccionesParticipantes extends CohesionAction {
    
/**
     * Called by Struts for the execution of action APreCrear_participantes.
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
    public ActionForward APreCrear_participantes(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"VCrear_participantes", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FParticipantes fFParticipantes = FParticipantes.clear(mapping, request);


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
     * Called by Struts for the execution of action APreBuscar_participantes.
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
    public ActionForward APreBuscar_participantes(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"VBuscar_participantes", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FParticipantesBuscar.clear(mapping, request);

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
     * Called by Struts for the execution of action ABuscar_participantes.
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
    public ActionForward ABuscar_participantes(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"APreListar_participantes", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FParticipantesBuscar fFParticipantesBuscar = (FParticipantesBuscar)form;
            request.getSession().setAttribute("ABuscar_participantes_campo", "nombre");
            request.getSession().setAttribute("ABuscar_participantes_valor", "%" + fFParticipantesBuscar.getNombre() + "%");

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
     * Called by Struts for the execution of action APreListar_participantes.
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
    public ActionForward APreListar_participantes(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"VListar_participantes", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            String crit = (String)request.getSession().getAttribute("ABuscar_participantes_campo");
            java.util.List<Participantes> list;
            if (crit==null) {
                list = (java.util.List<Participantes>)s.createQuery("from Participantes").list();
            } else {
                String valor = (String)request.getSession().getAttribute("ABuscar_participantes_valor");
                list = (java.util.List<Participantes>)
                   s.createQuery("from Participantes where "+crit+" like :valor")
                    .setString("valor", valor).list();
                request.getSession().removeAttribute("ABuscar_participantes_campo");
                request.getSession().removeAttribute("ABuscar_participantes_valor");
            }
            request.setAttribute("L_Participantes", list);

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
     * Called by Struts for the execution of action APre_participantes.
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
    public ActionForward APre_participantes(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_participantes", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            Long idParticipantes = lookup_Long(request, "idParticipantes");
            
            FParticipantes fFParticipantes = FParticipantes.clear(mapping, request);
            Participantes participantes = (Participantes)s.load(Participantes.class, idParticipantes);
            fFParticipantes.setIdParticipantes(participantes.getIdParticipantes());
            fFParticipantes.setNombre(participantes.getNombre());
            fFParticipantes.setUsuario(participantes.getUsuario());
            fFParticipantes.setClave(participantes.getClave());

            for (RolParticipante _RolParticipante : participantes.getRoles()) {
                if (_RolParticipante.getRol()!=null) Hibernate.initialize(_RolParticipante.getRol());
                if (_RolParticipante.getParticipante()!=null) Hibernate.initialize(_RolParticipante.getParticipante());
            }
            request.setAttribute("L_RolParticipante", participantes.getRoles());
            for (ProyectoParticipante _ProyectoParticipante : participantes.getProyectos()) {
                if (_ProyectoParticipante.getProyecto()!=null) Hibernate.initialize(_ProyectoParticipante.getProyecto());
                if (_ProyectoParticipante.getParticipante()!=null) Hibernate.initialize(_ProyectoParticipante.getParticipante());
            }
            request.setAttribute("L_ProyectoParticipante", participantes.getProyectos());
            for (ActividadParticipante _ActividadParticipante : participantes.getActividades()) {
                if (_ActividadParticipante.getActividad()!=null) Hibernate.initialize(_ActividadParticipante.getActividad());
                if (_ActividadParticipante.getParticipante()!=null) Hibernate.initialize(_ActividadParticipante.getParticipante());
            }
            request.setAttribute("L_ActividadParticipante", participantes.getActividades());

            request.getSession().setAttribute("idParticipantes", idParticipantes);
            request.getSession().setAttribute("idParticipantes_super", idParticipantes);

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
     * Called by Struts for the execution of action AAct_participantes.
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
    public ActionForward AAct_participantes(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_participantes", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FParticipantes fFParticipantes = (FParticipantes)form;
            Participantes participantes = (Participantes)s.load(Participantes.class, fFParticipantes.getIdParticipantes());
            participantes.setNombre(fFParticipantes.getNombre());
            participantes.setUsuario(fFParticipantes.getUsuario());
            participantes.setClave(fFParticipantes.getClave());


            for (RolParticipante _RolParticipante : participantes.getRoles()) {
                if (_RolParticipante.getRol()!=null) Hibernate.initialize(_RolParticipante.getRol());
                if (_RolParticipante.getParticipante()!=null) Hibernate.initialize(_RolParticipante.getParticipante());
            }
            request.setAttribute("L_RolParticipante", participantes.getRoles());
            for (ProyectoParticipante _ProyectoParticipante : participantes.getProyectos()) {
                if (_ProyectoParticipante.getProyecto()!=null) Hibernate.initialize(_ProyectoParticipante.getProyecto());
                if (_ProyectoParticipante.getParticipante()!=null) Hibernate.initialize(_ProyectoParticipante.getParticipante());
            }
            request.setAttribute("L_ProyectoParticipante", participantes.getProyectos());
            for (ActividadParticipante _ActividadParticipante : participantes.getActividades()) {
                if (_ActividadParticipante.getActividad()!=null) Hibernate.initialize(_ActividadParticipante.getActividad());
                if (_ActividadParticipante.getParticipante()!=null) Hibernate.initialize(_ActividadParticipante.getParticipante());
            }
            request.setAttribute("L_ActividadParticipante", participantes.getActividades());

            request.getSession().setAttribute("idParticipantes", participantes.getIdParticipantes());
            request.getSession().setAttribute("idParticipantes_super", participantes.getIdParticipantes());

            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("AAct_participantes.msg0"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action AElim_participantes.
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
    public ActionForward AElim_participantes(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"APreListar_participantes", "V_participantes", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            Long idParticipantes = lookup_Long(request, "idParticipantes");
            Participantes participantes = (Participantes)s.load(Participantes.class, idParticipantes);
            s.delete(participantes);
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
            getResources(request).getMessage("AElim_participantes.msg0"));
        }
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("AElim_participantes.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action ACrear_participantes.
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
    public ActionForward ACrear_participantes(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_participantes", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FParticipantes fFParticipantes = (FParticipantes)form;
            Participantes participantes = new Participantes();
            participantes.setNombre(fFParticipantes.getNombre());
            participantes.setUsuario(fFParticipantes.getUsuario());
            participantes.setClave(fFParticipantes.getClave());

            s.save(participantes);
            s.flush();
            fFParticipantes.setIdParticipantes(participantes.getIdParticipantes());

            request.getSession().setAttribute("idParticipantes", participantes.getIdParticipantes());
            request.getSession().setAttribute("idParticipantes_super", participantes.getIdParticipantes());

            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("ACrear_participantes.msg0"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }



}