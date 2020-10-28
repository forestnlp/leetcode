package com.leetcode.concurrent;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class P1115_1 {
    static class FooBar {

        private int n;

        private Lock lock = new ReentrantLock();
        private Condition condition = lock.newCondition();
        private boolean flag = true;

        public FooBar(int n) {
            this.n = n;
          }

        public void foo(Runnable printFoo) throws InterruptedException {

            for (int i = 0; i < n; i++) {
                lock.lock();
                while (!flag){
                    condition.await();
                }
                // printFoo.run() outputs "foo". Do not change or remove this line.
                printFoo.run();
                flag=!flag;
                condition.signalAll();
                lock.unlock();
            }
        }

        public void bar(Runnable printBar) throws InterruptedException {

            for (int i = 0; i < n; i++) {
                lock.lock();
                while (flag){
                    condition.await();
                }
                // printBar.run() outputs "bar". Do not change or remove this line.
                printBar.run();
                flag=!flag;
                condition.signalAll();
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) throws Exception {

        FooBar fooBar = new FooBar(55);

        Thread t1 = new Thread(() -> {
            try {
                fooBar.foo(() -> {
                    System.out.print("foo");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                fooBar.bar(() -> {
                    System.out.println("bar");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();
    }
}
