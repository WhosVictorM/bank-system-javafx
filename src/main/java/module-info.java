module com.whosvictorm.banksystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.whosvictorm.banksystem to javafx.fxml;
    exports com.whosvictorm.banksystem;
}