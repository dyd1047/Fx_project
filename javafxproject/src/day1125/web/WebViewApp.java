/*AWT/Swing 에서는 부분적으로나마 html이 적용될 수 있으나,
 * javascript는 실행될 수 없다.*/
package day1125.web;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class WebViewApp extends Application{
	WebView webView; //HTML 문서를 포함할 수 있는 컨테이너
	TextField t;
	
	@Override
	public void start(Stage stage) throws Exception {
		//youtube 삽입
		webView = new WebView();
		t = new TextField();
		webView.getEngine().load("https://www.youtube.com/watch?v=P5YsUdPm-s4");
		webView.setPrefSize(500, 500);
		
		showWindow(stage, webView);
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
