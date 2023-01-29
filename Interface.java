interface InterFace{
	void m1();
	void m2();

}

class Impl implements InterFace{
	public void m1(){
		System.out.println("From Method m1");
	}
	/*public void m2(){
		System.out.println("From Method m2");
	}*/
	
	public static void main(String arg[]){
		Impl ob = new Impl();
		ob.m1();
		//ob.m2();
	}
}