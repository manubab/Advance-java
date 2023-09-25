package test;

public class CheckPinNO {
	public boolean verify(int pinNo) {
		return switch (pinNo) {
		case 6054:
			yield true;
		case 9985:
			yield true;
		case 7368:yield true;
		default:
			yield false;

		};
	}

}
