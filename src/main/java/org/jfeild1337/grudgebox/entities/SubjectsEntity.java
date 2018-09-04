package org.jfeild1337.grudgebox.entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "SUBJECTS", schema = "GRUDGE", catalog = "")
public class SubjectsEntity {
    private int subjectId;
    private String subjectName;
    private Collection<GrudgeRecordEntity> grudgeRecordsBySubjectId;

    @Id
    @Column(name = "SUBJECT_ID")
    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    @Basic
    @Column(name = "SUBJECT_NAME")
    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubjectsEntity that = (SubjectsEntity) o;

        if (subjectId != that.subjectId) return false;
        if (subjectName != null ? !subjectName.equals(that.subjectName) : that.subjectName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = subjectId;
        result = 31 * result + (subjectName != null ? subjectName.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "subjectsBySubjectId")
    public Collection<GrudgeRecordEntity> getGrudgeRecordsBySubjectId() {
        return grudgeRecordsBySubjectId;
    }

    public void setGrudgeRecordsBySubjectId(Collection<GrudgeRecordEntity> grudgeRecordsBySubjectId) {
        this.grudgeRecordsBySubjectId = grudgeRecordsBySubjectId;
    }
}
