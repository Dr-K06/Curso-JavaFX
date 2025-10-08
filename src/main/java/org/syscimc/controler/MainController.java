package org.syscimc.controler;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.syscimc.model.Pessoa;

import java.text.DecimalFormat;

public class MainController {
    /*@FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }*/
    @FXML
    public TextField txtnome;
    @FXML
    public TextField txtAltura;
    @FXML
    public TextField txtPeso;
    @FXML
    public Label lbimc;
    @FXML
    public Label lbclassificacao;

    Pessoa pessoa = new Pessoa();
    @FXML
    protected void onCalcularIMCClick() {
        DecimalFormat df = new DecimalFormat();
      this.pessoa.setNome(this.txtnome.getText());
      this.pessoa.setAltura(Float.parseFloat( this.txtPeso.getText()));
      this.pessoa.setPeso(Float.parseFloat( this.txtPeso.getText()));

        df.applyPattern("#0.00");
        this.lbimc.setText(df.format(this.pessoa.calcularimc()));
        this.lbclassificacao.setText(this.pessoa.classificaçãoIMC());



    }
}
