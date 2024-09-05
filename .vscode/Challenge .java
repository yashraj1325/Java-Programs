public class Challenge {
  public static boolean checkEnding(String str1, String str2) {
		int count =0;
		for(int i =str2.length();i<str1.length()-1; i--){
			char ch =str2.charAt(i);
			count ++;
		}
		for(int j = str1.length();j<count;j--){
			char hc =str1.charAt(j);
			    if(char ch == char hc ){
						return true;
					}
			return false;
		}

  }
}