package assesment;

class C extends Alpahabate implements Task{

	
	C(int sno, String type) {
		super(sno, type);
		// TODO Auto-generated constructor stub
	}

	public void activity() {
		// TODO Auto-generated method stub
		System.out.println("class c");
	}

	@Override
	void m() {
		// TODO Auto-generated method stub
		System.out.println(type);
	}

	@Override
	void n() {
		// TODO Auto-generated method stub
		System.out.println(sno);
	}
	
}