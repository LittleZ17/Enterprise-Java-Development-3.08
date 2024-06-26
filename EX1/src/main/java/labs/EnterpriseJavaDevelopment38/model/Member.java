package labs.EnterpriseJavaDevelopment38.model;

import labs.EnterpriseJavaDevelopment38.Enum.Status;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Embeddable
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Status status;
    private Date renewalDate;
    @ManyToOne
    @JoinColumn(name = "chapter_id")
    private Chapter chapter;

    public Member() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Date getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(Date renewalDate) {
        this.renewalDate = renewalDate;
    }
}
