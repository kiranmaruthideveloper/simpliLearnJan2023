abstract class abs{
	abstract int sum(int a,int b);
	//abstract int m1(int a,int b);	
}

class Impl extends abs{
	
	int sum(int a, int b){
		return a+b;
	}
	
	public static void main(String[] args){
		Impl ob = new Impl();
		System.out.println(ob.sum(4,5));
	}
}