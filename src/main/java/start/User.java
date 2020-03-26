package start;

public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void showUserInfo() {
        System.out.println("Имя: " + name + " возраст: " + age);
    }


}



/*

package code;
import javafx.application.Application;


public class User {
   private String name;
   public User (String name) {
       this.name = name;
   }
   public String getName() {
       return name;
   }
   public void setName() {
       this.name = name;
   }
   public void helloUser() {
       name = name.substring(0, 1).toUpperCase() + name.substring(1);
       System.out.println("хай" + name);
       System.out.println("игра началась ...");

        }
    }
*/
