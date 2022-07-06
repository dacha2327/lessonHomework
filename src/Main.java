public class Main {
    public static void main(String[] args) {


        System.out.println(weather(23, 23));
        System.out.println(weather(40, -10));
        System.out.println(weather(14, 33));
        System.out.println(weather(36, -5));
        System.out.println(weather(27, 44));


    }




    public static String weather(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return ("Можно идти гулять");
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return ("Можно идти гулять");
        } else if (age > 45 && temperature >= -10 && temperature <= 25) {
            return ("Оставайтесь дома");

        }else return ("Оставайтесь дома");



    }


        {

        }





    }

    





