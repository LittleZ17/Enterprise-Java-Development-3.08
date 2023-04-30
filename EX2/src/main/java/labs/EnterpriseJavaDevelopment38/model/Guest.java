package labs.EnterpriseJavaDevelopment38.model;

import jakarta.persistence.*;
import labs.EnterpriseJavaDevelopment38.Enum.Status;

import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Status status;
    @ManyToMany
    @JoinTable(
            name = "guest_event",
            joinColumns = {@JoinColumn(name = "guest_id")},
            inverseJoinColumns = {@JoinColumn(name = "event_id")}
    )
    private List<Event> events;

    public Guest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
}
