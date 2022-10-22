package core;

import javafx.scene.control.TableRow;

public class CustomTableRow extends TableRow<Item> {
    
    public CustomTableRow() {
        super();
        setOnMouseClicked(event -> {
            if (getItem() != null) {
                getItem().play();
            }
        });
    }
    
    @Override
    protected void updateItem(Item item, boolean isEmpty) {
        super.updateItem(item, isEmpty);
    }
    
}
