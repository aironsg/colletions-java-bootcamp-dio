package br.com.devairon.sets.guestSet;

import java.util.HashSet;
import java.util.Set;

public class GuestSet {

    Set<Guest> guestSet = new HashSet<>();

    public GuestSet(Set<Guest> guestSet) {
        this.guestSet = guestSet;
    }

    public void addGuest(String name, String invitationCode) {
        Guest guest = new Guest(name, invitationCode);
        if(guestSet.isEmpty() || !guestSet.contains(guest)){
            guestSet.add(new Guest(name, invitationCode));
        }

    }

    public void removeGuestByInvitationCode(String invitationCode) {
        int count = 0;
        for (Guest guest: guestSet) {
            if(!guestSet.isEmpty()){
                if(guest.getInvitationCode().equalsIgnoreCase(invitationCode)){
                    guestSet.remove(guest);
                    System.out.println("Convidado removido com sucesso!");
                    break;
                }
            }

            if(guestSet.isEmpty() || (!guest.getInvitationCode().equalsIgnoreCase(invitationCode) && count == guestSet.size())){
                System.out.println("Erro ao encontrar o convidado, verifique os dados e tente novamente");
            }
            count++;
        }
    }

    public int countGuest() {
        return this.guestSet.size();
    }

    public void displayGuest() {
        //TODO Exibe todos os convidados do conjunto.
        for (Guest guest: guestSet
             ) {
            System.out.println("==================================");
            System.out.println(guest.toString());
            System.out.println("==================================");
        }
    }
}
