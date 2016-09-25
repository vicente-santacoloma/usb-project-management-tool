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
public class AccionesArtefacto extends CohesionAction {
    
/**
     * Called by Struts for the execution of action APreCrear_artefacto.
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
    public ActionForward APreCrear_artefacto(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"VCrear_artefacto", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FArtefacto fFArtefacto = FArtefacto.clear(mapping, request);

             //Feed for combo listActividad.
             {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
                (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
                "select new ve.usb.cohesion.runtime.Pair(descripcion, idActividad) " + 
                "from Actividad").list();
              list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
              fFArtefacto.setListActividad(list);
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
     * Called by Struts for the execution of action APreBuscar_artefacto.
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
    public ActionForward APreBuscar_artefacto(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"VBuscar_artefacto", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FArtefactoBuscar.clear(mapping, request);

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
     * Called by Struts for the execution of action ABuscar_artefacto.
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
    public ActionForward ABuscar_artefacto(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"APreListar_artefacto", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FArtefactoBuscar fFArtefactoBuscar = (FArtefactoBuscar)form;
            request.getSession().setAttribute("ABuscar_artefacto_campo", "titulo");
            request.getSession().setAttribute("ABuscar_artefacto_valor", "%" + fFArtefactoBuscar.getTitulo() + "%");

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
     * Called by Struts for the execution of action APreListar_artefacto.
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
    public ActionForward APreListar_artefacto(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"VListar_artefacto", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            String crit = (String)request.getSession().getAttribute("ABuscar_artefacto_campo");
            java.util.List<Artefacto> list;
            if (crit==null) {
                list = (java.util.List<Artefacto>)s.createQuery("from Artefacto").list();
            } else {
                String valor = (String)request.getSession().getAttribute("ABuscar_artefacto_valor");
                list = (java.util.List<Artefacto>)
                   s.createQuery("from Artefacto where "+crit+" like :valor")
                    .setString("valor", valor).list();
                request.getSession().removeAttribute("ABuscar_artefacto_campo");
                request.getSession().removeAttribute("ABuscar_artefacto_valor");
            }
            request.setAttribute("L_Artefacto", list);
            for (Artefacto artefacto:list) {
                if (artefacto.getActividad()!=null) artefacto.getActividad().getDescripcion();
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
     * Called by Struts for the execution of action APre_artefacto.
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
    public ActionForward APre_artefacto(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_artefacto", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            Long idArtefacto = lookup_Long(request, "idArtefacto");
            
            FArtefacto fFArtefacto = FArtefacto.clear(mapping, request);
            Artefacto artefacto = (Artefacto)s.load(Artefacto.class, idArtefacto);
            fFArtefacto.setIdArtefacto(artefacto.getIdArtefacto());
            fFArtefacto.setTitulo(artefacto.getTitulo());
            fFArtefacto.setTamano(artefacto.getTamano());
            fFArtefacto.setContenido(artefacto.getContenido());
            if (artefacto.getActividad()!=null) {
                fFArtefacto.setActividad(artefacto.getActividad().getIdActividad());
            } else {
                fFArtefacto.setActividad(0L);
            }

            //Feed for combo listActividad.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(descripcion, idActividad) " + 
               "from Actividad").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFArtefacto.setListActividad(list);
            }

            for (ActividadArtefacto _ActividadArtefacto : artefacto.getUsos()) {
                if (_ActividadArtefacto.getActividad()!=null) Hibernate.initialize(_ActividadArtefacto.getActividad());
                if (_ActividadArtefacto.getArtefacto()!=null) Hibernate.initialize(_ActividadArtefacto.getArtefacto());
            }
            request.setAttribute("L_ActividadArtefacto", artefacto.getUsos());

            request.getSession().setAttribute("idArtefacto", idArtefacto);
            request.getSession().setAttribute("idArtefacto_super", idArtefacto);

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
     * Called by Struts for the execution of action AAct_artefacto.
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
    public ActionForward AAct_artefacto(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_artefacto", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FArtefacto fFArtefacto = (FArtefacto)form;
            Artefacto artefacto = (Artefacto)s.load(Artefacto.class, fFArtefacto.getIdArtefacto());
            artefacto.setTitulo(fFArtefacto.getTitulo());
            artefacto.setTamano(fFArtefacto.getTamano());
            artefacto.setContenido(fFArtefacto.getContenido());
            if (fFArtefacto.getActividad()==0) artefacto.setActividad(null);
            else if ((artefacto.getActividad()==null) ||
                    (artefacto.getActividad().getIdActividad()!=fFArtefacto.getActividad())) {
                Actividad __obj = (Actividad)s.load(Actividad.class, fFArtefacto.getActividad());
                artefacto.setActividad(__obj);
            }


            //Feed for combo listActividad.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(descripcion, idActividad) " + 
               "from Actividad").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFArtefacto.setListActividad(list);
            }

            for (ActividadArtefacto _ActividadArtefacto : artefacto.getUsos()) {
                if (_ActividadArtefacto.getActividad()!=null) Hibernate.initialize(_ActividadArtefacto.getActividad());
                if (_ActividadArtefacto.getArtefacto()!=null) Hibernate.initialize(_ActividadArtefacto.getArtefacto());
            }
            request.setAttribute("L_ActividadArtefacto", artefacto.getUsos());

            request.getSession().setAttribute("idArtefacto", artefacto.getIdArtefacto());
            request.getSession().setAttribute("idArtefacto_super", artefacto.getIdArtefacto());

            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("AAct_artefacto.msg0"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action AElim_artefacto.
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
    public ActionForward AElim_artefacto(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"APreListar_artefacto", "V_artefacto", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            Long idArtefacto = lookup_Long(request, "idArtefacto");
            Artefacto artefacto = (Artefacto)s.load(Artefacto.class, idArtefacto);
            s.delete(artefacto);
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
            getResources(request).getMessage("AElim_artefacto.msg0"));
        }
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("AElim_artefacto.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action ACrear_artefacto.
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
    public ActionForward ACrear_artefacto(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_artefacto", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FArtefacto fFArtefacto = (FArtefacto)form;
            Artefacto artefacto = new Artefacto();
            artefacto.setTitulo(fFArtefacto.getTitulo());
            artefacto.setTamano(fFArtefacto.getTamano());
            artefacto.setContenido(fFArtefacto.getContenido());
            if (fFArtefacto.getActividad()==0) artefacto.setActividad(null);
            else {
                Actividad __obj = (Actividad)s.load(Actividad.class, fFArtefacto.getActividad());
                artefacto.setActividad(__obj);
            }

            s.save(artefacto);
            s.flush();
            fFArtefacto.setIdArtefacto(artefacto.getIdArtefacto());

            //Feed for combo listActividad.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(descripcion, idActividad) " + 
               "from Actividad").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFArtefacto.setListActividad(list);
            }

            request.getSession().setAttribute("idArtefacto", artefacto.getIdArtefacto());
            request.getSession().setAttribute("idArtefacto_super", artefacto.getIdArtefacto());

            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("ACrear_artefacto.msg0"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }



}