package com.company.jmix4.service;

import com.company.jmix4.entity.*;
import io.jmix.core.DataManager;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;

@Service
public class AuditService {

    private final DataManager dataManager;

    public AuditService(DataManager dataManager) {
        this.dataManager = dataManager;
    }

    public List<CheckList> convertTemplatesToChecklists(Audit audit, Collection<Template> templates) {

        List<CheckList> checklists = new ArrayList<>();
        for (Template template : templates) {
            CheckList checkList = dataManager.create(CheckList.class);
            checkList.setName(template.getName());
            checkList.setDescription(template.getDescription());
            checkList.setAudit(audit);
            checklists.add(checkList);
        }
        return checklists;
    }


    public String convertCheckSideToAuditCheckSide(Collection<CheckSides> checkSides) {
        return checkSides.stream().findFirst().get().getName();
    }

    public StatusAudit checkAuditStatus(List<CheckList> checkLists) {
        boolean allNotCorrespond = true;
        boolean anyCorrespond = false;
        boolean allCorrespond = true;

        for (CheckList checkList : checkLists) {
            List<PointCheckList> pointCheckLists = checkList.getPointCheckLists();
            if (pointCheckLists != null) {
                for (PointCheckList pointCheckList : pointCheckLists) {
                    StatusCheckList status = pointCheckList.getStatusCheckList();
                    if (status == StatusCheckList.CORRESPOND) {
                        anyCorrespond = true;
                    } else if (status != StatusCheckList.NOTCORRESPOND) {
                        allNotCorrespond = false;
                    }
                    if (status != StatusCheckList.CORRESPOND) {
                        allCorrespond = false;
                    }
                }
            }
        }
        if (allNotCorrespond) {
            return StatusAudit.PLANNED;
        } else if (anyCorrespond) {
            return StatusAudit.WORK;
        } else if (allCorrespond) {
            return StatusAudit.END;
        } else {
            return StatusAudit.PLANNED;
        }
    }

    public LocalDate checkAuditMaxMinDateWithSettings(Integer countDays, LocalDate dateEnd) {
        LocalDate localDate = dateEnd;
        LocalDate currentDate = LocalDate.now();
        LocalDate maxDate = currentDate.plusDays(countDays);
        LocalDate minDate = currentDate.minusDays(countDays);

        if (dateEnd.isAfter(minDate) && dateEnd.isBefore(maxDate)) {
            localDate = dateEnd;
        } else if (dateEnd.isBefore(minDate)) {
            localDate = minDate;
        } else if (dateEnd.isAfter(maxDate)) {
            localDate = maxDate;
        }
        return localDate;
    }
}
