package com.perion.forum1.lombok;

import lombok.*;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class Person4 {

    private final String firstName;
    private final String lastName;
    private final int age;
}
