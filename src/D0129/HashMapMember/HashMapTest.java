package D0129.HashMapMember;

public class HashMapTest {
    public static void main(String[] args) {
        Member member = new Member(1234,"첫째");
        Member member1 = new Member(3456,"둘째");
        Member member2 = new Member(5678,"셋째");
        Member member3 = new Member(4567,"넷째");

        HashMapMember hashMapMember = new HashMapMember();
        hashMapMember.addMember(member);
        hashMapMember.addMember(member1);
        hashMapMember.addMember(member2);
        hashMapMember.addMember(member3);

        hashMapMember.showAllMember();
        hashMapMember.removeMember(member.getId());
        System.out.println("삭제");
        hashMapMember.showAllMember();

    }
}
