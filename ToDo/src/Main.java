//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hello to our app for ToDo To Stat type ( A ) or to quit type ( X ) : ");
        String stert = input.nextLine();
        if (!stert.equals("A") && !stert.equals("a")) {
            System.out.println("you quit");
        } else {
            ArrayList<String> ToDo = new ArrayList();
            System.out.print("Enter ToDo to Your List : ");
            ToDo.add(input.nextLine());
            System.out.print("Enter ToDo to Your List : ");
            ToDo.add(input.nextLine());
            System.out.print("Enter ToDo to Your List : ");
            ToDo.add(input.nextLine());
            System.out.print("to print the List type - List - or to quit type x : ");
            String list = input.nextLine();
            if (!list.equals("List") && !list.equals("list")) {
                System.out.println("you quit");
            } else {
                System.out.println("your List :" + String.valueOf(ToDo));
            }
        }

    }
}
