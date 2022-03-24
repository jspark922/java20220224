package chap13.lecture.p01generic;

public class App01 {
	public static void main(String[] args) {
		Contatiner1 con1 =new Contatiner1();
		con1.setContent("java");
		String str1 = con1.getContent();
	}
}

class Contatiner1 {
	private String content;
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
}
