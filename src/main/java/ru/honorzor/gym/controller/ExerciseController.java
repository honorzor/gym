package ru.honorzor.gym.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.honorzor.gym.dto.ExerciseRequest;
import ru.honorzor.gym.dto.Response;
import ru.honorzor.gym.generator.ExerciseGenerator;

@RestController
@RequestMapping("/exercise")
@AllArgsConstructor
public class ExerciseController {
    private final ExerciseGenerator exerciseGenerator;

    @GetMapping(value = "/generate")
    public Response generate(ExerciseRequest request) {
        return Response.success(exerciseGenerator.generate(request));
    }

}
