package D0129.ArrayMember;

public class MemberTest {
    public static void main(String[] args) {
        Member member = new Member(12345);
        Member member1 = new Member(456789);
        Member member2 = new Member(789456);
        MemberArraylist memberArraylist = new MemberArraylist();
        memberArraylist.addMember(member);
        memberArraylist.addMember(member1);
        memberArraylist.addMember(member2);

        memberArraylist.showInfo();
        memberArraylist.removeMember(member.getId());
        System.out.println("*******삭제*******");
        memberArraylist.showInfo();

    }
}
