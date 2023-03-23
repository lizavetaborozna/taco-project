package com.project.taco.tacoproject.repository;

import com.project.taco.tacoproject.model.TacoOrder;

public interface OrderRepository {

    TacoOrder save(TacoOrder tacoOrder);
}
