package com.company.jmix4.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "CHECK_LIST", indexes = {
        @Index(name = "IDX_CHECK_LIST_AUDIT", columnList = "AUDIT_ID")
})
@Entity
public class CheckList {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @InstanceName
    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Composition
    @OneToMany(mappedBy = "checkList")
    private List<PointCheckList> pointCheckLists;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    @JoinColumn(name = "AUDIT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Audit audit;

    public List<PointCheckList> getPointCheckLists() {
        return pointCheckLists;
    }

    public void setPointCheckLists(List<PointCheckList> pointCheckLists) {
        this.pointCheckLists = pointCheckLists;
    }

    public Audit getAudit() {
        return audit;
    }

    public void setAudit(Audit audit) {
        this.audit = audit;
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