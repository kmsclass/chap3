package chap3;

public class Camera {
	private int number;
	// <bean id="camera1" class="chap2.Camera" p:number="1" />
	// setNumber 메서드를 이용하여 1값을 주입.
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Camera [number=" + number + "]";
	}
}
