package top.cupcupcui.leetcodeproblems.sorting;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumTestV2 {

    @Test
    public void test_PositiveCase0() {
        ThreeSumV2 service = new ThreeSumV2();
        int[] arg1 = {-1, 0, 1, 2, -1, 1};
        // int[] arg1 = {-1, 0, -1, 1, 1, 2};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-1, 0, -1, 1, 1, 2));
        List<List<Integer>> response = service.threeSum(arg1);
        for (int i = 0; i < expected.size(); i++) {
            Assert.assertArrayEquals(expected.get(i).toArray(), response.get(i).toArray());
        }
    }

    @Test
    public void test_PositiveCase1() {
        ThreeSumV2 service = new ThreeSumV2();
        int[] arg1 = {-1, 0, 3, 4, -1, -4, 2};
        // int[] arg1 = {-1, 0, -1, -4, 2, 4, 3};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-1, 0, -1, -4, 2, 4, 3));
        List<List<Integer>> response = service.threeSum(arg1);
        for (int i = 0; i < expected.size(); i++) {
            Assert.assertArrayEquals(expected.get(i).toArray(), response.get(i).toArray());
        }
    }

/*     @Test
    public void test_PositiveCase1() {
        ThreeSumV2 service = new ThreeSumV2();
        int[] arg1 = {-1, 0, 3, 4, -1, -4, 2};
        // int[] arg1 = {-1, 0, -1, -4, 2, 4, 3};
        int[] arg1 = {-1, 0, -1, -4};
        int[] arg1 = {-4, 0, -1, -1};

        int[] arg1 = {-4, 0, -1, -1};
        int[] arg1 = {-4, -1, 0, -1};
        int[] arg1 = {-4, -1, -1, 0};
        int[] arg1 = {-4, -1, -1, 0};



        // int[] arg1 = {2, 4, 3};
        // int[] arg1 = {2, 3, 4};
        int[] arg1 = {3, 4};
        int[] arg1 = {3, 4};

        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-1, 0, -1, -4, 2, 4, 3));
        List<List<Integer>> response = service.threeSum(arg1);
        for (int i = 0; i < expected.size(); i++) {
            Assert.assertArrayEquals(expected.get(i).toArray(), response.get(i).toArray());
        }
    } */

}