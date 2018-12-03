package entity;

import lombok.*;


import java.util.List;

@Data @RequiredArgsConstructor
public class PersonLombok {

    @NonNull
    private String firstName;
    private String middleName;
    @NonNull
    private String lastName;
    @NonNull
    private int id;
    @NonNull
    private String address;
    private List family;

}