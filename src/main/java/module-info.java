module org.syscimc {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.syscimc to javafx.fxml;
    exports org.syscimc;
    exports org.syscimc.controler;
    opens org.syscimc.controler to javafx.fxml;
}