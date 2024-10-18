DNI=$1
git checkout -b $DNI
git add .
git commit -m "$DNI"
git push --set-upstream origin $DNI
