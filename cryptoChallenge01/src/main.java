import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sIn = " ";
        char [] aIn;
        int check = 0;
        System.out.println("INSERIRE LA FRASE:");
        sIn = sc.next();
        aIn = sIn.toCharArray();
        char [] aOut = new char[aIn.length];

        for (int i = 1; i < 26; i++) {
            for (int j = 0; j < aIn.length; j++) {
                check = (int) aIn[j];
                for (int k = 0; k < i; k++) {
                    if (check == 65) {
                        check = 90;
                    }else{
                        check = check - 1;
                    }
                }
                aOut[j] = (char) check;
            }
            String sOut = new String(aOut);
            System.out.println("OUTPUT " + i + ":");
            System.out.println(sOut);
        }
    }
}
