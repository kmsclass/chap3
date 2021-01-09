package chap3;

public class InfraredRaySensor {
	private String name;  //생성자를 통해서 문자열값 주입.
	private boolean objectFounded;
	//생성자
	public InfraredRaySensor(String name) {
		this.name = name;
	}
	public void foundObject() {
		this.objectFounded = true;
	}
	//getter, setter, toString
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isObjectFounded() {
		return objectFounded;
	}
	public void setObjectFounded(boolean objectFounded) {
		this.objectFounded = objectFounded;
	}
	@Override
	public String toString() {
		return "InfraredRaySensor [name=" + name + ", objectFounded=" + objectFounded + "]";
	}
	
}
