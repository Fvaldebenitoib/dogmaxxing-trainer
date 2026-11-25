module cl.duoc.dogmaxxingtrainer {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens cl.duoc.dogmaxxingtrainer to javafx.fxml;
    exports cl.duoc.dogmaxxingtrainer;

    opens cl.duoc.dogmaxxingtrainer.controller to javafx.fxml;
    exports cl.duoc.dogmaxxingtrainer.controller;

}