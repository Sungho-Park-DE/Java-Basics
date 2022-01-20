public class ShapePrinter {
    public void printFloydsPyramid(int height) {
        int temp = 0;
        int lastNum=0;
        int length=0;
        length=String.valueOf(height*(height+1)/2).length();


        for (int i = 1; i <= height; i++) {
           String line=" ";
            for (int j = 1; j <= i; j++) {
                lastNum=temp+j;
                for (int k = String.valueOf(lastNum).length(); k < length; k++) {
                    System.out.print(line);
                }
                System.out.print( + (temp + j));
                System.out.print(line);

            }
            temp=lastNum;
            System.out.println(line);
        }
    }
}
