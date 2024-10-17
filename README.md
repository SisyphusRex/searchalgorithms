This is a collection of various search algorithms.

The program uses directory division and naming parallel to package naming for organization.

The classes also use method overloading because java is strongly typed and each method must handle multiple array data types.


OUTSIDE SOURCES:

https://stackoverflow.com/questions/64325661/cant-import-a-sub-package-in-java
    how to import subpackages

TO RUN:
    1. Move to parent directory, e.g. the directory containing searchalgorithms
    2.compile
        javac searchalgorithms/*.java
    3. run
        java searchalgorithms.Bootstrap

    **you must move to the parent directory for the compiler to be able to find the path to the subpackage searchalgorithms.searchclasses
    **if you try to compile from within searchalgorithms, the compiler cannot find the subpackage