# Security Solution Refinement Tree

This repository has been made to let users use the tool we created with Sirius to instantiate security solutions with our meta-model and be able to reuse existing ones in their project, it is divided into three parts:

1. `repository` : where the `.ssrt` files are stored and organized in the given structure :

```bash
.
└── semcomdt.swsecurity.ssrt.repository
    ├── representations.aird
    ├── security_patterns
    │   ├── security_objectives
    │   │   ├── availability
    │   │   ├── confidentiality
    │   │   │   └── authentication.ssrt
    │   │   └── integrity
    │   ├── threats
    │   └── vulnerabilities
    └── security_tactics
        ├── security_objectives
        │   ├── availability
        │   ├── confidentiality
        │   └── integrity
        ├── threats
        └── vulnerabilities

```

2. `semcomdt.swsecurity.ssrt` project containing the meta-model we use to generate our graphical editor

3. `semcomdt.swsecurity.ssrt.design` containing the definition of how the security solutions will be represented and the tools that can be used to modify them.

## Installation requirements
Sirius Graphical Representation :
- Java 17 Open JDK
- Obeo Designer Community 11.9 found on [Sirius website](https://eclipse.dev/sirius/download.html).

Xtext :
- Eclipse MDT 2024-06
- Java 21 Open JDK
- Maven 3.9+
## Sirius Installation guide

Import the `semcomdt.swsecurity.ssrt` and `semcomdt.swsecurity.ssrt.design` project in Obeo Designer Community. In the `model` folder open the `ssrt.genmodel` file in and right-click on `Ssrt` and select `Generate All`. Doing so will create files in the src-gen folder and two projects: `semcomdt.swsecurity.ssrt.edit` and `semcomdt.swsecurity.ssrt.editor`.
There might be errors shown in the `semcomdt.swsecurity.ssrt.edit` and `semcomdt.swsecurity.ssrt.editor`, you can go to Project > Clean to clean all projects.
You can now click on the green arrow in the toolbar, select `Run Configurations...`, create a new `Eclipse Application` and run it.

:warning: Make sure to import the `semcomdt.swsecurity.ssrt.design` or it might be compiled with an invalid Java version during runtime and cause issues.
### Runtime Application

In your runtime instance you can now import the `semcomdt.swsecurity.ssrt.design` and `semcomdt.swsecurity.ssrt.repository` projects.
You can now open the `.ssrt` files and visualize them in the default editor.

### Creating a Representation

To create a graphic representation of them you can unfold in the `Model Explorer` the `.ssrt` file you opened and right click on the library of your file and selet `new Representation` > `Other` and select `SSRT Library` from the `SSRT Design`, this will produce a representation that you can find under the Library where you will be able to make modification graphically.

### Creating new Security Solution Refinement Tree

If you want to create new Security Solution Refinement Tree Models, you need to go to `File > New > Other...` and select `Ssrt Model`. Select the project and folder it should be created into and then in the next page select the `Library` Model Object to finish the process of file creation. You can now use your Library, create new solutions from the editor or instead directly create a representation of it to create the library graphically.

---

## Xtext Installation Guide

### Creating Xtext required folders 
First you will need to run the script `createdirs.sh` so it can clean and create the required directories in the projects.

### Importing projects
You can then launch your Eclipse MDT and import the `xtext.semcomdt.swarchitecture.cbse.parent`, `xtext.semcomdt.swsecurity.objective.ciaamps.parent`, `xtext.semcomdt.swsecurity.ssrt.parent` projects.

### Generating artifacts 
Go to `xtext.semcomdt.swarchitecture.cbse > src > semcomdt.swarchitecture` and right click on `GenerateCbse.mwe2 > Run as.. > MWE2 Workflow`.
You then need to do the same procedure for `xtext.semcomdt.swsecurity.objective.ciaamps` and `xtext.semcomdt.swsecurity.ssrt`.
:warning: Make sure to do it in this order as they depend on each other in the given order.
### Lauching the Runtime Eclipse Application
After doing so you can then launch an Eclipse Application by right clicking on `xtext.semcomdt.swsecurity.ssrt  src > semcomdt.swsecurity > SsrtRuntimeModule.java` and selecting `Run as... > Eclipse Application`.
### Importing Example folder
You will then be able to import the SCADA folder containing file examples for each of the DSLs defined.
`File > Open Projects from file system > Directory > SCADA`.

### Creating new files
To create new files you will need to select `File > New File` and give a name with the extension matching the DSL :
- `.cbse`
- `.ciaamps`
- `.ssrt`
