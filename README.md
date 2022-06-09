# ENCAPSULACION 

- Cuando un objeto se encuentra encapsulado, solo sus metodos tienen acceso a sus atributos,evitandoo asi, la manipulacion de los atributos mediante la presencia de fuentes externas, es decir , quien proograma un oobjeto controla los metodos de acceso,su estado y su comportamiento.
- Es una de las propiedades mas importantes de la POO
- Consiste en la separacion de las propiedades externas de un objeto,correspondiente a la interfz de sus funciones de los detalles de implementacion interna del objeto.
- Se reduce la complejidad del sistema protejiendo los objetos contra posibles errores y permitiendo lograr de mejor manera extensiones futuras en la implementacion de los objetos 
- Consiste basicamente en proteger los agtributos del acceso directo de los objetos,colocandolos en una zona privada, y la unica forma de acceder a ellos es por medio de los metodos que estann en una zona publica

## Mensajes
- Una aplicacion prientada a objetos esta compuesta por varios objetos creados desde sus respectivas clases .
- Estos objetos necesitan una forma de comunicarse,para intercambiar datos entrte si ,y lo hacen por medio de mensajes.
- Los mensajes pueden contener parametros,en los cuales se eindican las caracteristicas especificas de la accion a realizar .
- Estructuralmente esta compesto por los siguientes elementos:
    1.el objeto destino,hacia el cual el mensaje es renviado.
    2.el nombre del metodo a lllamar 
    3.parametros solicitados por el metodo,a traves el cual suele darse la informacion.

- El envio y recepcion de mensajes es simplemente una peticion de un objeto a otro objeto para que este se comporte de una manera determinada ¿,ejecutando uno de sus metodos.
- Ejemplo:
    si existe un objeto A de la clase carro y un obkjeto B de la clase Impuesto,para calcular el 10% de impuestos sobre el precio del carro,la comunicacion podria ser:
    `float costo= A.getPrecio();`
    `B.calcularImpuesto(costo*0.10)`

## Ciclo de vida de los objetos 
- El objeto nace cuando se crea,vive cuando se utiliza en un rpograma y muere cuando deja de usarse.

## Constructores
- Son metodos especiales que tienen las siguientes caracteristicas:
    - Se llaman solo una vez al crear el objeto
    - tienen el mismo nombre de la clase.
    - pueden haber varios (sobrecarga de metodos).
    - Al crear un objeto solo se  utiliz uno.
    - No devuelve nada, ni void (realmente devuelve el objeto creado).

- Inicializa los atributos del objeto al momento de crearse sin hacer otra instruccion adicional.
- Java provee un constructor por defecto.
- Tipos:
    - Por defecto: no recibe parametros.
    - Comun u ordinario:puede recibir toda clase de parametros.
    - de copiia:permite a construccion de una copia del oobjeto.

## Crecimiento y vida del objeto 
- Una vez creado el objeto:
    - se puede trabajar con el
    - llamar a los metodos clase
    - guardar datos para almacenarlos temporlmente antes de registrarlos en una BD.
    - Compartir datos con los demas objetos,pasandoles mensajes.
-Cada objeto consume memoria,y depende de los atributos que tenga.

## Muerte del objeto 
- Java utiliza el Garbage Collector para liberar los objetos no referenciados.
- Java cuenta las referencias que hay sobre cada objeto .El objeto se borra cuando no tenga referencias .
- Antes de borrarlo Java da la oportunidad de llimpiarse asi mismo: finalizacion.
- Llamado explicito al gc System.gc();


## Ejercicio 
crear un programa para gestionar un plan de telefonia celular el plan tiene un numero de celular, un operador, una cantidad de minutos y un costo por minuto. calcular el total a pagar teniendo en cuenta que si el operador es movilujo tiene un 50% de descuento. usar minimo 3 constructores