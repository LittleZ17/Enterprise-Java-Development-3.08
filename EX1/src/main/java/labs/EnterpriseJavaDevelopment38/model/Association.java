package labs.EnterpriseJavaDevelopment38.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Association {
    @Id
    private Integer id;
    private String name;

    public Association() {
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
}
