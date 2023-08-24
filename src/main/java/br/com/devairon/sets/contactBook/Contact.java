package br.com.devairon.sets.contactBook;

public class Contact {

    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "Nome ='" + name + '\'' +
                ", Número Telefone='" + phoneNumber + '\'' +
                '}';
    }
}
