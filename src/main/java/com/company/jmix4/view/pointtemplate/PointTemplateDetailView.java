package com.company.jmix4.view.pointtemplate;

import com.company.jmix4.entity.PointTemplate;

import com.company.jmix4.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "pointTemplates/:id", layout = MainView.class)
@ViewController("PointTemplate.detail")
@ViewDescriptor("point-template-detail-view.xml")
@EditedEntityContainer("pointTemplateDc")
public class PointTemplateDetailView extends StandardDetailView<PointTemplate> {
}