package D0129.HashMember;

public class MemberTest {
    public static void main(String[] args) {
        Member member = new Member(1234,"첫째");
        Member member1 = new Member(4567,"둘째");
        Member member2 = new Member(8910,"셋째");
        Member member3 = new Member(111213,"넷째");

        MemberHashSet memberHashSet = new MemberHashSet();
        memberHashSet.addMember(member);
        memberHashSet.addMember(member1);
        memberHashSet.addMember(member2);
        memberHashSet.addMember(member3);

        memberHashSet.showInfo();

    }
}
