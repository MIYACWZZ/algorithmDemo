public class BubbleSort {
    public static void bubbleSort(int listDemo[]){
        for (int i = 0; i < listDemo.length-1; i++) {
            //i作为控制

            for (int j = 0; j < listDemo.length-1-i ; j++) {

                if (listDemo[j] > listDemo[j+1]){

                    Tool.swap(listDemo,j,j+1);
                }


            }
        }

    }

    public static void youHuaBubbleSort(int listDemo[]){
        int size = listDemo.length;

        for (int i = 0; i < size; i++) {
            //i作为控制

            int k = 0;//最大值对应的索引

            for (int j = 0; j < size-i ; j++) {

                if (listDemo[j] > listDemo[k]){
                    k = j;
                }

            }

            int t = listDemo[size-i-1];

            listDemo[size-i-1] = listDemo[k];

            listDemo[k] = t;


        }

    }
}
