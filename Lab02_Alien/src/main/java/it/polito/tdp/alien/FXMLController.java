package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class FXMLController {
	
	AlienDictionary dict = new AlienDictionary();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtInserisci;

    @FXML
    private Button btnTranslate;

    @FXML
    private ImageView logo;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;

    @FXML
    void doClear(ActionEvent event) {

    	this.dict.cancella();
    	txtResult.clear();
    	txtInserisci.clear();
    }

    @FXML
    void doTranslate(ActionEvent event) {

    	String ins = txtInserisci.getText().toLowerCase();
    	String campi[] = ins.split(" ");
    	
    	
    	if(campi.length==1) {
    		txtResult.setText("La traduzione di: "+campi[0]+" è "+dict.translateWord(campi[0]));
    		txtInserisci.clear();
    	}else if(campi.length==2) {
    		dict.addWord(campi[0], campi[1]);
    		txtInserisci.clear();
    	}
    	else
    		txtResult.setText("inserire un max di due parole");
    }

    @FXML
    void initialize() {
        assert txtInserisci != null : "fx:id=\"txtInserisci\" was not injected: check your FXML file 'SceneLab02.fxml'.";
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'SceneLab02.fxml'.";
        assert logo != null : "fx:id=\"logo\" was not injected: check your FXML file 'SceneLab02.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'SceneLab02.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'SceneLab02.fxml'.";
        
    }
}
