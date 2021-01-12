package viewController;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import model.Vehicle;

public class Controller extends Vehicle {

    @FXML
    private Button btn_search;

    @FXML
    private TextField tfield;

    @FXML
    private Button btn_searchexectly;

  //  @FXML
   // private ListView<?> listview;

    @FXML
    private TextArea tarea;



    @FXML
    void search(MouseEvent event) {

        String t = tfield.getText();

        if(t.contains("w"))
        {
  //          listview.setItems(null);
        }

    }

    @FXML
    void searchExactly(MouseEvent event)
    {


        String tf = tfield.getText();
        //
        if(tf.equals("BMW")) {
            tarea.setText("BMW \n" + toString());
        }
        else if(tf.equals("250 Isetta"))
        {
            tarea.setText("250 Isetta \n"+toString());
        }
        else if(tf.equals("300 Isetta"))
        {
            tarea.setText("300 Isetta \n"+toString());
        }
        else if(tf.equals("BMW 600"))
        {
            tarea.setText("BMW 600 \n"+toString());
        }
        else if(tf.equals("BMW 700"))
        {
            tarea.setText("BMW 700 \n"+toString());
        }
        else if(tf.equals("BMW i3"))
        {
            tarea.setText("BMW i3 \n"+toString());
        }
        else if(tf.equals("BMW 600"))
        {
            tarea.setText("BMW 600 \n"+toString());
        }
        else if(tf.equals("BMW 1-Series"))
        {
            tarea.setText("BMW 1-Series \n"+toString());
        }
        else if(tf.equals("BMW 2-Series"))
        {
            tarea.setText("BMW 2-Series \n"+toString());
        }
        else if(tf.equals("BMW 2-Series Gran Coupé"))
        {
            tarea.setText("BMW 2-Series Gran Coupé \n"+toString());
        }
        else if(tf.equals("BMW New Class 1602"))
        {
            tarea.setText("BMW New Class 1602\n"+toString());
        }
        else if(tf.equals("BMW New Class 1802"))
        {
            tarea.setText("BMW New Class 1802\n"+toString());
        }
        else if(tf.equals("BMW New Class 2002"))
        {
            tarea.setText("BMW New Class 2002\n"+toString());
        }
        else if(tf.equals("BMW New Class 1602"))
        {
            tarea.setText("BMW New Class 1602\n"+toString());
        }
        else if(tf.equals("BMW 3-Series "))
        {
            tarea.setText("BMW 3-Series  \n"+toString());
        }
        else if(tf.equals("BMW 3-Series M3"))
        {
            tarea.setText("BMW 3-Series M3\n"+toString());
        }
        else if(tf.equals("BMW 4-Series M4"))
        {
            tarea.setText("BMW 4-Series M4\n"+toString());
        }
        else if(tf.equals("BMW 4-Series "))
        {
            tarea.setText("BMW 4-Series \n"+toString());
        }
        else if(tf.equals("BMW 3-Series GT"))
        {
            tarea.setText("BMW 3-Series GT\n"+toString());
        }
        else if(tf.equals("BMW New Class 1500"))
        {
            tarea.setText("BMW New Class 1500\n"+toString());
        }
        else if(tf.equals("BMW New Class 1600"))
        {
            tarea.setText("BMW New Class 1600\n"+toString());
        }
        else if(tf.equals("BMW New Class 1800"))
        {
            tarea.setText("BMW New Class 1800\n"+toString());
        }
    }

}
