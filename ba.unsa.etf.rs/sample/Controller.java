package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Integer.parseInt;

public class Controller {
    public Label brojevi;
    public TextField unosPolje;

    public int sumaCifara(int broj){
        int sum = 0;
        while (broj >= 1) {
            int x = broj % 10;
            sum = sum + x;
            broj = broj / 10;
        }
        return sum;
    }

    public void ispisiBrojeve(ActionEvent actionEvent) {

        brojevi.setText("|| ");
        int unos = parseInt(unosPolje.getText());
        int i = 1;
        while (i < unos) {

            if (i % sumaCifara(i) == 0) {
                brojevi.setText(brojevi.getText() + i + " || ");
            }
            i++;
        }
    }
}