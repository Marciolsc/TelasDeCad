module com.faculdade.alunocad {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.faculdade.professorcad to javafx.fxml;
    exports com.faculdade.professorcad;
}
