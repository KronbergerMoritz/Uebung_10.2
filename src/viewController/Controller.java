package viewController;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import model.CarDatabase;
import model.Vehicle;

import java.util.HashMap;
import java.util.LinkedList;

public class Controller{

    @FXML
    private TextField textfield;

    @FXML
    private Button btn_search;

    @FXML
    private Button btn_searchexact;

    @FXML
    private ListView listView;

    private CarDatabase cdb = new CarDatabase();

    @FXML
    void searchPattern(MouseEvent event)
    {
        LinkedList<Vehicle> vehicles = cdb.search(textfield.getText(), false);

        listView.setItems(FXCollections.observableArrayList(vehicles));
    }

    @FXML
    void searchExactPattern(MouseEvent event)
    {
        LinkedList<Vehicle> vehicles = cdb.search(textfield.getText(), true);
        LinkedList<String> linkedList = new LinkedList<String>();

        if(vehicles != null) {
            linkedList.add(vehicles.getFirst().toString());
        }

        listView.setItems(FXCollections.observableArrayList(linkedList));
    }

}
