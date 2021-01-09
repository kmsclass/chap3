package chap3;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration //설정을 위한 자바 프로그램. xml 없이 설정 가능.
//<context:component-scan base-package="chap2" />
//chap3 패키지의 클래스 중 @Component 어노테이션이 있는 클래스를 객체화
@ComponentScan(basePackages = {"chap3"}) 
public class AppCtx {
	@Bean  //객체화. 메서드의 이름으로 객체가 저장됨.
	public Camera camera1() {  //<bean id="camera1" ... />
		Camera c = new Camera();
		c.setNumber(1);
		return c;
	}
	@Bean
	public Camera camera2() {
		Camera c = new Camera();
		c.setNumber(2);
		return c;
	}
	@Bean
	public Camera camera3() {
		Camera c = new Camera();
		c.setNumber(3);
		return c;
	}
	@Bean
	public Camera camera4() {
		Camera c = new Camera();
		c.setNumber(4);
		return c;
	}	
	@Bean
	@Qualifier("intrusionDetection") //<qualifier value="intrusionDetection" />
	public InfraredRaySensor windowSensor() {
		return new InfraredRaySensor("창센서");
	}
	@Bean
	@Qualifier("intrusionDetection")
	public InfraredRaySensor doorSensor() {
		return new InfraredRaySensor("현관센서");
	}
	@Bean
	@Qualifier("intrusionDetection")
	public InfraredRaySensor lampSensor() {
		return new InfraredRaySensor("전등센서");
	}
	@Bean
	public DisplayMode displayMode() {
		DisplayMode d = new DisplayMode();
		d.setType("GRID");
		return d;
	}
}
