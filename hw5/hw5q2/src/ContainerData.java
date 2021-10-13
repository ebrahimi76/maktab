import java.util.Scanner;

public class ContainerData {

    private final Scanner input = new Scanner(System.in);
    private int[] data;

    public ContainerData() {
        System.out.print("Enter size of data: ");
        int size = input.nextInt();
        data = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + "th: ");
            data[i] = input.nextInt();
        }
    }

    public void add() {
        System.out.print("Enter number of data: ");
        int num = input.nextInt();
        int[] newData = new int[data.length + num];
        System.arraycopy(data, 0, newData, 0, data.length);
        for (int i = data.length; i < data.length + num; i++) {
            System.out.print("Enter number " + (i + 1) + "th: ");
            newData[i] = input.nextInt();
        }
        data = newData;
    }

    public void del() {
        System.out.print("Delete with: [1]index [2]value\nYour choice: ");
        int select = input.nextInt();
        if (select == 1) {
            System.out.print("Enter index of number: ");
            int index = input.nextInt();
            if (index >= 0 && index <= data.length) {
                index--;
                int[] newData = new int[data.length - 1];
                if (index >= 0) System.arraycopy(data, 0, newData, 0, index);
                if (data.length - (index + 1) >= 0)
                    System.arraycopy(data, index + 1, newData, index + 1 - 1, data.length - (index + 1));
                data = newData;
            } else
                System.out.println("Enter the correct number!");
        } else if (select == 2) {
            System.out.print("Enter your number: ");
            int val = input.nextInt();
            int count = 0;
            for (int datum : data)
                if (datum == val)
                    count++;
            if (count == 0)
                System.out.println("This number is not available!");
            else {
                int[] newData = new int[data.length - count];
                for (int i = 0, j = 0; i < data.length; i++)
                    if (data[i] != val) {
                        newData[j] = data[i];
                        j++;
                    }
                data = newData;
            }
        } else
            System.out.println("Enter the correct number!");
    }

    public void find() {
        System.out.print("Enter your number: ");
        int val = input.nextInt();
        int count = 0;
        System.out.println("Result(s):");
        for (int i = 0; i < data.length; i++)
            if (data[i] == val) {
                System.out.println("Index of " + val + " is: " + (i + 1));
                count++;
            }
        if (count == 0)
            System.out.println("This number is not available!");
    }

    public void sort() {
        if (data.length == 0)
            System.out.print("Data: []\n");
        else {
            int[] oldData = new int[data.length];
            System.arraycopy(data, 0, oldData, 0, data.length);
            int temp;
            for (int i = 0; i < data.length - 1; i++)
                for (int j = (i + 1); j < data.length; j++)
                    if (data[i] > data[j]) {
                        temp = data[i];
                        data[i] = data[j];
                        data[j] = temp;
                    }
            System.out.print("Sort data: [");
            for (int i = 0; i < data.length - 1; i++)
                System.out.print(data[i] + ", ");
            System.out.print(data[data.length - 1] + "]\n");
            data = oldData;
        }
    }

    public void print() {
        if (data.length == 0)
            System.out.print("Data: []\n");
        else {
            System.out.print("Data: [");
            for (int i = 0; i < data.length - 1; i++)
                System.out.print(data[i] + ", ");
            System.out.print(data[data.length - 1] + "]\n");
        }
    }
}
