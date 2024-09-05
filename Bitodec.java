public class Bitodec {
    public static int binaryToDec(int n){
        int decimal =0;
        int base = 1;
        while(n>0){
            int lastDigit = n%10;
            n = n/10;
            decimal = decimal+lastDigit*base;
            base = base*2;
        }
        return decimal;
    }
    public static void main(String[] args) {
        int binaryNumber = 1010;
        int decimalNumber= binaryToDec(binaryNumber);
        System.out.println("decimaltobinary"+decimalNumber);
    }
}
 

