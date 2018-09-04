package org.jfeild1337.grudgebox.entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "GRUDGE_SEVERITY", schema = "GRUDGE", catalog = "")
public class GrudgeSeverityEntity {
    private int severityLevel;
    private String severityText;
    private Collection<GrudgeRecordEntity> grudgeRecordsBySeverityLevel;

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

    @OneToMany(mappedBy = "grudgeSeverityBySeverityLevel")
    public Collection<GrudgeRecordEntity> getGrudgeRecordsBySeverityLevel() {
        return grudgeRecordsBySeverityLevel;
    }

    public void setGrudgeRecordsBySeverityLevel(Collection<GrudgeRecordEntity> grudgeRecordsBySeverityLevel) {
        this.grudgeRecordsBySeverityLevel = grudgeRecordsBySeverityLevel;
    }
}
