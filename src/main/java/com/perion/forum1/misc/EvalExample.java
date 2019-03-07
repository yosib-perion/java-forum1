package com.perion.forum1.misc;


import org.mvel2.MVEL;

import java.io.Serializable;
import java.time.Duration;
import java.time.Instant;
import java.util.Map;

public class EvalExample {

    public static void main(String[] args) {

        Serializable compileExpression = MVEL.compileExpression("if (prop1 == 4 && prop2 == 10) {return true} else {return false}");
        System.out.println(compileExpression.getClass());

        eval(compileExpression, Map.of("prop1", 4, "prop2", 10));
        eval(compileExpression, Map.of("prop1", 4, "prop2", 11));
    }

    private static void eval(Serializable compileExpression, Map<String, Integer> request1Context) {

        Instant start = Instant.now();
        Boolean result = (Boolean) MVEL.executeExpression(compileExpression, request1Context);
        Instant end = Instant.now();

        System.out.println(result + " " + Duration.between(start, end));
    }
}
