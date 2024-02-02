package com.company.jmix4.entity;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum StatusCheckList implements EnumClass<Integer> {

    CORRESPOND(10),
    NOTCORRESPOND(20),
    NOTFILLED(30);

    private final Integer id;

    StatusCheckList(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static StatusCheckList fromId(Integer id) {
        for (StatusCheckList at : StatusCheckList.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}