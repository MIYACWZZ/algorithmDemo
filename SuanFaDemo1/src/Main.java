import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int list[] = Tool.randomList(n);

        Main main = new Main();

        long startTime;

        long endTime;

        startTime = System.nanoTime();
        BubbleSort.bubbleSort(list);
        endTime = System.nanoTime();
        System.out.println("优化前运行时间为： " + (endTime - startTime) + "ns");

        list = Tool.randomList(n);

        startTime = System.nanoTime();
        BubbleSort.youHuaBubbleSort(list);
        endTime = System.nanoTime();
        System.out.println("优化后运行时间为： " + (endTime - startTime) + "ns");

        /*
        long startTime;

        long endTime;


        startTime = System.nanoTime();
        main.testInserSort(list);
        endTime = System.nanoTime();
        System.out.println("InsertSort运行时间为： " + (endTime - startTime) + "ns");

        list = Tool.randomList(n);

        startTime = System.nanoTime();
        main.tsetSelectSort(list);
        endTime = System.nanoTime();
        System.out.println("SelectSort运行时间为： " + (endTime - startTime) + "ns");

        list = Tool.randomList(n);

        startTime = System.nanoTime();
        main.testYouHuaInsertSort(list);
        endTime = System.nanoTime();
        System.out.println("优化后的InsertSort运行时间为： " + (endTime - startTime) + "ns");*/


    }

    public void testInserSort(int listDemo[]){

        InsertSort.insertSort(listDemo);

    }

    public void tsetSelectSort(int listDemo[]){

        SelectSort.selectSort(listDemo);
    }


    public void testYouHuaInsertSort(int listDemo[]){
        InsertSort.youHuaInsertSort(listDemo);
    }



}



