

public class teste {
    
    static int[] returnNumeros;
    public static void main(String[] args) {
        int[] numeros = {847, 126, 394, 10, 578, 999, 482, 283, 134, 716, 405, 671, 202, 311, 869, 43, 602, 221, 771, 318, 945, 330, 659, 597, 762, 282, 429, 732, 161, 500, 366, 91, 896, 49, 679, 203, 24, 300, 585, 71, 651, 749, 553, 214, 978, 803, 367, 178, 719, 311, 93, 411, 447, 116, 630, 144, 354, 257, 886, 271, 99, 826, 496, 939, 383, 512, 217, 138, 182, 753, 607, 372, 808, 45, 291, 624, 323, 107, 445, 356, 998, 299, 772, 748, 890, 401, 239, 462, 40, 851, 61, 366, 144, 902, 677, 293, 515, 679, 208, 380};
        
        System.out.println("Numeros nao organizados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + ", ");
        }
        numeros=StartQuickSort(numeros,0,numeros.length-1);
        System.out.println("\nNumeros organizados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + ", ");
        }
    }    

    public static int[] StartQuickSort(int[] carros,int left, int right){
        returnNumeros= carros;

        QuickSort(left, right);
        return returnNumeros;
    }

    private static void QuickSort(int left, int right){
        int pi; 
        if (left<right) {
            pi = partition(left, right);
            QuickSort(left, pi-1);
            QuickSort(pi+1, right);
        }

        

 
    }

    private static int partition(int left, int right){
        int pivot = returnNumeros[right], i;

        i= left-1;

        int temp;

        for (int j = left; j < right; j++) {
            if (returnNumeros[j]>=pivot) {
                i++;

                temp= returnNumeros[j];
                returnNumeros[j]=returnNumeros[i];
                returnNumeros[i]=temp;
            }
        }

        temp= returnNumeros[right];
        returnNumeros[right]= returnNumeros[i+1];
        returnNumeros[i+1]= temp;

        return i+1;
    }

    
    
}

