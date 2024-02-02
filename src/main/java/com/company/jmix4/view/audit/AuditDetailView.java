package com.company.jmix4.view.audit;

import com.company.jmix4.entity.Audit;

import com.company.jmix4.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "audits/:id", layout = MainView.class)
@ViewController("Audit_.detail")
@ViewDescriptor("audit-detail-view.xml")
@EditedEntityContainer("auditDc")
public class AuditDetailView extends StandardDetailView<Audit> {
}