package Test8;

import java.util.*;

//10_9
public class Item {

	String name;
	int price, count;
	int volume; // 용량

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

		// NULL Pointer Exception 예방법
		for (int i = 0; i < items.length; i++) { // NPE (Null Pointer Exception
													// 방지 위한 초기화 작업
			items[i] = new Item();
		}

		int sum = 0;
		int Count_Volume = 0;
		String choose;

		while (Count_Volume != 5) { // 장바구니 공간 5

			for (int i = 0; i < items.length; i++) { // 배열의 크기만큼 반복

				System.out.print("구매하는 상품의 이름을 입력하세요:");
				items[i].name = stdin.next();

				System.out.print("구매하는 상품의 가격을 입력하세요:");
				items[i].price = stdin.nextInt();

				System.out.print("구매하는 상품의 수량을 입력하세요:");
				items[i].count = stdin.nextInt();

				sum += items[i].price; // 총 구매금액 계산
				Count_Volume += items[i].count; // 볼륨이 5이기 때문에 5까지 차면 브레이크 해야함

				if (Count_Volume > items.length) {

					System.out.println("장바구니가 다 찼습니다. 장바구니에 담을 수 없습니다.");
					items[i].name = "";
					items[i].price = 0;
					Count_Volume -= items[i].count;
					sum -= items[i].price;

				}

				// 장바구니 공간을 넘었을 경우를 보여줌

				else {
					System.out.println();
					System.out.println("장바구니");
					System.out.println();
					System.out.println("상품						가격			수량			총액");

					for (int j = 0; j <= i; j++) {
						if (!items[j].name.equals("")) {

							System.out.println(items[j].name + " 					 	" + items[j].price
									+ "		 	" + items[j].count + "		        " + items[j].price);
						}
					}
					System.out.println();
					System.out.println("총 구매금액:" + sum);

					System.out.print("쇼핑을 계속하시겠습니까<예 혹은 아니오>:");
					choose = stdin.next();

					if (choose.equals("아니오")) { // 아니오를 입력해야 끝남
						System.out.println();
						System.out.println();
						System.out.println("결제하세요");
						System.out.println("총 결제액:" + sum);
						Count_Volume = 5;
						break;
					}
				}
				// 공간을 넘지 않았을 경우
			}
			// 입력이 다 끝나고 for 문의 반복
		}
		// while 문의 끝
	}
	// main 의 끝
}
// class 의 끝
