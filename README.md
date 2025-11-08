# Conversor de Monedas

Este proyecto es una aplicación de consola desarrollada en **Java**, que permite convertir valores entre diferentes monedas utilizando datos actualizados desde la **ExchangeRate API**.

## 🎯 Objetivo

El objetivo del proyecto es aplicar conceptos clave del desarrollo backend en Java, incluyendo:

* Consumo de APIs REST usando `HttpClient`.
* Manejo de respuestas JSON mediante la biblioteca `Gson`.
* Interacción con el usuario mediante menú en consola.
* Buenas prácticas de código limpio.

## 🚀 Características

* Conversión en tiempo real entre monedas.
* Validación de entradas del usuario para evitar errores.
* Uso de arquitectura organizada en clases.
* Manejo claro y limpio de la respuesta JSON.

## 🧰 Tecnologías Utilizadas

| Herramienta / Librería | Uso                     |
| ---------------------- | ----------------------- |
| Java 21                | Lenguaje principal      |
| Maven                  | Gestión de dependencias |
| HttpClient             | Consumo de API          |
| Gson (Google)          | Parseo de JSON          |

## 🔧 Configuración Inicial

Asegúrate de tener configurado lo siguiente:

1. **Java 21** instalado.
2. **Maven** configurado.
3. Agregar la dependencia Gson en el archivo `pom.xml`.

```xml
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.13.2</version>
</dependency>
```

## 🔑 Generación de la API Key

1. Accede a: [https://www.exchangerate-api.com/](https://www.exchangerate-api.com/)
2. Crea una cuenta gratuita.
3. Copia tu **API Key** y reemplázala en el código dentro de la URL base.

## 🧭 Ejecución del Programa

1. Compilar el proyecto:

```
mvn clean install
```

2. Ejecutar:

```
java -jar target/CurrencyConverter-1.0-SNAPSHOT.jar
```

## 📋 Ejemplo de Uso

El programa mostrará un menú como el siguiente:

```
=== Conversor de Monedas ===
1) USD → PEN
2) PEN → USD
3) USD → ARS
4) ARS → USD
5) USD → CLP
6) Salir
```

Solo debes ingresar el número de la opción deseada y el monto a convertir.

## ✅ Estado del Proyecto

Completado y funcional. Abierto a mejoras.

## 💡 Posibles Mejoras Futuras

* Agregar interfaz gráfica.
* Guardar historial de conversiones.
* Soporte para más monedas.
