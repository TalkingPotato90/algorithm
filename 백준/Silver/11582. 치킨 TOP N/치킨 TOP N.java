import java.io.*;

public class Main {
    private static int[] arr;
    private static int person;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int chicken = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        arr = new int[chicken];

        for (int i = 0; i < chicken; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        person = Integer.parseInt(br.readLine());

        mergeSort(0, chicken - 1);
        
        for (int i = 0; i < chicken; i++) {
            bw.write(arr[i] + " ");
        }

        bw.flush();
        bw.close();
    }

    public static void mergeSort(int startIdx, int endIdx){
        if (startIdx < endIdx) {
            int midIdx = (startIdx + endIdx) / 2;
            mergeSort(startIdx, midIdx);
            mergeSort(midIdx + 1, endIdx);
            merge(startIdx, midIdx, endIdx);
        }
    }

    public static void merge(int startIdx, int midIdx, int endIdx) {
        int[] temp = new int[endIdx - startIdx + 1];

        if(temp.length > arr.length / person){
            return;
        }

        int i = startIdx;
        int j = midIdx + 1;
        int k = 0;

        while (i <= midIdx && j <= endIdx) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= midIdx) {
            temp[k++] = arr[i++];
        }

        while (j <= endIdx) {
            temp[k++] = arr[j++];
        }

        for (int index = startIdx; index <= endIdx; index++) {
            arr[index] = temp[index - startIdx];
        }
    }
}