package com.in28minutes.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data /* Equivalent to @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode. */
@AllArgsConstructor
public class Todo {
    private int id;
    private String user;
    private String description;
    private Date targetDate;
    private boolean isDone;
}
