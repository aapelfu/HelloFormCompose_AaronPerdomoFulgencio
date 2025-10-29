# 👋 HelloFormCompose - [Aaron Perdomo Fulgencio]

Primera aplicación con Jetpack Compose: formulario interactivo con TextField, Button y Text.

## 📝 Descripción

Aplicación Android que demuestra los fundamentos de Jetpack Compose:
- Campo de texto para ingresar el nombre del usuario
- Botón para generar un saludo personalizado
- Validación de entrada
- Conservación del estado ante cambios de configuración (rotación)

## ✨ Características implementadas

### Funcionalidad básica
- ✅ Interfaz declarativa con Jetpack Compose
- ✅ TextField para entrada de datos
- ✅ Button reactivo
- ✅ Text para mostrar resultado
- ✅ Estado con `rememberSaveable` (persiste en rotaciones)

### Extras (+3 puntos)
- ✅ **Botón deshabilitado** si no hay texto (+1 pt)
    - Usa `enabled = name.isNotBlank()`
    - El botón aparece en gris cuando el campo está vacío

- ✅ **Ocultar teclado** al saludar (+1 pt)
    - Implementado con `LocalSoftwareKeyboardController`
    - El teclado se cierra automáticamente al pulsar el botón

- ✅ **Contador de caracteres** (máx. 20) (+1 pt)
    - Límite de 20 caracteres en el TextField
    - Indicador visual "X/20 caracteres" debajo del campo

## 🚀 Cómo ejecutar

1. **Clonar el repositorio**
```bash
   git clone https://github.com/[aapelfu]/HelloFormCompose_[Aaron].git
```

2. **Abrir en Android Studio**
    - Android Studio Hedgehog o superior
    - Kotlin 1.9+

3. **Ejecutar**
    - Conectar dispositivo Android (API 24+) o iniciar emulador
    - Click en Run ▶️

4. **Probar la aplicación**
    - Escribe tu nombre en el campo de texto
    - Observa cómo se activa el botón
    - Pulsa "Saludar" para ver el mensaje
    - Rota el dispositivo para verificar que se conserva el estado

## 📱 Capturas de pantalla

![Campo vacío - Botón deshabilitado](screenshots/captura1.png)
![Escribiendo nombre - Contador activo](screenshots/captura2.png)
![Saludo mostrado](screenshots/captura3.png)

## 🛠️ Tecnologías utilizadas

- **Lenguaje**: Kotlin
- **UI Framework**: Jetpack Compose
- **Arquitectura**: Declarativa
- **Material Design**: Material 3
- **Gestión de estado**: `remember`, `rememberSaveable`

## 📚 Conceptos aplicados

- **Composables**: Funciones `@Composable` para construir UI
- **Estado reactivo**: La UI se recompone automáticamente al cambiar el estado
- **Modifiers**: Personalización de componentes
- **Column**: Layout vertical
- **TextField**: Entrada de texto con validación
- **Button**: Botón interactivo con estado habilitado/deshabilitado

## 👨‍💻 Autor

**[Aaron Perdomo Fulgencio]**
- GitHub: @aapelfu(https://github.com/aapelfu)
- Curso: Desarrollo Multiplataforma

## 📄 Licencia

Proyecto educativo - 2025
