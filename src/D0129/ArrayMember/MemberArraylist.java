package D0129.ArrayMember;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArraylist {
    private ArrayList<Member> memberArrayList;

    public MemberArraylist() {
        memberArrayList = new ArrayList<>();
    }

    public MemberArraylist(int size) {
        memberArrayList = new ArrayList<>(size);
    }

    public void addMember(Member member) {
        memberArrayList.add(member);
    }

    public boolean removeMember(int memberId) {
        Iterator<Member> ir = memberArrayList.iterator();
        while (ir.hasNext()) {
            Member member = ir.next();
            int tempId = member.getId();
            if (tempId == memberId) {
                memberArrayList.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showInfo(){
        Iterator<Member> ir = memberArrayList.iterator();
        while (ir.hasNext()){
            System.out.println("멤버 아이디: "+ir.next().getId());
        }
    }
}
