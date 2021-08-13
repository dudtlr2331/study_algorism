package prog.lv1.e42840;

public class Solution {
    // 1 2 3 4 5 1 2 3 4 5
    // 2 1 2 3 2 4 2 5
    // 3 3 1 1 2 2 4 4 5 5
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] cnt = {0,0,0};

        int max = 0;
        int maxcount=0;

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
        for(int i =0;i<cnt.length;i++){
            if(max < cnt[i]){
                max = cnt[i];
            }
            if(max == cnt[i]){
               // answer
            }
        }
        answer = new int[maxcount];
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] answers = {1,2,3,4,5};

        System.out.println(s.solution(answers));
    }
}

