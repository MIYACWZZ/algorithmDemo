public class SelectSort {
    private int list[]; //存储需要排序的数组

    SelectSort(){ }

    SelectSort(int list[]){
        this.list = list;
    }

    public void swap(int a, int b){ //交换函数
        int t = list[a];
        list[a] = list[b];
        list[b] = t;
    }

    public void selectSort(){   //选择排序函数
        for (int i = 0; i < list.length; i++) {

            int minIndex = i;

            for (int j = i+1; j < list.length; j++) {
                if (list[minIndex] > list[j])
                    minIndex = j;

//                找到[i , list.length)区间中最小的索引
            }

            swap(i , minIndex);

        }
    }

    public static void selectSort(int listDemo[]){  //用于对象传递的选择排序函数
        for (int i = 0; i < listDemo.length; i++) {

            int minIndex = i;

            for (int j = i+1; j < listDemo.length; j++) {
                if (listDemo[minIndex] > listDemo[j])
                    minIndex = j;

//                找到[i , list.length)区间中最小的索引
            }

            swap(listDemo, i , minIndex);

        }
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


    public void show(){     //不带参数的show方法重载
        System.out.println("The array element is...");
        for (int i = 0; i < list.length; i++) {
            System.out.printf("%d ",list[i]);
        }
        System.out.println();
    }
}
