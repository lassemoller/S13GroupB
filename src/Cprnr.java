public class Cprnr {

	private long cprno;

	public Cprnr(Long cprInd) {
		cprno = cprInd;
	}

	public Long getCprno() {
		return this.cprno;
	}

	// Used to check the Cpr length
	public Boolean checkCprno() {
		String cprLength = Long.toString(this.cprno);
		if (cprLength.length() > 10) {
			return false;
		}
		if (cprLength.length() < 10) {
			return false;
		} else {
			return true;
		}
	}

	public String toString() {
		String aString = String.format("%06d-%04d", this.cprno / 10000, this.cprno % 10000);
		if (!this.checkCprno())
			aString += ", invalid";
		return aString;
	}

	public static void main(String[] args) {

		// Invalid Testing
		Cprnr c = new Cprnr(12121212212L);
		System.out.println(c);
		System.out.println("\r\n");

		// Working Testing
		Cprnr c2 = new Cprnr(2703911234L);
		System.out.println(c2);
		System.out.println("\r\n");

	}
}
