package com.company.jmix4.view.audit;

import com.company.jmix4.entity.*;

import com.company.jmix4.service.AuditService;
import com.company.jmix4.view.main.MainView;

import com.company.jmix4.view.template.TemplateListView;
import com.company.jmix4.view.template.TemplateListViewSelect;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.InputEvent;
import com.vaadin.flow.router.Route;
import io.jmix.appsettings.AppSettings;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.model.InstanceContainer;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Collections;

@Route(value = "audits/:id", layout = MainView.class)
@ViewController("Audit_.detail")
@ViewDescriptor("audit-detail-view.xml")
@EditedEntityContainer("auditDc")

public class AuditDetailView extends StandardDetailView<Audit> {
    @Autowired
    private AppSettings appSettings;

    @Subscribe
    public void onInitEntity(final InitEntityEvent<Audit> event) {
        CustomerSettings customerSettings = appSettings.load(CustomerSettings.class);
        Integer countDays = customerSettings.getCountDays();

        Audit audit = event.getEntity();
        LocalDate dateAfterSettings = auditService.checkAuditMaxMinDateWithSettings(countDays, audit.getDateEnd());
        audit.setDateEnd(dateAfterSettings);
        
    }
    @Subscribe
    public void onBeforeSave(final BeforeSaveEvent event) {
        StatusAudit statusAudit =   auditService.checkAuditStatus(getEditedEntity().getCheckLists());
        getEditedEntity().setStatusAudit(statusAudit);
    }

    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private AuditService auditService;

    @Subscribe("checkListsDataGrid.add")
    public void onDepartmentsTableSayHello(final ActionPerformedEvent event) {
        // dialogWindows.view(this, TemplateListViewSelect.class).open();
        dialogWindows.lookup(this, Template.class)
                .withSelectHandler(templates -> {
                    List<CheckList> checkLists = auditService.convertTemplatesToChecklists(getEditedEntity(), templates);
                    getEditedEntity().setCheckLists(checkLists);
                })
                .open();
    }

    public void onAfterClose(final AfterCloseEvent event) {

    }
    @Subscribe("checkListsDataGrid.addCheckSide")
    private void addCheckSide(final ActionPerformedEvent event) {
        dialogWindows.lookup(this, CheckSides.class)
                .withSelectHandler(checkSide -> {
                    String checkSideString = auditService.convertCheckSideToAuditCheckSide(checkSide);
                    getEditedEntity().setCheckSide(checkSideString);
                })
                .open();
    }

//@Subscribe("checkSidesField.entityLookup2")
//    private void openLookupView(final ActionPerformedEvent event) {
//        dialogWindows.lookup(this, CheckSides.class)
//                .withSelectHandler(checkSide -> {
//                    String checkSideString = auditService.convertCheckSideToAuditCheckSide(checkSide);
//                    getEditedEntity().setCheckSide(checkSideString);
//                })
//                .open();
//    }
//

//    @Subscribe(id = "auditDc", target = Target.DATA_CONTAINER)
//    private void openLookupView(InstanceContainer.ItemPropertyChangeEvent<Audit> event) {
//        dialogWindows.lookup(this, CheckSides.class)
//                .withSelectHandler(checkSide -> {
//                    String checkSideString = auditService.convertCheckSideToAuditCheckSide(checkSide);
//                    getEditedEntity().setCheckSide(checkSideString);
//                })
//                .open();
//    }


}




