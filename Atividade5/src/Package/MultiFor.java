package Package;
public class MultiFor {
    public static void main(String[] args) {
        for(int i = 0; i < 4; i++) {
            for(int j = 4; j > 2; j--) {
                if(i==1) {
                    System.out.println(i + " " + j);
                    if (j == 3) { //estava imprimindo 2 3 em vez de 1 3
                        i++;
                    }
                }
                else {
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}