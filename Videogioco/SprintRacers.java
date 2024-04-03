package it.edu.iisgubbio.Videogioco;

import java.util.*;

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
	
	int i=0;
	
	public void start(Stage finestra) {
		
		GridPane griglia= new GridPane();
		griglia.setHgap(40);
		griglia.setVgap(20);
		griglia.setId("sfondoSP");
		griglia.setPadding(new Insets(10, 10, 10 ,10));
		
		Scene scene = new Scene(griglia, 945, 482);
		scene.getStylesheets().add("it/edu/iisgubbio/Videogioco/SprintRacer.css");
		
		finestra.setScene(scene);
		finestra.setTitle("SPRINT RACER");
		finestra.show();
		
		Label lTitolo= new Label("SPRINT RACERS");
		lTitolo.setId("Titolo");
		
		Button pMacchina= new Button("MACCHINA");
		Button pTracciato= new Button("TRACCIATO");
		Button pGioca= new Button("GIOCA");
		Button pComandi= new Button("COMANDI");
		
		pMacchina.setMinSize(175, 60);
		pTracciato.setMinSize(175, 60);
		pComandi.setMinSize(175, 60);
		pGioca.setMinSize(175, 60);
		
		pMacchina.setId("PulsantiSP");
		pTracciato.setId("PulsantiSP");
		pComandi.setId("PulsantiSP");
		pGioca.setId("PulsantiSP");
		
		griglia.add(lTitolo, 0, 0);
		griglia.add(pGioca, 0, 1);
		griglia.add(pMacchina, 0, 2);
		griglia.add(pTracciato, 0, 3);
		griglia.add(pComandi, 0, 4);
		
		pMacchina.setOnAction(e -> Macchina());
		pComandi.setOnAction(e -> Comandi());
	}
	
	public class Macchina extends Stage {
		
		Hashtable <Integer,Image> SceltaMacchine =  new Hashtable <Integer,Image>();
		
		Image AlfaRomeo = new Image(getClass().getResourceAsStream("AlfaRomeo.png"));
		Image AlphaTauri = new Image(getClass().getResourceAsStream("AlphaTauri.png"));
		Image Alpine = new Image(getClass().getResourceAsStream("Alpine.png"));
		Image AstonMartin = new Image(getClass().getResourceAsStream("AstonMartin.png"));
		Image Ferrari = new Image(getClass().getResourceAsStream("Ferrari.png"));
		Image Haas = new Image(getClass().getResourceAsStream("Haas.png"));
		Image McLaren = new Image(getClass().getResourceAsStream("McLaren.png"));
		Image Mercedes = new Image(getClass().getResourceAsStream("Mercedes.png"));
		Image RB = new Image(getClass().getResourceAsStream("RB.png"));
		
		ImageView iAlfaRomeo= new ImageView(AlfaRomeo);
		
		public Macchina() {
			
			SceltaMacchine.put(0, AlfaRomeo);
			SceltaMacchine.put(1, AlphaTauri);
			SceltaMacchine.put(2, Alpine);
			SceltaMacchine.put(3, AstonMartin);
			SceltaMacchine.put(4, Ferrari);
			SceltaMacchine.put(5, Haas);
			SceltaMacchine.put(6, McLaren);
			SceltaMacchine.put(7, Mercedes);
			SceltaMacchine.put(8, RB);
			
			GridPane griglia= new GridPane();
			griglia.setVgap(10);
			griglia.setHgap(10);
			griglia.setId("GP");
			
			
			Scene scene= new Scene(griglia );
			setTitle("Macchina G1");
			setScene(scene);
			
			scene.getStylesheets().add("it/edu/iisgubbio/Videogioco/SprintRacer.css");
			
			Label lGiocatore1= new Label("Macchina G1");
			Label lGiocatore2= new Label("Macchina G2");
			
			Button pAvanti = new Button(">");
			Button pIndietro = new Button("<");
			
			griglia.add(pIndietro, 0, 1);
			griglia.add(lGiocatore1, 1, 0);
			griglia.add(iAlfaRomeo, 1, 1);
			griglia.add(pAvanti, 2, 1);
			
			pAvanti.setOnAction(e -> Avanti());
			pIndietro.setOnAction(e -> Indietro());
			
		}
		private void Avanti() {
			
			i++;
			
			if(i > 8) {
				i=0;
			}
			
			iAlfaRomeo.setImage(SceltaMacchine.get(i));
		}
		private void Indietro() {
			
			i--;
			
			if(i < 0) {
				i=8;
			}
			iAlfaRomeo.setImage(SceltaMacchine.get(i));
		}
	}
	
	public class Comandi extends Stage {
		
		public Comandi() {
			
			GridPane griglia= new GridPane();
			
			griglia.setId("comandi");
			
			griglia.setVgap(10);
			griglia.setHgap(10);
			
			Scene scene= new Scene(griglia ,610,350);
			setTitle("SecondaFinestra");
			setScene(scene);
			
			scene.getStylesheets().add("it/edu/iisgubbio/Videogioco/SprintRacer.css");
			
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
			
			griglia.setId("GP");
			
		}
	}
	
	private void Macchina() {
		
		Macchina finestra= new Macchina();
		finestra.showAndWait();
		
	}
	
	private void Comandi() {
		
		Comandi finestra= new Comandi();
		finestra.showAndWait();
			
	}	
	public static void main(String[] args) {
		launch(args);
	}
}