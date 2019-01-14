package Test8;

import java.util.*;

//10_9
public class Item {

	String name;
	int price, count;
	int volume; // �뷮

	public Item() {
	}

	public Item(String name, int price, int count, int volume) {
		this.name = name;
		this.price = price;
		this.count = count;
		this.volume = volume;
	}
	// public Item(String name, int price ,int count) {
	// this.name = name;
	// this.price = price;
	// this.count = 0;
	// this.volume = 5;
	// }

	void addToCart(Item item) {
		item.count++;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdin = new Scanner(System.in);

		Item items[] = new Item[5];

		// NULL Pointer Exception �����
		for (int i = 0; i < items.length; i++) { // NPE (Null Pointer Exception
													// ���� ���� �ʱ�ȭ �۾�
			items[i] = new Item();
		}

		int sum = 0;
		int Count_Volume = 0;
		String choose;

		while (Count_Volume != 5) { // ��ٱ��� ���� 5

			for (int i = 0; i < items.length; i++) { // �迭�� ũ�⸸ŭ �ݺ�

				System.out.print("�����ϴ� ��ǰ�� �̸��� �Է��ϼ���:");
				items[i].name = stdin.next();

				System.out.print("�����ϴ� ��ǰ�� ������ �Է��ϼ���:");
				items[i].price = stdin.nextInt();

				System.out.print("�����ϴ� ��ǰ�� ������ �Է��ϼ���:");
				items[i].count = stdin.nextInt();

				sum += items[i].price; // �� ���űݾ� ���
				Count_Volume += items[i].count; // ������ 5�̱� ������ 5���� ���� �극��ũ �ؾ���

				if (Count_Volume > items.length) {

					System.out.println("��ٱ��ϰ� �� á���ϴ�. ��ٱ��Ͽ� ���� �� �����ϴ�.");
					items[i].name = "";
					items[i].price = 0;
					Count_Volume -= items[i].count;
					sum -= items[i].price;

				}

				// ��ٱ��� ������ �Ѿ��� ��츦 ������

				else {
					System.out.println();
					System.out.println("��ٱ���");
					System.out.println();
					System.out.println("��ǰ						����			����			�Ѿ�");

					for (int j = 0; j <= i; j++) {
						if (!items[j].name.equals("")) {

							System.out.println(items[j].name + " 					 	" + items[j].price
									+ "		 	" + items[j].count + "		        " + items[j].price);
						}
					}
					System.out.println();
					System.out.println("�� ���űݾ�:" + sum);

					System.out.print("������ ����Ͻðڽ��ϱ�<�� Ȥ�� �ƴϿ�>:");
					choose = stdin.next();

					if (choose.equals("�ƴϿ�")) { // �ƴϿ��� �Է��ؾ� ����
						System.out.println();
						System.out.println();
						System.out.println("�����ϼ���");
						System.out.println("�� ������:" + sum);
						Count_Volume = 5;
						break;
					}
				}
				// ������ ���� �ʾ��� ���
			}
			// �Է��� �� ������ for ���� �ݺ�
		}
		// while ���� ��
	}
	// main �� ��
}
// class �� ��
