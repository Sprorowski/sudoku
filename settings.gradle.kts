rootProject.name = "sprorowski.io.sudoku"
include("modules:game:presenter")
findProject(":modules:game:presenter")?.name = "presenter"
