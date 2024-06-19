package com.gabriel.ferreira.mockito_com_java.application.interfaces;

import java.util.List;

public interface ICourseService {
    List<String> buscarCursosPorEstudante(String estudante);
}
