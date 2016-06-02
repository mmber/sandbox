package de.healthag;

import java.util.Collection;

import com.google.gwt.thirdparty.guava.common.collect.Lists;
import com.vaadin.data.Container;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

public class MyGridComponent
{

    private VerticalLayout layout;

    public MyGridComponent()
    {
        init();
    }

    public Component getComponent()
    {
        return layout;
    }

    private void init()
    {
        layout = new VerticalLayout();

        TextField name = new TextField();
        name.setCaption( "Type your name here:" );

        Button button = new Button( "Click Me" );
        button.addClickListener( e -> {
            layout.addComponent( new Label( "Thanks " + name.getValue() + ", it works!" ) );
        } );

        // layout.addComponents( name, button, getGrid() );
        layout.addComponents( getGrid() );
        // layout.setMargin( true );
        // layout.setSpacing( true );

        // setContent( layout );
    }

    private Grid getGrid()
    {

        Grid grid = new Grid( getIndexedContainer() );

        grid.setCaption( "Standard-Grid" );
        return grid;
    }

    private Container.Indexed getIndexedContainer()
    {
        // Have some data
        Collection<Person> people =
            Lists.newArrayList( new Person( "Nicolaus Copernicus", 1543L ), new Person( "Galileo Galilei", 1564L ),
                                new Person( "Johannes Kepler", 1571L ) );
        for ( int i = 0; i < 100; i++ )
        {
            // people.add( new Person( "Name " + i, new Long( i ) ) );
        }

        // Have a container of some type to contain the data
        BeanItemContainer<Person> container = new BeanItemContainer<>( Person.class, people );

        return container;

    }
}
