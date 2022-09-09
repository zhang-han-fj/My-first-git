package ou.zh.day02.demo01;

public class Teachar {

	public void checkSoce(int soce) throws SoceException {
		if(soce <0 || soce >100) {
			throw new SoceException("soce is not right");
			
		}else {
			System.out.println("OK");
		}
	}

}
