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
public class AccionesProyectoParticipante extends CohesionAction {
    
/**
     * Called by Struts for the execution of action APreCrear_proyectoParticipante.
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
    public ActionForward APreCrear_proyectoParticipante(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"VCrear_proyectoParticipante", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FProyectoParticipante fFProyectoParticipante = FProyectoParticipante.clear(mapping, request);

             //Feed for combo listProyecto.
             {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
                (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
                "select new ve.usb.cohesion.runtime.Pair(nombre, idProyecto) " + 
                "from Proyecto").list();
              list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
              fFProyectoParticipante.setListProyecto(list);
             }
             //Feed for combo listParticipantes.
             {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
                (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
                "select new ve.usb.cohesion.runtime.Pair(nombre, idParticipantes) " + 
                "from Participantes").list();
              list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
              fFProyectoParticipante.setListParticipantes(list);
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
     * Called by Struts for the execution of action APreBuscar_proyectoParticipante.
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
    public ActionForward APreBuscar_proyectoParticipante(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"VBuscar_proyectoParticipante", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FProyectoParticipanteBuscar.clear(mapping, request);

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
     * Called by Struts for the execution of action ABuscar_proyectoParticipante.
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
    public ActionForward ABuscar_proyectoParticipante(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"APreListar_proyectoParticipante", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FProyectoParticipanteBuscar fFProyectoParticipanteBuscar = (FProyectoParticipanteBuscar)form;
            request.getSession().setAttribute("ABuscar_proyectoParticipante_campo", "fechaIngreso");
            request.getSession().setAttribute("ABuscar_proyectoParticipante_valor", "%" + fFProyectoParticipanteBuscar.getFechaIngreso() + "%");

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
     * Called by Struts for the execution of action APreListar_proyectoParticipante.
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
    public ActionForward APreListar_proyectoParticipante(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"VListar_proyectoParticipante", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            String crit = (String)request.getSession().getAttribute("ABuscar_proyectoParticipante_campo");
            java.util.List<ProyectoParticipante> list;
            if (crit==null) {
                list = (java.util.List<ProyectoParticipante>)s.createQuery("from ProyectoParticipante").list();
            } else {
                String valor = (String)request.getSession().getAttribute("ABuscar_proyectoParticipante_valor");
                list = (java.util.List<ProyectoParticipante>)
                   s.createQuery("from ProyectoParticipante where "+crit+" like :valor")
                    .setString("valor", valor).list();
                request.getSession().removeAttribute("ABuscar_proyectoParticipante_campo");
                request.getSession().removeAttribute("ABuscar_proyectoParticipante_valor");
            }
            request.setAttribute("L_ProyectoParticipante", list);
            for (ProyectoParticipante proyectoParticipante:list) {
                if (proyectoParticipante.getProyecto()!=null) proyectoParticipante.getProyecto().getNombre();
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
     * Called by Struts for the execution of action APre_proyectoParticipante.
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
    public ActionForward APre_proyectoParticipante(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_proyectoParticipante", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            Long idProyectoParticipante = lookup_Long(request, "idProyectoParticipante");
            
            FProyectoParticipante fFProyectoParticipante = FProyectoParticipante.clear(mapping, request);
            ProyectoParticipante proyectoParticipante = (ProyectoParticipante)s.load(ProyectoParticipante.class, idProyectoParticipante);
            fFProyectoParticipante.setIdProyectoParticipante(proyectoParticipante.getIdProyectoParticipante());

            fFProyectoParticipante.setParticipante(proyectoParticipante.getParticipante().getIdParticipantes());

            if (proyectoParticipante.getProyecto()!=null) {
                fFProyectoParticipante.setProyecto(proyectoParticipante.getProyecto().getIdProyecto());
            } else {
                fFProyectoParticipante.setProyecto(0L);
            }
            fFProyectoParticipante.setFechaIngreso(proyectoParticipante.getFechaIngreso().toString());

            //Feed for combo listProyecto.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(nombre, idProyecto) " + 
               "from Proyecto").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFProyectoParticipante.setListProyecto(list);
            }
            //Feed for combo listParticipantes.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(nombre, idParticipantes) " + 
               "from Participantes").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFProyectoParticipante.setListParticipantes(list);
            }


            request.getSession().setAttribute("idParticipantes_super", fFProyectoParticipante.getParticipante());

            request.getSession().setAttribute("idProyectoParticipante", idProyectoParticipante);
            request.getSession().setAttribute("idProyectoParticipante_super", idProyectoParticipante);

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
     * Called by Struts for the execution of action AAct_proyectoParticipante.
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
    public ActionForward AAct_proyectoParticipante(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_proyectoParticipante", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FProyectoParticipante fFProyectoParticipante = (FProyectoParticipante)form;
            ProyectoParticipante proyectoParticipante = (ProyectoParticipante)s.load(ProyectoParticipante.class, fFProyectoParticipante.getIdProyectoParticipante());
            if (fFProyectoParticipante.getProyecto()==0) proyectoParticipante.setProyecto(null);
            else if ((proyectoParticipante.getProyecto()==null) ||
                    (proyectoParticipante.getProyecto().getIdProyecto()!=fFProyectoParticipante.getProyecto())) {
                Proyecto __obj = (Proyecto)s.load(Proyecto.class, fFProyectoParticipante.getProyecto());
                proyectoParticipante.setProyecto(__obj);
            }
            proyectoParticipante.setFechaIngreso(new ve.usb.cohesion.runtime.LocalDate(fFProyectoParticipante.getFechaIngreso()));


            //Feed for combo listProyecto.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(nombre, idProyecto) " + 
               "from Proyecto").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFProyectoParticipante.setListProyecto(list);
            }
            //Feed for combo listParticipantes.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(nombre, idParticipantes) " + 
               "from Participantes").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFProyectoParticipante.setListParticipantes(list);
            }

            request.getSession().setAttribute("idProyectoParticipante", proyectoParticipante.getIdProyectoParticipante());
            request.getSession().setAttribute("idProyectoParticipante_super", proyectoParticipante.getIdProyectoParticipante());

            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("AAct_proyectoParticipante.msg0"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action AElim_proyectoParticipante.
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
    public ActionForward AElim_proyectoParticipante(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"APreListar_proyectoParticipante", "V_proyectoParticipante", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            Long idProyectoParticipante = lookup_Long(request, "idProyectoParticipante");
            ProyectoParticipante proyectoParticipante = (ProyectoParticipante)s.load(ProyectoParticipante.class, idProyectoParticipante);
            s.delete(proyectoParticipante);
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
            getResources(request).getMessage("AElim_proyectoParticipante.msg0"));
        }
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("AElim_proyectoParticipante.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action ACrear_proyectoParticipante.
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
    public ActionForward ACrear_proyectoParticipante(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_proyectoParticipante", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FProyectoParticipante fFProyectoParticipante = (FProyectoParticipante)form;
            ProyectoParticipante proyectoParticipante = new ProyectoParticipante();
            if (fFProyectoParticipante.getProyecto()==0) proyectoParticipante.setProyecto(null);
            else {
                Proyecto __obj = (Proyecto)s.load(Proyecto.class, fFProyectoParticipante.getProyecto());
                proyectoParticipante.setProyecto(__obj);
            }
            proyectoParticipante.setFechaIngreso(new ve.usb.cohesion.runtime.LocalDate(fFProyectoParticipante.getFechaIngreso()));

            s.save(proyectoParticipante);
            s.flush();
            fFProyectoParticipante.setIdProyectoParticipante(proyectoParticipante.getIdProyectoParticipante());

            //Feed for combo listProyecto.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(nombre, idProyecto) " + 
               "from Proyecto").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFProyectoParticipante.setListProyecto(list);
            }
            //Feed for combo listParticipantes.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(nombre, idParticipantes) " + 
               "from Participantes").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFProyectoParticipante.setListParticipantes(list);
            }

            request.getSession().setAttribute("idProyectoParticipante", proyectoParticipante.getIdProyectoParticipante());
            request.getSession().setAttribute("idProyectoParticipante_super", proyectoParticipante.getIdProyectoParticipante());

            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("ACrear_proyectoParticipante.msg0"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action APreCrear_proyectoParticipante_participantes.
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
    public ActionForward APreCrear_proyectoParticipante_participantes(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"VCrear_proyectoParticipante_participantes", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FProyectoParticipante fFProyectoParticipante = FProyectoParticipante.clear(mapping, request);

            //Feed for combo listProyecto.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(nombre, idProyecto) " + 
               "from Proyecto").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFProyectoParticipante.setListProyecto(list);
            }
            //Feed for combo listParticipantes.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(nombre, idParticipantes) " + 
               "from Participantes").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFProyectoParticipante.setListParticipantes(list);
            }

            fFProyectoParticipante.setParticipante(Long.parseLong((String)request.getParameter("idParticipantes_super")));

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