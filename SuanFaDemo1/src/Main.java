import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SelectSort selectSort ;
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int list[] = new int[n];

        for (int i = 0; i < n; i++) {
            list[i] = scanner.nextInt();
        }

        /*
//        通过内置私有属性

        selectSort = new SelectSort(list);

        selectSort.show();

        selectSort.selectSort();

        selectSort.show();*/

//        通过静态方法，使用对象传递特性

        SelectSort.show(list);

        SelectSort.selectSort(list);

        SelectSort.show(list);
    }
}
