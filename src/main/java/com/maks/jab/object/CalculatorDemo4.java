package com.maks.jab.object;

class Calculator {
    int left, right;
    public void setOprands(int left, int right) {
        this.left = left;
//        여기서 우항의 left와 right는 객체 선언 시의 left, right 매개변수를 의미한다.
//        만약 this.left 라고 했다면, 클래스 선언시 가르킨 left를 의미한다.
        this.right = right;

    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
/* 여기까지가 하나의 독립된 객체 '프로그램' 이라 여겨보자.
변수와 메소드로 이루어진 객체는. 이 모든 서비스 안에 코딩된 하나의 프로그램이다.
아래서 setOprands(a,b)는 위의 파라미터안에 a,b에 해당하는 숫자를 넣어 객체를 연산한다.
 */
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
/*
총평. 클래스는 설계도다. new 대입연산자로 c1, c2를 배치해서 2개의 개체를 만들었다.
이러한 객체는 'Calculator'라는 클래스==데이터타입 선언과 함께 만들어지는 '인스턴스'이다. 인스턴스는 calculator라는 클래스라는 설계도에 따라 만든 제품이다.
동일한 클래스를 통해서 만들어진 제품이기 때문에, 작동방식은 같지만, 서로 상태가 다르다.
변수와 같은 상태와 메소드라는 행위로 만들어지는 객체. 이러한 객체들로 기능하는 프로그래밍을 객체 지향 프로그래밍이라고 한다.
 */