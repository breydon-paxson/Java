package Week3;

public class FirstFunction {

    public static String singFullSong(String name) {
        String mainClause = "Happy to you";
        String out = mainClause + " " + mainClause;
        out += "Happy birthday dear " + name;
        out += mainClause;
        //return out;
        return out;
    }

    public static void singHappyBirthday(String name, int age) {
        //System.out.println("Happy Birthday " + name);
        System.out.println(singFullSong(name));
        System.out.println("You are " + age + " years old");
    }

    public static void main(String[] args) {
        System.out.println("Starting Main");
        singHappyBirthday("Suzy",5);
        System.out.println("Back in Main");
    }
}
