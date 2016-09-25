/*
 * HibernateUtil.java
 */

package ve.usb.cohesion.runtime;

import javax.servlet.http.HttpSession;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class HibernateUtil {
    private static final SessionFactory sessionFactory;
    private static Session session;
    static {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    public static Session getCurrentSession() {
        if (session==null || !session.isOpen()) {
//            AuditLogInterceptor interceptor = new AuditLogInterceptor();
//            session=sessionFactory.openSession(interceptor);
            session=sessionFactory.openSession();
//            interceptor.setSession(session);
//            interceptor.setSessionId("xx");
        } 
        return session;
    }
    
    public static Session getCurrentSession(String sessionId) {
        if (session==null || !session.isOpen()) {
//            AuditLogInterceptor interceptor = new AuditLogInterceptor();
//            session=sessionFactory.openSession(interceptor);
            session=sessionFactory.openSession();
//            interceptor.setSession(session);
//            interceptor.setSessionId(sessionId);
        } 
        return session;
    }
    
}