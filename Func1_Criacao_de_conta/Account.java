import java.util.Scanner;

public class Account
{
    private String name;
    private String login;
    private String password;

    public void setName(String name) {
        this.name = name;
    }

    public void setLogin(String login) {
        this.login = login;     
    }

    public void setPassword(String password) {
        this.password = password;
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
        return password ;
    }
}
