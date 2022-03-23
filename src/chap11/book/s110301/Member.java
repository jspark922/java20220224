package chap11.book.s110301;

public class Member {
	public String id;

	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		Member member = (Member) obj;
		if(id.equals(member.id)) {
			return true;
		}
		return false;
	}
}
