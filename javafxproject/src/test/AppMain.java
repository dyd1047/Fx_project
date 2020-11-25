/*1. javaFx
 * 2. Swing
 * 3. 중립적 클래스*/
package test;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AppMain extends Application{
								//javaFx 어플리케이션을 만들기 위해서는 반드시 Application 추상클래스를 상속받아야 함
	
	public AppMain() {
		System.out.println("생성자 호출 by "+Thread.currentThread().getName());
	}
	
	//어플리케이션이 실행할 준비가 되면 호출되는 메서드
	@Override
	public void start(Stage stage) throws Exception {
		System.out.println("start() 메서드 호출 by "+Thread.currentThread().getName());
		
		//무대를 정의한다!(fx에서는 윈도우에 반드시 하나의 scene이 존재해야 함)
		VBox parent = new VBox(); //수직으로 컴포넌트를 배치하는 레이아웃 객체
												//FlowLayout과 비슷한 객체
		Scene s = new Scene(parent); //Parent란? 부모클래스를 의미하는 것이 아니라, 객체간 포함관계에서
												//바깥쪽 컨테이너를 의미
												//Swing과 비유하자면, 레이아웃 객체가 Parent이다.
		Button bt = new Button("button");
		bt.setPrefSize(200, 40);
		
		//버튼을 parent에 부착하기
		parent.getChildren().add(bt);
		javafx.scene.control.TextField t = new TextField("test");
		parent.getChildren().add(t);
		
		stage.setScene(s);
		
		bt.setOnAction((e)->{
			System.out.println("click");
		});
		
		//매개변수로 받은 stage 변수가 어플리케이션의 윈도우이다
		stage.setMaxWidth(500);
		stage.setMaxHeight(500);
		stage.show(); //윈도우 보이게
	}
	
	//어플리케이션 시작 전, 초기화를 담당하는 메서드이다. 따라서 초기화할게 없다면
	//재정의는 필수는 아니다.
	//생성자 : 인스턴스가 태어날 때 호출되는 메서드(시점이 더 빠르다)
	// VS
	//init() : 태어난 이후에, 초기화 작업에 사용되는 메서드
	@Override
	public void init() throws Exception {
		//자바의 쓰레드의 메서드 중 현재 실행중인 쓰레드 정보를 얻기 위한 메서드
		
		
		System.out.println("init() 메서드 호출 by "+Thread.currentThread().getName());
	}
	
	@Override
	public void stop() throws Exception {
		System.out.println("stop() 메서드 호출 by "+Thread.currentThread().getName());
		
	}
	
	public static void main(String[] args) {
		System.out.println("launch() 메서드 호출 by "+Thread.currentThread().getName());
		launch(args); //실행명령어
	}
}
