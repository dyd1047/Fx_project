package day1124.layout;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

//Tile Pane : 동일한 크기의 셀을 갖는 배치 방법
public class TilePaneApp extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		TilePane parent = new TilePane(Orientation.VERTICAL, 10, 5);
		
		Button[] btn = new Button[10];
		
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new Button("버튼"+i);
			btn[i].setPrefSize(50, 50);
			
			parent.getChildren().add(btn[i]);
		}
		
		
		showWindow(stage, parent);
	}
	
	public void showWindow(Stage stage, Parent parent) {
		Scene s = new Scene(parent); //씬 생성
		stage.setScene(s); //생성된 씬을 윈도우에 적용
		stage.setWidth(500); //넓이
		stage.setHeight(500); //높이
		stage.show(); //윈도우 보여주기
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
