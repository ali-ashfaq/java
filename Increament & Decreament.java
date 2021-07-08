public static void main(String[] args) {
		int i=10;
		System.out.println("POST INCREMENT....");
		System.out.println(i);
		System.out.println(i++);
		System.out.println(i);//print 11
		System.out.println("PRE INCREMENT.....");
		int k=100;
		System.out.println(k);
		System.out.println(++k);
		System.out.println(k);
		
		System.out.println("POST DECREMENT....");
		int x=1000;
		System.out.println(x);
		System.out.println(x--);
		System.out.println(x);
		System.out.println("PRE DECREMENT.....");
		int y=2000;
		System.out.println(y);
		System.out.println(--y);
		System.out.println(y);
	}