package org.jfeild1337.grudgebox.entities;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "GRUDGE_SEVERITY", schema = "GRUDGE")
public class GrudgeSeverityEntity implements Serializable {
    private int severityLevel;
    private String severityText;

    @Id
    @Column(name = "SEVERITY_LEVEL")
    public int getSeverityLevel() {
        return severityLevel;
    }

    public void setSeverityLevel(int severityLevel) {
        this.severityLevel = severityLevel;
    }

    @Basic
    @Column(name = "SEVERITY_TEXT")
    public String getSeverityText() {
        return severityText;
    }

    public void setSeverityText(String severityText) {
        this.severityText = severityText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GrudgeSeverityEntity that = (GrudgeSeverityEntity) o;

        if (severityLevel != that.severityLevel) return false;
        if (severityText != null ? !severityText.equals(that.severityText) : that.severityText != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = severityLevel;
        result = 31 * result + (severityText != null ? severityText.hashCode() : 0);
        return result;
    }
}
