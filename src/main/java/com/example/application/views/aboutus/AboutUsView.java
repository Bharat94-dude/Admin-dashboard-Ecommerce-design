package com.example.application.views.aboutus;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.example.application.components.leafletmap.LeafletMap;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.example.application.views.MainLayout;

@PageTitle("About Us")
@Route(value = "empty", layout = MainLayout.class)
public class AboutUsView extends VerticalLayout {

    private LeafletMap map = new LeafletMap();

    public AboutUsView() {
        setSizeFull();
        setPadding(false);
        map.setSizeFull();
        map.setView(55.0, 10.0, 4);
        add(map);
    }
}
