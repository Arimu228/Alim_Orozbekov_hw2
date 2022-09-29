import java.util.Random;

public class Main {
    public static void main(String[] args) {


        System.out.println(ageOfHumanAndTemperatureOfOutside(44, -18));
        System.out.println(ageOfHumanAndTemperatureOfOutside(12, -3));
        System.out.println(ageOfHumanAndTemperatureOfOutside(55, 8));
        System.out.println(ageOfHumanAndTemperatureOfOutside(19, 20));
        System.out.println(ageOfHumanAndTemperatureOfOutside(13, 48));


    }

    public static String ageOfHumanAndTemperatureOfOutside(int ageOfHuman, int temperatureOfOutside) {
        if (ageOfHuman >= 20 && ageOfHuman <= 45 && temperatureOfOutside >= -20 && temperatureOfOutside <= 30) {
            return "you can go out";
        } else if (ageOfHuman < 20 && temperatureOfOutside >= 0 && temperatureOfOutside <= 28) {
            return "you can go out";
        } else if (ageOfHuman > 45 && temperatureOfOutside >= -10 && temperatureOfOutside <= 25) {
            return "you can go out";
        } else {
            return "stay at home";
        }
    }


    public static int generateRandomAge() {
        Random random = new Random();
        int randomAge = random.nextInt(100);
        return randomAge;
    }

}
