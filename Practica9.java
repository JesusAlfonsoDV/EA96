import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {
    // Write your code here
   /* List<List<Integer>>sumas = new ArrayList<>();
int n = 4;
int sumas;
/*for(int i ; i<n;i++){
    sumas.add(newArrayList());
    for(int j ; j<n;j++){
        sumas.get(j).add(0);
    }
} Esto solo se utilizo como ejemplo, para explicar en clase */

int maxSum=0; //se inicia dandole valor a la variable que tomara el valor de la suma maxima

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {//se añaden dos for para recorrer las posiciones de cada reloj de arena
                int suma = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2)
                        + arr.get(i + 1).get(j + 1)
                        + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);

                if (suma > maxSum) {//utilize un if para determinar cual de los dos es mayor y asignarlo a una variable
                    maxSum = suma;
                }
            }
        }

        return maxSum;
    }
}
/*Esto lo quite para simplificar mas el codigo y hacer toda la operacion en una sola funcion
int maxSum = 0;
for(int i = 0;i<n;i++){
    for(int j = 0; j < n; j++){
        if(sumas.get(i).get(j)>
        maxSum){
            maxSum = sumas.get(i)
            .get(j);
        }
    }
}
return maxSum;
    }
}*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
