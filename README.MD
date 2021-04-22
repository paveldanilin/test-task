# TestTask

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