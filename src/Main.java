import java.util.Date;
class SomeThing extends Thread
        implements Runnable


{
    static SomeThing mThing
    public void run()		//Этот метод будет выполняться в побочном потоке
    {
        mThing = new SomeThing();
        Date date = new Date();
        Thread myThready = new Thread(mThing);    //Создание потока "myThready"
        myThready.start();
        try{
            sleep(5000);
        }catch(InterruptedException e){}

        System.out.println("Прувет из 2 потока!", date);
        System.out.printf(str);
    }
}


public class Main			//Класс с методом main()
{
    static SomeThing mThing;    //mThing - объект класса, реализующего интерфейс Runnable

    public static void main(String[] args) {

        // Вывод текущей даты и времени с использованием toString()

        mThing = new SomeThing();
        Date date = new Date();
        Thread myThready = new Thread(mThing);    //Создание потока "myThready"
        myThready.start();                //Запуск потока
        String str = String.format("Главный поток завершён: %tc", date);
        System.out.printf(str);
    }
}