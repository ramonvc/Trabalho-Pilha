public class Contact {
    private int id;
    private String name;
    private String phone;
    private String email;

    public Contact(String name, String phone, String email) {
        this.id = this.hashCode();
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return  "Id: " + this.getId() + "\n" +
                "Nome: " + this.getName() + "\n" +
                "E-mail: " + this.getEmail() + "\n" +
                "Fone: " + this.getPhone();
    }
}
