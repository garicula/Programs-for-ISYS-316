module com.example.morleygarrickassignment3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.morleygarrickassignment3 to javafx.fxml;
    exports com.example.morleygarrickassignment3;
}