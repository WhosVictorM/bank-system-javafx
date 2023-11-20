module com.whosvictorm.banksystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;



    opens com.whosvictorm.banksystem;
    opens com.whosvictorm.banksystem.Controllers;
}