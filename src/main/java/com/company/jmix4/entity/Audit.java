package com.company.jmix4.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "AUDIT_")
@Entity(name = "Audit_")
public class Audit {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    @InstanceName
    @Column(name = "NAME")
    private String name;

    @Column(name = "CHECK_SIDE")
    private String checkSide;

    @Column(name = "DESCRIPTION")
    @Lob
    private String description;

    @Column(name = "DATE_END")
    private LocalDate dateEnd;

    @Column(name = "STATUS_AUDIT")
    private Integer statusAudit;

    @Composition
    @OneToMany(mappedBy = "audit")
    private List<CheckList> checkLists;

    public String getCheckSide() {
        return checkSide;
    }

    public void setCheckSide(String checkSide) {
        this.checkSide = checkSide;
    }

    public List<CheckList> getCheckLists() {
        return checkLists;
    }

    public void setCheckLists(List<CheckList> checkLists) {
        this.checkLists = checkLists;
    }

    public StatusAudit getStatusAudit() {
        return statusAudit == null ? null : StatusAudit.fromId(statusAudit);
    }

    public void setStatusAudit(StatusAudit statusAudit) {
        this.statusAudit = statusAudit == null ? null : statusAudit.getId();
    }

    public LocalDate getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}