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
public class AccionesMetodologia extends CohesionAction {
    
/**
     * Called by Struts for the execution of action APreCrear_metodologia.
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
    public ActionForward APreCrear_metodologia(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"VCrear_metodologia", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FMetodologia fFMetodologia = FMetodologia.clear(mapping, request);

             //Feed for combo listProyecto.
             {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
                (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
                "select new ve.usb.cohesion.runtime.Pair(nombre, idProyecto) " + 
                "from Proyecto").list();
              list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
              fFMetodologia.setListProyecto(list);
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
     * Called by Struts for the execution of action APreBuscar_metodologia.
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
    public ActionForward APreBuscar_metodologia(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"VBuscar_metodologia", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FMetodologiaBuscar.clear(mapping, request);

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
     * Called by Struts for the execution of action ABuscar_metodologia.
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
    public ActionForward ABuscar_metodologia(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"APreListar_metodologia", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FMetodologiaBuscar fFMetodologiaBuscar = (FMetodologiaBuscar)form;
            request.getSession().setAttribute("ABuscar_metodologia_campo", "nombre");
            request.getSession().setAttribute("ABuscar_metodologia_valor", "%" + fFMetodologiaBuscar.getNombre() + "%");

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
     * Called by Struts for the execution of action APreListar_metodologia.
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
    public ActionForward APreListar_metodologia(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"VListar_metodologia", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            String crit = (String)request.getSession().getAttribute("ABuscar_metodologia_campo");
            java.util.List<Metodologia> list;
            if (crit==null) {
                list = (java.util.List<Metodologia>)s.createQuery("from Metodologia").list();
            } else {
                String valor = (String)request.getSession().getAttribute("ABuscar_metodologia_valor");
                list = (java.util.List<Metodologia>)
                   s.createQuery("from Metodologia where "+crit+" like :valor")
                    .setString("valor", valor).list();
                request.getSession().removeAttribute("ABuscar_metodologia_campo");
                request.getSession().removeAttribute("ABuscar_metodologia_valor");
            }
            request.setAttribute("L_Metodologia", list);
            for (Metodologia metodologia:list) {
                if (metodologia.getProyectoModelo()!=null) metodologia.getProyectoModelo().getNombre();
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
     * Called by Struts for the execution of action APre_metodologia.
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
    public ActionForward APre_metodologia(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_metodologia", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            Long idMetodologia = lookup_Long(request, "idMetodologia");
            
            FMetodologia fFMetodologia = FMetodologia.clear(mapping, request);
            Metodologia metodologia = (Metodologia)s.load(Metodologia.class, idMetodologia);
            fFMetodologia.setIdMetodologia(metodologia.getIdMetodologia());
            fFMetodologia.setNombre(metodologia.getNombre());
            fFMetodologia.setClasificacion(metodologia.getClasificacion());
            if (metodologia.getProyectoModelo()!=null) {
                fFMetodologia.setProyectoModelo(metodologia.getProyectoModelo().getIdProyecto());
            } else {
                fFMetodologia.setProyectoModelo(0L);
            }

            //Feed for combo listProyecto.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(nombre, idProyecto) " + 
               "from Proyecto").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFMetodologia.setListProyecto(list);
            }

            for (Proyecto _Proyecto : metodologia.getProyectos()) {
                if (_Proyecto.getMetodologia()!=null) Hibernate.initialize(_Proyecto.getMetodologia());
            }
            request.setAttribute("L_Proyecto", metodologia.getProyectos());
            for (Rol _Rol : metodologia.getRoles()) {
                if (_Rol.getMetodologia()!=null) Hibernate.initialize(_Rol.getMetodologia());
            }
            request.setAttribute("L_Rol", metodologia.getRoles());

            request.getSession().setAttribute("idMetodologia", idMetodologia);
            request.getSession().setAttribute("idMetodologia_super", idMetodologia);

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
     * Called by Struts for the execution of action AAct_metodologia.
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
    public ActionForward AAct_metodologia(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_metodologia", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FMetodologia fFMetodologia = (FMetodologia)form;
            Metodologia metodologia = (Metodologia)s.load(Metodologia.class, fFMetodologia.getIdMetodologia());
            metodologia.setNombre(fFMetodologia.getNombre());
            metodologia.setClasificacion(fFMetodologia.getClasificacion());
            if (fFMetodologia.getProyectoModelo()==0) metodologia.setProyectoModelo(null);
            else if ((metodologia.getProyectoModelo()==null) ||
                    (metodologia.getProyectoModelo().getIdProyecto()!=fFMetodologia.getProyectoModelo())) {
                Proyecto __obj = (Proyecto)s.load(Proyecto.class, fFMetodologia.getProyectoModelo());
                metodologia.setProyectoModelo(__obj);
            }


            //Feed for combo listProyecto.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(nombre, idProyecto) " + 
               "from Proyecto").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFMetodologia.setListProyecto(list);
            }

            for (Proyecto _Proyecto : metodologia.getProyectos()) {
                if (_Proyecto.getMetodologia()!=null) Hibernate.initialize(_Proyecto.getMetodologia());
            }
            request.setAttribute("L_Proyecto", metodologia.getProyectos());
            for (Rol _Rol : metodologia.getRoles()) {
                if (_Rol.getMetodologia()!=null) Hibernate.initialize(_Rol.getMetodologia());
            }
            request.setAttribute("L_Rol", metodologia.getRoles());

            request.getSession().setAttribute("idMetodologia", metodologia.getIdMetodologia());
            request.getSession().setAttribute("idMetodologia_super", metodologia.getIdMetodologia());

            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("AAct_metodologia.msg0"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action AElim_metodologia.
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
    public ActionForward AElim_metodologia(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"APreListar_metodologia", "V_metodologia", };
        final int SALIDA_0 = 0;
        final int SALIDA_1 = 1;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            Long idMetodologia = lookup_Long(request, "idMetodologia");
            Metodologia metodologia = (Metodologia)s.load(Metodologia.class, idMetodologia);
            s.delete(metodologia);
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
            getResources(request).getMessage("AElim_metodologia.msg0"));
        }
        if (salida==1) {
          request.setAttribute("msg",
            getResources(request).getMessage("AElim_metodologia.msg1"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }

/**
     * Called by Struts for the execution of action ACrear_metodologia.
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
    public ActionForward ACrear_metodologia(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_metodologia", };
        final int SALIDA_0 = 0;

        int salida = SALIDA_0;
        Session s = HibernateUtil.getCurrentSession();
        Transaction tr = s.beginTransaction();
        try {
            FMetodologia fFMetodologia = (FMetodologia)form;
            Metodologia metodologia = new Metodologia();
            metodologia.setNombre(fFMetodologia.getNombre());
            metodologia.setClasificacion(fFMetodologia.getClasificacion());
            if (fFMetodologia.getProyectoModelo()==0) metodologia.setProyectoModelo(null);
            else {
                Proyecto __obj = (Proyecto)s.load(Proyecto.class, fFMetodologia.getProyectoModelo());
                metodologia.setProyectoModelo(__obj);
            }

            s.save(metodologia);
            s.flush();
            fFMetodologia.setIdMetodologia(metodologia.getIdMetodologia());

            //Feed for combo listProyecto.
            {java.util.List<ve.usb.cohesion.runtime.Pair> list = 
               (java.util.List<ve.usb.cohesion.runtime.Pair>)s.createQuery(
               "select new ve.usb.cohesion.runtime.Pair(nombre, idProyecto) " + 
               "from Proyecto").list();
             list.add(0,new ve.usb.cohesion.runtime.Pair("Ninguna", 0));
             fFMetodologia.setListProyecto(list);
            }

            request.getSession().setAttribute("idMetodologia", metodologia.getIdMetodologia());
            request.getSession().setAttribute("idMetodologia_super", metodologia.getIdMetodologia());

            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
            throw ex;
        } finally {
            try { s.close(); } catch (Exception ex2) {}
        }
        if (salida==0) {
          request.setAttribute("msg",
            getResources(request).getMessage("ACrear_metodologia.msg0"));
        }

        return mapping.findForward(SALIDAS[salida]);
    }



}