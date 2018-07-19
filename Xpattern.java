public class Xpattern {
    public static void main(String[] args) {
        char[] chars = {'1', '2', '3','2','1'};
        int length = chars.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (j == i || j == (length-1 - i)) {
                    System.out.print(chars[i]);
			
                } else {
                    System.out.print("  ");

                }
            }
            System.out.println();
        }
    }
}
