package com.cambeeler;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

    @FXML private Button Button1;

    public void initialize()
    {
        Button1.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public
            void handle(ActionEvent actionEvent)
            {
                System.out.println("This is what we want to execute when we push the button");
            }
        });
    }
}
