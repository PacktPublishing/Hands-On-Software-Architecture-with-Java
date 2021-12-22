package it.test;

import java.util.Random;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.opentracing.Traced;

@ApplicationScoped
@Traced
public class NameGuessService {

    public String guess()
    {
        Random random = new Random();
        String[] names = {"Giuseppe","Stefano","Filippo","Luca","Antonello"};
        return names[random.nextInt(names.length)];
    }
    
}
