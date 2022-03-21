module com.valisteven.project_lab5 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.valisteven.project_lab5 to javafx.fxml;
    exports com.valisteven.project_lab5;
}