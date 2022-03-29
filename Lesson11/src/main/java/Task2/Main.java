package Task2;

public class Main {

    public static void main(String[] args) {

        favoriteSeason(Season.SUMMER);
        favoriteSeason(Season.WINTER);

        Season[] seasons = Season.values();
        for (Season season : seasons) {
            season.info();
        }
    }
//    Задача2: Времена года
//
//     1) Создать перечисление, содержащее названия времен года.
//     2) Создать переменную содержащую ваше любимое время года и распечатать всю информацию о нем.
//     3) Создать метод, который принимает на вход переменную созданного вами enum типа.
//     Если значение равно Лето, выводим на консоль “Я люблю лето” и так далее. Используем оператор switch.
//     4) Перечисление должно содержать переменную, содержащую среднюю температуру в каждом времени года.
//     5) Добавить конструктор принимающий на вход среднюю температуру.
//     6) Создать метод getDescription, возвращающий строку “Холодное время года”.
//     Переопределить метод getDescription - для константы Лето метод должен возвращать “Теплое время года”.
//     ) В цикле распечатать все времена года, среднюю температуру и описание времени года.

    public static void favoriteSeason(Season season) {
        switch (season) {
            case FAVORITE -> {
                System.out.println("Мое любимое время года!");
            }
            case WINTER -> {
                System.out.println("Брррр...Очень холодно");
            }
            case SPRING -> {
                System.out.println("Скоро лето!");
            }
            case SUMMER -> {
                System.out.println("Я люблю лето!");
            }
            case AUTUMN -> {
                System.out.println("Дождливо(");
            }
        }
    }


    enum Season {

        FAVORITE() {
            @Override
            public void getDescription() {
                System.out.println("Мое любимое время года - это лето.");
            }
        },

        WINTER(0) {
            @Override
            public void getDescription() {
                System.out.println(WINTER.name() + " Очень холодное время года. Средняя температура воздуха: ");
            }
        },
        SPRING(12) {
            @Override
            public void getDescription() {
                System.out.println(SPRING.name() + " Теплое время года. Средняя температура воздуха: ");
            }
        },
        SUMMER(25) {
            @Override
            public void getDescription() {
                System.out.println(SUMMER.name() + " Очень теплое время года. Средняя температура воздуха: ");
            }

        },
        AUTUMN(5) {
            @Override
            public void getDescription() {
                System.out.println(AUTUMN.name() + " Холодное время года. Средняя температура воздуха: ");
            }
        };

        private double averageTemperature;

        Season(double averageTemperature) {
            this.averageTemperature = averageTemperature;
        }

        Season() {
        }

        public void getDescription() {
        }

        public void info() {
            getDescription();
            System.out.println(averageTemperature);
        }
    }
}
