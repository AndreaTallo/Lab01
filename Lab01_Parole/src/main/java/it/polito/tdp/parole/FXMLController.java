package it.polito.tdp.parole;

import it.polito.tdp.parole.model.Parole;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco ;
    @FXML
    private TextArea txtTime;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;
    @FXML
    private Button btnCancella;

    @FXML
    void doCancella(ActionEvent event) {
    	if(!elenco.getElenco().contains(txtParola.getText())) {
    		txtResult.setText(elenco.toString()+"Errore parola non presente nella lista");
    		return;
    	}
    	elenco.cancella(txtParola.getText());
    	txtResult.setText(elenco.toString());
    	double time=System.nanoTime();
        elenco.addTempo(time);
        txtTime.setText(elenco.stampaTempi());
    }

    @FXML
    void doInsert(ActionEvent event) {
    	
    	elenco.addParola(txtParola.getText());
    	String s=elenco.toString();
    	txtResult.setText(s);
    	double time=System.nanoTime();
        elenco.addTempo(time);
        txtTime.setText(elenco.stampaTempi());
        txtParola.setText("");
    	// TODO
    }

    @FXML
    void doReset(ActionEvent event) {
    	elenco.reset();
    	txtResult.setText(elenco.toString());
    	double time=System.nanoTime();
        elenco.addTempo(time);
        txtTime.setText(elenco.stampaTempi());
    	// TODO
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

        elenco = new Parole(null) ;
    }
}
