package core;

public enum HP12CErrors implements ErrorsEnumInterface{
	
	ERROR_MATH ( 0, "Math Error"), 
	ERROR_SRO  ( 1, "Storage Register Overflow Error"), 
	ERROR_STAT ( 2, "Statistic Error"),
	ERROR_IRR1 ( 3, "IRR1 Error"),
	ERROR_MEM  ( 4, "Memory Error"),
	ERROR_CI   ( 5, "Compound Interest Error"),
	ERROR_SR   ( 6, "Storage Registers Error"),
	ERROR_IRR2 ( 7, "IRR2 Error"),
	ERROR_CAL  ( 8, "Calendar Error"),
	ERROR_SERV ( 9, "Service Error"),
	ERROR_PR   (10, "Post Reset Error");
	
	private int code;
	private String message;
	
	private HP12CErrors(int code, String message) {
		this.code = code;
		this.message = message;
	}
	
	public String getName() {
		return this.name();
	}

	public int getCode() {
		return this.code;
	}

	public String getMessage(){
		return this.message;
	}
	
	public void print() {
		System.out.println(this);
	}
	
	public String toString() {
		String r = "";
		r += this.name()+": "; 
		return r;
	}
	
}
