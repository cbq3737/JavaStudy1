package ch07;

public class Powder extends Material {
	public String toString() {
		return "재료는 Powder입니다";
	}

	@Override
	public void doPrint() {
		System.out.println("Powder do print");
	}
}
