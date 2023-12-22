class Solution {
    static class Pair {
        int start, finish, index;
        Pair(int start, int finish, int index) {
            this.start = start;
            this.finish = finish;
            this.index = index;
        }
    }
    
    public static ArrayList<Integer> maxMeetings(int N, int[] S, int[] F) {
        // code here
        ArrayList<Pair> meetings = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < N; i++) meetings.add(new Pair(S[i], F[i], i+1));
        Collections.sort(meetings, (a, b) -> {
            return a.start - b.start;
        });
        int preFinish = 0;
        for(Pair meeting: meetings) {
            if(meeting.start > preFinish) {
                ans.add(meeting.index);
                preFinish = meeting.finish;
            }else if(preFinish > meeting.finish) {
                ans.set((ans.size() - 1), meeting.index);
                preFinish = meeting.finish;
            }
        }
        Collections.sort(ans);
        return ans;
    }
}

