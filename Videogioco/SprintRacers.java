package it.edu.iisgubbio.Videogioco;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SprintRacers extends Application{

	
	
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
	
	public class SecondaFinestra extends Stage {
		
		public SecondaFinestra() {
			
			GridPane griglia= new GridPane();
			
			griglia.setVgap(10);
			griglia.setHgap(10);
			
			Scene scene= new Scene(griglia ,610,350);
			setTitle("SecondaFinestra");
			setScene(scene);
			
			Image ComWASD = new Image(getClass().getResourceAsStream("ComWASD.png"));
			Image ComFreccie = new Image(getClass().getResourceAsStream("ComFreccie.png"));
			
			ImageView iWASD= new ImageView(ComWASD);
			ImageView iFreccie= new ImageView(ComFreccie);
			
			Label lGiocatore1= new Label("Comandi Giocatore 1:");
			Label lGiocatore2= new Label("Comandi Giocatore 2:");
			
			griglia.add(lGiocatore1, 0, 0);
			griglia.add(lGiocatore2, 1, 0);
			griglia.add(iWASD, 0, 1);
			griglia.add(iFreccie, 1, 1);
			
		}
	}
	private void Comandi() {
		
		SecondaFinestra finestra= new SecondaFinestra();
		
		finestra.showAndWait();
			
	}
		
	
	public static void main(String[] args) {
		launch(args);
	}
}