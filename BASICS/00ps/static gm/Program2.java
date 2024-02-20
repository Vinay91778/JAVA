class Program2{
	public static void main(String[] args){
	System.out.println(k1(5));
	}

	public static int k1(int n){
		if(n==0){
			return n;
		}else{
			return n+k1(n-1);
		}
    }
}
