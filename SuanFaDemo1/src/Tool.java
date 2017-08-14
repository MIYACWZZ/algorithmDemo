import java.util.Random;

public class Tool {
    public static int[] randomList(int n){
        int listDemo[] = new int[n];

        Random random = new Random();

        for (int i = 0; i < n; i++) {
            listDemo[i] = random.nextInt(20);
        }

        return listDemo;
    }

    public static boolean isSorted(int[] listDemo){
        for (int i = 1; i < listDemo.length; i++) {
            if(listDemo[i] < listDemo[i-1])
                return false;
        }

        return true;
    }

    public static void swap(int listDemo[],int a,int b){    //用于交换的静态方法
        int t = listDemo[a];
        listDemo[a] = listDemo[b];
        listDemo[b] = t;
    }

    public static void show(int listDemo[]){        //带参数的show方法重载
        System.out.println("The array element is...");
        for (int i = 0; i < listDemo.length; i++) {
            System.out.printf("%d ",listDemo[i]);
        }
        System.out.println();
    }


}
