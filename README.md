# ORIENTACION-A-OBJETOS-I
En este repositorio se almacenaran la consignas y los enunciados resueltos de la materia "Orientación a Objteos I" de la carrera APU-Informatica de la UNLP

## Cuadernillo de actividades  - ultima actualización: 

2 de octubre de 2025

## Comando para crear proyecto maven con el arquetipo de la catedra:

 - aclaración: debe tenerse instalado maven en la pc y configurar la variable de entorno "MAVEN_HOME".

  Comando maven:  

  ```
  `mvn archetype:generate `
    `"-DgroupId=io.github.unlp-oo" `
    `"-DartifactId=${nombre-del-proyecto-elegido}" `
    `"-DarchetypeGroupId=io.github.unlp-oo" `
    `"-DarchetypeArtifactId=archetype" `
    `"-DarchetypeVersion=1.0.0" `
    `"-DinteractiveMode=false"`
  ```

### Comando Powershell asociado al script automatico
``` proyecto-objetos ```


### Script automatico para powershell

``` Script para crear un nuevo proyecto Maven
#crear-proyecto.ps1 (nombre del archivo/script)
#Pide todos los datos del desarrollador por teclado
#Solicitar nombre del proyecto
 $artifactId = Read-Host "Ingrese el nombre del proyecto (artifactId)"

#Confirmación
Write-Host "`nCreando proyecto con:"
Write-Host "Artifact ID: $artifactId"

# --- Ejecutar comando Maven ---
mvn archetype:generate `
    "-DgroupId=io.github.unlp-oo" `
    "-DartifactId=$artifactId" `
    "-DarchetypeGroupId=io.github.unlp-oo" `
    "-DarchetypeArtifactId=archetype" `
    "-DarchetypeVersion=1.0.0" `
    "-DinteractiveMode=false" `

# --- Mensaje final ---
Write-Host "`n✅ Proyecto Maven '$artifactId' creado exitosamente."
```

