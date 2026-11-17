# Práctica de Interfaces Móviles: Login con Material 3 y Material You

Prototipo funcional desarrollado en **Android Studio** con **Kotlin** y **Jetpack Compose**, aplicando los lineamientos de diseño de **Material Design 3** y personalización dinámica **Material You**.

## 1. Fase de Investigación y Arquitectura
- **Objetivo:** Reducir la fricción de autenticación mediante jerarquía visual clara, validación instantánea y accesibilidad táctil (`48dp` mínimo en áreas interactivas).
- **Flujo de Usuario:** `Inicio` → `Captura de credenciales` → `Validación local` → `Estado de carga` → `Pantalla de Bienvenida`.

## 2. Bocetos (Sketches)
![Boceto de Login](docs/01_sketch_login.png)

## 3. Esquemas Estructurales (Wireframes)
![Wireframe de Login](docs/02_wireframe_login.png)

## 4. Maquetado Visual (Mockups)
![Mockup de Login](docs/03_mockup_login.png)

## 5. Implementación Técnica (Material 3 & Material You)
- **Material 3:** Uso de componentes `OutlinedTextField`, `Button`, `FilledTonalButton`, elevación tonal y formas redondeadas (`12dp` / `CircleShape`).
- **Material You:** Implementación de `dynamicLightColorScheme` y `dynamicDarkColorScheme` para Android 12+ (API 31+), con paleta semilla de respaldo para versiones anteriores y soporte completo para **Modo Oscuro**.

## 6. Ejecución del Proyecto
1. Clonar este repositorio: `git clone https://github.com/TU_USUARIO/practica-login-material3.git`
2. Abrir en **Android Studio** (Ladybug o superior).
3. Sincronizar Gradle y ejecutar en un emulador con **API 31+** para visualizar el cambio dinámico de colores.
