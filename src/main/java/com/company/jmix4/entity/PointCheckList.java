package com.company.jmix4.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;

import java.util.UUID;

@JmixEntity
@Table(name = "POINT_CHECK_LIST", indexes = {
        @Index(name = "IDX_POINT_CHECK_LIST_CHECK_LIST", columnList = "CHECK_LIST_ID")
})
@Entity
public class PointCheckList {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    @Column(name = "CONTENT")
    private String content;

    @Lob
    @Column(name = "CONCLUSION")
    private String conclusion;

    @Column(name = "STATUS_CHECK_LIST")
    private Integer statusCheckList;

    @JoinColumn(name = "CHECK_LIST_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private CheckList checkList;

    public CheckList getCheckList() {
        return checkList;
    }

    public void setCheckList(CheckList checkList) {
        this.checkList = checkList;
    }

    public StatusCheckList getStatusCheckList() {
        return statusCheckList == null ? null : StatusCheckList.fromId(statusCheckList);
    }

    public void setStatusCheckList(StatusCheckList statusCheckList) {
        this.statusCheckList = statusCheckList == null ? null : statusCheckList.getId();
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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