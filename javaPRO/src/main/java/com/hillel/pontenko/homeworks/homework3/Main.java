package com.hillel.pontenko.homeworks.homework3;




import com.hillel.pontenko.homeworks.homework3.entity.Admin;
import com.hillel.pontenko.homeworks.homework3.entity.Support;
import com.hillel.pontenko.homeworks.homework3.entity.User;

import java.util.Scanner;



    public class Main {
        public static void main(String[] args){

            User user = new User("", "", "", "", "", "");
            user.read();

            Support support = new Support("", "","","","","");
            support.read();

            Admin admin = new Admin("","","","","","");
            admin.read();




            Scanner write = new Scanner(System.in);
            System.out.println("Введи текст:");
            String userString = write.nextLine();
            String supportString = write.nextLine();
            String adminString = write.nextLine();

            user.write(userString);
            support.write(supportString);
            admin.write(adminString);


            String quatrain = new String("Буря мглою, небокроет\n" +
                    "Вихри снежные крутя\n" +
                    "То как зверь она завоет\n" +
                    "То заплачет как дитя");
            String str1 = "Буря мглою, небокроет";

            support.stringValidation();
            if (str1.equalsIgnoreCase(quatrain)) {
                System.out.println("содержит");
            } else {
                System.out.println("не содержит");
            }















        }
}
