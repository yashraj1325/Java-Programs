/* 
public class er {
    public static int fib(int n){
        if(n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }
    public static void main (String args[]){
        int n = 25;
        System.out.println(fib(n));

    }
    
}

public class er{
public static boolen isSorted(int arr[],int i) {
    if(i ==arr.length-1){
        return true;
    }
    if(arr[i] >arr[i+1]) {
        return false;

    }
    return isSorted(arr, i+1);

}
public static void main(String args[]){
    int arr[]={5,6};
    System.out.println(isSorted(arr,0));
}
}

`//first occerence
public class er {
    public static int firstOccurance(int arr[],int key,int i){
        if(i ==arr.length){
            return -1;

        }
        if(arr[i]== key){
            return i;
        }
        return firstOccurance(arr ,key,i+1);

    }
    public static void main(String args[]){
        int arr[] ={8,3,4,5,7,6,3,5,2};
        System.out.println(firstOccurance(arr,5,0));
    }
}

//finding power 
public class er {
    public static int optimizedpower(int a,int n){
        if(n == 0){
            return 1;
        }
        int halfpowersq = optimizedpower(a, n/2) * optimizedpower(a, n/2);
        //n is odd
        id(n % 2 !=0) {
            halfpowersq = a* halfpowersq;
        }
        return halfpowersq;
    }
    public static void main(String[] args){
        int a= 2;
        int n= 10;
        System.out.println(optimizedpower(a,n));
    }
}

//remove duplicate
public class er {
    public static void removeduplicate(Stirng str,int idx,StringBuilder newStr, boolean)
    if(idk == str.length()){
        System.out.println(newStr);
        return;
    }
    char currchar = str.charAt(idx);
    if(map[currChar-'a'] == true) {
        removeDuplicates(str,idx+1,newStr,map);

    }
    else{
        map[currChar-'a'] = true;
        removeDuplicates(Str,idx+1, newStr.append(currChar),map);

    }

}
public static void main(String args[]){
    String str = "appnnacollege";
    removeDuplicates(str,0,new StringBuilder("26"),new boolean())
}


public class er {
    public static int friendsParing(int n){
        if(n == 1 || n ==2) {
            return n;

        }
        int fnm1 = friendsParing(n-1);

        int fnm2 = friendsParing(n-2);
        int pairways =(n-1)*fnm2;

        int totways = fnm1 + pairways;
        return totways;
    

    }
    public  static void main(String args[]){
        System.out.println(friendsParing(3));
    }
}

public class er {
    public static int fact(int n){
        if(n == 0) {
            return 1 ;
        }
        int fnm1 = fact(n-1);
        int fn = n* fact(n-1);
        return fn;
    }
    public static void main(String args[]){
        int n = 5;
        fact(n);
        System.out.println(fact(n));

    }
}
*/
public class er {
    public static void findPermutation{}
}