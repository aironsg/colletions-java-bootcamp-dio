package br.com.devairon.sets.guestSet;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainGuestSet {
    public static void main(String[] args) {

        Set<Guest> guests = new HashSet<>();
        GuestSet guestSet = new GuestSet(guests);

        guestSet.addGuest("airon", "1234");
        guestSet.addGuest("jose", "12345");
        guestSet.addGuest("marin", "12346");
        guestSet.addGuest("luiz", "12347");

        System.out.println("Quantidade de convidados é " + guestSet.countGuest());
        guestSet.displayGuest();

        guestSet.removeGuestByInvitationCode("1234");

        System.out.println("Quantidade de convidados é " + guestSet.countGuest());
        guestSet.displayGuest();
    }
}
