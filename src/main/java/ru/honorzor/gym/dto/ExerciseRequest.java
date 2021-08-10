package ru.honorzor.gym.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import ru.honorzor.gym.enums.LevelType;
import ru.honorzor.gym.enums.SexType;

@Data
@Builder
public class ExerciseRequest {

    private SexType sex;

    private LevelType level;

    private int age;

}
