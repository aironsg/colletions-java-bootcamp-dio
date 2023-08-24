package br.com.devairon.maps.scheduleEvent;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class ScheduleEvent {
    private Map<LocalDate, Event> scheduleEvent;

    public ScheduleEvent() {
        this.scheduleEvent = new HashMap<>();
    }

    public void add(LocalDate date, String name, String attraction){
        //TODO  Adiciona um evento à agenda.
    }

    public void displayScheduleEvent(){
        //TODO Exibe a agenda de eventos em ordem crescente de data.

    }

    public void getNextEvent(){
        //TODO Retorna o próximo evento que ocorrerá.
    }


}
