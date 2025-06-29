package org.example.Utils;

import lombok.Data;

@Data
public class UserDetails {
    long userId;
    String name;
    int age;
    String location;
    String designation;
    Details Details;

    private static class Details {
        String address;
    }
}
