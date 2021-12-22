package it.test;

import java.util.Random;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.metrics.MetricUnits;
import org.eclipse.microprofile.metrics.annotation.Counted;
import org.eclipse.microprofile.metrics.annotation.Timed;

@Path("/")
public class MetricsTest {

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    @Counted(name = "callsNumber", description = "How many calls received.")
    @Timed(name = "callsTimer", description = "Time for each call", unit = MetricUnits.MILLISECONDS)
    public String hello() throws InterruptedException {
        int rand = (int)(Math.random() * 30);
        Thread.sleep(rand*100);
        return "Hello RESTEasy";
    }
}