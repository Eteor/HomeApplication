public class User {

    private long id;
    private String login;
    private String password;

    public User(Long id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }


    public long getId()
    {
        return id;
    }

    public String GetLogin()
    {
        return login;
    }

    public String getPassword()
    {
        return password;
    }

    private void setId(long id)
    {
        this.id = id;
    }

    private void setLogin(String login)
    {
        this.login = login;
    }

    private void setPassword(String password)
    {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
