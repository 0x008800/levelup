package main.java.lecture10;
/*������� �����, ������� ����� ������� ������� ��� ���������� ��� ����� ���������.
 ��� �������� ������������ ������������ � ����������� ���� ������.
 ������ ������������� ����������� �������� ������� �������� ���������� ����� ��������� ��������.
  */
public class Main {
    private static int count;

    public static void main(String[] args) {
       new Main();
       new Main();
       new Main();
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
