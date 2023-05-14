import java.util.Scanner;

import com.hasibul.hello.*;
import com.hasibul.passgen.*;;

class Launcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hello.say();
        System.out.print("Enter your password length: ");
        int length = sc.nextInt();
        String pass = Generator.gen(length);
        System.out.println("The password is \""+pass+"\"");
        sc.close();
    }
}
