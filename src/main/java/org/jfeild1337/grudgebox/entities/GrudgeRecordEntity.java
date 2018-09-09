package org.jfeild1337.grudgebox.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "GRUDGE_RECORD", schema = "GRUDGE")
public class GrudgeRecordEntity implements Serializable {
    private int recordId;
    private String grudgeText;
    private Timestamp grudgeCreatedDate;
    private Timestamp grudgeUpdatedDate;
    private SubjectsEntity subjectsBySubjectId;
    private GrudgeSeverityEntity grudgeSeverityBySeverityLevel;

    @Id
    @Column(name = "RECORD_ID")
    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    @Basic
    @Column(name = "GRUDGE_TEXT")
    public String getGrudgeText() {
        return grudgeText;
    }

    public void setGrudgeText(String grudgeText) {
        this.grudgeText = grudgeText;
    }

    @Basic
    @Column(name = "GRUDGE_CREATED_DATE")
    public Timestamp getGrudgeCreatedDate() {
        return grudgeCreatedDate;
    }

    public void setGrudgeCreatedDate(Timestamp grudgeCreatedDate) {
        this.grudgeCreatedDate = grudgeCreatedDate;
    }

    @Basic
    @Column(name = "GRUDGE_UPDATED_DATE")
    public Timestamp getGrudgeUpdatedDate() {
        return grudgeUpdatedDate;
    }

    public void setGrudgeUpdatedDate(Timestamp grudgeUpdatedDate) {
        this.grudgeUpdatedDate = grudgeUpdatedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GrudgeRecordEntity that = (GrudgeRecordEntity) o;

        if (recordId != that.recordId) return false;
        if (grudgeText != null ? !grudgeText.equals(that.grudgeText) : that.grudgeText != null) return false;
        if (grudgeCreatedDate != null ? !grudgeCreatedDate.equals(that.grudgeCreatedDate) : that.grudgeCreatedDate != null)
            return false;
        if (grudgeUpdatedDate != null ? !grudgeUpdatedDate.equals(that.grudgeUpdatedDate) : that.grudgeUpdatedDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = recordId;
        result = 31 * result + (grudgeText != null ? grudgeText.hashCode() : 0);
        result = 31 * result + (grudgeCreatedDate != null ? grudgeCreatedDate.hashCode() : 0);
        result = 31 * result + (grudgeUpdatedDate != null ? grudgeUpdatedDate.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "SUBJECT_ID", referencedColumnName = "SUBJECT_ID", nullable = false)
    public SubjectsEntity getSubjectsBySubjectId() {
        return subjectsBySubjectId;
    }

    public void setSubjectsBySubjectId(SubjectsEntity subjectsBySubjectId) {
        this.subjectsBySubjectId = subjectsBySubjectId;
    }

    @ManyToOne
    @JoinColumn(name = "SEVERITY_LEVEL", referencedColumnName = "SEVERITY_LEVEL", nullable = false)
    public GrudgeSeverityEntity getGrudgeSeverityBySeverityLevel() {
        return grudgeSeverityBySeverityLevel;
    }

    public void setGrudgeSeverityBySeverityLevel(GrudgeSeverityEntity grudgeSeverityBySeverityLevel) {
        this.grudgeSeverityBySeverityLevel = grudgeSeverityBySeverityLevel;
    }
}
