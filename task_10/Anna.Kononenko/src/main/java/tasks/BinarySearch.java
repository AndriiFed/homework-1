package com.hillel.tasks;

/**
 5.�������� ������� ���������� ����� � �������,
 �������� �������� ����������� �� �����������.
 ���� ����� ���� � ������� ������� ������ ���������� true, ����� - false */

public class BinarySearch {

  public boolean exists(int[] array, int number) {

    for (int i = 0; i < array.length; i++) {
      if (array[i] == number) {
        return true;
      }
    }
    return false;
  }
}

