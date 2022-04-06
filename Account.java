import java.util.ArrayList;
import java.util.Scanner;

public class Account
{
    private String name;
    private String login;
    private String password;
    private String age;
    private String gender;
    private String address;
    private String phone_number;
    private String new_attribute;
    private String attribute_name;

    public void setName(String name) {
        this.name = name;
    }

    public void setLogin(String login) {
        this.login = login;     
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(String age) {
        this.age = age;
    } 

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone_number) {
        this.phone_number = phone_number;
    }

    public void Criar(String new_attribute, String attribute_name) {
        this.attribute_name = attribute_name;
        this.new_attribute = new_attribute;
    }

    public String getName()
    {
        return name;
    }

    public String getUser()
    {
        return login;
    }

    public String getPass()
    {
        return password;
    }

    public String getAge()
    {
        return age;
    }

    public String getGender()
    {
        return gender;
    }

    public String getAddress()
    {
        return address;
    }

    public String getPhone()
    {
        return phone_number;
    }

    public String getAttribute()
    {
        return new_attribute;
    }

    public String getAttributeName()
    {
        return attribute_name;
    }

    public void encerrar()
    {
        this.address = null;
        this.age = null;
        this.name = null;
        this.login = null;
        this.password = null;
        this.phone_number = null;
        this.gender = null;
        this.new_attribute = null;
        this.attribute_name = null;

    }
}