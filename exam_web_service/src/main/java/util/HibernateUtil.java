package util;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
    private static SessionFactory sessionFactory;

    static {
        try {
            sessionFactory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .buildSessionFactory();

        } catch (Throwable ex) {
            ex.printStackTrace();
        }
    }

    public static Session getSession() throws HibernateException {
        return sessionFactory.openSession();
    }
    public static void main(String[] args) throws Exception {
        final Session session = getSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();


            transaction.commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            transaction.rollback();
        } finally {
            session.close();
        }
    }
}
