package edu.cmu.dronesim2d.view.hospital;

import javafx.scene.Group;
import javafx.scene.Node;

import edu.cmu.dronesim2d.model.entity.Hospital;
import edu.cmu.dronesim2d.view.SelectableView;

public abstract class HospitalView  extends Group implements SelectableView, Hospital.Listener {
    protected String uniqueID = null;
  /*  public static List<HospitalView> hospitalViewList = new ArrayList<>();
    public Object getHospital() {
        return null;
    }*/


    @Override
    public String getUniqueID() {
        return uniqueID;
    }

    public Node getNode() {
        return null;
    }
/*
    public static void cleanHospitalViewList() {}

    public static List<HospitalView> getHospitalViewList() {
        return hospitalViewList;
    }

    public static void removeHospitalViewFromList(HospitalView hospitalView) {

    }

    public static void addHospitalViewFromList(HospitalView hospitalView){

    }*/


    public abstract String getHospitalLabel();

    @Override
    public void removeStyleSelected() {

    }

    @Override
    public void applyStyleSelected() {

    }
}
