package main.java.lecture11;
//�������� ���������, � ������� �������� ����� �������� � �������.
// � ���������� ������ ���� ���������� - ����������, ��������� �� �������, �������.
//        ��������� ������ ���� ���������� (generic).
//        ������ ������� ���������� ������ 10; ��� �������� ������� ��������� ��� � 2 ����,
// � ��������� ��� ���������� �� ������� ������� � �����.
//        �������� ����� ��� �������� �������� �� ������� � ������� ���� ����������� ��������.
public class Main {
    public static Container arr = new Container();
    public static void main(String[] args) {
        arr.add(1);
        arr.add(1.2);
        arr.add("asdasd");
        arr.add("asdasd");
        arr.add("asdasd");
        arr.add("asdasd");
        arr.add("asdasd");
        arr.add("asdasd");
        arr.add(new Object());
        Object user = (Object) arr.get(3);
        for (int i = 0; i < 10; i++) {
            System.out.println(i +" "+ arr.get(i));
        }
        arr.del();
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.println(i +" "+ arr.get(i));
        }
    }
}
