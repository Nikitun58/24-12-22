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

        //  задача №3.1
        System.out.println("задача №3.1");
        int peopleage=15;
        if (peopleage>=2 && peopleage<=6){ System.out.println("ему нужно ходить в детский сад");}
        if (peopleage>=7 && peopleage<=18){ System.out.println("му нужно ходить в школу");}
        if (peopleage>18 && peopleage<24){ System.out.println("его место в университете");}
        else if (peopleage>24){ System.out.println("ему пора ходить на работу");}

        //  задача №3.2
        System.out.println("задача №3.2");
        int chaild=8;
        int bigchaild=0;
        if (chaild<=5){System.out.println("он не может кататься на аттракционе");}
        if (chaild>5 && chaild<14 && bigchaild>=1){System.out.println("он может кататься только в сопровождении взрослого");}
        else if(chaild>5 && chaild<14 && bigchaild<=1){System.out.println("взрослого нет, то кататься нельзя");}
        if (chaild>14){System.out.println("он может кататься без сопровождения взрослого");}

        //  задача №3.3
        System.out.println("задача №3.3");
        int one=5;
        int two=8;
        int three=18;
        if (one>two && one>three){ System.out.println("большее число "+one);}
        else if (two>one && two>three){ System.out.println("большее число "+two);}
        else  { System.out.println("большее число "+three);}




    }
}