public class Colab {
    public class Challenge {
        public static boolean canCapture(String[] rooks) { 
            // Extracting the positions
            String rook1 = rooks[0];
            String rook2 = rooks[1];
            
            // Extracting row and column of each rook
            char row1 = rook1.charAt(0);
            char col1 = rook1.charAt(1);
            char row2 = rook2.charAt(0);
            char col2 = rook2.charAt(1);
            
            // Rooks can attack each other if they share the same row or column
            return row1 == row2 || col1 == col2;
        }
            
        }
    
}
