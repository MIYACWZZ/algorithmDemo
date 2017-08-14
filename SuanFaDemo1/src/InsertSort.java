import java.util.Random;
import java.util.Scanner;

public class InsertSort {

    public static void insertSort(int listDemo[]){

        for (int i = 1; i < listDemo.length; i++) {

            //寻找list[i]合适的插入位置
            for (int j = i; j > 0; j--) {
                if (listDemo[j] < listDemo[j-1])
                    Tool.swap(listDemo,j,j-1);
                else
                    break;
            }

        }


    }

    /*
    * 因为每一次调用交换函数实质是赋值了三次，比一般的比较更耗时，所以优化为两两比较
    * */

    public static void youHuaInsertSort(int listDemo[]){


        for (int i = 1; i < listDemo.length; i++) {
            int e = listDemo[i]; // 保存副本

            int j;

            for (j = i; j > 0 && listDemo[j-1] > e ; j--) {

                listDemo[j] = listDemo[j-1];
            }

            listDemo[j] = e;


        }

    }




}
