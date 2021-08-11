package ru.honorzor.gym.dto;

import lombok.*;
import ru.honorzor.gym.enums.LevelType;
import ru.honorzor.gym.enums.SexType;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ExerciseRequest {

    private SexType sex;

    private LevelType level;

    private int age;

}
