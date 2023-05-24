
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
   //     task9();

    }
    public static void task1 () {
        System.out.println("Задача1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
    }

    public static void task2 () {
        System.out.println("Задача2");
        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);


    }
    public static void task3 () {
        System.out.println("Задача3");
        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        dog = dog - 3.5;
        System.out.println(dog);

        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);

        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);

    }
    public static void task4 () {
        System.out.println("Задача4");

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5 () {
        System.out.println("Задача5");

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

    }
    public static void task6 () {
        System.out.println("Задача6");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeight = boxer1 + boxer2;
        System.out.println(totalWeight);
        var difference = boxer2 - boxer1;
        System.out.println(difference);

    }
    public static void task7 () {
        System.out.println("Задача7");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var difference = boxer2 - boxer1;
        System.out.println(difference);
        difference = boxer2 % boxer1;
        System.out.println(difference);

    }
    public static void task8 () {
        System.out.println("Задача8");

        //       1

        var totalTime = 640;
        var time1 = 8;
        var numberOfEmployees = totalTime / time1;
        System.out.println("Всего работников в компании - " + numberOfEmployees + " человек");

        // 2

        var employees = 80;
        var employees2 = employees + 94;
        var totalTime2 = time1 * employees2;
        System.out.println("Если в компании работает " + employees2 + " человека, то всего " + totalTime2 + " часа работы может быть поделено между сотрудниками");

    }











}

