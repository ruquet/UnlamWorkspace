# UnlamWorkspace
Villafañe Nicolas
Ruquet Ivan
#

Respuestas: 

5.     Cuando se realizó el segundo push, notamos que nos tira un error que impedía volcar el proyecto en el git. Esto se debe porque uno tiene que volcar una imagen entera del proyecto sumado al cambio. Al notar que las bases son distintas, te lo impide. 

- Antes de realizar un push, se debe adherir los archivos a modificar con ‘git add XX’ y luego git commit –m “mensaje” para tener una imagen del proyecto que subiremos al repositorio remoto. 

- ¿Qué estrategia propondrían para evitar esta situación?  

Investigamos que , antes de seguir con el proyecto,  se debe realizar un git fetch. Que trae los cambios nuevos de la rama donde estamos ubicados. Y de haber cambios, realizamos un ‘git pull’. 
Una vez tengamos toda la base actualizada, continuamos nuestro trabajo. 

Lo otro que se investigo, fue para traer la base del repositorio remoto y unirla con el proyecto actual. 

git pull --rebase origin master  

git push origin master 

Esto nos dejaria la posibilidad de pushear sin inconvenientes. 

6. El comando -b crea una nueva rama y la cambia a ella. 

Esto nos sirve para crear varias instancias distintas sin modificar la version final o principal. 

9. Realizar en el repositorio remoto un merge request 

Cuando realizamos una nueva rama y la pusheamos al git, hacemos un pull request para que el administrador del repositorio acepte el merge de esa rama al master. 

¿Qué diferencias notaron en el proceso? 

Esto facilita que uno este al tanto de que se hace merge y que no. Entonces, no hay inconvenientes en el proyecto principal. 

¿Qué estrategia utilizarían para evitar conflictos? 

Principalmente, realizar un ‘git fetch’ y ‘git status’ para verificar que estemos al dia, y empezar a trabajar desde ahí. 
Y si trabajamos paralelamente, utilizariamos nuestras branches para luego hacer un pull request. No realizar un merge a menos que estemos de acuerdo. 
