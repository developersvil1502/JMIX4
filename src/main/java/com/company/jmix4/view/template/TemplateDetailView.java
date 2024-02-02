package com.company.jmix4.view.template;

import com.company.jmix4.entity.Template;

import com.company.jmix4.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "templates/:id", layout = MainView.class)
@ViewController("Template.detail")
@ViewDescriptor("template-detail-view.xml")
@EditedEntityContainer("templateDc")
public class TemplateDetailView extends StandardDetailView<Template> {
}