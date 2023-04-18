public class Login {

    private String name_user,pass_user,
            name_admin,pass_admin;

    public Login(){
        name_user = "tami";
        pass_user = "1234";

        name_admin = "mita";
        pass_admin = "4321";
    }

    //setter
    public void setUsername_user(String username_user){
        this.name_user = username_user;
    }
    public void setPassword_user(String password_user){
        this.pass_user = password_user;
    }
    public void setUsername_admin(String username_admin){
        this.name_admin = username_admin;
    }
    public void setPassword_admin(String password_admin){
        this.pass_admin = password_admin;
    }

    //getter
    public String getUsername_user() {
        return name_user;
    }
    public String getPassword_user() {
        return pass_user;
    }
    public String getUsername_admin() {
        return name_admin;
    }
    public String getPassword_admin() {
        return pass_admin;
    }
}
