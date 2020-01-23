# Taller Ejercicio MVN-Git

Programa que calcula la media y desviación estandar de una lista de numeros.

## Empezando

Pasos para necesarios para correr el programa 

### Prerrequisitos

#### Java
 Java es necesario para correr el programa, para comprobar si esta instalado desde la linea de comandos:

```
>java -version

java version "1.8.0_181"
Java(TM) SE Runtime Environment (build 1.8.0_181-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.181-b13, mixed mode)
```

#### Maven
El programa corre con maven, para comprobar si esta instalado desde la linea de comandos:

```
>mvn -v

Apache Maven 3.6.1 (d66c9c0b3152b2e69ee9bac180bb8fcc8e6af555; 2019-04-04T14:00:29-05:00)
Maven home: C:\Program Files\apache-maven-3.6.1\bin\..
Java version: 1.8.0_181, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk1.8.0_181\jre
Default locale: es_CO, platform encoding: Cp1252
OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"
```

#### Git
Para descargar el programa se necesita git, para comprobar si esta instalado desde la linea de comandos:

```
> git --version

git version 2.21.0.windows.1
```

### Instalación

Para instalar el repositorio se instala en la ruta deseada desde git de esta forma

```
> git clone https://github.com/svega99/AREPLAB1.git

```
Para compilar el proyecto desde maven:

```
> mvn package
```
## Corriendo el programa

Para correr el programa es necesario tener un archivo txt que contenga numeros para calcular la media y desviación estandar. El proyecto ya contiene dos archivos de prueba llamados ```tabla1.txt``` y ```tabla2.txt```
Para correr con alguno de los archivos en la consola:

```
> mvn exec:java -Dexec.args="tabla1.txt"
...
La media es: 550.6
La desviación estandar es: 572.03
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.073 s
[INFO] Finished at: 2020-01-23T10:49:56-05:00
[INFO] ------------------------------------------------------------------------
```

## Corriendo los tests

Para correr los tests:

```
> mvn test
...
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running edu.escuelaing.app.CalculatorTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.048 s - in edu.escuelaing.app.CalculatorTest
[INFO] Running edu.escuelaing.app.LinkedListTest
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 s - in edu.escuelaing.app.LinkedListTest
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  7.922 s
[INFO] Finished at: 2020-01-23T10:49:33-05:00
[INFO] ------------------------------------------------------------------------
```

El programa usa dos clases de test. ```LinkedListTest``` prueba el funcionamiento de la LinkedList y ```CalculatorTest``` prueba que la media y la desviación estandar se calculen de la forma adecuada.

## Authors

* **Santiago Vega Romero**  - [svega99](https://github.com/svega99)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
