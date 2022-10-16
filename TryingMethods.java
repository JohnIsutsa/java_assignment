//Class to test various method implementations

public class TryingMethods {
    public static void main(String[] args) {

        // Object to test dayOfTheWeek method
        TryingMethods test1 = new TryingMethods();
        System.out.println(test1.dayOfTheWeek(1));

        // Object to test randomFunction method 
        TryingMethods test2 = new TryingMethods();
        System.out.println(test2.randomFunction(2000));

        //Testing sumOneThousand method
        System.out.println(sumOneThousand());

        //Testing sumOfEven method
        System.out.println(sumOfEven());
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

    static int sumOneThousand(){
        int sum = 0;
        for(int i = 1; i <= 1000; i++){
            sum += i;
        }
        return sum;
    }

    static int sumOfEven(){
        int sum = 0;
        for(int i = 12; i <=103; i++) {
            if (i%2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
