package com.company.jmix4.entity;

import io.jmix.appsettings.defaults.AppSettingsDefault;
import io.jmix.appsettings.entity.AppSettingsEntity;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.UUID;

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
}