# **CHALLENGE 1 JAVA - CONVERSOR DE MONEDAS**
## **ALURA ONE G4** 

##### _challengeonecodificador4_

## **_RESUMEN_**

Utilizando la interfaz gráfica de usuario (GUI) de JAVA, se creó una herramienta para convertir diferentes tipos de moneda (dólar, euros, libras esterlinas, yen Japones, won sul-coreano y pesos colombianos), utilizando paradigmas de programación orientada a objetos. 

### **DESARROLLO DE LA HERRAMIENTA**  

A continuación, se presenta una breve explicación de algunos fragmentos del código elaborado en JAVA para este proyecto.

Para el desarrollo de este proyecto se crearon 5 clases, para la primera se utilizó un JFrame que es el encargado de contener toda la parte visual de la herramienta, como lo son los botones, los JtextField y los JLabel. 

La segunda clase que se creo fue la clase “IndicesDolar” que es la encargada de contener los datos de los tipos de conversión, en la declaración de los datos se utilizó el modificador de acceso de tipo public, para poder acceder desde las demás clases de una forma fácil, también los datos son static, para que no sean modificables dentro de las clases. 

La tercera clase se llamó “LimpiarCampos” que es utilizada para limpiar los valores en los JtextField, en el momento que sea necesario.    

La cuarta clase es la “SeleccionMoneda” que se encarga de contener las opciones de selección de moneda mediante el uso de la estructura condicional “switch”.

### **FUNCIONAMIENTO DE LA HERRAMIENTA**

En el momento que se desee cerrar el programa, se cuenta con 2 opciones, una es la forma tradicional que se utiliza en Windows, la otra forma es hacer uso del botón "Salir".

![](https://github.com/Luis-Carlos-H/Conversor-de-Monedas/blob/master/Ima/ventana.png)

La herramienta cuenta con 6 opciones de conversión de moneda, las cuales se pueden ver en la siguiente imagen, a su vez el resultado muestran todas las conversiones al mismo tiempo para un tipo de moneda seleccionada. 

![](https://github.com/Luis-Carlos-H/Conversor-de-Monedas/blob/master/Ima/listaMonedas.png)

Para dar clic en el botón convertir, se debe haber ingresado el valor que se desea convertir, adicional a esto debe ser un tipo de dato numérico, no se aceptan caracteres. 

Si al dar clic en el botón convertir, no se ha ingresado algún valor, el programa mostrara por medio de una ventana, el mensaje que se puede observar en la siguiente imagen. 

![](https://github.com/Luis-Carlos-H/Conversor-de-Monedas/blob/master/Ima/ventanaSinDato.png)

 

De la misma forma al ingresar un dato incorrecto como se puede observar en el ejemplo de la siguiente imagen, una ventana nos indicará que debemos volver a ingresar el valor, este dato debe ser de tipo numérico. 

![](https://github.com/Luis-Carlos-H/Conversor-de-Monedas/blob/master/Ima/errorTipoDato.png)

 Ventana de mensaje por error al ingresar el dato a convertir.

![](https://github.com/Luis-Carlos-H/Conversor-de-Monedas/blob/master/Ima/ventanaErrorDato.png)

A continuación, se presenta un ejemplo del uso adecuado de la herramienta, se escogió el dólar para hacer la conversión a las diferentes monedas, entonces se introdujo la cantidad de dólares que se querían convertir, en este caso fueron 10 dólares.

![](https://github.com/Luis-Carlos-H/Conversor-de-Monedas/blob/master/Ima/funcionando.png)
