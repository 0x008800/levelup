package main.java.lecture10;
/*������� �����, ������� ����� ������� ������� ��� ���������� ��� ����� ���������.
 ��� �������� ������������ ������������ � ����������� ���� ������.
 ������ ������������� ����������� �������� ������� �������� ���������� ����� ��������� ��������.
  */
public class Main {
    private static int count;

    public static void main(String[] args) {
        Main main = new Main();
        Main main1 = new Main();
//        Main main2 = new Main();
        System.out.println(count);
    }

    public Main() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Main.count = count;
    }
}
