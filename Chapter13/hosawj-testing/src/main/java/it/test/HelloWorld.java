package it.test;

public class HelloWorld {

    private String who;

    public HelloWorld() {
        this.who="default";
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }
    
    public String doIt()
    {
        return "Hello "+ this.who;
    }
    
}
