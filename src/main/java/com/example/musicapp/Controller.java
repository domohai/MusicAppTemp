package com.example.musicapp;

import core.CustomTableRow;
import core.Item;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private TableView<Item> table;
    @FXML
    private Label songName;
    @FXML
    private Button playButton;
    
    private ObservableList<Item> list = FXCollections.observableArrayList();
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        TableColumn<Item, Integer> idCol = new TableColumn<>("id");
        TableColumn<Item, String> nameCol = new TableColumn<>("#Title");
        nameCol.setCellValueFactory(new PropertyValueFactory<>("songName"));
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        table.getColumns().add(idCol);
        table.getColumns().add(nameCol);
        
        list.addAll(new Item(), new Item("the quarry", "src/main/resources/audios/The_Quarry.mp3"));
        table.setItems(list);
        
        table.setRowFactory(row -> new CustomTableRow());
    }
    
    @FXML
    public void playButton(ActionEvent event) {
        Item item = table.getSelectionModel().getSelectedItem();
        if (item != null) {
            if (item.isPlaying()) {
                item.stop();
            }
        }
    }
}