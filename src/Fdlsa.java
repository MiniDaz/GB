import java.util.ArrayList;


public class Fdlsa {
    public static void main(String[] args) throws InterruptedException {
        ty();

    }
    private static void ty () throws InterruptedException {
        ArrayList<Object> ob=new ArrayList<>();
        for (int i = 0; i < 500; i++) {
            Thread.sleep(100);
            ob.add(new byte[1024*1024]);//заполняем лист


            if(i%10==0){  //
                ob.clear();// каждую 10 итерацию очищаем лист
                System.gc();// пытаемся вызвать сборщик
            }
        }
        System.out.println(ob.size());


    }
}
