/*
import java.util.Scanner;
public class array {
    public static void main(String args[]){
        int marks[] = new int [100];
      
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        sc.close();
    
        System.out.println("phy:"+marks[0]);
        System.out.println("che:"+marks[1]);
        System.out.println("math:"+marks[2]);
        

    }

}


public class array {
public static void update(int marks[]){
    for(int i =0; i<marks.length;i++){
        marks[i] = marks[i] +1;
        
    }
}

public static void main(String args[]){
    int marks[] ={87,89,86};
    update(marks);

    for(int i=0;i<marks.length;i++){
        System.out.print(marks[i]+" ");
    }
    System.out.println();
}
}

//linearSearch
public class array {
    public static int linearSearch(int numbers[], int key){

        for(int i=0;i<numbers.length; i++){
            if(numbers[i]== key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] ={2,4,6,8,10,12,14,16};
        int key =10;
        int index = linearSearch(numbers,key);
        if(index == -1){
            System.out.println("not found");
        }else{
        System.out.println("key is at index:"+index);

    }
}
}

//finding the largest number,smallest.
public class array {
    public static int getlargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
          
                if(largest < numbers[i]){
                    largest = numbers[i];
                }
                if(smallest > numbers[i]){
                    smallest = numbers[i];

                }
            }
            System.out.println("smallest value is :"+smallest);
            return largest;

        }
        


        
        public static void main(String args[]){
            int numbers[] = {1,2,5,6,3};
            System.out.println("largest value is :"+getlargest(numbers));

    }
}

//binnary search
public class array {
    public static int binnarySearch(int numbers[], int key){
        int start = 0, end = numbers.length-1;

        while(start <= end){
            int mid = (start + end)/2;
            if(numbers[mid]==key){

            }
            if(numbers[mid]<key){
                start = mid-1;

            }else {
                end =mid-1;
            }
            
        }
        return -1;
        
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10,12,14};
        int key = 10;
        System.out.println("index for key is :"+ binnarySearch(numbers, key));

    }
}

//reverse array.ss(18)
public class array {
    public static void reverse(int numbers[]){
        int first = 0,last =numbers.length-1;

        while(first < last){
    
                int temp = numbers[last];
                numbers[last] = numbers[first];
                numbers[first]= temp;
                first++;
                last--;
            }
        }
        public static void main(String agrs[]){
            int numbers[] ={2,4,6,8,10};

            reverse(numbers);
            for(int i=0; i<numbers.length; i++){
                System.out.print(numbers[i]+" ");
            }
            System.out.println();
        }
}

public class array{
    public static void printpairs(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            int curr = numbers[i];
            for (int j=i+1;j<numbers.length; j++){
                System.out.print("("+curr +","+ numbers[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        printpairs(numbers);
    }
}ja

public class array{
    public static void printsubarray(int numbers[]){
        for(int i =0;i<numbers.length; i++){
            int start = i;
        for(int j =i;j<numbers.length;j++){
            int end = j;
            for(int k=start;k<=end;k++){
                System.out.print(numbers[k]+" ");
            }
            System.out.println();
        }
        System.out.println();
        }
    }
    public static void main(String args[]){
        int numbers[] ={2,4,6,8,10};
        printsubarray(numbers);

    }
}

public class array{
    public static void printsubarray(int numbers[]){
        for(int i =0;i<numbers.length; i++){
            int start = i;
        for(int j =i;j<numbers.length;j++){
            int end = j;
            for(int k=start;k<=end;k++){
                System.out.print(numbers[k]+" ");
            }
            System.out.println();
        }
        System.out.println();
        }
    }
    public static void main(String args[]){
        int numbers[] ={2,4,6,8,10};
        printsubarray(numbers);

    }
}

public class array{
    public static void maxSubarraySum(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i= 0; i<numbers.length;i++){
            int start = i;
            for(int j=1; j<numbers.length;j++){
                int end = j;
                currSum = 0;
                for(int k=start; k<=end; k++){
                    currSum += numbers[k];


                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;

                }
            }
            
        }
        System.out.println("max sum ="+maxSum);
    }
    public static void main(String args[]){
        int numbers[]={1,-2,6,-1,3};
        maxSubarraySum(numbers);

    }
}

public class array{
    public static void maxsubarraysum(int numbers[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

     prefix[0] = numbers[0];
     //calculate prefix array
     for(int i=1; i<prefix.length;i++){
        prefix[i] = prefix[i-1] + numbers[i];
     }

     for(int i=0; i<numbers.length; i++){
        int start = i;
        for(int j=i; j<numbers.length; j++){

        }
     }

    }
}


import java.util.*;
public class array{
    public static int buyAndSellStock(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0;i<prices.length; i++){
            if(buyPrice <prices[i]){
                int profit = prices[i]- buyPrice;//today's profit
                maxProfit = Math.max(maxProfit,profit);

            }else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;

    }
    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
        System.out.println(buyAndSellStock(prices));
    }
}

public class array{
    public static int trappedRainWater(int height[])[
        int n = height.length;
        int leftMax[]=new int [n];
        leftMax[i]=MAth.Max(height[i],leftMax[i-1]);
    ]












    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trappedRainWater(height));
    }
}
*/
