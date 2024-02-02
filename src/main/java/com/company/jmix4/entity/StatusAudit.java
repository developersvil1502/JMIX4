package com.company.jmix4.entity;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum StatusAudit implements EnumClass<Integer> {

    PLANNED(10),
    WORK(20),
    END(30);

    private final Integer id;

    StatusAudit(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static StatusAudit fromId(Integer id) {
        for (StatusAudit at : StatusAudit.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}