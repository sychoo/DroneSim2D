package edu.cmu.dronesim2d.controller;

import javafx.scene.input.KeyEvent;


import edu.cmu.dronesim2d.model.Cell;
import edu.cmu.dronesim2d.model.entity.Hospital;
import edu.cmu.dronesim2d.model.entity.drone.Drone;

import edu.cmu.dronesim2d.view.CellView;
import edu.cmu.dronesim2d.view.SelectableView;
import edu.cmu.dronesim2d.view.antenna.AntennaView;
import edu.cmu.dronesim2d.view.drone.DroneView;


import java.util.HashMap;
import java.util.Map;

public abstract class DroneController {
    protected static DroneController instance;

    protected static Map<String, DroneView> droneViewMap = new HashMap<>();
    protected static Map<String, Drone>  droneMap = new HashMap<>();

    public static DroneController getInstance(){
        return instance;
    }

    public static void init(String nameClass){

        if(instance == null || !instance.getClass().getSimpleName().equals(nameClass)){
            if(nameClass.equals(DroneKeyBoardController.class.getSimpleName())){
                instance = DroneKeyBoardController.getInstance();

            }

            if(nameClass.equals(DroneAutomaticController.class.getSimpleName())){
                instance = DroneAutomaticController.getInstance();
            }
        }

    }

    public static void consumeCleanEnvironment() {
        droneMap.clear();
        droneViewMap.clear();
        Drone.restartCount();
    }


    /*  abstract public void notifyChangeInModel();*/

    abstract public void consumeRunEnviroment();

    abstract public void consumeBadConnection(SelectableView selectableView);


    abstract void notifyStopEnviroment();

    public abstract void consumeNormalConnection(SelectableView selectableView);

    abstract public void consumeStrongWind();

    abstract public void consumeNormalWind();

    abstract public void consumeReset();

    abstract public void startUpdateBatteryPerSeconds();


    public abstract Drone createDrone(String uniqueID, String droneLabel,CellView currentCellView);

    public void deleteDrone(Drone drone){
        droneMap.remove(drone.getUniqueID());
        DroneView droneView = droneViewMap.remove(drone.getUniqueID());
        droneView.getCurrentCellView().getChildren().remove(droneView);
    }

    public Map<String, DroneView> getDroneViewMap() {
        return droneViewMap;
    }

    public void setDroneViewMap(Map<String, DroneView> droneViewMap) {
        this.droneViewMap = droneViewMap;
    }

    public Map<String, Drone> getDroneMap() {
        return droneMap;
    }

    public void setDroneMap(Map<String, Drone> droneMap) {
        this.droneMap = droneMap;
    }

    public abstract DroneView getDroneViewFrom(String identifierDrone);
    public abstract Drone getDroneFrom(String identifierDrone);



    public void consumeClickEvent(SelectableView selectedEntityView) {
        if(selectedEntityView instanceof DroneView){
            Drone drone =  getDroneFrom(selectedEntityView.getUniqueID());
            drone.setSelected(true);
        }
    }
    public abstract void consumeOnKeyPressed(SelectableView selectedEntityView, KeyEvent keyEvent);

    public  void cleanSelections(){
        for(Drone drone : droneMap.values()){
            drone.setSelected(false);
        }
    }


    public void consumeSaveAttributesDrone(DroneView droneView) {

    }
}
