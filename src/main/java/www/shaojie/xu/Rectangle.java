package www.shaojie.xu;

import org.springframework.stereotype.Component;

@Component
public class Rectangle {
	
	Math mathObj;
	
	private int length;
	
	private int witdh;
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWitdh() {
		return witdh;
	}

	public void setWitdh(int witdh) {
		this.witdh = witdh;
	}
	
	public int getArea(){
		return mathObj.multiply(this.getLength(), this.getWitdh());
	}
	
	
	
	
	

}
