package com.company.jmix4.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "TEMPLATE")
@Entity
public class Template {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @InstanceName
    @Column(name = "NAME")
    private String name;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    @Column(name = "COUNT_POINTS")
    private Integer countPoints;

    @Column(name = "DESCRIPTION")
    @Lob
    private String description;

    @Composition
    @OneToMany(mappedBy = "template")
    private List<PointTemplate> pointTemplates;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCountPoints() {
        return countPoints;
    }

    public void setCountPoints(Integer countPoints) {
        this.countPoints = countPoints;
    }

    public List<PointTemplate> getPointTemplates() {
        return pointTemplates;
    }

    public void setPointTemplates(List<PointTemplate> pointTemplates) {
        this.pointTemplates = pointTemplates;
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