package edu.cmu.dronesim2d.util;

import javafx.scene.Parent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import edu.cmu.dronesim2d.view.CellView;
import edu.cmu.dronesim2d.view.SelectableView;


public class SelectHelper extends Rectangle {
public static Color DEFAULT_COLOR = Color.BLUE;

    public SelectHelper(Color color) {
        super(30,30);

        setFill(Color.TRANSPARENT);
        setStrokeWidth(3);
        setStroke(color);
    }

}
