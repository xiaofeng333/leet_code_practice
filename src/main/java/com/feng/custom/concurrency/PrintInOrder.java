package com.feng.custom.concurrency;

import java.util.concurrent.CountDownLatch;

/**
 * 按序打印: https://leetcode-cn.com/problems/print-in-order/
 * 请设计修改程序，以确保 second() 方法在 first() 方法之后被执行，third() 方法在 second() 方法之后被执行。
 * 解: 可采用cas(定义volatile变量, 循环判断)、条件队列(wait/Condition)、Semaphore、CountDownLatch
 */
public class PrintInOrder {

    private CountDownLatch second = new CountDownLatch(1);
    private CountDownLatch third = new CountDownLatch(1);

    public PrintInOrder() {

    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        second.countDown();
    }

    public void second(Runnable printSecond) throws InterruptedException {

        // printSecond.run() outputs "second". Do not change or remove this line.
        second.await();
        printSecond.run();
        third.countDown();
    }

    public void third(Runnable printThird) throws InterruptedException {

        // printThird.run() outputs "third". Do not change or remove this line.
        third.await();
        printThird.run();
    }
}
