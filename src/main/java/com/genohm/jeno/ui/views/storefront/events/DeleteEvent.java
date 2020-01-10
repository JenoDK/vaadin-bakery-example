package com.genohm.jeno.ui.views.storefront.events;

import com.vaadin.flow.component.ComponentEvent;
import com.genohm.jeno.ui.views.orderedit.OrderItemEditor;

public class DeleteEvent extends ComponentEvent<OrderItemEditor> {
	public DeleteEvent(OrderItemEditor component) {
		super(component, false);
	}
}