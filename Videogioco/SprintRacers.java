package it.edu.iisgubbio.Videogioco;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SprintRacers extends Application{

	@Override
	public void start(Stage finestra) {
		
		GridPane griglia= new GridPane();
		
		griglia.setHgap(40);
		griglia.setVgap(40);
		
		griglia.setId("sfondoSP");
		
		griglia.setPadding(new Insets(10, 10, 10 ,10));
		Scene scene = new Scene(griglia, 945, 482);
		
		scene.getStylesheets().add("it/edu/iisgubbio/Videogioco/SprintRacer.css");
		
		finestra.setScene(scene);
		finestra.setTitle("SPRINT RACER");
		finestra.show();
		
		Label lTitolo= new Label("SPRINT RACERS");
		
		lTitolo.setId("Titolo");
		
		Button pSingolo= new Button("1 GIOCATORE");
		Button pDoppio= new Button("2 GIOCATORI");
		Button pComandi= new Button("COMANDI");
		
		pSingolo.setMinSize(175, 60);
		pDoppio.setMinSize(175, 60);
		pComandi.setMinSize(175, 60);
		
		pSingolo.setId("PulsantiSP");
		pDoppio.setId("PulsantiSP");
		pComandi.setId("PulsantiSP");
		
		griglia.add(lTitolo, 0, 0);
		griglia.add(pSingolo, 0, 1);
		griglia.add(pDoppio, 0, 2);
		griglia.add(pComandi, 0, 3);
		
		pComandi.setOnAction(e -> Comandi());
		
	}
	
	private void Comandi() {
		
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
