package assesment;
interface Task{
	void activity();
}
abstract class  Alpahabate{
	int sno;
	String type;
	Alpahabate(int sno,String type){
		this.sno=sno;
		this.type=type;
		
	}
	abstract void m();
	abstract void n();
}
	
class  classprocess{
	public static void process(Task t) {
		t.activity();
	}
	
}



public class Process {
	public static void process(Alpahabate A) {
     A.m();
     A.n();
}
	public static void main(String []arg) {
		Process.process(new A(1,"first"));
		Process.process(new B(2,"second"));
		Process.process(new C(3,"Third"));
		Process.process(new D(2,"fourth"));
		classprocess.process(new A(0, null));
		classprocess.process(new B(2,"done"));
		classprocess.process(new C(3,"done"));
		classprocess.process(new D(4,"done"));
		}
	}
