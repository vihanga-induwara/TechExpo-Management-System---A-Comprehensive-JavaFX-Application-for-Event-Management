module lk.rgu.techexpo {
    requires javafx.controls;
    requires javafx.fxml;


    opens lk.rgu.techexpo to javafx.fxml;
    exports lk.rgu.techexpo;
}