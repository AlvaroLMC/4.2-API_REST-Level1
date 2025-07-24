package cat.itacademy.s04.t02.n01.repository;

import cat.itacademy.s04.t02.n01.model.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitRepository extends JpaRepository<Fruit, Integer> {
}



/*Esta interfaz hereda de JpaRepository<Fruita, Integer>, lo que por defecto,
:nos proporciona métodos como:
    findById(id)
    findAll()
    save(entity)
    deleteById(id)*/