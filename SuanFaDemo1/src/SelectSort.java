public class SelectSort {


    public static void selectSort(int listDemo[]){  //用于对象传递的选择排序函数
        for (int i = 0; i < listDemo.length; i++) {

            int minIndex = i;

            for (int j = i+1; j < listDemo.length; j++) {
                if (listDemo[minIndex] > listDemo[j])
                    minIndex = j;

//                找到[i , list.length)区间中最小的索引
            }

            Tool.swap(listDemo, i , minIndex);

        }
    }



}
