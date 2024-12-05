module org.example.sentimentprojectv3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.sentimentprojectv3 to javafx.fxml;
    exports org.example.sentimentprojectv3;
}