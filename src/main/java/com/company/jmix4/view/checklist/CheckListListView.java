package com.company.jmix4.view.checklist;

import com.company.jmix4.entity.CheckList;

import com.company.jmix4.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "checkLists", layout = MainView.class)
@ViewController("CheckList.list")
@ViewDescriptor("check-list-list-view.xml")
@LookupComponent("checkListsDataGrid")
@DialogMode(width = "64em")
public class CheckListListView extends StandardListView<CheckList> {
}