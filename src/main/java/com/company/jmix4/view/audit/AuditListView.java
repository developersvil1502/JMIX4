package com.company.jmix4.view.audit;

import com.company.jmix4.entity.Audit;

import com.company.jmix4.entity.CheckList;
import com.company.jmix4.entity.Template;
import com.company.jmix4.view.main.MainView;

import com.company.jmix4.view.template.TemplateListView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "audits", layout = MainView.class)
@ViewController("Audit_.list")
@ViewDescriptor("audit-list-view.xml")
@LookupComponent("auditsDataGrid")
@DialogMode(width = "64em")
public class AuditListView extends StandardListView<Audit> {
//    @Autowired
//    private DialogWindows dialogWindows;
//
//    @Subscribe
//    public void onAfterClose(final AfterCloseEvent event) {
//
//    }
//    private void openView() {
//        dialogWindows.view(this, TemplateListView.class).open();
//    }
//
//    private void openLookupView() {
//        dialogWindows.lookup(this, TemplateListView.class)
//                .withSelectHandler(departments -> {
//                    // ...
//                })
//                .open();
//    }
//    @Autowired
//    private DialogWindows dialogWindows;
//
//    private void openDetailViewToCreateEntity() {
//        dialogWindows.detail(this, CheckList.class)
//                .withViewClass(Template.class)
//                .newEntity()
//                .withAfterCloseListener(afterCloseEvent -> {
//                    if (afterCloseEvent.closedWith(StandardOutcome.SAVE)) {
//                        Template template = afterCloseEvent.getView().getEditedEntity();
//                        // ...
//                    }
//                })
//                .open();
//    }
}