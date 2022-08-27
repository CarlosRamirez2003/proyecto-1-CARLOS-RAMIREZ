# proyecto-1-CARLOS-RAMIREZ
Programa de administración del reporte de inconsistencias, bugs y errores relacionados a los servicios que  se proporcionan en un Sistema que se utiliza para la venta de productos online. generando tickets de reoportes los cuelues puenden pertenecer a 3 diferentes departamentos , Mesa de ayuda , soporte y desarrollo , asi mismo si un departamento no puede dar solucion pasará al siguiente hasta lllegar al departamento desarrollo.
## Diagrama de clase
![image](https://user-images.githubusercontent.com/109763655/187012849-1a872001-6bad-47ec-9ee7-59a4f8a85069.png)

# Manual de usuario
Al ejecutar el programa se desplegará el siguiente menú 

![image](https://user-images.githubusercontent.com/109763655/187012894-12d23d5b-5566-47c6-b5b8-68d3f2725f3b.png)

Nota: Cada dato es verificado, si el usuario ingresa un dato incorrecto el programa lo pedirá de nuevo hasta que ingrese uno correcto como por ejemplo si el usuario ingresa un numero en algún nombre el programa lo detectará y pedirá de nuevo 

### Opcion 1 :Generar ticket
![image](https://user-images.githubusercontent.com/109763655/187013044-03cbfcf5-9427-4093-b0f9-df50b89c0b9b.png)


al ejecutar esta opcion se pediran los siguientes datos 
nit.
problema encontrado.
Completando los campos se genera un Tiket con el numero correspondiente el cual sera enviado a Cola mesa Para inicaiar a escalar o bien darle solucion en la misma 

### Opcion 2 :Cargar datos masivos 
![image](https://user-images.githubusercontent.com/109763655/187013087-2ee6944b-8796-46c9-9666-47e77cb88d05.png)

al ingresar esta opcion se cargara un archivo .Json con objetos de tipo tiket  

### Opcion 3 :Atencion Mesa de ayuda

primero pedita el nit del operador 

al ingresar esta opcion generara el primer ticket que esta cola mesa

![image](https://user-images.githubusercontent.com/109763655/187013185-8336352f-edb7-43cf-8b00-acd1874fffcf.png)

si ingresamos el numero 1  logramos solucionar el problema el ticket cambiara su estado a "resuelto"

si ingresamos el 0 escalara ese ticket a la siguiente cola la cual eS Cola Soporte 

### Opcion 4:Atencion soporte 

primero pedita el nit del operador 

al ingresar esta opcion generara el Ultimo ticket que esta cola Soporte

![image](https://user-images.githubusercontent.com/109763655/187013460-c4f4914a-1029-4661-b2d3-5683932f8222.png)

si ingresamos el numero 1  logramos solucionar el problema el ticket cambiara su estado a "resuelto"

si ingresamos el 0 escalara ese ticket a la siguiente cola la cual es Cola Desarrollo

### Opcion 5: Atencion Desarrollador

primero pedita el nit del operador 

al ingresar esta opcion generara un ticket random que pertenezca esta cola Desarrollo

![image](https://user-images.githubusercontent.com/109763655/187013546-8f6092eb-6f5f-4f2b-b088-07152a3c328f.png)

en este apartado si o si debe de tener solucion el problema 


### Opcion 6: Mostrar todos los ticket 
Como su nombre lo indica mostrara todos los tikets Sin importar la cola o el estado(creado , resuelto )

![image](https://user-images.githubusercontent.com/109763655/187013605-ed281412-c02e-4cd9-b384-0f90d0c2aa96.png)

### Opcion 7: Mostrar Todos los tikets en Mesa de Ayuda
Como el nombre indica Mostrara todos los tikets que estan en Mesa de ayuda sin importar el estado  (creado , resuelto )

![image](https://user-images.githubusercontent.com/109763655/187013650-8eded52d-bc18-4ef7-8cb3-2c735501ea9a.png)

### opcion 8: Mostrar Todos los tikets en Cola Soporte

Como el nombre indica Mostrara todos los tikets que estan en Cola Soporte sin importar el estado  (creado , resuelto )


![image](https://user-images.githubusercontent.com/109763655/187013680-3a72f9fd-419e-41d3-aa96-42a87e6401b5.png)

### Opcion 9: Mostrar Todos los tikets en Cola Desarrollador

Como el nombre indica Mostrara todos los tikets que estan en Cola Desarrollo sin importar el estado  (creado , resuelto )

![image](https://user-images.githubusercontent.com/109763655/187013742-592441f8-1d58-484b-a2f5-b4530f0e20e4.png)

### Opcion 10: Mostrar Bitacora

Mostrara todas las acciones realizadas desde crear un tiquet ,escalarlo hasta resolverlo

![image](https://user-images.githubusercontent.com/109763655/187013790-d042f0fa-a06e-4c95-8c9a-8c4fbe3df136.png)

### Opcion 11 Cerrar programa 

![image](https://user-images.githubusercontent.com/109763655/187013813-1ef958cc-32f0-4780-98e0-8cd09a0718bb.png)













