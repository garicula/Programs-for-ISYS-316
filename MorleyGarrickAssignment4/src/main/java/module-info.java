module com.example.morleygarrickassignment4 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.morleygarrickassignment4 to javafx.fxml;
    exports com.example.morleygarrickassignment4;
}