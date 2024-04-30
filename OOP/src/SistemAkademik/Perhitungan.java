package SistemAkademik;

public class Perhitungan {
    int[] data;

    public Perhitungan(int[] data) {
        this.data = data;
    }
    public double menghitungMean() {
        double mean = 0.0;
        double jumlah = 0.0;

        for (int i = 0; i < data.length; i++) {
            jumlah += data[i];
        }
        mean = jumlah / data.length;
        return mean;
    }

    public int Max() {
        int max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > max)
                max = data[i];
        }
        return max;
    }

    public int Min() {
        int min = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] < min)
                min = data[i];
        }
        return min;
    }

    public int Range() {
        return Max() - Min();
    }

    public double menghitungMedian() {
        double median = 0.0;

        BubbleSort sort = new BubbleSort();
        sort.Sort(data);

        if(data.length %2==0){
            int data1 = data.length / 2;
            double a = data[data1-1];
            double b = data[data1];
            median = (a+b) / 2;
        }else {
            int data1 = data.length /2;
            double a = data[data1];
            median = a;
        }
        return median;
    }

    public int menghitungModus(){
        int [] frekuensi = new int [data.length];
        int modus = 0;

        for(int i = 0;i < data.length;i++){
            frekuensi[i] = 0;
        }
        for (int i = 0;i < data.length;i++){
            for (int j = 0;i < data.length;j++){
                if (data[j] == data [i]){
                    frekuensi[i] += 1;
                }
            }
        }
        int max = frekuensi[0];
        for (int i = 0; i < data.length;i++){
            if (frekuensi[i] > max){
                max = frekuensi[i];
            }
        }
        int posisi = 0;
        for (int i = 0;i < data.length;i++ ){
            if (frekuensi[i] == max){
                posisi = i;
                break;
            }
        }
        return modus = data[posisi];
    }
    public void cetak() {
        System.out.print("Data = ");

        System.out.println();
        System.out.println("Mean = "+menghitungMean());
        System.out.println("Max = "+Max());
        System.out.println("Min = "+Min());
        System.out.println("Range = "+Range());

        System.out.print("Data Terurut = ");

        System.out.println();
        System.out.println("Median = "+menghitungMedian());
        System.out.println("Modus = "+menghitungModus());
    }

}
