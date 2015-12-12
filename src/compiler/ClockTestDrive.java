package compiler;

public class ClockTestDrive {

	public static void main(String[] args) {
		Clock c = new Clock();
		c.setTime("1255");
		String tod = c.getTime();
		System.out.println("Time: " + tod);
	}

}
