package prog.lv1.e42840;

public class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] cnt = {0,0,0};
        int max = -1;
        int maxCnt = 0;

        for (int i = 0; i < answers.length; i++) {
            if ( answers[i] == a[i%5]) {
                cnt[0]++;
            }
            if ( answers[i] == b[i%8]) {
                cnt[1]++;
            }
            if ( answers[i] == c[i%10]) {
                cnt[2]++;
            }
        }

        for(int i = 0; i < cnt.length; i++) {
            if(cnt[i] > max) {
                max = cnt[i];
            }
        }

        for(int i =0; i < cnt.length; i++) {
            if(cnt[i] == max) {
                maxCnt++;
            }
        }
        answer = new int[maxCnt];

        for(int i = 0; i < cnt.length; i++) {
            if(cnt[i] == max) {
                answer[i] = i+1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] answers = {
                { 1, 2, 3, 4, 5 },
                { 1, 3, 2, 4, 2 },
                {2, 3, 5, 5, 3}
        };
        int[][] result = {
                { 1 },
                { 1, 2, 3 },
                {2, 3}
        };

        for(int i=0; i<answers.length; i++) {
            int[] r = s.solution(answers[i]);
            boolean isOk = true;
            for(int j=0; j<result[i].length; j++) {
                if(result[i].length != r.length) {
                    isOk = false;
                    break;
                }
                if(result[i][j] != r[j]) {
                    isOk = false;
                    break;
                }
            }
            if(isOk) {
                System.out.println((i+1) + ".정답입니다.");
            }else {
                System.out.println((i+1) + ".오답입니다.");
            }
        }
    }


    public int[] bubbleSort(int[] arrTarget) {
        int temp = 0;
        for(int i=0; i < arrTarget.length; i++) {
            for(int j=0; j < arrTarget.length-1; j++) {
                if(arrTarget[j] > arrTarget[j+1]) {
                    temp = arrTarget[j];
                    arrTarget[j] = arrTarget[j+1];
                    arrTarget[j+1] = temp;
                }
            }
        }
        return arrTarget;
    }
}