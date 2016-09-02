package me.binarybench.game;

import me.binarybench.test.CoreTest;
import org.apache.commons.dbcp2.BasicDataSource;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleConsumer;


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

    public void testMethod(double test)
    {

    }

    public void takeRunnable(DoubleConsumer runnable)
    {

    }


}
