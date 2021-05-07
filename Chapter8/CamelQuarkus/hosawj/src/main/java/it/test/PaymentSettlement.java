package it.test;
import javax.enterprise.context.ApplicationScoped;
import org.apache.camel.builder.endpoint.EndpointRouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;

@ApplicationScoped
public class PaymentSettlement extends EndpointRouteBuilder {

    @Override
    public void configure() throws Exception {

 //Simple Route
         from(platformHttp("/camel/settlement")) 
        .unmarshal() 
        .json(JsonLibrary.Jackson, Payment.class) 
        .setHeader("PaymentID", simple("${body.id}")) 
        .marshal() 
        .jacksonxml() 
        .to(file("{{settlement.path}}?fileName=${header.PaymentID}.xml")); 

/*        
//Filter
        from(platformHttp("/camel/settlement")) 
        .unmarshal() 
        .json(JsonLibrary.Jackson, Payment.class) 
        .setHeader("PaymentID", simple("${body.id}")) 
        .setHeader("Amount", simple("${body.amount}"))
        .marshal() 
        .jacksonxml() 
            .filter(simple("${header.amount} > 10"))
            .to(file("{{settlement.path}}?fileName=${header.PaymentID}.xml")); 

+/
       /* 
      //Content Based Routing   
         from(platformHttp("/camel/settlement"))
        .unmarshal()
        .json(JsonLibrary.Jackson, Payment.class)
        .setHeader("PaymentID", simple("${body.id}"))
        .setHeader("Amount", simple("${body.amount}"))
        .marshal()
        .jacksonxml()
            .choice()   
                .when(simple("${header.amount} > 10"))
                    .to(file("{{settlement.path}}?fileName=${header.PaymentID}.xml"))
                .otherwise()    
                    .log("No settlement needed")
        .end(); */
    }
}