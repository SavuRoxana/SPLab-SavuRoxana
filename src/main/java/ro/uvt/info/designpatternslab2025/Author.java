package ro.uvt.info.designpatternslab2025;

public class Author {
    private String name;
    private String surname;

    public Author(String fullName) {
        // Assuming fullName is "FirstName LastName" or "FirstName Surname"
        String[] parts = fullName.split(" ", 2);
        if (parts.length >= 2) {
            this.name = parts[0];
            this.surname = parts[1];
        } else {
            this.name = fullName;
            this.surname = "";
        }
    }

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

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

    public void print() {
        System.out.println("Author: " + name + " " + surname);
    }
}
