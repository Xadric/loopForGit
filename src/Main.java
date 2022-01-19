import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    new Main().run();
    }

    private void run() {
       int[] mass = createMass(10);
       printArray(mass);

       int max = mass[0];
       for (int i = 1; i < mass.length; i++) {
           if (mass[i]>max){
               max=mass[i];
           }
        }

        int i=1;
        /*
        while (i<mass.length){
            if (mass[i]>max){
                max=mass[i];
            }
            i++;
        }
*/
        /*
        do{
            if (mass[i]>max){
                max=mass[i];
            }
            i++;
        }while (i<mass.length);*/


        System.out.println(' ');
        System.out.println("max "+max);
    }

    private void printArray(int[] m) {
//        for (int i = 0; i < m.length; i++) {
//            System.out.print(m[i]+" ");
//        }
        System.out.println(Arrays.toString(m));
    }

    private int[] createMass(int n) {
        int[] ints = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
          ints[i]=random.nextInt(1000);
        }

        return ints;
    }
}
