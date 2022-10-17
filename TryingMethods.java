public class TryingMethods {
    public static void main(String[] args) {

        // Object to test dayOfTheWeek method
        TryingMethods test1 = new TryingMethods();
        System.out.println(test1.dayOfTheWeek(1));

        // Object to test randomFunction method 
        TryingMethods test2 = new TryingMethods();
        System.out.println(test2.randomFunction(2000));

    }

    String dayOfTheWeek(int day){
        String dayOfTheWeek = "";
        switch (day) {
            case 1:
                dayOfTheWeek = "Sun";
                break;
            case 2:
                dayOfTheWeek = "Mon";
                break;
            case 3:
                dayOfTheWeek = "Tue";
                break;
            case 4:
                dayOfTheWeek = "Wed";
                break;
            case 5:
                dayOfTheWeek = "Thu";
                break;
            case 6:
                dayOfTheWeek = "Fri";
                break;
            case 7:
                dayOfTheWeek = "Sat";
                break;
            default:
                break;
        }
        return dayOfTheWeek;
    }

    String randomFunction(int year){
        String message = "";
        if(year>2022){
            message += "Too early";
        } else if(year<2022){
            message += "Too late";
        } else if(year == 2022){
            message += "Just right";
        }
        return message;
    }
}
