package ch14;

import java.util.Comparator;

public class Member implements Comparable<Member>{
	private int memberId;
	private String memberName;
	
	public Member() {
		
	}
	
	public Member(int memberId,String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public int hashCode() {	
		return memberId;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(this.memberId == member.memberId) {
				return true;
			}
			else {
				return false;
			}
		}
		
		return super.equals(obj);
	}
	@Override
	public String toString() {
		return memberName+" 회원님의 아이디는"+memberId+" 입니다.";
	}
	@Override
	public int compareTo(Member m) {
		if(this.memberId > m.memberId) {
			return 1;
		}
		else if(this.memberId < m.memberId) {
			return -1;
		}
		else {
			return 0;
		}
	}
//	@Override
//	public int compare(Member m1, Member m2) {
//		if(m1.memberId > m2.memberId) {
//			return 1;
//		}
//		else if(m1.memberId < m2.memberId) {
//			return -1;
//		}
//		else {
//			return 0;
//		}
//	}
	
}
