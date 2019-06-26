package formJavaFx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import personTable.PersonTableVievColumn;

import java.net.URL;
import java.util.ResourceBundle;

@Component
public class ControllerFx implements Initializable {
    @FXML
    private TableView tableView1;

    @FXML
    private ListView table1;

    @FXML
    private Label label1;
    private ObservableList<PersonTableVievColumn> tbl;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        PersonTableVievColumn personTableVievColumn =new PersonTableVievColumn();
        personTableVievColumn.setColum1("A");
        personTableVievColumn.setColum2("G");
        personTableVievColumn.setColum3("D");
        ObservableList<String> observableList= FXCollections.observableArrayList();
        observableList.addAll("A","B");
        table1.setItems(observableList);
        observableList.addAll("K","L");

       tbl= FXCollections.observableArrayList();
        tbl.add(personTableVievColumn);
        tableView1.setItems(tbl);
        TableColumn<PersonTableVievColumn,String> tableColumn=null;
        tableColumn.getCellValueFactory(PropertyValueFactory<PersonTableVievColumn,String>("C1"));
        tableView1.getColumns().addAll(tableColumn);
     //   TableColumn<PersonTableVievColumn,String> tableColumn = new TableColumn<>();
     //   PropertyValueFactory<PersonTableVievColumn,String> prg = new PropertyValueFactory<>("colum1");
     //   tableColumn.setCellFactory(new PropertyValueFactory<PersonTableVievColumn,String>("colum1"));
      //  tableView1.getColumns().add(prg);
      //  TableView1.getColumns().



    }


}
