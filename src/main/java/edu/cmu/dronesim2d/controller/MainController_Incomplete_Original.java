// Simon Chu
// Tue 2021-08-17 16:30:35 EDT 
//
// main entry point for the project

package edu.cmu.dronesim2d.controller;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import edu.cmu.dronesim2d.view.CellView;
import edu.cmu.dronesim2d.view.SelectableView;
import edu.cmu.dronesim2d.view.antenna.AntennaView;
import edu.cmu.dronesim2d.view.boat.BoatView;
import edu.cmu.dronesim2d.view.drone.DroneView;
import edu.cmu.dronesim2d.view.hospital.HospitalView;
import edu.cmu.dronesim2d.view.house.HouseView;
import edu.cmu.dronesim2d.view.river.RiverView;

import java.util.ArrayList;
import java.util.List;

 
public class MainController_Incomplete_Original extends Application {

    @FXML
    private
    AnchorPane environmentAnchorPane;

    @FXML
    private
    AnchorPane settingsAnchorPane;

    @FXML
    AnchorPane loggerAnchorPane;

    @FXML
    private
    ToggleButton startToggleButton, restartToggleButton;

    @FXML
    private
    ToggleButton riverToggleButton, hospitalToggleButton, droneToggleButton, antennaToggleButton, boatToggleButton, houseToggleButton, treeToggleButton;

    @FXML
    AnchorPane defaultPanelSettingsAnchorPane;


    @FXML
    private
    TextArea loggerTextArea;

    @FXML
    private
    CheckBox automaticExecutionCheckBox/*, wrapperCheckBox*/;

    @FXML
    private
    Button deleteButton, cleanButton;

    @FXML
    private
    ComboBox windForceCombBox;


    private boolean running = false;
    private boolean droneToggleButtonIsSelected = false;

    private LoggerController loggerController;
    private EnvironmentController environmentController;
    private static MainController instance;
    private boolean canCreateElements = true;
    private MenuController menuControler;



    public static void main(String[] args) {
        launch(args);
    }
    
    
    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/layout.fxml"));
        loader.setController(this);
        AnchorPane rootAnchorPane = loader.load();
        primaryStage.setTitle("Dragonfly Simulator");

        menuControler = new MenuController(rootAnchorPane, primaryStage);

        Scene scene = new Scene(rootAnchorPane, 903, 705);

        primaryStage.setScene(scene);
        primaryStage.show();
    }



}
