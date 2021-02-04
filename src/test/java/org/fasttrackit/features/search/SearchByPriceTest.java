package org.fasttrackit.features.search;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

import java.util.Arrays;


public class SearchByPriceTest extends BaseTest {

    @Steps
    private LoginSteps loginSteps;

    @Test
    public static void main(String[] args) {

        int [] array = new int [] {190, 125, 160, 140};

        Arrays.sort(array);
        System.out.println("Elements of array sorted in ascending order: ");

        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }






    }


}

