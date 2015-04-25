package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    private final String mask = "###-???-UU.LL-HHH-***";
    private final SpecialTextField mSpecialTextField = new SpecialTextField(mask);
    @FXML
    private Label mLabel;
    @FXML
    private AnchorPane mAnchorPane;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        mLabel.setText(mask);
        AnchorPane.setBottomAnchor(mSpecialTextField, 15d);
        AnchorPane.setLeftAnchor(mSpecialTextField, 40d);
        AnchorPane.setRightAnchor(mSpecialTextField, 40d);
        mSpecialTextField.alignmentProperty().setValue(Pos.CENTER);
        mAnchorPane.getChildren().addAll(mSpecialTextField);
    }
}
