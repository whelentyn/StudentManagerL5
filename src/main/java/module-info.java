module com.valisteven.project_lab5 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.valisteven.loose.oose.fis.lab.student.manager to javafx.fxml;
    exports com.valisteven.loose.oose.fis.lab.student.manager;
}