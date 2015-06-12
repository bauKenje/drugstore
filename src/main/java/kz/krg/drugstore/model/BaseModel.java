package kz.krg.drugstore.model;

import java.util.UUID;

/**
 * Базовая сущность
 */
@SuppressWarnings("all")
public abstract class BaseModel {
    public UUID id;

    protected BaseModel(){
        id = UUID.randomUUID();
    }

    public boolean equals(BaseModel model){
        return this.id == model.id;
    }
}
