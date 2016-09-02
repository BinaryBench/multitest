package me.binarybench.game;

import me.binarybench.test.CoreTest;
import org.apache.commons.dbcp2.BasicDataSource;
import org.omg.PortableServer.THREAD_POLICY_ID;

/**
 * Created by Bench on 9/1/2016.
 */
public class Main {
    public static void main(String[] args)
    {
        CoreTest ct = new CoreTest();
        CoreTest.coolCool();


    }

    public Main()
    {
        takeRunnable(this::testMethod);
    }

    public void testMethod()
    {

    }

    public void takeRunnable(Runnable runnable)
    {

    }


}
