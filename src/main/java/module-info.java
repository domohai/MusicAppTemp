module com.example.musicapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires javafx.graphics;
    
    
    opens com.example.musicapp to javafx.fxml;
    exports com.example.musicapp;
    exports core;
    opens core to javafx.fxml;
}