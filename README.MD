[![CircleCI](https://circleci.com/gh/paveldanilin/test-task.svg?style=svg)](https://circleci.com/gh/paveldanilin/test-task)

# TestTask

```
Нужно сделать веб сервер в котором реализовать 2 REST API:

·       Принимает произвольное число типа integer и кладет его в табличку БД, ответом будет ID этой записи

·       Принимает имя агрегатной операции (например сумма, среднее, минимальное, максимальное) и IDшки записей. Если IDшки не указаны – сделать по всем записям. Ответом будет результат агрегатной операции.

 
Какие технологии использовать:

·       Сделать все с использованием Spring Framework. Каждая агрегатная операция – бин в Spring.

·       Использовать нужно XML контекст, не аннотации. Чтобы поднять веб сервере – использовать Spring Boot.

·       Для доступа к БД использовать Spring JPA.

·       База данных – любая. Самая простая SQLLite для этих целей.

·       Для тестирование рест контролеров – используй Postman/Insomnia.

·       IDE лучше использовать Intelij IDEA (активируй триал, он дается на 30 дней).

·       Придерживаться ООП.

Результаты выложить на GitHub.

Обязательное наличие статического анализатора кода Qulice - https://www.qulice.com/ Каждое подавление warning должно быть объясненно
```

#### Build
- mvn install

#### Start
- mvn spring-boot:run

#### Insomnia collection
- Insomnia_2021-04-22.json

#### SuppressWarnings

Для абстрактной сущности подавляем отсутсвие абстрактных методов.
Нужно было расшарить свойство Id, для всех сущностей.
```java
@SuppressWarnings("PMD.AbstractClassWithoutAbstractMethod")
public abstract class AbstractEntity {}
```


Нужно дать возможность спрингу создать инстанс главного класса.
```java
@SuppressWarnings({
    "PMD.ClassWithOnlyPrivateConstructorsShouldBeFinal",
    "PMD.UseUtilityClass"
})
public class XmlConfigApplication {}
```

#### Unit test
- TODO unit test