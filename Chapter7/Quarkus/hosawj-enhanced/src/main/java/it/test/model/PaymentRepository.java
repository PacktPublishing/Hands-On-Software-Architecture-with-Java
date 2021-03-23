package it.test.model;

import java.util.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class PaymentRepository implements PanacheRepository<Payment>{
   
    private Logger log =   Logger.getLogger(this.getClass().getName());

    @Transactional
    public Payment create(Payment payment)
    {
        log.info("Persisting " + payment );
        persist(payment);
        return payment;
    }
    
    public Payment find(String id)
    {
        log.info("Looking for " + id );
        
        Payment payment=find("id", id).firstResult();
        log.info("Found " + payment );
        return payment;
    }

}
