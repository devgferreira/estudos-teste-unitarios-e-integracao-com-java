package com.gabriel.ferreira.mockito_com_java.application.buniness;

import com.gabriel.ferreira.mockito_com_java.application.interfaces.ICourseService;

import java.util.ArrayList;
import java.util.List;

public class CourseBusiness {
    private final ICourseService _courseService;

    public CourseBusiness(ICourseService courseService) {
        _courseService = courseService;
    }
    public List<String> buscarCursosPorEstudante(String estudante){
        List<String> cursosFiltrados = new ArrayList<>();
        List<String> cursos = _courseService.buscarCursosPorEstudante(estudante);

        for (String curso : cursos){
            if(curso.contains("Spring")){
                cursosFiltrados.add(curso);

            }
        }
        return cursosFiltrados;
    }
}
