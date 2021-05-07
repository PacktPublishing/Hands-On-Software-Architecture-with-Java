package it.test;

import java.sql.Date;

public class Payment {

   private String id; 

   private Date date;

   private String currency;

   private String sender;

   private String recipient;

   private String signature;

   private float amount;

   public Payment() {
}
   
   public Payment(String id, Date date, String currency, String sender, String recipient, String signature, float amount) {
    this.id = id;
    this.date = date;
    this.currency = currency;
    this.sender = sender;
    this.recipient = recipient;
    this.signature = signature;
    this.amount = amount;
}
   
public String getId() {
    return id;
}

public void setId(String id) {
    this.id = id;
}

public Date getDate() {
    return date;
}

public void setDate(Date date) {
    this.date = date;
}

public String getCurrency() {
    return currency;
}

public void setCurrency(String currency) {
    this.currency = currency;
}

public String getSender() {
    return sender;
}

public void setSender(String sender) {
    this.sender = sender;
}

public String getRecipient() {
    return recipient;
}

public void setRecipient(String recipient) {
    this.recipient = recipient;
}

public String getSignature() {
    return signature;
}

public void setSignature(String signature) {
    this.signature = signature;
}

public float getAmount() {
    return amount;
}

public void setAmount(float amount) {
    this.amount = amount;
}

@Override
public String toString() {
    return "Payment [amount=" + amount + ", currency=" + currency + ", date=" + date + ", id=" + id + ", recipient="
            + recipient + ", sender=" + sender + ", signature=" + signature + "]";
}

   
}
