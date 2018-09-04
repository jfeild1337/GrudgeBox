package org.jfeild1337.grudgebox.entities;

import javax.persistence.*;

@Entity
@Table(name = "GRUDGE", schema = "GRUDGE", catalog = "")
public class GrudgeEntity {
    private int grudgeId;
    private String grudgeText;

    @Id
    @Column(name = "GRUDGE_ID")
    public int getGrudgeId() {
        return grudgeId;
    }

    public void setGrudgeId(int grudgeId) {
        this.grudgeId = grudgeId;
    }

    @Basic
    @Column(name = "GRUDGE_TEXT")
    public String getGrudgeText() {
        return grudgeText;
    }

    public void setGrudgeText(String grudgeText) {
        this.grudgeText = grudgeText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GrudgeEntity that = (GrudgeEntity) o;

        if (grudgeId != that.grudgeId) return false;
        if (grudgeText != null ? !grudgeText.equals(that.grudgeText) : that.grudgeText != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = grudgeId;
        result = 31 * result + (grudgeText != null ? grudgeText.hashCode() : 0);
        return result;
    }
}
