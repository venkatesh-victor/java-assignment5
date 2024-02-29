import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Weight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<int[]> weightList = new ArrayList<>();

        int[] emp1 = {56, 58, 65, 67, 60};
        int[] emp2 = {49, 55, 65, 67};
        int[] emp3 = {49, 52, 55, 59};
        int[] emp4 = {77, 69, 79};

        weightList.add(emp1);
        weightList.add(emp2);
        weightList.add(emp3);

        while(true)
        {
            System.out.println(weightList.size() + " emplyoees have their weights registered.");
            System.out.println("To get the minimum weight of an emplyoee enter 1.");
            System.out.println("To enter weights of a new emplyoee enter 2.");
            System.out.println("To exit the program enter 0");

            int choice = sc.nextInt();

            switch(choice)
            {
                case 1: 
                    System.out.println("Enter employee id: ");
                    int id = sc.nextInt();
                    System.out.println("The mininum weight of the employye " + id + " is " + minWeight(weightList, id));
                    break;

                case 2:
                    addEmpWeightList(weightList);
                    break;

                case 0:
                    System.exit(0);

                default:
                    System.out.println("Invalid input");
                    System.exit(0);
            }

            System.out.println();
        }
    } 

    public static int minWeight(ArrayList<int[]> list, int id)
    {
        int[] weight = list.get(--id);

        int min = weight[0];
        for(int i = 0; i < weight.length; i++)
        {
            if(weight[i] < min)
                min = weight[i];
        }

        return min;
    }

    public static void addEmpWeightList(ArrayList<int[]> weightList)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of entries for this employee: ");
        int n = sc.nextInt();

        int[] empWeights = new int[n];

        System.out.println("Enter the weights one by one: ");
        for(int i = 0; i < n; i++) 
        {
            empWeights[i] = sc.nextInt();
        }

        weightList.add(empWeights);

        System.out.println("The weight list added in id " + weightList.size());
    }
}
