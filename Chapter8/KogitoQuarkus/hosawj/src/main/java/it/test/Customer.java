package it.test;
public class Customer
{
    private String name;
    private String surname;
    private int age;
    private String taxCode;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getTaxCode() {
        return taxCode;
    }
    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }
    @Override
    public String toString() {
        return "Customer [age=" + age + ", name=" + name + ", surname=" + surname + ", taxCode=" + taxCode + "]";
    }

}