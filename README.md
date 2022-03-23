# PAML

This is a repository for PAML, the programming assignment markup language. This language is meant for creating programming assignments in any programming languange, without needing different projects and files for solution, starting code, tests, assignment desriptions etc. That means that everything is developed in one place, and the idea write the entire solution and have a parser that can read PAML files and generate the different artefacts. I have not developed such a tool for this project but i created an example project which shows how a PAML file looks like and how the generated output might look like. This DSL is created with Xtext, and the grammar of the language is described [here](https://github.com/ErlendBerntsen/paml/blob/main/PAML/org.xtext.paml/bin/org/xtext/paml/PAML.xtext). A file consist of metainformation, such as the programming language of the assignment and same layout definitions of the output, and tasks. Tasks can have title, description, code, tests and subtasks in them. There is also options to write code in a paml file that is not associated with a specifc task. An example for a simple "Hello World" Java exercise can be found [here](https://github.com/ErlendBerntsen/paml/tree/main/PAML/examplepaml/src). This language was inspired by my master thesis, which currently focuses on a specific solution for Java programming assignments without creating a DSL. I included a [short paper](https://github.com/ErlendBerntsen/paml/blob/main/PAML/MP_Short_Paper.pdf) i've written about my thesis for those who are interested in reading more about that.
