package com.company.jmix4.view.pointtemplate;

import com.company.jmix4.entity.PointTemplate;

import com.company.jmix4.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "pointTemplates", layout = MainView.class)
@ViewController("PointTemplate.list")
@ViewDescriptor("point-template-list-view.xml")
@LookupComponent("pointTemplatesDataGrid")
@DialogMode(width = "64em")
public class PointTemplateListView extends StandardListView<PointTemplate> {
}