import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1;
        int start_index = 1;
        int end_index = 1;
        int sum = 1;

        while(end_index != N){ // end_index 가 N까지 갈 때
            if(sum < N){
                end_index++;
                sum += end_index;
            }
            else if(sum > N){
                sum -= start_index;
                start_index++;
            }
            else if(sum == N){
                count++;
                end_index++;
                sum += end_index;
            }
        }
        System.out.println(count);
    }
}
