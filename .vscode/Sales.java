public class Sales {
	public static double discount(int price, int percentage) {
		double decount = (price*percentage)/100.0;
	double finalprice = price - decount;
		return finalprice;
		
	}
    public static void main(String[]args){
        int percentage = 20;
        int price = 89;
        System.out.println("the final price is"+" "+discount(price,percentage));
    }
} 
    

