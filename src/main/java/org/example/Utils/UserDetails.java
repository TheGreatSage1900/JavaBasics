package org.example.Utils;

import lombok.Data;

import java.util.List;

@Data
public class UserDetails {
    long userId;
    String name;
    int age;
    String location;
    String designation;
    List<String> nickNames;
}
