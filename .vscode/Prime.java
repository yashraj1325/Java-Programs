public class Prime {
  
        public static boolean Primee(int n){
            boolean prime=true; 
            for(int i=2; i<=n-1; i++){
                if(n%i==0){
                    prime=false;
                    break;

                }

            }
            return prime;



        }
        public static void main(String[] args) {
            int n =8;
          System.out.print(Primee(n));
        
            
        }
    }
        
    


    

