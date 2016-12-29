import notentity.Bus;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Olga Pavlova on 12/29/2016.
 */
public class Main {
    public static void main(String args[]){

        Bus bus = new Bus();
        bus.setId(16);
        bus.setNumber("BusNumberIsSet");


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("NewPersistenceUnit");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(bus);
        em.getTransaction().commit();


        /*EntityManagerFactory emf1 = Persistence.createEntityManagerFactory("NewPersistenceUnit");
        EntityManager em1 = emf1.createEntityManager();

        em1.getTransaction().begin();

        Bus bus1 = em1.find(Bus.class, new Long(1));
        System.out.println(bus1.toString());

        em1.getTransaction().commit();*/


    }

}
