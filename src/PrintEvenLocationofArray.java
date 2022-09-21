import java.util.Scanner;

public class PrintEvenLocationofArray {
    public static void main(String[] args) {
        System.out.println("enter number of elements you want to enter in array-->");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int array[];//=new int(count);
        array = new int[count];
        System.out.println("Enter " + count + " integer numbers in array-->");
        for (int i = 0; i < count; i++)
            array[i] = scanner.nextInt();
        System.out.println("All array elements are-->");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("Even location numbers are -->");
        for (int i = 0; i < array.length; i++) {
            if(i%2==0)
                System.out.println(array[i]);
        }
    }
}
