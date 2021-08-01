package prog.lv1.e42748;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int[] result = copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(result);
            answer[i] = result[commands[i][2] - 1];
        }
        return answer;
    }

    //카피 어레이.
    public int[] copyOfRange(int[] arr, int srt, int end) {
        int size = end - srt;
        int[] result = new int[size];
        for (int i = srt, idx = 0; idx < size; i++, idx++) {
            result[idx] = arr[i];
        }
        return result;
    }
}

