package org.example.Concepts;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ThreadStatus {
    NEW("New"),
    RUNNABLE("ready to run"),
    BLOCKING("Blocked due to sync"),
    WAITING("waiting for the resource"),
    TERMINATED("Process done");

    private final String description;

}
