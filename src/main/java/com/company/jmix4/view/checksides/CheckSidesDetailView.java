package com.company.jmix4.view.checksides;

import com.company.jmix4.entity.CheckSides;

import com.company.jmix4.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "checkSideses/:id", layout = MainView.class)
@ViewController("CheckSides.detail")
@ViewDescriptor("check-sides-detail-view.xml")
@EditedEntityContainer("checkSidesDc")
public class CheckSidesDetailView extends StandardDetailView<CheckSides> {
}