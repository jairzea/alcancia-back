# Alcancia

## Backend

### Configuración de proyecto en local

# Requisitos previos

- Asegurese de tener JAVA V. 19 o superior instalado en su equipo
- Asegurese de tener apache MAVEN instalado en su equipo
- Asegurese de tener un servidor apache o de base de datos para gestionar la misma.

# Siguientes pasos

- git clone https://github.com/jairzea/alcancia-back.git
- cd /alcancia-back
- Cree una base de datos en su servidor

# Configuración de propiedades de la aplicacion

- Especifique los datos de conexión de la base de datos creada en el archivo en la ruta: /src/main/resources/application.properties

```HTML
spring.datasource.url=jdbc:mysql://{nombre-dominio}:{puerto}/{nombre-base-datos}
spring.datasource.username={usuario-base-datos}
spring.datasource.password={contraseña-usuario}
spring.jpa.hibernate.ddl-auto=update
```

_Despues de haber seguido los pasos anteriores y si todo va bien, ejecute el siguiente comando en la terminal del proyecto_

## `mvn spring-boot:run`

# Link repositorio front:

## https://github.com/jairzea/alcancia-mutual
