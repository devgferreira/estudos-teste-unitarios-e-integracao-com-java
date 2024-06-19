package com.gabriel.ferreira.mockito_com_java.application.buniness;

import com.gabriel.ferreira.mockito_com_java.application.interfaces.ICourseService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CourseBusinessMockTest {
    ICourseService _courseService;
    CourseBusiness _courseBusiness;
    List<String> courses;
    @BeforeEach
    void setup(){
        _courseService = mock(ICourseService.class);

        _courseBusiness = new CourseBusiness(_courseService);
        courses = Arrays.asList(
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
    @Test
    void testbuscarCursosPorEstudante_UsandoMock(){
        //Given / Arrange
        when(_courseService.buscarCursosPorEstudante("Gabriel")).thenReturn(courses);

        //When / Act
        List<String> cursosFiltrados = _courseBusiness.buscarCursosPorEstudante("Gabriel");

        // Then / Assert
        assertEquals(4, cursosFiltrados.size());
    }
    @Test
    void testbuscarCursosPorEstudante_UsandoFooBarEstudante(){
        //Given / Arrange
        //When / Act
        List<String> cursosFiltrados = _courseBusiness.buscarCursosPorEstudante("Foo Bar");

        // Then / Assert
        assertEquals(0, cursosFiltrados.size());
    }


}