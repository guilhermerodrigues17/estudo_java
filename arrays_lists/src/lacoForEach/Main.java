package lacoForEach;

public class Main {
    public static void main(String[] args) {

        //Declaro um array contendo três posições com os seguintes valores
        String[] arr = new String[] {"A", "B", "C"};

        //Laço convencional para percorrer o array
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("__________________________");

        //Laço forEach para percorrer o mesmo array
        for (String obj : arr) {
            System.out.println(obj);
        }
    }
}
