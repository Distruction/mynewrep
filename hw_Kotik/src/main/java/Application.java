

import src.main.java.module.Kotik;

@SuppressWarnings("all")
public class Application {
    public static void main(String[] args) {
        Kotik kotik1 = new Kotik(11, "Alexey", 2, "Maow");
        Kotik kotik2 = new Kotik();
        setKotik(kotik2, 10, "Boris", 3, "Meow");
        kotik1.liveAnotherDay();
        System.out.println();
        System.out.println("������ ����� " + kotik1.getName() + " � ����� ��� �������� " + kotik1.getWeight() + " ��");
        System.out.print("���� �������� ");
        System.out.println(kotik1.getMeow().equals(kotik2.getMeow()) ? "���������" : "��-�������");
        System.out.println("����� ������� " + Kotik.getCountCat());
    }

    public static void setKotik(Kotik kotik, int prettiness, String name, int weight, String meow) {
        kotik.setName(name);
        kotik.setPrettiness(prettiness);
        kotik.setWeight(weight);
        kotik.setMeow(meow);


    }
}
