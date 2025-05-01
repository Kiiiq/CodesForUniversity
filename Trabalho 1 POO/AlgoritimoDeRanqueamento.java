public class AlgoritimoDeRanqueamento {

    private Carro[] returnCarros;

    public Carro[] startQuickSort(Carro[] carros,int left, int right){
        returnCarros= carros;

        quickSort(left, right);
        return returnCarros;
    }

    private void quickSort(int left, int right){
        int pi; 
        if (left<right) {
            pi = partition(left, right);
            quickSort(left, pi-1);
            quickSort(pi+1, right);
        }
    }

    private int partition(int left, int right){
        int pivot = returnCarros[right].getPosicao(), i;

        i= left-1;

        Carro temp;

        for (int j = left; j < right; j++) {
            if (returnCarros[j].getPosicao()>=pivot) {
                i++;

                temp= returnCarros[j];
                returnCarros[j]=returnCarros[i];
                returnCarros[i]=temp;
            }
        }

        temp= returnCarros[right];
        returnCarros[right]= returnCarros[i+1];
        returnCarros[i+1]= temp;

        return i+1;
    }

    
    
}
