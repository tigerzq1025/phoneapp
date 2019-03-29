package com.jbit.service;



import com.jbit.entity.Informations;

import java.util.List;

public interface IfService {
    List<Informations> findAllIf();

    Informations findOneIf(Long id);
}
