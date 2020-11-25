package day1124.layout;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

//FlowPane 은 AWT의 FlowLayout과 기능이 같다.
//즉 공간이 부족할 경우, 다음 행으로 컴포넌트들이 흘러 내려감
public class FlowPaneApp extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		//TilePane과 흡사하지만, TilePane은 자식 요소들의 크기가 모두 일정하다.
		FlowPane parent = new FlowPane(10, 10);
		
		Button bt1 = new Button("bt1");
		TextField t = new TextField();
		TextArea area = new TextArea();
		Button bt2 = new Button("bt2");
		Button bt3 = new Button("bt3");
		
		bt1.setPrefSize(80, 50);
		t.setPrefSize(380, 50);
		area.setPrefSize(480, 400);
		
		parent.getChildren().add(t);
		parent.getChildren().add(bt1);
		parent.getChildren().add(area);
		
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
