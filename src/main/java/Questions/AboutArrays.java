package Questions;



class Questions {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i = 0; i < myArray.length; i++)
            if (i == myArray[i])
                sum += myArray[i];
            else
                System.out.println(i);

        System.out.println("Sum: " + sum);
    }
}