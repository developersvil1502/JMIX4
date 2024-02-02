package com.company.jmix4.view.template;

import com.company.jmix4.entity.Template;

import com.company.jmix4.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "templateSelect", layout = MainView.class)
@ViewController("Template.list.select")
@ViewDescriptor("template-list-view-select.xml")
@LookupComponent("templatesDataGrid")
@DialogMode(width = "64em")
public class TemplateListViewSelect extends StandardListView<Template> {
}