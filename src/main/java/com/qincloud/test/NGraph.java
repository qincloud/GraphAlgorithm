package com.qincloud.test;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.controlsfx.control.action.Action;
import org.controlsfx.dialog.Dialog;
import org.controlsfx.dialog.Dialogs;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;

public class NGraph extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	public void init(Stage stage) throws Exception {
		BorderPane bor = new BorderPane();
		Scene s = new Scene(bor, 1000, 800);
		s.getStylesheets().add("index.css");
		s.setFill(Color.TRANSPARENT);
		stage.setScene(s);
		HBox h = new HBox();
		final TextField t = new TextField();
		t.setPromptText("请输入老婆的个数");
		Button b = new Button("生成");
		h.getChildren().addAll(t, b);
		bor.setTop(h);
		final Accordion acc = new Accordion();
		ScrollPane scr = new ScrollPane();
		scr.getStyleClass().add("mylistview");
		acc.setMinWidth(950);
		acc.setMaxWidth(950);
		scr.setMinWidth(980);
		scr.setMaxWidth(980);
		scr.setContent(acc);
		bor.setCenter(scr);

		b.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent event) {
				acc.getPanes().clear();
				NHouGraph g = new NHouGraph();
				int c = 0;
				int num = Integer.parseInt(t.getText());
				if (num < 4) {
					Dialogs a = Dialogs.create().title("提示").lightweight().message("请输入大于等于4的数").owner(null);
					a.showInformation();
					return;
				}
				if (num > 10) {
					Dialogs a = Dialogs.create().title("提示").lightweight().message("请输入小于10的").owner(null);
					a.showInformation();
					return;
				}
				g.setN(num);
				g.Backtrack(1);
				int[][] grid = new int[21][21];
				for (List<Integer> list : g.getLists()) {
					VBox v = new VBox();
					for (int i = 0; i <= 20; i++) {
						for (int j = 0; j <= 20; j++) {
							grid[i][j] = 0;
						}
					}
					int count = 0;
					c++;

					for (Integer i : list) {
						count++;
						if (i == 0) {
							grid[count][i] = 0;
						} else {
							grid[count][i] = 1;
						}
					}
					for (int i = 1; i <= num; i++) {
						HBox ht = new HBox();
						for (int j = 1; j <= num; j++) {
							if (grid[i][j] != 0) {
								Ellipse e = ShapeAll.getEllipse();
								e.setFill(Color.MEDIUMTURQUOISE);
								ht.getChildren().add(e);
							} else {
								Ellipse e = ShapeAll.getEllipse();
								e.setFill(Color.GREEN);
								ht.getChildren().add(e);
							}
						}
						v.getChildren().add(ht);
					}
					TitledPane title = ShapeAll.getTitled("第" + c + "个解法", v);
					acc.getPanes().add(title);
				}
			}
		});
		stage.show();
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		stage = new Stage();
		stage.setOnCloseRequest(new EventHandler<WindowEvent>() {

			public void handle(WindowEvent event) {
				System.exit(0);
			}
		});
		init(stage);
	}

}
