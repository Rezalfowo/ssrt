find . -type d -name 'src-gen' -exec rm -r {} +
find . -type d -name 'xtend-gen' -exec rm -r {} +
find . -type d -name 'target' -exec rm -r {} +
find . -type d -name '.settings' -exec rm -r {} +

cd xtext.semcomdt.swarchitecture.cbse.parent
mkdir xtext.semcomdt.swarchitecture.cbse/src-gen
mkdir xtext.semcomdt.swarchitecture.cbse.ide/src-gen
mkdir xtext.semcomdt.swarchitecture.cbse.ui/src-gen
mkdir xtext.semcomdt.swarchitecture.cbse.web/src-gen
mkdir xtext.semcomdt.swarchitecture.cbse/xtend-gen
mkdir xtext.semcomdt.swarchitecture.cbse.ide/xtend-gen
mkdir xtext.semcomdt.swarchitecture.cbse.ui/xtend-gen
mkdir xtext.semcomdt.swarchitecture.cbse.web/xtend-gen

cd ../xtext.semcomdt.swsecurity.objective.ciaamps.parent
mkdir xtext.semcomdt.swsecurity.objective.ciaamps/src-gen
mkdir xtext.semcomdt.swsecurity.objective.ciaamps.ide/src-gen
mkdir xtext.semcomdt.swsecurity.objective.ciaamps.ui/src-gen
mkdir xtext.semcomdt.swsecurity.objective.ciaamps.web/src-gen
mkdir xtext.semcomdt.swsecurity.objective.ciaamps/xtend-gen
mkdir xtext.semcomdt.swsecurity.objective.ciaamps.ide/xtend-gen
mkdir xtext.semcomdt.swsecurity.objective.ciaamps.ui/xtend-gen
mkdir xtext.semcomdt.swsecurity.objective.ciaamps.web/xtend-gen

cd ../xtext.semcomdt.swsecurity.ssrt.parent
mkdir xtext.semcomdt.swsecurity.ssrt/src-gen
mkdir xtext.semcomdt.swsecurity.ssrt.ide/src-gen
mkdir xtext.semcomdt.swsecurity.ssrt.ui/src-gen
mkdir xtext.semcomdt.swsecurity.ssrt.web/src-gen
mkdir xtext.semcomdt.swsecurity.ssrt/xtend-gen
mkdir xtext.semcomdt.swsecurity.ssrt.ide/xtend-gen
mkdir xtext.semcomdt.swsecurity.ssrt.ui/xtend-gen
mkdir xtext.semcomdt.swsecurity.ssrt.web/xtend-gen