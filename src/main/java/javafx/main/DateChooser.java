package javafx.main;

import javafx.application.Application;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class DateChooser extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		String [] d31 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
				"21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
		
		String [] d30 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
				"21", "22", "23", "24", "25", "26", "27", "28", "29", "30"};
		
		String [] d30 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
				"21", "22", "23", "24", "25", "26", "27", "28", "29", "30"};
		
		ComboBox day = new ComboBox();
		day.setEditable(true);
		day.getItems().addAll("")
		ComboBox month = new ComboBox();
		month.setEditable(true);
		ComboBox year = new ComboBox();
		year.setEditable(true);
		
		HBox hbox = new HBox();
		hbox.getChildren().addAll(day, month, year);

	}

}
