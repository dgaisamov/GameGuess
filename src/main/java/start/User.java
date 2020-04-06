package start;

import java.util.Scanner;
import java.io.*;


public class User {
    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);
        System.out.println("введи имя: ");
    }

        private String name;

    public User(String name) {
            this.name = name;
        }

        public boolean equals (Object object){
            User user = (User) object;
            String currentFullName = this.name;
            String comparFullName = user.name;
            return currentFullName.equals(comparFullName);
        }

        @Override
        public int hashCode () {
            return 1;
        }

        public String toString () {
            return this.name;
        }
    }

