public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3};
        int[] array2 = {4,5,6};

        for(int i = 0; i<array1.length; i++){
            //Multipilikation der Arrays und Ausgabe
            int multiplikation = array1[i]*array2[i];
            System.out.println("Multiplikation von Arrayposition " + i + " = " + multiplikation);
            //Addition der Arrays und Ausgabe
            int addition = array1[i]+array2[i];
            System.out.println("Addition von Arrayposition " + i + " = " + addition);
        }
    }
}
