package car;

import java.util.Scanner;

public class Sys {
	Moto[] motos;

	public void rentMoto() {
		String[] carType = { "����", "����", "�µ�" };
		int[] busType = { 10, 32 };
		Scanner input = new Scanner(System.in);
		System.out.println("welcome");
		System.out.println("day");
		int day = input.nextInt();
		System.out.println("count?");
		int count = input.nextInt();
		motos = new Moto[count];
		for (int i = 0; i < motos.length; i++) {
			System.out.println("��ѡ���" + (i + 1) + "����");
			System.out.println("1��car or 2��bus");
			int sel = input.nextInt();
			if (sel == 1) {
				System.out.println("type 1��bmw 2��audi 3��benc");
				sel = input.nextInt();
				motos[i] = new Car("³ B88888", carType[sel - 1]);
				// moto.setType(carType[sel - 1]);
				// �������
				// double totalFee = moto.rentFee(day);
				// ������
				// System.out.println("**car , * day , totalfee ***" +
				// totalFee);
			} else {
				System.out.println("seatCount 1�� < 16 2�� > 16");
				sel = input.nextInt();
				motos[i] = new Bus("³ A88888", busType[sel - 1]);
				// moto.setSeatCount(busType[sel - 1]);
				// �������
				// double totalFee = moto.rentFee(day);
				// ������
				// System.out.println("**car , * day , totalfee ***" +
				// totalFee);
			}
		}
		calcFee(day);

	}

	public void calcFee(int day) {
		double totalFee = 0;
		for (int i = 0; i < motos.length; i++) {
			// �������
			double fee = motos[i].rentFee(day);
			totalFee += fee;
			if (motos[i] instanceof Car)
				System.out.println("car, * day , totalfee ***" + fee);
			else
				System.out.println("bus, * day , totalfee ***" + fee);

		}
		System.out.println("totalFee  =  " + totalFee);
	}

	public static void main(String[] args) {
		new Sys().rentMoto();
	}
}