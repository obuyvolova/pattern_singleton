package com.company;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        logger.log("The filter starts ");
        List<Integer> result = new ArrayList<>();
        for (Integer x : source) {
            if (x < threshold) {
                logger.log("Element " + x + " has been filtered");
                result.add(x);
            } else {
                logger.log("Element " + x + " has not been filtered");
            }
        }
        logger.log("Filtered " + result.size() + " elements out of " + source.size());
        return result;
    }


}
