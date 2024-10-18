
cd estructuras24-parcial1
DNI=$(cat DNI)
# Volver al branch inicial
git checkout main
# Borrar el branch del alumno localmente
git branch -D $DNI
# Resetear archivos que puedan haber sido modificados
git reset --hard HEAD
# Resetear archivos que no están trackeados en git
git clean -xdf

