package com.company.jmix4.entity;

import io.jmix.appsettings.defaults.AppSettingsDefault;
import io.jmix.appsettings.entity.AppSettingsEntity;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@JmixEntity
@Table(name = "CUSTOMER_SETTINGS")
@Entity
public class CustomerSettings extends AppSettingsEntity {
    @Column(name = "NOTIFICATION_TEXT")
    private String notificationText;

    @AppSettingsDefault("B")
    @Column(name = "DEFAULT_GRADE")
    private String defaultGrade;

    @AppSettingsDefault("1000")
    @Column(name = "SALES_THRESHOLD", precision = 19, scale = 2)
    private BigDecimal salesThreshold;

    //сколько дней от текущей даты при создании аудита
    @AppSettingsDefault("5")
    @Column(name = "MAX_countDays")
    private Integer countDays;

    public String getNotificationText() {
        return notificationText;
    }

    public String getDefaultGrade() {
        return defaultGrade;
    }

    public BigDecimal getSalesThreshold() {
        return salesThreshold;
    }

    public Integer getCountDays() {
        return countDays;
    }
}