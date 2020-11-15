package nyelviElemek.introcontrol;

public class IntroControl {

    public int substractTenIfGreaterThanTen(int number){
        if (number<=10){
            return number;
        }
        return number-10;
    }

    public String describeNumber(int number){
        if (number == 0){
            return "zero";
        }
        return "not zero";
    }

    public String greetingToJoe(String name){
        if (name == "Joe"){
            return "Hello "+ name;
        }
        return " ";
    }

    public int calculateBonus(int sale){
        if (sale>=1000000){
            return sale/10;
        }
        return 0;
    }

    public int calculateConsumption(int prev, int next){
        if(next<prev){
            return next+10000-prev;
        }
        return next-prev;
    }

    public void printNumbersBetween(int max){
        for(int i=0;i<=max;i++){
            System.out.println(i);
        }
    }

    public void printNumbersInBetween(int a, int b){
       if (a>b){
           for (int i=a;i>=b;i--){
               System.out.println(i);
           }
       }
       for (int j=a;j<=b;j++){
           System.out.println(j);
       }
    }

    public void printOddNumbers(int max){
        for (int i=1;i<=max;i+=2){
            System.out.println(i);
        }
    }

}
