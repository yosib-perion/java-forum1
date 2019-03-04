package com.perion.forum1.lombok;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@EqualsAndHashCode
@ToString
public class Person3 {

    private String firstName;
    private String lastName;
    private int age;
}
