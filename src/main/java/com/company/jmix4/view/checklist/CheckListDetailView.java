package com.company.jmix4.view.checklist;

import com.company.jmix4.entity.CheckList;

import com.company.jmix4.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "checkLists/:id", layout = MainView.class)
@ViewController("CheckList.detail")
@ViewDescriptor("check-list-detail-view.xml")
@EditedEntityContainer("checkListDc")
public class CheckListDetailView extends StandardDetailView<CheckList> {
}