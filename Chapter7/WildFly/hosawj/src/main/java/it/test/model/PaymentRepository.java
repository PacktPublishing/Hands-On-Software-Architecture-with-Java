package it.test.model;

import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public class PaymentRepository {
   
    private Logger log =   Logger.getLogger(this.getClass().getName());

    @PersistenceContext(unitName = "hosawjPersistenceUnit")
    private EntityManager em;

    public Payment create(Payment payment)
    {
        log.info("Persisting " + payment );
        em.persist(payment);
        return payment;
    }
    public Payment find(String id)
    {
        log.info("Looking for " + id );
        Payment payment=em.find(Payment.class, id);
        log.info("Found " + payment );
        return payment;
    }

}
