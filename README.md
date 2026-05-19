# Validación de Contraseñas

## Preguntas y respuestas

### ¿Qué devuelve el método si la contraseña es null?
false

### ¿Qué devuelve si la contraseña tiene menos de 8 caracteres?
false

### ¿Qué devuelve si no tiene ningún número?
false
---

# Ejemplos
## Ejemplo de contraseña válida
password1

## Ejemplo de contraseña inválida
password
---

# Resultado de los tests
## ¿Qué test falla?
shortPasswordSouldBeInvalid

## ¿Por qué falla?
Porque una contraseña corta devuelve true cuando debería devolver false.
---

# Comparación de resultados
| Resultado esperado | Resultado obtenido |
|-------------------|-------------------|
| false | true |
