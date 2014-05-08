package compare;

import java.util.Arrays;
public class TestCar {

	
	public static void main(String[] args) {
		Car[] CarArrays = new Car[] {
				new Car("Honda","รถมอเตอร์ไซค์",43000),
				new Car("Kubota","รถสามล้อ",60000),
				new Car("LA","รถจักรยาน",2000)};
				Arrays.sort(CarArrays);
				System.out.println(Arrays.toString(CarArrays));
}
}