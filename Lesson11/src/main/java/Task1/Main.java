package Task1;

import Task1.IInstrument.Type;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        FindEnam findEnam = new FindEnam();
        ArrayList<IInstrument> instruments = new ArrayList<>();
        instruments.add(findEnam.createInstrument(Type.PIPE));
        instruments.add(findEnam.createInstrument(Type.GUITAR));
//        IInstrument[] instruments = new IInstrument[4];                       //Нельзя вызывать метод у null/ NullPointerException
//        instruments[0] = findEnam.createInstrument(Type.PIPE);
//        instruments[2] = findEnam.createInstrument(Type.GUITAR);
        for (IInstrument instrument : instruments) {
            instrument.play();
        }

    /*
        Задача1:
        Интерфейс Инструмент

          1) Создать интерфейс Инструмент(внутри enum Type с перечислением типов инструментов) и
          реализующие его классы Гитара, Барабан и Труба.
          2) Интерфейс Инструмент содержит метод play() и переменную String KEY ="До мажор".
          3) Гитара содержит переменные класса количество Струн, Барабан - размер, Труба - диаметр.
          4) Создать массив типа Инструмент, содержащий инструменты разного типа.
          5) Наполнять массив инструментами необходимо через метод createInstrument,
          который на вход принимает Тип инструмента(enum) и создает конкретный инструмент.
          6) В цикле вызвать метод play() для каждого инструмента, который должен выводить строку
         "Играет такой-то инструмент, с такими-то характеристиками".

         */

    }

    public static class FindEnam {
        private Type type;

        public IInstrument createInstrument(Type type) {
            for (IInstrument.Type instrumentType : Type.values()) {
                if (type == instrumentType) {
                    switch (instrumentType) {
                        case GUITAR -> {
                            Guitar guitar = new Guitar(0);
                            System.out.println("Создана гитара!");
                            return guitar;
                        }
                        case DRUM -> {
                            Drum drum = new Drum(1);
                            System.out.println("Создан барабан!");
                            return drum;
                        }
                        case PIPE -> {
                            Pipe pipe = new Pipe(2.1097);
                            System.out.println("Создана труба!");
                            return pipe;
                        }
                    }
                }
            }
            return null;
        }
    }
}




