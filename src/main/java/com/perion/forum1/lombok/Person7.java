package com.perion.forum1.lombok;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Person7 {

    private String firstName;
    private String lastName;
    private int age;
}
