package com.company.jmix4.view.pointchecklist;

import com.company.jmix4.entity.PointCheckList;

import com.company.jmix4.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "pointCheckLists/:id", layout = MainView.class)
@ViewController("PointCheckList.detail")
@ViewDescriptor("point-check-list-detail-view.xml")
@EditedEntityContainer("pointCheckListDc")
public class PointCheckListDetailView extends StandardDetailView<PointCheckList> {
}