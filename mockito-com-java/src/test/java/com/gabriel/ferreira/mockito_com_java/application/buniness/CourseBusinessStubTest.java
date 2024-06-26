package com.gabriel.ferreira.mockito_com_java.application.buniness;

import com.gabriel.ferreira.mockito_com_java.application.interfaces.ICourseService;
import com.gabriel.ferreira.mockito_com_java.application.services.CourseService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CourseBusinessStubTest {
    @Test
    void testbuscarCursosPorEstudante_UsandoStub(){
        //Given / Arrange
        ICourseService _courseService = new CourseService();
        CourseBusiness _courseBusiness = new CourseBusiness(_courseService);

        //When / Act
        List<String> cursosFiltrados = _courseBusiness.buscarCursosPorEstudante("Gabriel");

        // Then / Assert
        assertEquals(4, cursosFiltrados.size());
    }
    @Test
    void testbuscarCursosPorEstudante_UsandoFooBarEstudante(){
        //Given / Arrange
        ICourseService _courseService = new CourseService();
        CourseBusiness _courseBusiness = new CourseBusiness(_courseService);

        //When / Act
        List<String> cursosFiltrados = _courseBusiness.buscarCursosPorEstudante("Foo Bar");

        // Then / Assert
        assertEquals(0, cursosFiltrados.size());
    }


}