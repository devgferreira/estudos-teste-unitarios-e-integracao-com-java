package com.gabriel.ferreira.mockito_com_java.application.services;

import com.gabriel.ferreira.mockito_com_java.application.interfaces.ICourseService;

import java.util.Arrays;
import java.util.List;

public class CourseService implements ICourseService {
    @Override
    public List<String> buscarCursosPorEstudante(String estudante) {
        return Arrays.asList(
                "REST API's RESTFul do 0 à Azure com ASP.NET Core 5 e Docker",
                "Agile Desmistificado com Scrum, XP, Kanban e Trello",
                "Spotify Engineering Culture Desmistificado",
                "REST API's RESTFul do 0 à AWS com Spring Boot 3 Java e Docker",
                "Docker do Zero - Maestria - ContÃªinerizaÃ§Ã£o Desmistificada",
                "Docker para Amazon AWS Implante Apps Java e .NET com Travis CI",
                "MicrosserviÃ§os do 0 com Spring Cloud, Spring Boot e Docker",
                "Arquitetura de MicrosserviÃ§os do 0 com ASP.NET, .NET 6 e C#",
                "REST API's RESTFul do 0 à AWS com Spring Boot 3 Kotlin e Docker",
                "Kotlin para DEV's Java: Aprenda a Linguagem PadrÃ£o do Android",
                "MicrosserviÃ§os do 0 com Spring Cloud, Kotlin e Docker"
        );

    }
}
