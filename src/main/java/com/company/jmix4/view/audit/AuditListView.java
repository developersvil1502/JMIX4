package com.company.jmix4.view.audit;

import com.company.jmix4.entity.Audit;

import com.company.jmix4.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "audits", layout = MainView.class)
@ViewController("Audit_.list")
@ViewDescriptor("audit-list-view.xml")
@LookupComponent("auditsDataGrid")
@DialogMode(width = "64em")
public class AuditListView extends StandardListView<Audit> {
}