/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantmanagementsy;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import static restaurantmanagementsy.data.username;

/**
 *
 * @author LENOVO
 */
public class dashboardController implements Initializable{
    
    @FXML
    private AnchorPane main_form;
    
     @FXML
    private Button availableFD_addBtn;

    @FXML
    private Button availableFD_clearBtn;

    @FXML
    private TableColumn<?, ?> availableFD_col_productID;

    @FXML
    private TableColumn<?, ?> availableFD_col_productName;

    @FXML
    private TableColumn<?, ?> availableFD_col_productPrice;

    @FXML
    private TableColumn<?, ?> availableFD_col_productStatus;

    @FXML
    private TableColumn<?, ?> availableFD_col_productType;

    @FXML
    private Button availableFD_deleteBtn;

    @FXML
    private AnchorPane availableFD_form;

    @FXML
    private TextField availableFD_productID;

    @FXML
    private TextField availableFD_productName;

    @FXML
    private TextField availableFD_productPrice;

    @FXML
    private ComboBox<?> availableFD_productStatus;

    @FXML
    private ComboBox<?> availableFD_productType;

    @FXML
    private TextField availableFD_search;

    @FXML
    private Button availableFD_updateBtn;

    @FXML
    private Button avialableFD_btn;

    @FXML
    private Button close;

    @FXML
    private BarChart<?, ?> dashboard_ICChart;

    @FXML
    private Label dashboard_NC;

    @FXML
    private BarChart<?, ?> dashboard_NOCChart;

    @FXML
    private Label dashboard_TI;

    @FXML
    private Label dashboard_Tincome;

    @FXML
    private Button dashboard_btn;

    @FXML
    private AnchorPane dashboard_form;

    @FXML
    private Button logout;

    @FXML
    private FontAwesomeIcon minimize;

    @FXML
    private Button order_add;

    @FXML
    private TextField order_amount;

    @FXML
    private Button order_btn;

    @FXML
    private TableColumn<?, ?> order_col_productID;

    @FXML
    private TableColumn<?, ?> order_col_productPrice;

    @FXML
    private TableColumn<?, ?> order_col_productQuantity;

    @FXML
    private TableColumn<?, ?> order_col_productType;

    @FXML
    private TableColumn<?, ?> order_col_produtName;

    @FXML
    private AnchorPane order_form;

    @FXML
    private Button order_paybtn;

    @FXML
    private ComboBox<?> order_productID;

    @FXML
    private ComboBox<?> order_productName;

    @FXML
    private Spinner<?> order_quantity;

    @FXML
    private Button order_recieptbtn;

    @FXML
    private Button order_removebtn;

    @FXML
    private TableView<?> order_tableview;

    @FXML
    private Label order_total;

    @FXML
    private Label username;
    private double x=0 ;
    private double y=0 ;
    
    public void logout(){
        try{
           Alert alert = new Alert(AlertType.CONFIRMATION);
           alert.setHeaderText(null);
           alert.setTitle("Confirmation Message");
           alert.setHeaderText(null);
           alert.setContentText("Are you sure you want to logout?");
           Optional<ButtonType> option = alert.showAndWait();
           
           if(option.equals(ButtonType.OK )){
               
               logout.getScene().getWindow().hide();
               //link of the login form
               
               
               
               Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
               Stage stage = new Stage();
               Scene scene = new Scene(root);
               
               
               stage.initStyle(StageStyle.TRANSPARENT);
               
               
               root.setOnMousePressed((MouseEvent event) -> {
                   x = event.getSceneX();
                   y = event.getSceneY();

               });
               root.setOnMouseDragged((MouseEvent event) -> {
                   stage.setX(event.getScreenX() - x);
                   stage.setY(event.getSceneY() - y);
                   stage.setOpacity(.8f);

               });
               root.setOnMouseReleased((MouseEvent event) -> {
                   stage.setOpacity(1);
        });
               
               stage.initStyle(StageStyle.TRANSPARENT);
               
               stage.setScene(scene);
               stage.show();
               
           }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    public void displayUsername(){
        String user =data.username;
        user = user.substring(0,1).toUpperCase() + user.substring(1);
        
       username.setText(user);
        
    }
    
    public void close(){
        System.exit(0);
    }
    public void minimize(){
        
        Stage stage= (Stage)main_form.getScene().getWindow();
        stage.setIconified(true);
   
    }
    

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        displayUsername();
        
        
    }
    

    
}
