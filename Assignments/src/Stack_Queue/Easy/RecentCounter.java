package Stack_Queue.Easy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {

//    LeetCode: 933. Number of Recent Calls
    Deque<Integer> Q;
    public RecentCounter() {
        Q = new LinkedList<>();
    }

    public int ping(int t) {
        Q.offer(t);

        while(Q.peek() < t-3000){
            Q.poll();
        }
        return Q.size();
    }
}
