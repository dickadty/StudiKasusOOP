package SistemAkademik;

public class BubbleSort {
    public int[] Sort(int [] data){
        int [] urut = new int [data.length];
        for (int i = 0; i < data.length;i++){
            for (int j = 0; j < data.length;j++){
                if (data[j] > data[j+1]){
                    int dummy = data[j];
                    data[j] = data[j+1];
                    data[j+1] = dummy;
                }
            }
        }
        return urut;
    }
}
