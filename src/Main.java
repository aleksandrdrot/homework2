public class Main {

    public static void main(String[] args) {

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog + "\ncat = " + cat + "\npaper = " + paper + "\n");

        System.out.println("Увеличели на 4");
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println("dog = " + dog + "\ncat = " + cat + "\npaper = " + paper +"\n");

        System.out.println("Уменьшили");
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("dog = " + dog + "\ncat = " + cat + "\npaper = " + paper +"\n");

        System.out.println("Умножаем");
        dog *= 0.35;
        cat *= 0.35;
        paper *= 0.35;
        System.out.println("dog = " + dog + "\ncat = " + cat + "\npaper = " + paper +"\n");

        System.out.println("Делим");
        dog /= 0.35;
        cat /= 0.35;
        paper /= 0.35;
        System.out.println("dog = " + dog + "\ncat = " + cat + "\npaper = " + paper +"\n");

        {
            var sportsMen1 = 78.2;
            var sportsMen2 = 82.7;
            System.out.println("Вес первого бойца " + sportsMen1 + " кг.\nВес второго бойца " + sportsMen2 + " кг.");
            System.out.println("Общий вес двух бойцов " + (sportsMen1 + sportsMen2));
            System.out.println("Разница в весе " + (sportsMen2 - sportsMen1));
            System.out.println("Разница в весе " + (sportsMen2 % sportsMen1));
        }

        {
            System.out.println();
            var allTime = 640;
            var workTime = 8;
            var people = 0;
            System.out.println("Всего работает в компании - " + (people = allTime / workTime) + " человек.");
            System.out.println("Если в компании работает " + (people += 94) + " человек, то всего " + ((double) allTime / people) +
                    " часа работы может быть поделено между сотрудниками");
        }



    }

}