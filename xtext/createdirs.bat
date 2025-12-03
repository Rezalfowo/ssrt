@echo off
find "." "-type" "d" "-name" "src-gen" "-exec" "rm" "-r" "{}" "+"
find "." "-type" "d" "-name" "xtend-gen" "-exec" "rm" "-r" "{}" "+"
find "." "-type" "d" "-name" "target" "-exec" "rm" "-r" "{}" "+"

cd "xtext.semcomdt.swarchitecture.cbse.parent"
mkdir "xtext.semcomdt.swarchitecture.cbse.ide\xtend-gen"
mkdir "xtext.semcomdt.swarchitecture.cbse.ui\xtend-gen"
mkdir "xtext.semcomdt.swarchitecture.cbse.web\xtend-gen"

cd "..\xtext.semcomdt.swsecurity.objective.ciaamps.parent"
mkdir "xtext.semcomdt.swsecurity.objective.ciaamps.ide\xtend-gen"
mkdir "xtext.semcomdt.swsecurity.objective.ciaamps.ui\xtend-gen"
mkdir "xtext.semcomdt.swsecurity.objective.ciaamps.web\xtend-gen"

cd "..\xtext.semcomdt.swsecurity.ssrt.parent"
mkdir "xtext.semcomdt.swsecurity.ssrt.ide\xtend-gen"
mkdir "xtext.semcomdt.swsecurity.ssrt.ui\xtend-gen"
mkdir "xtext.semcomdt.swsecurity.ssrt.web\xtend-gen"