package com.qincloud.test;

import javafx.scene.Node;
import javafx.scene.control.TitledPane;
import javafx.scene.shape.Ellipse;

public class ShapeAll {

	public static Ellipse getEllipse()
	{
		return new Ellipse(30, 30, 30, 30);
	}
	
	public static TitledPane getTitled(String s,Node n)
	{
		return new TitledPane(s,n);
	}
}
