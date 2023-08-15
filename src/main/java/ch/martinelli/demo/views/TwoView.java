package ch.martinelli.demo.views;

import com.vaadin.flow.component.confirmdialog.ConfirmDialog;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.BeforeLeaveEvent;
import com.vaadin.flow.router.BeforeLeaveObserver;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Two")
@Route(value = "two", layout = MainLayout.class)
public class TwoView extends VerticalLayout implements BeforeLeaveObserver {

    public TwoView() {
        add(new H1("Two"));
    }


    @Override
    public void beforeLeave(BeforeLeaveEvent beforeLeaveEvent) {
        BeforeLeaveEvent.ContinueNavigationAction postpone = beforeLeaveEvent.postpone();

        new ConfirmDialog("Leave?", "Do you really want to leave?", "Yes", confirmEvent -> postpone.proceed())
                .open();
    }
}
