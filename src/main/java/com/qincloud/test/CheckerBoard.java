package com.qincloud.test;

import javafx.animation.Animation;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class CheckerBoard extends Application {
	public static int tile = 0;
	public static int[][] Board = new int[8][8];
	public static double x, y;

	public static void main(String[] args) {
		launch(args);
	}

	public void init(final Stage stage) throws Exception {
		Animation ani = new Timeline();
		VBox V = new VBox();
		V.setSpacing(10.00);
		Scene s = new Scene(V);
		s.setOnMouseClicked(new EventHandler<MouseEvent>() {

			public void handle(MouseEvent event) {
				if (event.getClickCount() == 2) {
					stage.setFullScreen(true);
				}
			}
		});
		s.setOnMousePressed(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent me) {

				x = me.getScreenX() - stage.getX();
				y = me.getScreenY() - stage.getY();

			}

		});
		s.setOnMouseDragged(new EventHandler<MouseEvent>() {

			public void handle(MouseEvent me) {

				stage.setX(me.getScreenX() - x);
				stage.setY(me.getScreenY() - y);

			}

		});
		s.setFill(Color.TRANSPARENT);
		ChessBoard(0, 0, 0, 0, 8);
		for (int i = 0; i < 8; i++) {
			HBox h = new HBox();
			h.setSpacing(10.00);
			for (int j = 0; j < 8; j++) {
				if (Board[i][j] == 1) {
					Ellipse e = ShapeAll.getEllipse();
					e.setFill(Color.BLACK);
					h.getChildren().add(e);
				} else if (Board[i][j] == 2) {
					Ellipse e = ShapeAll.getEllipse();
					e.setFill(Color.RED);
					h.getChildren().add(e);
				} else if (Board[i][j] == 3) {
					Ellipse e = ShapeAll.getEllipse();
					e.setFill(Color.GREEN);
					h.getChildren().add(e);
				} else if (Board[i][j] == 4) {
					Ellipse e = ShapeAll.getEllipse();
					e.setFill(Color.BLUE);
					h.getChildren().add(e);
				} else if (Board[i][j] == 5) {
					Ellipse e = ShapeAll.getEllipse();
					e.setFill(Color.DEEPPINK);
					h.getChildren().add(e);
				} else if (Board[i][j] == 6) {
					Ellipse e = ShapeAll.getEllipse();
					e.setFill(Color.WHEAT);
					h.getChildren().add(e);
				} else if (Board[i][j] == 7) {
					Ellipse e = ShapeAll.getEllipse();
					e.setFill(Color.AZURE);
					h.getChildren().add(e);
				} else if (Board[i][j] == 8) {
					Ellipse e = ShapeAll.getEllipse();
					e.setFill(Color.CORAL);
					h.getChildren().add(e);
				} else if (Board[i][j] == 9) {
					Ellipse e = ShapeAll.getEllipse();
					e.setFill(Color.TAN);
					h.getChildren().add(e);
				} else if (Board[i][j] == 10) {
					Ellipse e = ShapeAll.getEllipse();
					e.setFill(Color.DARKRED);
					h.getChildren().add(e);
				} else if (Board[i][j] == 11) {
					Ellipse e = ShapeAll.getEllipse();
					e.setFill(Color.VIOLET);
					h.getChildren().add(e);
				} else if (Board[i][j] == 12) {
					Ellipse e = ShapeAll.getEllipse();
					e.setFill(Color.LIGHTGREEN);
					h.getChildren().add(e);
				} else if (Board[i][j] == 13) {
					Ellipse e = ShapeAll.getEllipse();
					e.setFill(Color.LIME);
					h.getChildren().add(e);
				} else if (Board[i][j] == 14) {
					Ellipse e = ShapeAll.getEllipse();
					e.setFill(Color.MAROON);
					h.getChildren().add(e);
				} else if (Board[i][j] == 15) {
					Ellipse e = ShapeAll.getEllipse();
					e.setFill(Color.TOMATO);
					h.getChildren().add(e);
				} else if (Board[i][j] == 16) {
					Ellipse e = ShapeAll.getEllipse();
					e.setFill(Color.MISTYROSE);
					h.getChildren().add(e);
				} else if (Board[i][j] == 17) {
					Ellipse e = ShapeAll.getEllipse();
					e.setFill(Color.THISTLE);
					h.getChildren().add(e);
				} else if (Board[i][j] == 18) {
					Ellipse e = ShapeAll.getEllipse();
					e.setFill(Color.SNOW);
					h.getChildren().add(e);
				} else if (Board[i][j] == 18) {
					Ellipse e = ShapeAll.getEllipse();
					e.setFill(Color.FUCHSIA);
					h.getChildren().add(e);
				} else if (Board[i][j] == 19) {
					Ellipse e = ShapeAll.getEllipse();
					e.setFill(Color.KHAKI);
					h.getChildren().add(e);
				} else if (Board[i][j] == 20) {
					Ellipse e = ShapeAll.getEllipse();
					e.setFill(Color.INDIANRED);
					h.getChildren().add(e);
				} else if (Board[i][j] == 21) {
					Ellipse e = ShapeAll.getEllipse();
					e.setFill(Color.IVORY);
					h.getChildren().add(e);
				} else if (Board[i][j] == 22) {
					Ellipse e = ShapeAll.getEllipse();
					e.setFill(Color.OLIVEDRAB);
					h.getChildren().add(e);
				} else if (Board[i][j] == 23) {
					Ellipse e = ShapeAll.getEllipse();
					e.setFill(Color.PURPLE);
					h.getChildren().add(e);
				} else if (Board[i][j] == 24) {
					Ellipse e = ShapeAll.getEllipse();
					e.setFill(Color.MISTYROSE);
					h.getChildren().add(e);
				} else {
					Ellipse e = ShapeAll.getEllipse();
					e.setFill(Color.CORAL);
					h.getChildren().add(e);
				}
			}
			V.getChildren().add(h);
		}
		stage.setScene(s);
		stage.show();

	}

	public static void ChessBoard(int tr, int tc, int dr, int dc, int size) {
		if (size == 1)
			return;
		int t = tile++, s = size / 2;

		if (dr < tr + s && dc < tc + s) {
			ChessBoard(tr, tc, dr, dc, s);
		} else {
			Board[tr + s - 1][tc + s - 1] = t;
			ChessBoard(tr, tc, tr + s - 1, tc + s - 1, s);
		}

		if (dr < tr + s && dc >= tc + s) {
			ChessBoard(tr, tc + s, dr, dc, s);
		} else {
			Board[tr + s - 1][tc + s] = t;
			ChessBoard(tr, tc + s, tr + s - 1, tc + s, s);
		}

		if (dr >= tr + s && dc < tc + s) {
			ChessBoard(tr + s, tc, dr, dc, s);
		} else {
			Board[tr + s][tc + s - 1] = t;
			ChessBoard(tr + s, tc, tr + s, tc + s - 1, s);
		}

		if (dr >= tr + s && dc >= tc + s) {
			ChessBoard(tr + s, tc + s, dr, tc, s);
		} else {
			Board[tr + s][tc + s] = t;
			ChessBoard(tr + s, tc + s, tr + s, tc + s, s);
		}

	}

	@Override
	public void start(Stage stage) throws Exception {
		stage = new Stage(StageStyle.TRANSPARENT);
		init(stage);
	}

}
