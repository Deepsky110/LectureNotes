package test;

class Target {

	public Target() {
		System.out.println("객체 생성됨");
	}

	void func() {
		System.out.println("Target func...");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// Target target = new Target();
		// target.func();

		String info = "com.test.Target"; // 이 정보만 가지고 func 실행시키기
		try {
			Class clazz = Class.forName (info);
			Target result = (Target) clazz.newInstance();
			result.func();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
