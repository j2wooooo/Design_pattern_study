/* [p.43] 26��, ���� Ŭ���� ���̾�׷��� �ڵ�� �ۼ��϶�. */

package java_design_pattern;

// Person Ŭ����
public class Person {
	// -phones �̹Ƿ� ���ü��� private
	private Phone[] phones;
	
	// 2
	// constructor
	// class Phone���� �迭�� �����. �迭�� size = 2
	public Person() {
		phones = new Phone[2];
	}
	
	// ���� �ΰ��� Ŭ������ �����Ͽ� �ش��ϴ� ��ȭ��ȣ�� ����Ѵ�.
	public Phone getPhone(int i) {
		if(i==0 || i == 1)
			return phones[i]; // i = 0�̸� �� ��ȭ, i = 1�̸� �繫�� ��ȭ
		
		return null;
	}
}

/* �� �ڵ�� �� ��ȭ�� �繫�� ��ȭ�� �迭�� �ε����� ���� �����ؾ� �ϹǷ� �ſ� �����ϴ�.
�̷� ���� ��ȭ���� ������ �����ؼ� ����ϸ� �ذ��� �� �ִ�.*/
