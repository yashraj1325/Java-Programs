import java.util.Scanner;
public class Long {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String sen = sc.nextLine();
        sen = sen+" ";
        String word = " ",ig = " ";
        for(int i=0;i<sen.length();i++){
            char ch = sen.charAt(i);
            if (ch != ' ') {
                word=word+ch;
            }else{
                if(word.length()>ig.length()){
                    ig = word;
                }
                word =" ";
            }
            System.out.println("longest word is"+ig);

        }
       

    }
    
}
