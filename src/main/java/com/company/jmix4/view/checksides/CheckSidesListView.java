package com.company.jmix4.view.checksides;

import com.company.jmix4.entity.CheckSides;

import com.company.jmix4.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "checkSideses", layout = MainView.class)
@ViewController("CheckSides.list")
@ViewDescriptor("check-sides-list-view.xml")
@LookupComponent("checkSidesesDataGrid")
@DialogMode(width = "64em")
public class CheckSidesListView extends StandardListView<CheckSides> {
}