package it.test.rest;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import it.test.model.Payment;
import it.test.model.PaymentRepository;


@Path("/payments")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PaymentResource {

    @Inject
    PaymentRepository repository;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello";
    }

    @GET
    @Path("/find/{id}")
    public Response find(@PathParam("id") String id) {
        Payment payment=repository.find(id);
        if(payment==null)
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        else    
         return Response.ok(payment).build();
    }
/*
curl -X POST -H 'Content-Type:application/json' -d '{"id":"1ef43029-f1eb-4dd8-85c4-1c332b69173c", "date":1616504158091, "currency":"EUR", "sender":"giuseppe@test.it", "recipient":"stefano@domain.com", "signature":"169e8dbf-90b0-4b45-b0f9-97789d66dee7", "amount":100.0}'  http://127.0.0.1:8080/hosawj/rest/payments/create

{"id":"1ef43029-f1eb-4dd8-85c4-1c332b69173c",
"date":1616504158091,
"currency":"EUR",
"sender":"giuseppe@test.it",
"recipient":"stefano@domain.com",
"signature":"169e8dbf-90b0-4b45-b0f9-97789d66dee7",
"amount":100.0}
*/
    @POST
    @Path("/create")
    public Response create(Payment payment) {
        return Response.ok(repository.create(payment)).build();
    }
}
