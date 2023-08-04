public class User {
    private String id;
    private String nameSurname;
    private String phoneNumber;
    private String email;

    public User(String id, String nameSurname, String phoneNumber, String email) {
        this.id = id;
        this.nameSurname = nameSurname;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public User() {
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNameSurname() {
        return nameSurname;
    }
    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
