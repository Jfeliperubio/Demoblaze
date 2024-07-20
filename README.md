# Demoblaze

Este proyecto contiene pruebas automatizadas utilizando Selenium, Cucumber, Serenity y Java. Está diseñado para demostrar cómo integrar estas tecnologías para realizar pruebas de aceptación automatizadas en la página web "Product Store". Los casos de prueba principales incluyen:

1. **Registro de un Nuevo Usuario**: Automatización del proceso de registro de un nuevo usuario en la página Product Store.
2. **Realización de una Compra**: Automatización del proceso de añadir productos al carrito y completar la compra en la página Product Store.

## Autores

- [@Jfeliperubio](https://github.com/Jfeliperubio)

### Descripción del Proyecto

El objetivo de este proyecto es proporcionar un conjunto de pruebas automatizadas que validen las funcionalidades clave de la página web "Product Store". Utilizando el patrón de diseño Page Object Model (POM), el proyecto organiza y estructura el código de manera que sea fácil de mantener y extender.

Los casos de prueba creados incluyen:

1. **Registro de un Nuevo Usuario**: Este caso de prueba verifica que un nuevo usuario puede registrarse en la página Product Store. Se automatizan los pasos necesarios para navegar a la página de registro, ingresar la información requerida y confirmar el registro exitoso.

2. **Realización de una Compra**: Este caso de prueba valida el flujo completo de compra, incluyendo la selección de productos, la adición de productos al carrito, y la finalización del proceso de compra. Los pasos incluyen navegar por la tienda, seleccionar productos, añadirlos al carrito y proceder con el checkout hasta ver la confirmación de compra.

### Cucumber

**Cucumber** es una herramienta de pruebas que admite la escritura de especificaciones de pruebas en un lenguaje natural (Gherkin). Facilita la comunicación entre los desarrolladores, testers y stakeholders, permitiendo definir el comportamiento esperado del software mediante ejemplos legibles por humanos.

![CucumberLogo](https://i.pinimg.com/originals/dd/be/20/ddbe20664a0e1e16a5706655616ee870.png)

- **Ventajas:**
    - Escritura de pruebas en lenguaje natural.
    - Fomenta la colaboración entre equipos técnicos y no técnicos.
    - Integración con múltiples lenguajes de programación y frameworks de automatización.

- **Ejemplo de un archivo Gherkin:**
  ```gherkin
  Feature: Purchase Feature

  Scenario: Usuario compra un producto
    Given El usuario está en la página de inicio
    When El usuario añade un producto al carrito
    And El usuario procede al checkout
    Then El usuario debería ver un mensaje de confirmación de compra
### Serenity BDD

**Serenity BDD** es un framework para pruebas automatizadas que extiende las capacidades de WebDriver y JUnit. Proporciona herramientas avanzadas para generar informes detallados y visuales sobre la ejecución de las pruebas, facilitando la comprensión del estado del proyecto y la cobertura de las pruebas.

![SerenityLogo](https://serenity-bdd.info/wp-content/uploads/2022/04/serenity-dojo.png)

**Ventajas:**
- Informes detallados y visuales de las pruebas.
- Soporte para pruebas de aceptación y de regresión.
- Integración con Cucumber, JUnit y otros frameworks de pruebas.

**Características clave:**
- Captura de capturas de pantalla durante la ejecución de las pruebas.
- Organización de pruebas en historias y tareas.
- Fácil integración con herramientas de CI/CD.

### Selenium

**Selenium** es una herramienta de automatización para pruebas de aplicaciones web. Permite controlar navegadores web mediante scripts y automatizar interacciones con la página web, como hacer clic en botones, ingresar texto y navegar entre páginas.

![SeleniumLogo](https://digitronsoftwares.com/assets/uploads/media-uploader/qasnklj71709102260.png)

**Ventajas:**
- Soporte para múltiples navegadores (Chrome, Firefox, Safari, etc.).
- Compatibilidad con diversos lenguajes de programación (Java, C#, Python, etc.).
- Capacidad para ejecutar pruebas en entornos distribuidos.

**Ejemplo de uso de Selenium en Java:**

```java
WebDriver driver = new ChromeDriver();
driver.get("https://www.ejemplo.com");
WebElement usernameField = driver.findElement(By.id("username"));
usernameField.sendKeys("usuario");
WebElement passwordField = driver.findElement(By.id("password"));
passwordField.sendKeys("contraseña");
WebElement loginButton = driver.findElement(By.id("loginButton"));
loginButton.click();

```



## Requisitos

Asegúrate de tener instalados los siguientes programas en tu máquina:

- [Java JDK 8+](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Gradle](https://gradle.org/)
- [Git](https://git-scm.com/)

## Instalación

1. Clona el repositorio:

   ```bash
   git clone https://github.com/Jfeliperubio/Demoblaze.git

   ```
## Estructura del Proyecto y Patrón de Diseño

Este proyecto utiliza el patrón de diseño Page Object Model (POM). POM es un patrón de diseño popular en pruebas de automatización que promueve la creación de una clase para cada página web en la aplicación, encapsulando la lógica y las interacciones con la página en métodos bien definidos.

### Estructura del Proyecto

- `src/main/java/com/axa/actions/Actions.java`: Contiene acciones reutilizables que se pueden realizar en diferentes páginas.
- `src/main/java/com/axa/constants/Constants.java`: Define constantes que se utilizan en todo el proyecto.
- `src/main/java/com/axa/models/Customer.java`, `Item.java`, `User.java`: Clases modelo que representan entidades de datos utilizadas en las pruebas.
- `src/main/java/com/axa/pages/demoblaze/`: Contiene clases de página que representan diferentes páginas de la aplicación Demoblaze.
  - `CartPage.java`: Lógica y métodos relacionados con la página del carrito de compras.
  - `CheckoutPage.java`: Lógica y métodos relacionados con la página de pago.
  - `HomePage.java`: Lógica y métodos relacionados con la página de inicio.
  - `ItemPage.java`: Lógica y métodos relacionados con la página de detalles de un artículo.
  - `ProductPage.java`: Lógica y métodos relacionados con la página de productos.
  - `RegisterPage.java`: Lógica y métodos relacionados con la página de registro.
- `src/main/java/com/axa/utils/Utils.java`: Métodos utilitarios que pueden ser usados en diferentes partes del proyecto.
- `src/test/java/com/axa/runners/`: Contiene clases runner que configuran y ejecutan las pruebas.
  - `PurchaseProductRunner.java`: Runner para pruebas de compra de productos.
  - `RegisterUserRunner.java`: Runner para pruebas de registro de usuario.
- `src/test/java/com/axa/stepdefinitions/`: Contiene las definiciones de pasos para las pruebas de Cucumber.
  - `PurchaseProductStepDefinitions.java`: Definiciones de pasos para la compra de productos.
  - `RegisterStepDefinitions.java`: Definiciones de pasos para el registro de usuario.
- `src/test/resources/`: Contiene recursos necesarios para las pruebas.
  - `serenity.conf`, `serenity.properties`: Archivos de configuración de Serenity.
  - `drivers/`: Controladores para diferentes navegadores.
    - `chrome/chromedriver.exe`: Controlador para Chrome.
    - `edge/msedgedriver.exe`: Controlador para Edge.
    - `firefox/geckodriver.exe`: Controlador para Firefox.
  - `features/`: Archivos de características en Gherkin que describen los casos de prueba.
    - `purchase_product.feature`: Archivo Gherkin para pruebas de compra de productos.
    - `register_new_user.feature`: Archivo Gherkin para pruebas de registro de nuevo usuario.

## Ejecución de los Casos de Prueba

La imagen muestra el flujo de trabajo de Serenity BDD con Cucumber para la automatización de pruebas de aplicaciones web.

![Serenity Report](https://qaautomation.expert/wp-content/uploads/2021/07/image-105.png?w=1200)


#### 1. **Feature File (Gherkins)**

Los archivos de características (feature files) escritos en Gherkin describen los casos de prueba en un lenguaje natural que es fácil de entender para todos los miembros del equipo, incluidos los que no son técnicos.

**Ejemplo**:
```gherkin
Feature: Registro de Nuevo Usuario

  Scenario: Usuario se registra con éxito
    Given El usuario está en la página de registro
    When El usuario ingresa sus datos y envía el formulario
    Then El usuario debería ver un mensaje de registro exitoso

Feature: Realización de una Compra

  Scenario: Usuario compra un producto
    Given El usuario está en la página de inicio
    When El usuario añade un producto al carrito
    And El usuario procede al checkout
    Then El usuario debería ver un mensaje de confirmación de compra
```
#### 2. **Step Definition**

Las definiciones de pasos (Step Definitions) contienen el código que realiza las acciones descritas en los archivos de características. Utilizan Serenity BDD, Selenium, Java, Maven, JUnit y Cucumber para interactuar con la aplicación web y verificar los resultados esperados.

**Ejecución**:
- **Registro de un Nuevo Usuario**:
  - Navegar a la página de registro.
  - Ingresar los datos del usuario en los campos correspondientes.
  - Enviar el formulario de registro.
  - Verificar que el mensaje de registro exitoso se muestra.

- **Realización de una Compra**:
  - Navegar a la página de inicio.
  - Añadir un producto al carrito.
  - Proceder al checkout.
  - Verificar que el mensaje de confirmación de compra se muestra.

```java
// Ejemplo de una definición de pasos en Java para el registro de usuario
public class RegisterStepDefinitions {

  @Given("El usuario está en la página de registro")
  public void elUsuarioEstaEnLaPaginaDeRegistro() {
    // Código para navegar a la página de registro
  }

  @When("El usuario ingresa sus datos y envía el formulario")
  public void elUsuarioIngresaSusDatosYEnviaElFormulario() {
    // Código para ingresar datos y enviar el formulario
  }

  @Then("El usuario debería ver un mensaje de registro exitoso")
  public void elUsuarioDeberiaVerUnMensajeDeRegistroExitoso() {
    // Código para verificar el mensaje de registro exitoso
  }
}

// Ejemplo de una definición de pasos en Java para la realización de una compra
public class PurchaseProductStepDefinitions {

  @Given("El usuario está en la página de inicio")
  public void elUsuarioEstaEnLaPaginaDeInicio() {
    // Código para navegar a la página de inicio
  }

  @When("El usuario añade un producto al carrito")
  public void elUsuarioAnadeUnProductoAlCarrito() {
    // Código para añadir un producto al carrito
  }

  @When("El usuario procede al checkout")
  public void elUsuarioProcedeAlCheckout() {
    // Código para proceder al checkout
  }

  @Then("El usuario debería ver un mensaje de confirmación de compra")
  public void elUsuarioDeberiaVerUnMensajeDeConfirmacionDeCompra() {
    // Código para verificar el mensaje de confirmación de compra
  }
}
``` 
#### 3. **TestRunner**

El TestRunner es responsable de ejecutar los archivos de características utilizando Cucumber con Serenity. Configura el entorno de prueba y coordina la ejecución de los casos de prueba definidos en los archivos Gherkin y las definiciones de pasos.

```java
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.axa.stepdefinitions",
        plugin = {"pretty"}
)
public class TestRunner {
}
``` 
#### 4. **Serenity Report**

**Descripción**: Al finalizar la ejecución de las pruebas, Serenity BDD genera un informe detallado y visual sobre la ejecución de los casos de prueba. Este informe incluye capturas de pantalla, detalles de los pasos ejecutados, resultados de las pruebas y cualquier error encontrado durante la ejecución.

**Beneficios**:
- **Visualización**: Proporciona una visualización clara y detallada del estado de las pruebas.
- **Trazabilidad**: Permite rastrear los resultados de las pruebas hasta los requisitos y especificaciones de negocio.
- **Análisis**: Facilita el análisis de fallos y la identificación de áreas problemáticas en la aplicación.

**Ubicación de los Informes**:
Los informes de Serenity se generan automáticamente y se pueden encontrar en el directorio `target/site/serenity`. Este directorio contiene un conjunto de páginas HTML que proporcionan una visión completa de la ejecución de las pruebas.

**Estructura del Informe**:
- **Dashboard**: Proporciona una visión general del estado del proyecto, incluyendo el número de pruebas ejecutadas, las que pasaron, fallaron o quedaron pendientes.
- **Test Results**: Detalles específicos de cada prueba ejecutada, incluyendo los pasos realizados, capturas de pantalla y resultados.
- **Requirements Coverage**: Muestra la cobertura de los requisitos por las pruebas ejecutadas.
- **Error Analysis**: Proporciona detalles sobre cualquier error encontrado durante la ejecución de las pruebas, facilitando el análisis y la corrección de los problemas.

**Ejemplo de Visualización del Informe**:
![Serenity Report](https://serenity-bdd.github.io/assets/images/reports-overview-71f7fb1aae958453fc042f9b385fff85.png)

### Acceso a los Informes

Para acceder a los informes, abre el archivo `index.html` ubicado en el directorio `target/site/serenity` con cualquier navegador web. Este archivo es la página de inicio del informe de Serenity y proporciona enlaces a todas las secciones del informe.

### Resumen del Flujo de Ejecución

1. **Inicio**: La ejecución comienza con los archivos de características que describen los casos de prueba en Gherkin.
2. **Definiciones de Pasos**: Los pasos definidos en Gherkin se mapean a las definiciones de pasos en Java que contienen el código para interactuar con la aplicación.
3. **Ejecución de Pruebas**: El TestRunner ejecuta las pruebas coordinando entre los archivos de características y las definiciones de pasos.
4. **Generación de Informes**: Serenity genera un informe detallado de la ejecución de las pruebas, proporcionando una visión clara del estado del proyecto y la calidad del software.

Este flujo asegura que los casos de prueba se ejecuten de manera eficiente y los resultados se presenten de forma clara y comprensible para todo el equipo.



## Dependencias

Este proyecto utiliza Serenity BDD, JUnit y Cucumber para pruebas automatizadas. Se han utilizado versiones antiguas de las librerías debido a la inestabilidad en la construcción de la solución con versiones más recientes de Serenity, Selenium y Cucumber.

### Justificación del Uso de Versiones Antiguas

Durante el desarrollo de este proyecto, se identificaron varios problemas de compatibilidad y estabilidad al utilizar versiones más recientes de Serenity, Selenium y Cucumber. Algunas de las principales razones para optar por versiones anteriores incluyen:

1. **Compatibilidad**: Las versiones más recientes de Serenity, Selenium y Cucumber no siempre son compatibles entre sí. Esto puede causar problemas durante la integración y ejecución de pruebas automatizadas.
2. **Estabilidad**: Las versiones más recientes pueden introducir nuevos errores y problemas de rendimiento que no estaban presentes en versiones anteriores. Optar por versiones estables y probadas garantiza una ejecución de pruebas más confiable.
3. **Documentación y Soporte**: Las versiones antiguas suelen tener más documentación y una comunidad más amplia que puede proporcionar soluciones a problemas conocidos.

### Comparación con Playwright

**Playwright** es una herramienta moderna para la automatización de pruebas que se ha destacado por su facilidad de uso y configuración en comparación con Selenium y frameworks asociados como Serenity y Cucumber.

**Ventajas de Playwright:**
- **Configuración Sencilla**: Playwright se puede configurar rápidamente sin la necesidad de manejar múltiples dependencias y configuraciones complejas.
- **Multi-Navegador y Multi-Plataforma**: Playwright soporta múltiples navegadores (Chromium, Firefox, WebKit) y se ejecuta en diversas plataformas (Windows, macOS, Linux).
- **API Intuitiva**: La API de Playwright es más moderna e intuitiva, facilitando la escritura y mantenimiento de las pruebas.
- **Mayor Estabilidad**: Playwright tiende a ser más estable debido a su enfoque en evitar condiciones de carrera y manejar asíncronamente las operaciones de automatización.

**Ejemplo de Playwright en JavaScript:**

```javascript
const { chromium } = require('playwright');

(async () => {
  const browser = await chromium.launch();
  const page = await browser.newPage();
  await page.goto('https://www.demoblaze.com');
  await page.click('#add-to-cart');
  await page.click('#cart');
  await browser.close();
})();
``` 
### Dependencias Utilizadas

Asegúrate de incluir las siguientes dependencias en tu archivo `pom.xml` (para un proyecto Maven):

```xml
<dependencies>
    <!-- Testing frameworks -->
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter</artifactId>
        <version>5.9.1</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.10.2</version>
        <scope>test</scope>
    </dependency>

    <!-- Selenium -->
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.22.0</version>
    </dependency>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-chrome-driver</artifactId>
        <version>4.22.0</version>
    </dependency>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-firefox-driver</artifactId>
        <version>4.22.0</version>
    </dependency>
    <dependency>
        <groupId>io.github.bonigarcia</groupId>
        <artifactId>webdrivermanager</artifactId>
        <version>5.9.1</version>
    </dependency>

    <!-- Cucumber -->
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-java</artifactId>
        <version>7.18.0</version>
    </dependency>
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-junit</artifactId>
        <version>7.18.0</version>
        <scope>test</scope>
    </dependency>

    <!-- Serenity dependencies -->
    <dependency>
        <groupId>net.serenity-bdd</groupId>
        <artifactId>serenity-core</artifactId>
        <version>4.1.20</version>
    </dependency>
    <dependency>
        <groupId>net.serenity-bdd</groupId>
        <artifactId>serenity-junit</artifactId>
        <version>4.1.20</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>net.serenity-bdd</groupId>
        <artifactId>serenity-cucumber</artifactId>
        <version>4.1.20</version>
        <scope>test</scope>
    </dependency>

    <!-- Additional dependencies -->
    <dependency>
        <groupId>com.github.javafaker</groupId>
        <artifactId>javafaker</artifactId>
        <version>1.0.2</version>
    </dependency>
</dependencies>
``` 
### Conclusión

Mientras que Selenium, Serenity y Cucumber ofrecen un poderoso conjunto de herramientas para pruebas automatizadas, la complejidad de configuración y la inestabilidad de las versiones más recientes pueden ser un desafío significativo. Optar por versiones más antiguas y estables puede mitigar algunos de estos problemas, pero sigue siendo un proceso complicado debido a las múltiples dependencias y la configuración requerida.

**Desafíos con Selenium, Serenity y Cucumber:**
1. **Configuración Compleja**: La integración de múltiples herramientas y librerías puede requerir un esfuerzo significativo para garantizar la compatibilidad y el funcionamiento adecuado.
2. **Problemas de Compatibilidad**: Las versiones más recientes de las librerías pueden no ser compatibles entre sí, lo que introduce errores y problemas de estabilidad.
3. **Mantenimiento**: La necesidad de mantener y actualizar varias dependencias aumenta la carga de mantenimiento del proyecto.

**Ventajas de Playwright:**
1. **Configuración Sencilla**: Playwright se puede configurar rápidamente sin la necesidad de manejar múltiples dependencias y configuraciones complejas.
2. **Multi-Navegador y Multi-Plataforma**: Playwright soporta múltiples navegadores (Chromium, Firefox, WebKit) y se ejecuta en diversas plataformas (Windows, macOS, Linux).
3. **API Intuitiva**: La API de Playwright es más moderna e intuitiva, facilitando la escritura y mantenimiento de las pruebas.
4. **Mayor Estabilidad**: Playwright tiende a ser más estable debido a su enfoque en evitar condiciones de carrera y manejar asíncronamente las operaciones de automatización.

