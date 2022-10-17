package core;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.GridPane;

public class CustomListCell extends ListCell<Item> {
    private Button button;
    private Label label;
    private GridPane pane;
    
    public CustomListCell() {
        super();
        
        button = new Button("Play");
    }
    
    
}
