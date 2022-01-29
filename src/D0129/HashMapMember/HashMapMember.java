package D0129.HashMapMember;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapMember {
   private HashMap<Integer, Member> hashMap;

   public HashMapMember(){
       hashMap = new HashMap<>();
   }

   public void addMember(Member member){
       hashMap.put(member.getId(), member);
   }

   public boolean removeMember(int id){
       if(hashMap.containsKey(id)){
           hashMap.remove(id);
           return true;
       }
       System.out.println("해당 id는 존재하지 않습니다.");
       return false;
   }

   public void showAllMember(){
       Iterator<Integer> ir = hashMap.keySet().iterator(); // 키값이 set으로 나옴

       while (ir.hasNext()){
           int key = ir.next();
           Member member = hashMap.get(key);
           System.out.println(member);
       }
   }

}
