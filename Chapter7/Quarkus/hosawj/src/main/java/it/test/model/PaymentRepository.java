package it.test.model;

import java.util.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@ApplicationScoped
public class PaymentRepository {
   
    private Logger log =   Logger.getLogger(this.getClass().getName());

    @PersistenceContext
    private EntityManager em;

    @Transactional
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
