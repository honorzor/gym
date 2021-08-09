package ru.honorzor.gym.entity;

import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;
import ru.honorzor.gym.enums.LevelType;
import ru.honorzor.gym.enums.MuscleType;
import ru.honorzor.gym.enums.SexType;

import javax.persistence.*;

@Entity
@Table(name = "T_EXERCISE")
@Builder
@NoArgsConstructor
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    private String name;

    private String description;

    @Enumerated(value = EnumType.STRING)
    private SexType sex;

    @Enumerated(value = EnumType.STRING)
    private LevelType level;

    private MuscleType muscle;
}
