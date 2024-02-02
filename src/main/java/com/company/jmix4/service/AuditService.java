package com.company.jmix4.service;

import com.company.jmix4.entity.Audit;
import com.company.jmix4.entity.CheckList;
import com.company.jmix4.entity.Template;
import io.jmix.core.DataManager;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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


}
