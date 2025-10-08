module org.syscimc {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.syscimc to javafx.fxml;
    exports org.syscimc;
}