package D0129.HashMember;

import java.util.Objects;

public class Member {
    private int id;
    private String name;

    public Member(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    // hashset에서 중복 체크를 위해서 equals와 hashcode
    @Override
    public boolean equals(Object o) {
        if(o instanceof Member){
            Member member = (Member) o;
            if(this.id == member.id) return true;
            else return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
