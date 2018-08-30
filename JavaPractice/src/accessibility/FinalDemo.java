package accessibility;

public class FinalDemo {

	public static void main(String[] args) {
		final MyDto dto = new MyDto();
		dto.setFirstName("Srijit");
		dto.setAge(30);
		
		System.out.println(dto.toString());
	}

}
