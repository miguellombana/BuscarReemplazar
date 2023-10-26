package dad;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarReemplazar extends Application {

	@Override

	public void start(Stage primaryStage) throws Exception {

		GridPane root = new GridPane();
		root.setHgap(5);
		root.setVgap(5);

		HBox Hbox1 = new HBox();
		VBox Vbox1 = new VBox();
		VBox Vbox2 = new VBox();
		VBox Vbox3 = new VBox();
		Button Button1 = new Button("Buscar");
		Button Button2 = new Button("Reemplazar");
		Button Button3 = new Button("Remplazar todo");
		Button Button4 = new Button("Cerrar");
		Button Button5 = new Button("Ayuda");
		CheckBox c1 = new CheckBox("Mayusculas y minusculas");
		CheckBox c2 = new CheckBox("Buscar hacia atras");
		CheckBox c3 = new CheckBox("Expresion regular");
		CheckBox c4 = new CheckBox("Resaltar resultados");
		TextField Text1 = new TextField();
		TextField Text2 = new TextField();
		Label l1 = new Label("Buscar: ");
		Label l2 = new Label("Remplazar con: ");

		Vbox1.getChildren().addAll(Button1, Button2, Button3, Button4, Button5);
		Vbox1.setSpacing(5);

		ColumnConstraints colConstraints = new ColumnConstraints();
		colConstraints.setHgrow(Priority.ALWAYS);
		root.getColumnConstraints().addAll(new ColumnConstraints(), new ColumnConstraints(), colConstraints);

		Button1.setMaxWidth(Double.MAX_VALUE);
		Button2.setMaxWidth(Double.MAX_VALUE);
		Button3.setMaxWidth(Double.MAX_VALUE);
		Button4.setMaxWidth(Double.MAX_VALUE);
		Button5.setMaxWidth(Double.MAX_VALUE);

		Vbox2.getChildren().addAll(c1, c2);
		Vbox2.setSpacing(5);
		Vbox3.getChildren().addAll(c3, c4);
		Vbox3.setSpacing(5);
		Hbox1.getChildren().addAll(Vbox2, Vbox3);
		Hbox1.setSpacing(5);

		GridPane.setRowIndex(l1, 0);
		GridPane.setColumnIndex(l1, 0);
		GridPane.setRowSpan(Vbox1, 6);
		GridPane.setColumnSpan(Text1, 2);
		GridPane.setColumnSpan(Text2, 2);
		GridPane.setColumnSpan(Hbox1, 2);
		GridPane.setRowSpan(Hbox1, 2);

		root.getChildren().add(l1);
		root.add(Text1, 1, 0);
		root.add(l2, 0, 1);
		root.add(Text2, 1, 1);
		root.add(Vbox1, 3, 0);
		root.add(Hbox1, 1, 3);

		Scene scene = new Scene(root, 500, 500);

		primaryStage.setScene(scene);
		primaryStage.setTitle("Buscar y Reemplazar");
		primaryStage.setMinHeight(200);
		primaryStage.setMinWidth(400);
		primaryStage.show();

	}

}
