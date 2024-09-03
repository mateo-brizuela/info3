A continuación se detallan la estructura mediante la cual organizamos el repositorio y el flujo de trabajo que vamos a ir siguiendo. 

Estructura: 
Como vamos a usar el repositorio para guardar, no solo el src de los códigos, sino además los documentos de los prácticos, lo primero con lo que nos encontramos son las carpetas dedicadas para cada una de estas cosas: documentos y practico. 
Además, optamos por agrupar el código de cada proyecto en carpetas enumeradas para tal fin. 
En lo que respecta al uso de ramas, contamos con 2 principales: main y test. 

Flujo de trabajo: 
- Creación de una rama de desarrollo para la feature en cuestión con el nombre de "proyecto<numero del proyecto>/<nombre de la feature>"
- Merge de la rama secundaria con la rama test
- Testeo de la funcionalidad
- En caso de que todo funcione bien: merge de la rama test con la main
