package br.com.devairon.maps.scheduleEvent;

public class Event {

    private String name;
    private String attaction;

    public Event(String name, String attaction) {
        this.name = name;
        this.attaction = attaction;
    }

    public String getName() {
        return name;
    }

    public String getAttaction() {
        return attaction;
    }
}
