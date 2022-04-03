package com.xhs.chanOfResponsibility;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/4/2 9:59
 * @since
 */
public class Main {
    public static void main(String[] args) {
        Support alice = new NoSupport("Alice");
        Support bob = new LimitSupport("Bob", 100);
        Support charlie = new SpecialSupport("Charlie", 429);
        Support diana = new LimitSupport("Diana", 200);
        Support elmo = new OddSupport("Elmo");
        Support fred = new LimitSupport("Fred", 300);

        // 形成职责链
        alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);

        for (int i=0;i<500;i+=33) {
            alice.support(new Trouble(i));
        }

        System.out.println(" =========================== ");

        for (int i=0;i<500;i+=33) {
            alice.support2(new Trouble(i));
        }

        System.out.println(" =========================== ");
        for (int i=0;i<500;i+=33) {
            alice.support3(new Trouble(i));
        }
    }
}
