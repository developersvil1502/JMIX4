package com.company.jmix4.view.pointchecklist;

import com.company.jmix4.entity.PointCheckList;

import com.company.jmix4.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "pointCheckLists", layout = MainView.class)
@ViewController("PointCheckList.list")
@ViewDescriptor("point-check-list-list-view.xml")
@LookupComponent("pointCheckListsDataGrid")
@DialogMode(width = "64em")
public class PointCheckListListView extends StandardListView<PointCheckList> {
}