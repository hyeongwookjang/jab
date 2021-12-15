package com.maks.jab.object;

class Calculator {
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
// 여기까지가 하나의 독립된 객체 '프로그램' 이라 여겨보자
    public static class CalculatorDemo4 {

        public static void main(String[] args) {

            Calculator c1 = new Calculator();
            c1.setOprands(10, 20);
            c1.sum();
            c1.avg();

            Calculator c2 = new Calculator();
            c2.setOprands(20, 40);
            c2.sum();
            c2.avg();
        }

    }
}
