public class Palindrome {
    public static void main(String[] args) {
        String palin = "racercar";
        System.out.println(ispalindrone(palin));
        
    }
    static boolean ispalindrone(String palin){
        if( palin==null|| palin.length() == 0){
            return true;

        }
       
        palin  = palin.toLowerCase();
        for(int i = 0;i<=palin.length()/2;i++){
            char start = palin.charAt(i);
            char end = palin.charAt(palin.length()-1-i);
            if(start != end){
                return false;
            }

        }
        return true;
}
}

