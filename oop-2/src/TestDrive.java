
import com.npru.se65.id65001.HumanBeing;

public class TestDrive {

	public static void main(String[] args) {
		HumanBeing hb = new HumanBeing();
		hb.setHeight(181);
		hb.setWeight(78);
		hb.calculateBmi();
		System.out.println(" BMI: "+hb.getBmi());
		System.out.println(hb.analyzeBmi());
	}

}
