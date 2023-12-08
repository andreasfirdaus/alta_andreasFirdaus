import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("##  Program Java Cari Nilai Rata-rata  ##");
        int[] arr = new int[100];

        float total, rata2;

        System.out.print("Input jumlah element array: ");
        int arr_count = input.nextInt();

        System.out.println("Input "+arr_count+" angka (dipisah dengan enter):");

        // simpan setiap angka yang diinput ke dalam array
        for(int i = 0; i < arr_count; i++){ //0<4
            arr[i] = input.nextInt(); //0 //1 //2 //3 //4 //5 //6 //100
            System.out.println("isi "+ arr[i]);
        }

        System.out.println();

        // cari total semua element array
        total = 0;
        for(int i = 0; i < arr_count; i++){  // 0<4
            total = total+arr[i];  //0+
//            System.out.println(total);
        }

        // hitung nilai rata-rata
        rata2 = (total/arr_count);
        System.out.println("Nilai rata-rata dari "+ arr_count +
                " inputan adalah: "+ rata2);

    }

//    private static float Mean(float[]numbers)
//    {
//
//    }
}