package ch.martinelli.demo.views;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.router.RouterLink;

@PageTitle("One")
@Route(value = "one", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class OneView extends VerticalLayout {

    public OneView() {
        add(new H1("One"));

        add(new RouterLink("Two", TwoView.class));
    }

}
