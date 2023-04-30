package labs.EnterpriseJavaDevelopment38.model;

import jakarta.persistence.Entity;

@Entity
public class Speaker extends Guest{
    private double presentationDuration;

    public Speaker() {
        super();
    }

    public double getPresentationDuration() {
        return presentationDuration;
    }

    public void setPresentationDuration(double presentationDuration) {
        this.presentationDuration = presentationDuration;
    }
}
