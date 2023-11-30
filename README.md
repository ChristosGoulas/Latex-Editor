## Latex-Editor
LatexEditor, an application that facilitates the writing and maintenance of Latex documents.

# Purpose
Latex is a well known high quality document preparation markup language. It provides a large
variety of styles and commands that enable advanced document formatting. Typically, a Latex document
is compiled with a tool like MikTex, Lyx, etc. to produce a respective formatted document in pdf, ps, etc.
Formatting documents with Latex is like a programming process as it involves the proper usage of Latex
commands which are embedded in the document contents. The objective of this project is to develop a
simple Latex editor for inexperienced Latex users. The goal of the editor is to facilitate the usage of Latex
commands for the preparation of Latex documents. One of the prominent features that distinguishes
the LatexEditor from other similar applications is its multi-strategy version tracking functionalities that
enable undo and redo actions.

# User Stories
- [x] As a user, I want to create a new Latex document, based on a particular Latex document
template. If I don't specify a template, the application should create an empty Latex document
- [x] As a user, I want to edit the contents of the Latex document, via the application's user
interface.
- [x] As a user, I want to add Latex commands in the Latex document automatically using the
application user interface. A minimal set of Latex commands that I want to use is given in Table 1.
Some of the commands are allowed only for specific types of Latex documents. The application
should notify me if I try to add Latex commands that are not allowed in the Latex document.
- [x] As a user, I should be able to activate an automatic version tracking mechanism that keeps
track of the document evolution history, at any time. The history consists of a sequence of
subsequent versions of the Latex document. The mechanism should provide at least two alternative
storage strategies for the document evolution history:
- Volatile (default strategy): for each document change the mechanism keeps the previous
version of the document in a main memory list of subsequent document versions.
- Stable: for each document change the mechanism keeps the previous version of the
document on disk storage.
- [x] As a user, I should be able to change the storage strategy of the version tracking mechanism
at any time.
- If I change from Volatile to Stable the application should store the document evolution
history on disk storage.
- If I change from Stable to Volatile the application should load the document evolution
history from disk storage to main memory.
- [x] As a user, I should be able to disable the version tracking mechanism at any time.
- [x] As a user, I should be able to rollback to a previous version of the Latex document based on
the document evolution history. The application should notify me if I try to use the rollback action
and the version tracking mechanism has not been enabled before.
- [x] As a user, I should be able to save the Latex document on disk storage.
- [x] As a user, I should be able to load the Latex document from disk storage.

# Desing Patterns
-Prototype
-Strategy
-Factory
-Command

# References
- General information about the Latex project https://www.latex-project.org/
- Download MikTex - Latex distribution - https://miktex.org/
- WinEdt - manipulation and compilation of Latex documents http://www.winedt.com/index.html
- LaTeX/Document Structure https://en.wikibooks.org/wiki/LaTeX/Document_Structure



