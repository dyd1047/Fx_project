package day1124.layout;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
//Application울 상속받는 순간 생명주기 메서드를 이용할 수 있다.
public class AnchorPaneApp  extends Application{
	
	//가동되지 시작할 때 호출됨 (Application Thread UI.Event 전용 쓰레드에 의해 호출)
	//무조건 호출됨.. 따라서 앱이 가동될때 주로 디자인 구성을 여기서 처리하면 된다.
	@Override
	public void start(Stage stage) throws Exception {
		//stage? 이 앰에서 사용될 윈도우를 stage라 한다.
		
		//윈도우 안에는 반드시 씬(Scene)이라 부르는 컨테이너 즉 레이아웃 객체가 와야 한다.
		//하나의 윈도우 안에는 하나의 씬이 올 수 있다.
		AnchorPane parent = new AnchorPane(); //absolute(절대위치)로 위치를 지정할 수 있는 pane
		
		//버튼 3개를 생성하여 절대 위치로 배치해본다.
		Button bt1 = new Button("버튼1");
		Button bt2 = new Button("버튼2");
		Button bt3 = new Button("버튼3");
		
		//버튼위 위치 지정
		bt1.setLayoutX(0);
		bt1.setLayoutY(50);
		bt2.setLayoutX(100);
		bt2.setLayoutY(50);
		bt3.setLayoutX(200);
		bt3.setLayoutY(50);
		
		parent.getChildren().add(bt1);
		parent.getChildren().add(bt2);
		parent.getChildren().add(bt3);
		
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
		launch(args); //앱 가동
	}
}
