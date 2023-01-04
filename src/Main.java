public class Main {
    public static void main(String[] args) {

        //  задача №1
        System.out.println("задача №1");
        int age=25;
        if (age>=18){
        System.out.println("hooray for you 18");
        }
        if (age<18) {
        System.out.println("the age of majority has not yet come");
        }

        //  задача №2
        System.out.println("задача №2");
        int age2=8;
        if (age2>=7 && age2<=17 ){  System.out.println("the child goes to school");
        }
        if (age2>=18 && age2<=23){  System.out.println("he has already graduated from school and can go to university");
        }
        if (age2>=24){  System.out.println("he graduated from university and it's time for him to look for his first job");
        }

        //  задача №3
        System.out.println("задача №3");
        int passengermunber=102;
        int Seatcar=102;
        int sittingPlace=60;
        int standingPlace=Seatcar-sittingPlace;
        int freeseatplaces=sittingPlace-passengermunber;
        int freestandingplaces=standingPlace-passengermunber+sittingPlace;

        if (passengermunber<59) {System.out.println("В вагоне есть "+freeseatplaces+" сидячих мест и "+freestandingplaces+" стоячих мест");
        }
        if (passengermunber==59) {System.out.println("В вагоне есть "+freeseatplaces+" сидячих мест и "+freestandingplaces+" стоячих мест");
        }
        if (passengermunber>=60 && passengermunber<101 ) {System.out.println("В вагоне нет сидячих мест есть только "+freestandingplaces+" стоячие места");
        }
        if (passengermunber==101) {System.out.println("В вагоне нет сидячих мест есть только "+freestandingplaces+" стоячие места");
        }
        if (passengermunber >=102) {System.out.println("В вагоне нет мест");
        }

        //  задача №1.1
        System.out.println("задача №1.1");
        System.out.println("задача №1");
        int age1=8;
        if (age1>=18){
            System.out.println("hooray for you 18");
        }
        else { System.out.println("the age of majority has not yet come");
        }

        //  задача №1.2
        System.out.println("задача №1.2");
        int age3=5;
            if (age3 >= 7 && age3 <= 17) {
                System.out.println("the child goes to school");
            }
            if (age3<=6) {
            System.out.println("you're still young, wait for your turn");
             }
            else if (age3 >= 18 && age3 <= 23) {
                System.out.println("he has already graduated from school and can go to university");
            }
            else if (age3 >= 24) {
                System.out.println("he graduated from university and it's time for him to look for his first job");
            }


        //  задача №1.3
        System.out.println("задача №1.3");
        int passenger=102;
        int Seatcar1=102;
        int sittingPlace1=60;
        int standingPlace1=Seatcar-sittingPlace1;
        int freeseatplaces1=sittingPlace1-passenger;
        int freestandingplaces1=standingPlace1-passenger+sittingPlace1;

        if (passenger<59) {System.out.println("В вагоне есть "+freeseatplaces1+" сидячих мест и "+freestandingplaces1+" стоячих мест");
        }
        if (passenger==59) {System.out.println("В вагоне есть "+freeseatplaces1+" сидячих мест и "+freestandingplaces1+" стоячих мест");
        }
        else if (passenger>=60 && passenger<101 ) {System.out.println("В вагоне нет сидячих мест есть только "+freestandingplaces1+" стоячие места");
        }
        if (passenger==101) {System.out.println("В вагоне нет сидячих мест есть только "+freestandingplaces1+" стоячие места");
        }
        else if (passenger >=102) {System.out.println("В вагоне нет мест");
        }

    }
}