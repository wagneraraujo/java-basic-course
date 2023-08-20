package Entities;

public class RentLesson94 {
    private String name;
    private String email;

    public RentLesson94(){

    }

    public RentLesson94(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return "Rent [name=" + name + ", email" + email +"]";
    }
}
