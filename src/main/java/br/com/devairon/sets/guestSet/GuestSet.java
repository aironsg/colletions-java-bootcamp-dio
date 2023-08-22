package br.com.devairon.sets.guestSet;

import java.util.HashSet;
import java.util.Set;

public class GuestSet {

    Set<Guest> guestSet = new HashSet<>();

    public GuestSet(Set<Guest> guestSet) {
        this.guestSet = guestSet;
    }

    public void addGuest(String name, String invitationCode) {
        //TODO  Adiciona um convidado ao conjunto.
    }

    public void removeGuestByInvitationCode(String invitationCode) {
        //TODO Remove um convidado do conjunto com base no código do convite.
    }

    public int countGuest() {

        return this.guestSet.size();
    }

    public void displayGuest() {
        //TODO Exibe todos os convidados do conjunto.
    }
}
