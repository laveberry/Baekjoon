import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, HashSet<String>> map = new HashMap<>();
        Map<String, Integer> idxMap = new HashMap<>();
 
        for (int i = 0; i < id_list.length; i++) {
            String name = id_list[i];
            map.put(name, new HashSet<>());
            idxMap.put(name, i);//index 순서 담아주기
        }
 
        for (String s : report) {
            String[] str = s.split(" ");
            String from = str[0];//신고한사람
            String to = str[1];//신고당한사람
            map.get(to).add(from);//신고한사람을 set에 담아주기
        }
 
        for (int i = 0; i < id_list.length; i++) {
            HashSet<String> send = map.get(id_list[i]);
            if (send.size() >= k) {//신고한사람수가 k 초과하면
                for (String name : send) {//신고한사람 index찾아서 ++해주기
                    answer[idxMap.get(name)]++;
                }
            }
        }
        return answer;
    }
}