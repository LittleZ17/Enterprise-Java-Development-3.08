package labs.EnterpriseJavaDevelopment38.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String district;

    @OneToOne
    @JoinColumn(name = "president_id")
    private Member president;
    @Embedded
    private List<Member> memberList;
    @ManyToOne
    @JoinColumn(name = "association_id")
    private Association association;

    @OneToMany(mappedBy = "id")
    private List<Member> members;

    public Chapter() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Member getPresident() {
        return president;
    }

    public void setPresident(Member president) {
        this.president = president;
    }

    public List<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
    }
}
