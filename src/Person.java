public class Person {


	// varibales
	private Cprnr cpr;
	private String name;
	private String address;
	private double saldo;
	private double saldoYtd;
	private double saldoLtd;
	
	//private Laan[] laan;
	//private Reservationer[] reservationer;
	
	//Constructor
	public Person(String name, Cprnr cpr, String address, double saldo) {
		this.name = name;
		this.cpr = cpr;
		this.address = address;
		this.saldo = saldo;
	}	
	
	public void laaner(){
		//bog, BogEksemplar
	}
	
	public void reserver(){
		//title, Bog
	}
	
	public String getName(){
		return this.name;
	}
	
	public void regulerSaldo(){
	
	}
	
	public Cprnr getCprnr() {
		return this.cpr;
	}
	
	public String getAdresse() {
		return this.address;
	}
	
	//string output format
	public String toString() {
		String s = String.format("Navn: " +this.getName() + "\r\nCPR: " + this.getCprnr() + "\r\nAdresse: " + this.getAdresse());
		return s;
	}
	
	//testing person
	public static void main(String[] args) {
		Cprnr c = new Cprnr(1212121212L);
		Person p1 = new Person("Lasse Møller Nielsen", c, "Østre Kirkevej 33", 100);
		System.out.println(p1);

	}
	

}
