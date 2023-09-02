package ru.mirea.it.ivbo;

public class Main {
    public int integer;


    public static String hello="Hello, world!";
    public static String test = new String("Hello, world!");

    public static void main(String[] args) {
        System.out.println(hello);
        User user = new User("Ivan","",23);
        User other = new User("Sergei","",20);;

        String userFirstName =  user.getFirstName();
        System.out.println(user.equals(other));

        User[] users = {user, other};
//        int[] users = new int[10];
        for(int i=0;i<users.length;i++) {
            System.out.println(users[i]);
        }
        for ( User value:users) {
            System.out.println(value);
        }



        switch (args[0]) {
            case "1":{
                System.out.println("One");
                break;
            }
            default: {
                System.out.println("No arg");
            }
        }



        System.out.println(users[0]);









                ;







    }
}
