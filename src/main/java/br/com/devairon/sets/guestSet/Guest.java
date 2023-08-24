package br.com.devairon.sets.guestSet;

public class Guest {

    private String name;
    private String invitationCode;

    public Guest(String name, String invitationCode) {
        this.name = name;
        this.invitationCode = invitationCode;
    }

    public String getName() {
        return name;
    }

    public String getInvitationCode() {
        return invitationCode;
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + name + '\'' +
                ", Código do convite='" + invitationCode + '\'' +
                '}';
    }
}
